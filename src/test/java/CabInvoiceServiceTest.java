import com.bridgelabz.CabInvoiceService;
import com.bridgelabz.MultipleRide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceServiceTest {
    @Test
    public  void whenGivenDistanceAndTime_ShouldReturnTotalFare(){
        CabInvoiceService cabInvoiceService = new CabInvoiceService();
        double distance = 2.0;
        int time = 5;
        double totalFare = cabInvoiceService.calculateFare(distance, time);
        Assertions.assertEquals(25,totalFare, 0.0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare(){
        CabInvoiceService cabInvoiceService = new CabInvoiceService();
        double distance = 0.1;
        int time = 1;
        double totalFare = cabInvoiceService.calculateFare(distance, time);
        Assertions.assertEquals(5, totalFare, 0.0);
    }
    @Test
    public void givenMultipleRides_shouldReturn_averageFare(){
        CabInvoiceService cabInvoiceService = new CabInvoiceService();
        MultipleRide[] rides = { new MultipleRide (2.0,5),
                                 new MultipleRide (2.0,5)
        };
        double result = cabInvoiceService.calculateTotalAggregate(rides);
        Assertions.assertEquals(25,result);

    }
}
