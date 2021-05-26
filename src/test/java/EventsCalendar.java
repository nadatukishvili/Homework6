import Rooms.Chrome.ChromeRunner;
import Rooms.StepsObject.RoomsSteps;
import org.testng.annotations.Test;

public class EventsCalendar extends ChromeRunner {
    @Test
    public void Events(){
        RoomsSteps eventSteps = new RoomsSteps();
                eventSteps
                        .gotoEventsCalendarPage()
                        .gotoEventsHistoryPage();


    }
}
