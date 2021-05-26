import Rooms.Chrome.ChromeRunner;
import Rooms.StepsObject.RoomsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RoomsHotel extends ChromeRunner {
    @Test
    public void roomsHotelPage(){
        RoomsSteps steps = new RoomsSteps();
        steps
                .gotoWebsite();
        String expectedResult = "Old City. New City.".toUpperCase();
        Assert.assertEquals( expectedResult, $(".module-intro__headline").getText(),"check title");
        sleep( 5000 );

    }
}
