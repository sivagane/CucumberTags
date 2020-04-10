package org.cucumberTags.StepDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
WebDriver driver;

@Before
public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.crmpro.com/");
    driver.findElement(By.name("username")).sendKeys("batchautomation");
    driver.findElement(By.name("password")).sendKeys("Test@12345");
    driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
}
@After
public void tearDown() {
	driver.quit();
}
//@Given("User enters with valid login id and valid password")
//public void user_enters_with_valid_login_id_and_valid_password() {
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.crmpro.com/");
//    driver.findElement(By.name("username")).sendKeys("batchautomation");
//    driver.findElement(By.name("password")).sendKeys("Test@12345");
//    driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
//   
//}

//@Given("User enters with Invalid login id and valid password")
//public void user_enters_with_Invalid_login_id_and_valid_password() {
//	
//}
//
//@Given("User creates a contact")
//public void user_creates_a_contact() {
//   driver.switchTo().frame("mainpanel");
//   Actions action= new Actions (driver);
//   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Contacts']"));
//   action.moveToElement(Contacts).build().perform();
//   driver.findElement(By.xpath("//a[text()='New Contact']")).click();
//   driver.findElement(By.id("first_name")).sendKeys("Siva");
//   driver.findElement(By.id("surname")).sendKeys("Ganesh");
//   WebElement select1 = driver.findElement(By.xpath("(//select[@class='select' and  @size='1'])[4]"));
//   Select s=new Select(select1);
//   s.selectByVisibleText("Esq.");
//   
//   WebElement select2 = driver.findElement(By.xpath("(//select[@class='select' and  @size='1'])[6]"));
//   Select s1= new Select(select2);
//   s1.selectByVisibleText("Prospect");
//   driver.findElement(By.xpath("(//input[@class='button' and @value='Load From Company']/following-sibling::input)[1]")).click();
//}
//
//@Given("User creates a Deal")
//public void user_creates_a_Deal() {
//	 driver.switchTo().frame("mainpanel");
//	 Actions action= new Actions (driver);
//	   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Deals']"));
//	   action.moveToElement(Contacts).build().perform();
//	   driver.findElement(By.xpath("//a[text()='New Deal']")).click();
//	   driver.findElement(By.id("title")).sendKeys("New Title 2");
//	   driver.findElement(By.name("contact_lookup")).sendKeys("New Contact");
//	   driver.findElement(By.xpath("//input[@type='submit' and @value='Save and Create Another']/preceding-sibling::input")).click();
//}
//
//@Given("User creates a Task")
//public void user_creates_a_Task() {
//	 driver.switchTo().frame("mainpanel");
//	Actions action= new Actions (driver);
//	   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Tasks']"));
//	   action.moveToElement(Contacts).build().perform();
//	   driver.findElement(By.xpath("//a[text()='New Task']")).click();
//	   driver.findElement(By.xpath("//input[@id='title']")).sendKeys("New Tasks 1");
//	   driver.findElement(By.id("completion")).sendKeys("50");
//	   Select s= new Select(driver.findElement(By.xpath("//select[@class='select' and @name='priority']")));
//	   s.selectByVisibleText("Normal");
//	   driver.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[1]/td/input")).click();
//}
//
//@Given("User Searches LeftPanel")
//public void user_Searches_LeftPanel() {
//   driver.switchTo().frame("mainpanel");
//   driver.findElement(By.xpath("//a[text()='Pipeline']")).click();
//   Select s= new Select (driver.findElement(By.name("by_user")));
//   s.selectByVisibleText("All Users");
//}
//
//@Given("User creates a Case")
//public void user_creates_a_Case() {
//	driver.switchTo().frame("mainpanel");
//	Actions action= new Actions (driver);
//	   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Cases']"));
//	   action.moveToElement(Contacts).build().perform();
//	   driver.findElement(By.xpath("//a[text()='New Case']")).click();
//	  driver.findElement(By.xpath("(//input[@type='radio' and @name='closed'])[2]")).click();
//	  Select s= new Select(driver.findElement(By.xpath("//select[@class='select' and @name='type' and @size='1']")));
//	  s.selectByVisibleText("Technical Support");
//	  driver.findElement(By.name("email_notification")).click();
//	  driver.findElement(By.xpath("(//td[@align='center' and @valign='top' and @colspan='2'])[1]")).click();
//}

