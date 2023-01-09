package step_definitions;

import cucumber.api.java.en.And;
import gherkin.lexer.Th;
import org.example.pageObject.InventoriPage;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User sort product list by name Z to A")
    public void selectProductContainer() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String a ="Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(2000);
    }
    @And("User pick item Sauce Labs Backpack")
    public void clickItemBasket1() throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(1000);
    }

    @And("User pick item Sauce Labs Fleece Jacket")
    public void clickItemBasket2() throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket2();
        Thread.sleep(1000);
    }

    @And("User klik keranjang")
    public void clickKeranjang() throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.setKeranjang();
        Thread.sleep(1000);
    }

    @And("User klik remove last item")
    public void clickRemove() throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.setRemove();
        Thread.sleep(1000);
    }

}
