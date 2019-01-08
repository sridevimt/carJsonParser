import java.io.Serializable;


public class PerDayRent implements Serializable{


    private static final long serialVersionUID = 2441884604454610729L;
    private double Price;
    private double Discount;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    @Override
    public String toString() {
        return "PerDayRent{" +
                "price=" + Price +
                ", discount=" + Discount +
                '}';
    }
}
