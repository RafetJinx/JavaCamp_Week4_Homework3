package Concrete;

import Abstract.SaleManagerInterface;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;

public class SaleManager implements SaleManagerInterface{
	
	
	@Override
	public int increaseBillingNumber(Sale sale) {
		sale.setBillingNumber(sale.getBillingNumber() + 1);
		return sale.getBillingNumber();
	}

	@Override
	public double calculateSubtotalFee(Sale sale) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sale(Sale sale, Game game) {
		if(game.getStockAmount() > 0) {
		 	 sale.setSubtotalFee(sale.getSubtotalFee() + game.getPrice());
		 	 game.setStockAmount(game.getStockAmount() - 1);
		 	 increaseBillingNumber(sale);
		 	 showWithoutCampaignSaleInformations(sale, game);
		} else {
			System.out.println("Urunun stogu bitmistir");
		}
	}

	@Override
	public void multipleSale(Sale[] sales, Game game) {
		boolean haveStock = true;
		for(Sale sale : sales) {
			while(haveStock) {
				if(game.getStockAmount() > 0) {
				 	 sale.setSubtotalFee(sale.getSubtotalFee() + game.getPrice());
				 	 game.setStockAmount(game.getStockAmount() - 1);
				 	 increaseBillingNumber(sale);
				 	 showWithoutCampaignSaleInformations(sale, game);
				} else {
					System.out.println("Urunun stogu bitmistir");
					haveStock = false;
				}
			}
		}
	}

	@Override
	public void campaignSale(Sale sale, Campaign campaign, CampaignManager campaignManager, Game game) {
		if(campaign.getProductStockAmountCampaign() > 0) {
			sale.setSubtotalFee(sale.getSubtotalFee() + campaignManager.calculateCampaignPrice(campaign, game));
			campaign.setProductStockAmountCampaign(campaign.getProductStockAmountCampaign() - 1);
			game.setStockAmount(game.getStockAmount() - 1);
			increaseBillingNumber(sale);
			showCampaignSaleInformations(sale, campaign, game);
		} else {
			System.out.println("Kampanyadaki urunun stogu bitmistir");
		}
	}

	@Override
	public void multipleCampaignSale(Sale[] sales, Campaign campaign, CampaignManager campaignManager, Game game) {
		boolean haveStock = true;
		for(Sale sale : sales) {
			while(haveStock) {
				if(campaign.getProductStockAmountCampaign() > 0) {
					sale.setSubtotalFee(sale.getSubtotalFee() + campaignManager.calculateCampaignPrice(campaign, game));
					campaign.setProductStockAmountCampaign(campaign.getProductStockAmountCampaign() - 1);
					game.setStockAmount(game.getStockAmount() - 1);
					increaseBillingNumber(sale);
					showCampaignSaleInformations(sale, campaign, game);
				} else {
					System.out.println("Kampanyadaki urunun stogu bitmistir");
					haveStock = false;
				}
			}
		}
	}

	@Override
	public void showSaleInformations(Sale sale, Campaign campaign, Game game) {
		System.out.println("Satisi yapilan urun: " + game.getName()
							+"\nSatis sayisi: " + sale.getBillingNumber()
							+"\nKampanya stogunda kalan urun adedi: " + campaign.getProductStockAmountCampaign()
							+"\nStokta kalan urun adedi: " + game.getStockAmount()
							+"\nAra toplam ucreti: " + sale.getSubtotalFee());
	}

	@Override
	public void showWithoutCampaignSaleInformations(Sale sale, Game game) {
		System.out.println("Satisi yapilan urun: " + game.getName()
							+"\nFatura numarasi: " + sale.getBillingNumber()
							+"\nAra toplam ucreti: " + sale.getSubtotalFee()
							+"\nUrunun satis fiyati: " + game.getPrice()
							+"\nStokta kalan urun adedi: " + game.getStockAmount());
	}

	@Override
	public void showCampaignSaleInformations(Sale sale, Campaign campaign, Game game) {
		System.out.println("Satisi yapilan urun: " + game.getName()
							+"\nFatura numarasi: " + sale.getBillingNumber()
							+"\nAra toplam ucreti: " + sale.getSubtotalFee()
							+"\nUrunun kampanyasiz fiyati: " + game.getPrice()
							+"\nUrunun kampanyali fiyati: " + campaign.getCampaignPrice()
							+"\nStokta kalan urun adedi: " + game.getStockAmount()
							+"\nKampaya stogunda kalan urun adedi: " + campaign.getProductStockAmountCampaign());

	}
}
