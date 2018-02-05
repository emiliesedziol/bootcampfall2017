import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    // constructor
 //   public Product() {
 //       code = "";
 //       description = "";
 //       price = 0;
 //   }
    
    public Product(String code, String description, double price) {
    		code = "abc";
    		description = "testing";
    		price = 54.40;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // method not defined with the constructor
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}