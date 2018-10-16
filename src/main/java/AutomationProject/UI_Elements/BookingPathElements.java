package AutomationProject.UI_Elements;

import AutomationProject.MainFolder.Driver;
import org.openqa.selenium.By;

public class BookingPathElements {

    public static class Hotels{

        public static void HotelListByPicture(int ListPosition){

            Driver.driver.findElement(By.cssSelector("#body-section > div.listingbg > div > div.col-md-9.col-xs-12 > div.row > div > table > tbody > tr:nth-child("+ListPosition+") > td > div.col-md-3.col-xs-4.go-right.rtl_pic > div > a")).click();
        }

        public static void HotelListByLinkText(int ListPosition){

            Driver.driver.findElement(By.cssSelector("#body-section > div.listingbg > div > div.col-md-9.col-xs-12 > div.row > div > table > tbody > tr:nth-child("+ListPosition+") > td > div.col-md-6.col-xs-4.go-right > div > h4 > a > b")).click();
        }

        public static void HotelListByDetailsButton(int ListPosition){

            Driver.driver.findElement(By.cssSelector("#body-section > div.listingbg > div > div.col-md-9.col-xs-12 > div.row > div > table > tbody > tr:nth-child("+ListPosition+") > td > div.col-md-3.col-xs-4.col-sm-4.go-left.pull-right.price_tab > a > button")).click();
        }

        public static void HotelAvailableRooms(int ListPosition){

            Driver.driver.findElement(By.cssSelector("#ROOMS > div > table > tbody > tr:nth-child("+ListPosition+") > td > div.col-md-10.col-xs-7.g0-left > div.col-md-8.book_area.go-left > div > div.col-md-2.go-right.pull-right > div > label > div")).click();
        }


    }
}
