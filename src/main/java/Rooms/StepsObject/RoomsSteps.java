package Rooms.StepsObject;

import Rooms.PageObject.RoomsPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class RoomsSteps extends RoomsPage {
    public RoomsSteps gotoWebsite(){
        gotoRoomsPage.waitUntil( Condition.visible,3000 );
        gotoPageTbilisi.click();

        return this;
    }


    public RoomsSteps gotoEventsCalendarPage(){
        gotoMenuBar.click();
        chooseEvents.click();
        selectTypeButton.click();
        chooseEventType.click();
        GotoCalendar.click();
        gotoNextMonth.click();
        gotoNextMonth.click();
        selectDate.click();
        return this;

    }
    public RoomsSteps gotoEventsHistoryPage(){
        gotoEventPage.click();
        eventsArchive.scrollIntoView( "true" );
        eventsArchive.shouldBe( Condition.visible );
        eventsDetails.click();
        return this;

    }



}
