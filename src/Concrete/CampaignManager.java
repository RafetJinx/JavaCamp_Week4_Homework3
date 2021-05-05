package Concrete;

import Abstract.CampaignManagerInterface;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignManagerInterface{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi"
							+"\nEklenen kampanyanin bilgileri:");
		showCampaignProperties(campaign);
	}

	@Override
	public void addMultipleCampaign(Campaign[] campaigns) {
		for(Campaign campaign : campaigns) {
			System.out.println("Kampanya eklendi"
					+"\nEklenen kampanyanin bilgileri:");
			showCampaignProperties(campaign);
		}
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi"
				+"\nSilinen kampanyanin bilgileri:");
		showCampaignProperties(campaign);
	}

	@Override
	public void deleteMultipleCampaign(Campaign[] campaigns) {
		for(Campaign campaign : campaigns) {
			System.out.println("Kampanya silindi"
					+"\nSilinen kampanyanin bilgileri:");
			showCampaignProperties(campaign);
		}
	}
	
	@Override
	public int calculateStockAmount(Campaign campaign, Game game) {
		campaign.setProductStockAmountCampaign(game.getStockAmount() * 6 / 10);
		return campaign.getProductStockAmountCampaign();
	}

	@Override
	public int calculateDiscountRate(Campaign campaign, Game game) {
		campaign.setRateOfDiscount(10);
		return campaign.getRateOfDiscount();
	}

	@Override
	public int calculateCampaignPrice(Campaign campaign, Game game) {
		campaign.setCampaignPrice(game.getPrice() - (game.getPrice() * campaign.getRateOfDiscount() / 100));
		return campaign.getCampaignPrice();
	}

	@Override
	public void showCampaignProperties(Campaign campaign) {
		System.out.println("Campaign name: " + campaign.getName()
							+"\nCampaign detail: " + campaign.getDetail()
							+"\nCampaign begin date: " + campaign.getBeginDate()
							+"\nCampaign ending date: " + campaign.getEndingDate()
							+"\nCampaign campaignProduct: " + campaign.getCampaignProduct()
							+"\nCampaign productStockAmountCampaign: " + campaign.getProductStockAmountCampaign()
							+"\nCampaign campaignPrice: " + campaign.getCampaignPrice()
							+"\nCampaign rateOfDiscount: " + campaign.getRateOfDiscount());
	}	
}
