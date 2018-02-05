import java.text.NumberFormat;

public class Album extends Product {

	private String albumCode;
	private String description;
	private double price;
	
	public String getAlbumCode() {
		return albumCode;
	}
	public void setAlbumCode(String albumCoode) {
		this.albumCode = albumCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
	
	@Override
    public String toString() {
        return description;
    }
}
