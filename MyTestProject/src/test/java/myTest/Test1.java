package myTest;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Screen;

public class Test1 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.16.1.215:9090");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='tree_close']")).click();
		driver.findElement(By.xpath("//*[@id=\"pathway\"]")).click();
	//	WebDriverWait wait = new WebDriverWait(driver, 60);
	//	wait.until(ExpectedConditions..elementToBeClickable(driver.findElement(By.xpath("//*[@id=\'place_trb\']/div[1]/button[1]"))));//.visibilityOf());
		Thread.sleep(17000);
		
		driver.findElement(By.xpath("//*[@id=\'place_trb\']/div[1]/button[1]")).click();////*[@id='place_trb']/div[1]/button[1]
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-vertical-pane/div/div/app-pathway-creation/div/div/split/split-area/split/split-area[1]/accordion/accordion-group[2]/div/div[2]/div/div[3]/a[1]")).click();
		Thread.sleep(7000);
		
	//	Screen src=new Screen();
		
	//	Pattern img1 = new Pattern("D:\\Selenium Files\\Sikuli\\Images\\HumanAgent.PNG");
	//	Pattern img2 = new Pattern("D:\\Selenium Files\\Sikuli\\Images\\DragDropBox.PNG");
		
		/*src.hover("D:\\Selenium Files\\Sikuli\\Images\\1.PNG");
		Thread.sleep(2000);
		src.dragDrop("D:\\Selenium Files\\Sikuli\\Images\\HumanAgent.PNG","D:\\Selenium Files\\Sikuli\\Images\\DragInfo.PNG");
		src.dragDrop("D:\\Selenium Files\\Sikuli\\Images\\Test_independent_entity.PNG","D:\\Selenium Files\\Sikuli\\Images\\DragInfo.PNG");
		src.dragDrop("D:\\Selenium Files\\Sikuli\\Images\\Test_first_agent_for_qa.PNG","D:\\Selenium Files\\Sikuli\\Images\\DragInfo.PNG");
		Thread.sleep(2000);
		*/
		//Click on Drag and Drop Box
		driver.findElement(By.id("trb_0")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.id("delete_test_first_agent_for_qa")).click();
	//	driver.findElement(By.xpath("//*[@id='delete_test_first_agent_for_qa']")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id='delete_test_first_agent_for_qa']")).click();
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.className("info-layer")));
		
	//	ac.moveToElement(driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button[1]"))).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert ale=driver.switchTo().alert();
		ale.accept();
		
		WebElement element = driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button[1]"));	
		System.out.println(element.getText());
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		
		Thread.sleep(2000);
		
	//	src.dragDrop("D:\\Selenium Files\\Sikuli\\Images\\Test_first_agent_for_qa.PNG","D:\\Selenium Files\\Sikuli\\Images\\DragInfo.PNG");
		
		
	//	String create_dependent_entity_attribute = driver.switchTo().alert().getText();
	//	Assert.assertEquals("Please select constraint", create_dependent_entity_attribute);
		
	//	Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.className("info-layer"))).perform();
		
		//Updating Intent1 Name
		String s="My Intent1";
	//	ac.doubleClick(driver.findElement(By.id("trb_intent1"))).sendKeys(Keys.chord(Keys.CONTROL, "a")).sendKeys(s).build().perform();
	
		//Click on Drag and Drop Box
		driver.findElement(By.id("trb_0")).click();
		Thread.sleep(2000);
		//Updating Process name
	//	ac.doubleClick(driver.findElement(By.id("process_Process Name"))).sendKeys(Keys.chord(Keys.CONTROL, "a")).sendKeys("My Process1").build().perform();
		Thread.sleep(2000);	
		//Click on Drag and Drop Box
	//	driver.findElement(By.id("trb_0")).click();
		
		//Click on Expand icon of entity
		driver.findElement(By.id("open_test_first_agent_for_qa")).click();
		Thread.sleep(2000);
		
		//Click on "Test Name button" in Attributes
		driver.findElement(By.name("select_attribute_test_first_agent_for_qa_test_name")).click();
		
		//Click on "ON and OFF" button
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		
		//Click on File Location
		driver.findElement(By.name("select_attribute_test_first_agent_for_qa_file_location")).click();
		
		//Click on "ON and OFF" button
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		
		//Click  on creation_datetime
		driver.findElement(By.name("select_attribute_test_first_agent_for_qa_creation_datetime")).click();
		
		//Click on "ON and OFF" button
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		
		//Click on test_first_agent_for_qa_id
		driver.findElement(By.name("select_attribute_test_first_agent_for_qa_test_first_agent_for_qa_id")).click();
		//Click on "ON and OFF" button
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.switch.switch-small.switch-labeled")).click();
		Thread.sleep(2000);
		//Click on test_first_agent_for_qa_id
		driver.findElement(By.name("select_attribute_test_first_agent_for_qa_test_first_agent_for_qa_id")).click();
		
		//Click on Expand icon of entity
		driver.findElement(By.id("close_test_first_agent_for_qa")).click();
		Thread.sleep(2000);
		
		//Click on 'Save' icon 
		driver.findElement(By.id(s+""+"_save")).click();
		
	}	
		


		

	

}
