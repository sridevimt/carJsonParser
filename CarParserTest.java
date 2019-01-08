import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CarParserTest {

    @Test
    public void testPrintBlueTeslas()  {
        String filePath = "/Users/sridevi/Downloads/data.txt";
        List<GenericCar> carList = CarParser.printBlueTeslas(filePath);
        for(GenericCar car: carList){
            assertEquals("Blue", car.getMetadata().getColor());
            assertEquals("Tesla",car.getMake());
        }
    }

    @Test
    public void testLowestPrices(){
        String filePath = "/Users/sridevi/Downloads/data.txt";
        GenericCar car = CarParser.lowestPrices(filePath);
        assertEquals("Tesla", car.getMake());
        assertEquals("T1", car.getModel());
    }

    @Test
    public void testHighestRevenue(){

        String filepath = "/Users/sridevi/Downloads/data.txt";
        GenericCar  car = CarParser.highestRevenue(filepath);
        assertEquals("Tesla", car.getMake());
        assertEquals("T2", car.getModel());


    }
}