//@Given("User creates a Doc")
//public void user_creates_a_Doc() {
//	driver.switchTo().frame("mainpanel");
//	Actions action= new Actions (driver);
//	   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Docs']"));
//	   action.moveToElement(Contacts).build().perform();
//	   driver.findElement(By.xpath("//a[text()='New Document']")).click();
//	   driver.findElement(By.id("title")).sendKeys("New Docs Title");
//	   driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("I Want to create a new Document for the Technical Development of my Company regarding the development of new Softwares");
//	   driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\sivag\\Downloads\\Siva.xlsx");
//	   driver.findElement(By.xpath("//*[@id=\"docForm\"]/table/tbody/tr[14]/td[2]/input")).click();
//}
//
//@Given("User creates a Form")
//public void user_creates_a_Form() {
//	driver.switchTo().frame("mainpanel");
//	Actions action= new Actions (driver);
//	   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Forms']"));
//	   action.moveToElement(Contacts).build().perform();
//	   driver.findElement(By.xpath("//a[text()='New Form']")).click();
//	   driver.findElement(By.id("title")).sendKeys("New Form");
//	   driver.findElement(By.id("report_email")).sendKeys("sivaabi81@yahoo.com");
//	   driver.findElement(By.xpath("//textarea[@name='welcome_message']")).sendKeys("Hi Welcome. Create a new Form");
//	   driver.findElement(By.xpath("//textarea[@name='confirmation_message']")).sendKeys("Form is created Successfully");
//	   driver.findElement(By.xpath("//td[@align='center' and @valign='top' and @colspan='2']//descendant::input")).click();
//}
//
//@Given("User Reports")
//public void user_Reports() {
//	driver.switchTo().frame("mainpanel");
//    driver.findElement(By.xpath("//a[text()='Reports']")).click();
//    WebElement DealStatistics = driver.findElement(By.xpath("//a[text()='Deal Statistics']"));
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	   js.executeScript("arguments[0].scrollIntoView(true)", DealStatistics);
//	   DealStatistics.click();
//		
//}
//
//@Given("User creates a Company")
//public void user_creates_a_Company() {
//	driver.switchTo().frame("mainpanel");
//	Actions action= new Actions (driver);
//	   WebElement Contacts = driver.findElement(By.xpath("//a[text()='Companies']"));
//	   action.moveToElement(Contacts).build().perform();
//	   driver.findElement(By.xpath("//a[text()='New Company']")).click();
//	   driver.findElement(By.id("company_name")).sendKeys("New Company");
//	   Select s= new Select (driver.findElement(By.xpath("//select[@name='source' and @class='select' and @size='1']")));
//	   s.selectByVisibleText("Customer");
//	   driver.findElement(By.xpath("//input[@type='button' and  @value='Lookup' and @onclick]")).click();
//	   Set<String> allwinhan = driver.getWindowHandles();
////	   List<String> li= new ArrayList<String>();
////	   li.addAll(allwinhan);
////	   String win = li.get(0);
////	   driver.switchTo().window(win);
//	   Iterator<String> itr = allwinhan.iterator();
//	   String parentwindow = itr.next();
//	   System.out.println("The Parent window id is "+parentwindow);
//	   System.out.println("The Title of the Page is "+driver.getTitle());
//	   String childwindow = itr.next();
//	   driver.switchTo().window(childwindow);
//	   driver.findElement(By.id("search")).sendKeys("New Company");
//	   driver.findElement(By.xpath("//input[@type='submit']")).click();
//	   driver.findElement(By.xpath("//input[@type='button']")).click();
//}

@Given("User Searches for Company")
public void user_Searches_for_Company() {
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.name("search")).sendKeys("New Company");
	driver.findElement(By.xpath("//input[@type='image']")).click();
	
}

@Given("User clicks Timeline")
public void user_clicks_Timeline() throws InterruptedException {
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//a[text()='Timeline']")).click();
	driver.findElement(By.xpath("//img[@src='https://www.crmpro.com/external/jscalendar/img.gif' and @id='f_trigger_c_date_from']")).click();
	WebElement NextYear = driver.findElement(By.xpath("(//div[@unselectable='on'])[7]"));
	for(int i=0;i<15;i++) {
		NextYear.click();
	}
	Thread.sleep(3000);
	WebElement NextMonth = driver.findElement(By.xpath("(//div[@unselectable='on'])[6]"));
	for(int i=0;i<2;i++) {
		NextMonth.click();
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//tr[@class='daysrow']/descendant::td[text()='17']")).click();
	driver.findElement(By.xpath("//select[@name='focus_on' and @class='select']/following-sibling::input")).click();
}

@Given("User creates a Alert")
public void user_creates_a_Alert() {
	driver.switchTo().frame("mainpanel");
	 driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	 driver.findElement(By.xpath("//option[text()='[A]ll users']")).click();
	 Select s =new Select(driver.findElement(By.xpath("//select[@name='format']")));
	 s.selectByVisibleText("Text Message Alert");
	 driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td/fieldset/form/table/tbody/tr/td[1]/table/tbody/tr[7]/td[2]/input")).click();
}

@Given("User Click on CustomView")
public void user_Click_on_CustomView() {
	driver.switchTo().frame("mainpanel");
	 driver.findElement(By.xpath("//a[text()='Custom Views']")).click();
}

}
