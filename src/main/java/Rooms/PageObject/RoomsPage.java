package Rooms.PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RoomsPage {
    protected SelenideElement
            gotoRoomsPage=$(byText( "Welcome to Georgia" )),
            gotoPageTbilisi= $(".header__top__nav",0).$(byText( "Tbilisi" )),
            checkToTitle = $(".module-intro__headline"),
            gotoMenuBar = $(".menu-toggler__icon"),
            chooseEvents= $(".container").$(byText( "Events Calendar")),
            selectTypeButton = $("#type-button"),
            chooseEventType =$("#ui-id-2"),
            GotoCalendar =$("#from"),
            gotoNextMonth =$(".ui-datepicker-next"),
            selectDate = $(byLinkText( "10" )),
            gotoEventPage = $(byText( "View Past Events" )),
            eventsArchive= $(byText( "#Art: Mamuka Japharidze – Works from Archive" )),
            eventsDetails = $(".event-item__infos",1).$(byText( "More Info" ));



}
