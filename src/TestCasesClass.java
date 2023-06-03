import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesClass extends MainClass {

	@BeforeTest
	public void myBeforeTest() {

		driver.manage().window().maximize();
		driver.get(WebSiteURL);

	}

	@Test(priority = 1)
	public void SingIUp() throws InterruptedException {

		driver.get(SignupPageURL);
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));

		firstName.sendKeys(firstNameList[RandomIndex]);

		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));

		lastName.sendKeys(lastNameList[RandomIndex]);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));

		email.sendKeys(EmailUser + RandomIndexForEmail + EmailComplete);

		theEmailToLogin = EmailUser + RandomIndexForEmail + EmailComplete;
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys(MutualPassowrd);
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
		confirmpassword.sendKeys(MutualPassowrd);

		WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));

		createAccount.click();
		
		Thread.sleep(5000);
		
		driver.get(SingOutURL);

	}

	@Test(priority = 2)
	public void SignIn() {

		driver.get(SingInPageURL);
		WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		EmailField.sendKeys(theEmailToLogin);
		WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		PasswordField.sendKeys(MutualPassowrd);

		WebElement SingInButton = driver.findElement(By.xpath("//*[@id=\"send2\"]"));

		SingInButton.click();
	}
	
	@Test(priority = 3)
	public void AddItems() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] ItemPages = { "https://magento.softwaretestingboard.com/radiant-tee.html",
			                   "https://magento.softwaretestingboard.com/breathe-easy-tank.html",
				               "https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
			                   "https://magento.softwaretestingboard.com/hero-hoodie.html",
				               "https://magento.softwaretestingboard.com/fusion-backpack.html" };

		for (String ITEM : ItemPages) {
			driver.get(ITEM);

			Thread.sleep(5000);

			if (driver.getCurrentUrl().contains("radiant")) {
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(radiantNumber);

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
		    	colors.get(randomIndexForTheColor).click();
				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("breathe")) {
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(breatheNumber);

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();

				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
	     		AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("argus")) {

				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

	   		Quantity.sendKeys(argusNumber);

			WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();

				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("hoodie")) {

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();

				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));

				Quantity.sendKeys(heroNumber);

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("backpack")) {
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(backpackNumber);

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(3000);
			}

		}

	}

	@Test(priority = 4)
	public void CheckOutProcess() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(CheckoutPageURL);

		WebElement StreetAdress = driver.findElement(By.name("street[0]"));
		StreetAdress.sendKeys("AmmanStreet");

		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("Amman");

		WebElement region = driver.findElement(By.name("region_id"));
		Select selector_Region = new Select(region);
		selector_Region.selectByIndex(RandomIndex);

		WebElement PostalCode = driver.findElement(By.name("postcode"));
		PostalCode.sendKeys("123");

		WebElement country = driver.findElement(By.name("country_id"));
		Select selector_Country = new Select(country);		
		selector_Country.selectByIndex(RandomIndex);

		WebElement mobileNumber = driver.findElement(By.name("telephone"));

		mobileNumber.sendKeys(PhoneNumer);
		Thread.sleep(10000);
		WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
		SubmitButton.click();
	}

	@Test()
	public void this_is_a_test() {

		List<String> PriceList = new ArrayList<String>();

		PriceList.add(RadinetPrice);
		PriceList.add(breathePrice);
		PriceList.add(argusPrice);
		PriceList.add(heroPrice);
		PriceList.add(backpackPrice);


		for (int i = 0; i < PriceList.size(); i++) {

			String ListPriceUpdated = PriceList.get(i);
			String output = ListPriceUpdated.replaceAll("\\$|\\.\\d+", "");

			int finalPrice = Integer.parseInt(output);
			
			System.out.println(finalPrice);

		}
		
		
		List<String> ItemNumber = new ArrayList<String>();

		ItemNumber.add(radiantNumber);
		ItemNumber.add(breatheNumber);
		ItemNumber.add(argusNumber);
		ItemNumber.add(heroNumber);
		ItemNumber.add(backpackNumber);

		
		
		for (int i = 0; i < ItemNumber.size(); i++) {

			String ItemNumberUpdated = ItemNumber.get(i);

			int finalPrice = Integer.parseInt(ItemNumberUpdated);
			
			System.out.println(finalPrice);

		}

	}
}
