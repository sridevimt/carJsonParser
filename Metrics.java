import java.io.Serializable;


public class Metrics implements Serializable {

    private static final long serialVersionUID = 1821180957012549725L;
    private double yoymaintenancecost;
    private double depreciation;
    private RentalCount rentalcount;


    public double getYoymaintenancecost() {
        return yoymaintenancecost;
    }

    public void setYoymaintenancecost(double yoymaintenancecost) {
        this.yoymaintenancecost = yoymaintenancecost;
    }


    public double getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(double depreciation) {
        this.depreciation = depreciation;
    }

    public RentalCount getRentalcount() {
        return rentalcount;
    }

    public void setRentalcount(RentalCount rentalcount) {
        this.rentalcount = rentalcount;
    }




    @Override
    public String toString() {
        return "Metrics{" +
                "mainteneneceCost=" + yoymaintenancecost +
                ", depreciation=" + depreciation +
                ", rentalCount=" + rentalcount +
                '}';
    }
}
