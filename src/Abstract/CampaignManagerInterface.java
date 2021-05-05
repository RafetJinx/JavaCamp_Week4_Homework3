package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignManagerInterface {
	void addCampaign(Campaign campaign);
	
	void addMultipleCampaign(Campaign[] campaigns);
	
	void deleteCampaign(Campaign campaign);
	
	void deleteMultipleCampaign(Campaign[] campaigns);
	
	int calculateStockAmount(Campaign campaign, Game game);
	
	int calculateDiscountRate(Campaign campaign,Game game);
	
	int calculateCampaignPrice(Campaign campaign,Game game);
	
	void showCampaignProperties(Campaign campaign);
}
