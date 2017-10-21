/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.logicgameplayer;

//import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author admin
 */
public class LogicGamePlayer {

    public void playGame() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl = "http://htmlpreview.github.io/?https://github.com/jackpowers/The-Logic-Game/blob/master/gameboard/logicgame.html";
        driver.get(baseUrl);

        WebElement form1 = driver.findElement(By.xpath("//select[@id='1']"));
        WebElement form2 = driver.findElement(By.xpath("//select[@id='2']"));
        WebElement form3 = driver.findElement(By.xpath("//select[@id='3']"));
        
        WebElement form4 = driver.findElement(By.xpath("//select[@id='4']"));
        WebElement form5 = driver.findElement(By.xpath("//select[@id='5']"));
        WebElement form6 = driver.findElement(By.xpath("//select[@id='6']"));
        
        WebElement form7 = driver.findElement(By.xpath("//select[@id='7']"));
        WebElement form8 = driver.findElement(By.xpath("//select[@id='8']"));
        WebElement form9 = driver.findElement(By.xpath("//select[@id='9']"));
        
        WebElement tilde4 = driver.findElement(By.xpath("//button[@id='tilde4']"));
        WebElement tilde5 = driver.findElement(By.xpath("//button[@id='tilde5']"));
        
        WebElement winner = driver.findElement(By.xpath("//h2[@id='message']"));

        
        WebDriverWait wait = new WebDriverWait(driver, 20);
        
        //true player turn 1

        wait.until(ExpectedConditions.elementToBeClickable(form1));

        Select dropdown1 = new Select(form1);

        dropdown1.selectByIndex(1);
        
        //false player turn 1
        
        wait.until(ExpectedConditions.elementToBeClickable(form2));

        Select dropdown2 = new Select(form2);

        dropdown2.selectByIndex(2);
        
        //true player turn 2
        
        wait.until(ExpectedConditions.elementToBeClickable(form3));

        Select dropdown3 = new Select(form3);

        dropdown3.selectByIndex(3);
        
        //false player turn 2
        
        wait.until(ExpectedConditions.elementToBeClickable(form4));

        Select dropdown4 = new Select(form4);

        dropdown4.selectByIndex(4);
        
        //true player turn 3
        
        wait.until(ExpectedConditions.elementToBeClickable(form5));

        Select dropdown5 = new Select(form5);

        dropdown5.selectByIndex(1);
        
        // false player turn 3
        
        wait.until(ExpectedConditions.elementToBeClickable(tilde4));
        
        tilde4.click();
        
        // true player turn 4
        
        wait.until(ExpectedConditions.elementToBeClickable(tilde5));
        
        tilde5.click();
        
        // false player turn 4
        
        wait.until(ExpectedConditions.elementToBeClickable(form6));

        Select dropdown6 = new Select(form6);

        dropdown6.selectByIndex(2);
        
        // true player turn 5
        
         wait.until(ExpectedConditions.elementToBeClickable(form7));

        Select dropdown7 = new Select(form7);

        dropdown7.selectByIndex(3);
        
        // false player turn 5
        
        wait.until(ExpectedConditions.elementToBeClickable(form8));

        Select dropdown8 = new Select(form8);

        dropdown8.selectByIndex(4);
        
        //true player turn 6
        
        wait.until(ExpectedConditions.elementToBeClickable(form9));

        Select dropdown9 = new Select(form9);

        dropdown9.selectByIndex(1);
        
        System.out.println(winner.getText());
        


		driver.close();
                driver.quit();
    }

}
