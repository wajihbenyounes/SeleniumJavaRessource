package Stms;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ressource {
	
	WebDriver driver ;
	@BeforeTest
	public void OpenRessourcePage () {
		
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("https://app-develop.stradatms.net/resources");
		
		// driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar/div[2]/ul/li[17]/a")).click(); // ressource icone
		
		// driver.findElement(By.xpath("//*[@id=\"configuration\"]/ul/li[2]/a")).click(); // ressource
		
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}
	
	@Test 
	public void Resource () {

		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/app-resources/div/div/div[1]/mat-selection-list/mat-list-option[1]/div")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/app-navbar/header/div/div[1]/div[2]/button[1]")).click(); 
		// Nouveau type
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("mat-input-0")).sendKeys("TestAuto"); // Libellé d’absence
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("mat-input-1")).sendKeys("Test2"); // Code d’absence
		
		driver.findElement(By.xpath("//*[@id=\"columnModal\"]/div/div/div[2]/p[3]/input")).click() ; // Couleur d’affichage
		
		driver.findElement(By.xpath("//*[@id=\"columnModal\"]/div/div/div[2]/p[3]/color-picker/div/div[9]/div[2]/div[2]")).click() ; // blue color select
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).click(); // Code d’absence 

		driver.findElement(By.xpath("//*[@id=\"columnModal\"]/div/div/div[3]/button[1]")).click() ; // Valider
		
			
			driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/app-resources/div/div/div[1]/mat-selection-list/mat-list-option[2]/div/div[2]")).click();
			// Type d'échéance 
			
			driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/app-navbar/header/div/div[1]/div[2]/button[1]")).click(); // Nouveau type
			
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"addLibelle\"]")).sendKeys("Test1925"); // libéllé
			
			driver.findElement(By.xpath("//*[@id=\"mat-radio-4\"]")).click(); // Indefini
						
			driver.findElement(By.xpath("//*[@id=\"mat-radio-13\"]")).click(); // annuelle
					
			driver.findElement(By.xpath("//*[@id=\"columnModal\"]/div/div/form/div[1]/div[4]/div/div/div[2]/div/div[1]/span/input")).sendKeys("5"); // toute les ***
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-44\"]")).click(); // Chekbox -- le  *** 
			
			driver.findElement(By.xpath("//*[@id=\"columnModal\"]/div/div/form/div[1]/div[4]/div/div/div[2]/div/div[2]/span/span[1]/input")).sendKeys("02");
			
			driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div")).click(); // open dropdown
			
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"mat-option-12\"]/span")).click(); // Mai
			
			//Select MoisTypeEcheance = new Select (driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div"))) ; // Open dropdown 
			
			//MoisTypeEcheance.selectByVisibleText("Mai"); // Mai
					
			driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div[2]/app-resources/div/div/div[2]/app-deadline-ressources/div[2]/div/div/form/div[2]/button[1]")).click();
			//Valider 
			
			
		}
		
}


