package com.skillstorm.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WarehouseList {
    private WebDriver driver;
    private static final String url = "http://localhost:5173/warehouses";
    //private static final String editIconClassName = "MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-78trlr-MuiButtonBase-root-MuiIconButton-root";

    /*
     * Finding location, capacity, and stock web elements on the page
     */
    @FindBy(name = "location")
    private WebElement locationField;

    @FindBy(name = "capacity")
    private WebElement capacityField;

    @FindBy(name = "currentStock")
    private WebElement stockField;

    //Finding edit icon button
    @FindBy(name = "editIcon")
    private WebElement editBtn;

    //Finding update warehouse button
    @FindBy(name = "warehouseBtn")
    private WebElement warehouseBtn;

    //Finding table of warehouses
    @FindBy(className = "warehouseTable")
    private WebElement warehouseTable;

    public WarehouseList(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void getUrl() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.driver.get(url);
    }

    public void clickEditButton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editBtn.click();
    }

    public void setLocation(String location){
        locationField.clear();
        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        locationField.sendKeys(location);
    }

    public void setCapacity(String capacity){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        capacityField.clear();
        capacityField.sendKeys(capacity);
    }

    public void setStock(String stock){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stockField.clear();
        stockField.sendKeys(stock);
    }

    public void clickUpdateWarehouse(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        warehouseBtn.click();
    }

    public boolean displayWarehouseTable(){
        return warehouseTable.isDisplayed();
    }

    //TODO: check to see if success message pops up





}
