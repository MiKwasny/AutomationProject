package AutomationProject.MainFolder;

import AutomationProject.UI_Elements.BookingPathElements;

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
    public static void BookHotelAvailableRoomsPick(int ListPosition){
        //To DO
    }
}
