package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class InventoriPage {

    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement basketItem2;

    @FindBy(xpath = "//a[.='2']")
    private WebElement keranjang;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
    private WebElement remove;


    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;


    public void clickBasket1(){
        basketItem1.click();
    }
    public void clickBasket2(){
        basketItem2.click();
    }
    public void setKeranjang(){
        keranjang.click();
    }
    public void setRemove(){
        remove.click();
    }
    public void selectProductContainer(String sortProductList){
        Select b = new Select(selectContainer);
        b.selectByVisibleText(sortProductList);
    }

}
