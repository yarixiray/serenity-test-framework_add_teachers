package serenitytest.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;


@DefaultUrl("http://skillsup.ua/")
public class NewPageSkillsUp extends PageObject {
    private By linkourteam = By.linkText("Наша команда");
    private By memberclass = By.className("name");
    private By searchheader = By.xpath("//div[@class='greenHeader']");
    private By infoAboutCoach = By.className("text");
    private String coach;

    public void goToCoachPage(){
        WebElement goToCoachPage = find(linkourteam);
        goToCoachPage.click();
    }

    public List<String> findCoachNmae (){
        List<WebElementFacade> listmembers = findAll(memberclass);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i: listmembers){
            stringsNames.add (i.getText());
        }
        return stringsNames;
    }

    public void openPersonalInfoPage(String name){
        List<WebElementFacade> webElements = findAll(memberclass);
        for (WebElement i : webElements){
            if (i.getText().contains(name)){
                i.click();
                break;
            }
        }
    }

    public Boolean searchPersonalPage(String person){
        openPersonalInfoPage(coach);
        System.out.println(find(searchheader).getText());
        return find(searchheader).getText().contains(person);
    }

    public Boolean searchCourcesOfCoach(String cources){
        openPersonalInfoPage(coach);
        System.out.println(find(infoAboutCoach).getText());
        return find(infoAboutCoach).getText().contains(cources);
    }

}