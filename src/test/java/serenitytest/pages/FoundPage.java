package serenitytest.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.yecht.Data;

@DefaultUrl("http://skillsup.ua/")

public class FoundPage extends PageObject{

    private By ourteam = By.linkText("Наша команда");
    private By findField = By.id("u5016-2");
    private String coachFirst = "Александр Галковский";

    public void goToCoachPage(){
        WebElement goToCoachPage = find(ourteam);
        goToCoachPage.click();
    }
public void setFindField(String name){
    WebElement findMenu = find(findField);
    findMenu.sendKeys(coachFirst);
    }
public void checkResults() {

    Assert.assertFalse();
}
}
