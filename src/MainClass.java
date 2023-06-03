import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class MainClass {

	static WebDriver driver = new ChromeDriver();
	Assertion myAssert = new Assertion();
	Random rand = new Random();
	
	String WebSiteURL = "https://magento.softwaretestingboard.com/";
	String SignupPageURL = "https://magento.softwaretestingboard.com/customer/account/create/";
	String SingInPageURL = "https://magento.softwaretestingboard.com/customer/account/login";
	String SingOutURL = "https://magento.softwaretestingboard.com/customer/account/logout/"; 
	String CheckoutPageURL = "https://magento.softwaretestingboard.com/checkout/";

	
	String[] firstNameList = { "ahmad", "ali", "anas", "mahmoud", "toqa" };
	String[] lastNameList = { "mahmoud", "noureldin", "faisal", "bahaa", "fadi" };
	String MutualPassowrd = "Sksk123!@#";
	String theEmailToLogin;
	
	String EmailUser = "user";
	String EmailComplete = "@yahoo.com";
	
	String PhoneNumer = "00962792281383";
	
    int RandomIndex = rand.nextInt(0, 5);
	int RandomIndexForEmail = rand.nextInt(0, 100);
	
	// How many pieces to order it
	String radiantNumber = "3";
	String breatheNumber = "2";
	String argusNumber = "4";
	String heroNumber = "1";
	String backpackNumber = "5";

	int numberOfItemTobeAdded = 5;

	// this the price
	String RadinetPrice;
	String breathePrice;

	String argusPrice;
	String heroPrice;
	String backpackPrice;

	

	
	
	
}
