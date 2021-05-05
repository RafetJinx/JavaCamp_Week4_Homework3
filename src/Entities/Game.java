package Entities;

public class Game {
	private final String name;
	private final String producer;
	private final String publisher;
	private String releaseDate;
	private int price;
	private int stockAmount;
	
	private Game(Builder builder) {
		this.name = builder.name;
		this.producer = builder.producer;
		this.publisher = builder.publisher;
		this.releaseDate = builder.releaseDate;
		this.price = builder.price;
		this.stockAmount = builder.stockAmount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getName() {
		return name;
	}

	public String getProducer() {
		return producer;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public static class Builder{
		private String name;
		private String producer;
		private String publisher;
		private String releaseDate;
		private int price;
		private int stockAmount;
		
		public Builder name(final String name) {
			this.name = name;
			return this;
		}

		public Builder producer(final String producer) {
			this.producer = producer;
			return this;
		}
		
		public Builder publisher(final String publisher) {
			this.publisher = publisher;
			return this;
		}
		
		public Builder releaseDate(final String releaseDate) {
			this.releaseDate = releaseDate;
			return this;
		}
		
		public Builder price(final int price) {
			this.price = price;
			return this;
		}
		
		public Builder stockAmount(final int stockAmount) {
			this.stockAmount = stockAmount;
			return this;
		}
		
		public Game builder() {
			return new Game(this);
		}
	}
}
