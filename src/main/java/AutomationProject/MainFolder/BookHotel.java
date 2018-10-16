package AutomationProject.MainFolder;

import AutomationProject.UI_Elements.BookingPathElements;
import org.openqa.selenium.By;

public class BookHotel extends BookingPathElements{

    public static void BookHotelPosition(String How, int ListPosition){

        switch(How){
            case "Picture":
                BookingPathElements.Hotels.HotelListByPicture(ListPosition);
            case "LinkText":
                BookingPathElements.Hotels.HotelListByLinkText(ListPosition);
            case "DetailsButton":
                BookingPathElements.Hotels.HotelListByDetailsButton(ListPosition);
        }
    }
    public static void BookHotelDetailsOptions(){
        //To DO
    }
    public static void BookHotelAvailableRoomsPick(String roomType){

        for (int i=0;i<=4;i++){
            if(i == 1 && Driver.driver.findElement(By.cssSelector("#ROOMS > div > table > tbody > tr:nth-child(1) > td > div.col-md-10.col-xs-7.g0-left > div.col-md-4.go-right > div:nth-child("+i+") > h4 > a > b")).getText() == roomType){
                BookingPathElements.Hotels.HotelAvailableRooms(i);
            }
            if(i > 1 && Driver.driver.findElement(By.cssSelector("#ROOMS > div > table > tbody > tr:nth-child(1) > td > div.col-md-10.col-xs-7.g0-left > div.col-md-4.go-right > div:nth-child("+(i+6)+") > h4 > a > b")).getText() == roomType){
                BookingPathElements.Hotels.HotelAvailableRooms((i+6));
                break;
            }
        }
        System.out.println("This Hotel does not have this kind of available room!");
    }
}
