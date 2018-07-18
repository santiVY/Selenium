package com.accenture.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duolingo {

	public void AbrirDuolingo() {
		
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.duolingo.com";
		Driver.get(url);
		
		WebElement ingresar = Driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]"));
		ingresar.click();
		
		WebElement correo = Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]"));
		correo.sendKeys("svy9602@gmail.com");
		correo.click();
		
		WebElement contrasena = Driver.findElement(By.xpath("//*[@id=\"top_password\"]"));
		contrasena.sendKeys("Sonlas12sisabe@");
		contrasena.click();
		
		WebElement iniciar = Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[3]"));
		iniciar.click();
		
	}
}
