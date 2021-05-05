package Abstract;

import Concrete.CampaignManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;

public interface SaleManagerInterface {
	int increaseBillingNumber(Sale sale);
	
	double calculateSubtotalFee(Sale sale);
	
	void sale(Sale sale, Game game);
	
	void multipleSale(Sale[] sales, Game game);
	
	void campaignSale(Sale sale, Campaign campaign, CampaignManager campaignManager, Game game);
	
	void multipleCampaignSale(Sale[] sales, Campaign campaign, CampaignManager campaignManager, Game game);
	
	void showSaleInformations(Sale sale, Campaign campaign, Game game);
	
	void showWithoutCampaignSaleInformations(Sale sale, Game game);
	
	void showCampaignSaleInformations(Sale sale, Campaign campaign, Game game);
}
