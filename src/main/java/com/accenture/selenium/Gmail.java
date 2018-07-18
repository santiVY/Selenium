package com.accenture.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	
	public  void IrSantiago() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		String url = "https://mail.google.com";   // llama la url de gmail
		driver.get(url);  //url por get
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //Tiempo en segundos
	
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']")); // id identificador identifica el correo
		email_phone.sendKeys("svy9602@gmail.com"); // input donde se va ingresar el correo o lo que se vaya buscar
		driver.findElement(By.id("identifierNext")).click(); // clic del boton
	
		WebElement password = driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")); // id identificar identificar la contraseña
		WebDriverWait wait = new WebDriverWait(driver, 50); 
		wait.until(ExpectedConditions.elementToBeClickable(password)); // pasword  
		password.sendKeys("@@@@@@@"); // contraseña
		driver.findElement(By.id("passwordNext")).click();
		
		
	
		WebElement click1;
		WebElement click2;
		WebElement click3;
		WebElement click4;
		WebElement click5;
	
	
		click1 = driver.findElement(By.xpath("//*[@id=\":kc\"]/div/div")); // aca selecciono el boton redactar por xpath
		click1.click();
	
		click2 = driver.findElement(By.name("to"));
		click2.sendKeys("daneilatoro@gmail.com");
		click2.click();
	
		click3 = driver.findElement(By.name("subjectbox"));
		click3.sendKeys("Dani esto es una prueba de mi automatización");
		click3.click();
	
		click4 = driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]")); 
		click4.sendKeys("Esto es una prueba");
		click4.click();
	
		click5 = driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")); // id identificador identifica el correo;
		click5.click();
	}
}

