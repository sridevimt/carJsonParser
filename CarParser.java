import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarParser {

    public static GenericCar[] readCarObject(String filePath) {

        BufferedReader br = null;
        GenericCar[] result = null;
        try {
            Gson gson = new Gson();
            br = new BufferedReader(new FileReader(filePath));
            result = gson.fromJson(br, GenericCar[].class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


        }

        return result;
    }


    public static List<GenericCar> printBlueTeslas(String filePath) {

        GenericCar[] result = readCarObject(filePath);
        List<GenericCar> carList = new ArrayList<GenericCar>();

        for (GenericCar car : result) {
            //System.out.println(car+ "\n");
            if (car == null) {
                continue;
            }
            if (car.getMetadata().getColor().equals("Blue") && car.getMake().equals("Tesla")) {
                System.out.println(car.getMetadata().getColor() + " - " + car.getMetadata().getNotes());
                carList.add(car);
            }
        }
        return carList;

    }


    public static GenericCar lowestPrices(String filePath)  {
        GenericCar[] result = readCarObject(filePath);
        double minPrice = result[0].getPerDayRent().getPrice();
        GenericCar lowestPricedCar  = result[0];
        double minDiscountedPrice = result[0].getPerDayRent().getPrice()- result[0].getPerDayRent().getDiscount();
        GenericCar lowestDiscountedPricedCar  = result[0];

        for (GenericCar car : result) {
            //System.out.println(car+ "\n");
            if(car == null){
                continue;
            }

            if (car.getPerDayRent().getPrice() < minPrice) {
                minPrice = car.getPerDayRent().getPrice();
                lowestPricedCar = car;
            }

            if((car.getPerDayRent().getPrice()-car.getPerDayRent().getDiscount())< minDiscountedPrice)
            {
                minDiscountedPrice = car.getPerDayRent().getPrice()-car.getPerDayRent().getDiscount();
                lowestDiscountedPricedCar = car;
            }

        }

        System.out.println(minPrice);
        System.out.println(lowestPricedCar);
        System.out.println(lowestDiscountedPricedCar);
        return lowestPricedCar;
    }


    public static GenericCar highestRevenue(String filePath) {

        GenericCar[] result = readCarObject(filePath);
        GenericCar highestRevCar = result[0];
        double grossIncome = result[0].getMetrics().getRentalcount().getYeartodate()*(result[0].getPerDayRent().getPrice()-result[0].getPerDayRent().getDiscount());
        double yoy = result[0].getMetrics().getYoymaintenancecost();
        double depricate = result[0].getMetrics().getDepreciation();
        double totalExpense = yoy+depricate;
        double totalRevenue = grossIncome-totalExpense;
        double maxRevenue =  totalRevenue;

        for (GenericCar car : result) {
            //System.out.println(car+ "\n");
            if (car == null) {
                continue;
            }
            yoy = car.getMetrics().getYoymaintenancecost();
            depricate = car.getMetrics().getDepreciation();
            totalExpense = yoy + depricate;
            grossIncome = car.getMetrics().getRentalcount().getYeartodate() * (car.getPerDayRent().getPrice() - car.getPerDayRent().getDiscount());
            totalRevenue = grossIncome - totalExpense;
            if (totalRevenue > maxRevenue) {
                maxRevenue = totalRevenue;
                highestRevCar = car;
            }

        }
        System.out.println(maxRevenue);
        System.out.println(highestRevCar);
        return highestRevCar;
    }

}
