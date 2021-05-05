package Entities;

public class Campaign {
	private final String name;
	private final String detail;
	private final String beginDate;
	private final String endingDate;
	private final String campaignProduct;
	private int productStockAmountCampaign;
	private int campaignPrice;
	private int rateOfDiscount;
	
	private Campaign(Builder builder) {
		this.name = builder.name;
		this.detail = builder.detail;
		this.beginDate = builder.beginDate;
		this.endingDate = builder.endingDate;
		this.campaignProduct = builder.campaignProduct;
		this.productStockAmountCampaign = builder.productStockAmountCampaign;
		this.campaignPrice = builder.campaignPrice;
		this.rateOfDiscount = builder.rateOfDiscount;
	}
	
	public int getProductStockAmountCampaign() {
		return productStockAmountCampaign;
	}

	public void setProductStockAmountCampaign(int productStockAmountCampaign) {
		this.productStockAmountCampaign = productStockAmountCampaign;
	}

	public int getCampaignPrice() {
		return campaignPrice;
	}

	public void setCampaignPrice(int campaignPrice) {
		this.campaignPrice = campaignPrice;
	}

	public int getRateOfDiscount() {
		return rateOfDiscount;
	}

	public void setRateOfDiscount(int rateOfDiscount) {
		this.rateOfDiscount = rateOfDiscount;
	}

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public String getCampaignProduct() {
		return campaignProduct;
	}

	public static class Builder{
		
		private String name;
		private String detail;
		private String beginDate;
		private String endingDate;
		private String campaignProduct;
		private int productStockAmountCampaign;
		private int campaignPrice;
		private int rateOfDiscount;
		
		public Builder(String name, String detail, String beginDate, 
				String endingDate, String campaignProduct) {
			this.name = name;
			this.detail = detail;
			this.beginDate = beginDate;
			this.endingDate = endingDate;
			this.campaignProduct = campaignProduct;
		}
		
		public Builder productStockAmountCampaign(final int productStockAmountCampaign) {
			this.productStockAmountCampaign = productStockAmountCampaign;
			return this;
		}
		
		public Builder campaignPrice(final int campaignPrice) {
			this.campaignPrice = campaignPrice;
			return this;
		}
		
		public Builder rateOfDiscount(final int rateOfDiscount) {
			this.rateOfDiscount = rateOfDiscount;
			return this;
		}
		
		public Campaign builder() {
			return new Campaign(this);
		}
	}
}