import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class GenericCar implements Serializable {


    private static final long serialVersionUID = -3635706843945768603L;

    private String vin;

    @SerializedName(value= "perdayrent")
    private PerDayRent perDayRent;

    private Metrics metrics;

   // @SerializedName(value= "metadata")
    private Metadata metadata;

    private String make;
    private String model;


    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    public PerDayRent getPerDayRent() {
        return perDayRent;
    }

    public void setPerDayRent(PerDayRent perDayRent) {
        this.perDayRent = perDayRent;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public String toString() {
        return "GenericCar{" +
                "vin='" + vin + '\'' +
                ", perdayrent=" + perDayRent +
                ", metrics=" + metrics +
                ", metadata=" + metadata +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
