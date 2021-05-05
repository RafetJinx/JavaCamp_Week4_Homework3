package week4_homework3;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CommentManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Comment;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Game game = new Game.Builder().name("Leauge of Legends")
									  .producer("Riot Games")
									  .publisher("RITO")
									  .releaseDate("2009.10.27")
									  .price(20)
									  .stockAmount(100).builder();
		GameManager gameManager = new GameManager();
		
		
		Gamer gamer = new Gamer.Builder("12345678901", "Engin", "Demirog", new GregorianCalendar(1986,07,05)).buidler();
		GamerManager gamerManager = new GamerManager();
		
		
		ArrayList<String> tags = new ArrayList<String>();
		tags.add("Top Lane");
		tags.add("Jungle");
		tags.add("Mid Lane");
		tags.add("Attack Damage Carry");
		tags.add("Support");
		Comment comment = new Comment("LoL'u birakin","LoL insana zarar veriyor",
										"Oyuncularin saglina zarar veren bir oyun oynamayin",tags);
		CommentManager commentManager = new CommentManager();

		
		Campaign.Builder campaignBuilder = 
				new Campaign.Builder("LoL Indirimde","Moba Oyunu","2021.4.5","2021.4.10",game.getName());
		CampaignManager campaignManager = new CampaignManager();
		
		campaignBuilder.productStockAmountCampaign(campaignManager.calculateStockAmount(campaignBuilder.builder(), game));
		campaignBuilder.campaignPrice(campaignManager.calculateCampaignPrice(campaignBuilder.builder(), game));
		campaignBuilder.rateOfDiscount(campaignManager.calculateDiscountRate(campaignBuilder.builder(), game));
	
		Campaign campaign = campaignBuilder.builder();
		
		
		Sale sale = new Sale();
		SaleManager saleManager = new SaleManager();
		
	   
	    MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
	    System.out.println("Dogrulama durumu : gercek kisi " + (mernisServiceAdapter.checkIfRealPerson(gamer) ? "" : "degil"));
		
		
	    System.out.println("<<<<<--------------------------------GAME MANAGER-------------------------------->>>>>");
		gameManager.addGame(game);
		System.out.println("-------------------------------------");
		gameManager.deleteGame(game);
		System.out.println("-------------------------------------");
		gameManager.showGameProperties(game);
		System.out.println();
		
		
		System.out.println("<<<<<--------------------------------GAMER MANAGER-------------------------------->>>>>");
		gamerManager.register(gamer);
		System.out.println("-------------------------------------------------------------------------------");
		gamerManager.unregister(gamer);
//		System.out.println("-------------------------------------------------------------------------------");
//		gamerManager.updateInformation(gamer.buidler());
		System.out.println("-------------------------------------------------------------------------------");
		gamerManager.showGamerProperties(gamer);
		System.out.println();
		
		
		System.out.println("<<<<<--------------------------------COMMENT MANAGER-------------------------------->>>>>");
		commentManager.addComment(gamer, game, comment);
		System.out.println("-------------------------------------------------------------------------------");
		commentManager.deleteComment(gamer, game, comment);
		System.out.println("-------------------------------------------------------------------------------");
//		commentManager.updateComment(comment);
//		System.out.println("-------------------------------------------------------------------------------");
		commentManager.showCommentProperties(comment);
		System.out.println();
		
		
		System.out.println("<<<<<--------------------------------CAMPAIGN MANAGER-------------------------------->>>>>");
		campaignManager.addCampaign(campaign);
		System.out.println("---------------------------------------------");
		campaignManager.deleteCampaign(campaign);
		System.out.println("---------------------------------------------");
		campaignManager.showCampaignProperties(campaign);
		System.out.println();
		
		
		System.out.println("<<<<<--------------------------------SALE MANAGER-------------------------------->>>>>");
		saleManager.sale(sale, game);
		System.out.println("---------------------------------------------");
		saleManager.campaignSale(sale, campaign, campaignManager, game);
		System.out.println("---------------------------------------------");
		saleManager.campaignSale(sale, campaign, campaignManager, game);
	}
}








