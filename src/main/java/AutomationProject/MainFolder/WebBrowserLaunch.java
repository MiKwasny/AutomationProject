package AutomationProject.MainFolder;


public class WebBrowserLaunch {


    public static void Launch() {
<<<<<<< HEAD
        System.setProperty("webdriver.gecko.driver", "D:\\JavaEverything\\drivers\\geckodriver.exe");
=======
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Comarch\\Desktop\\Selenium Webdriver\\geckodriver.exe");
>>>>>>> 89f9f09ee7be26927b494fd793ff736b821de419
        String appUrl = "http://www.phptravels.net/";
        Driver.driver.get(appUrl);
        //Driver.driver.manage().window().maximize();
        //String Title = Driver.driver.getTitle();
        //System.out.println("Actual title is " + Title);

    }

}