package com.skillstorm.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.skillstorm.Selenium.OrdersList;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OrdersStepDefinition {
        private OrdersList ordersList;
    
    @Before("@Orders")
    public void before(){
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        this.ordersList = new OrdersList(driver);
    }

    @Given("I am on the order list page")
    public void iAmOnTheOrderListPage(){}

    @When("I fill in {string}, {string}, {string}, and {string}")
    public void iFillInValidInformation(){}

    @And("I click the Add order button")
    public void iClickTheAddOrderButton(){}
}
