package serenitytest.pages;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class WikiDummyPage extends PageObject {

	private By searchTerms = By.name("search");
	private By lookupButton = By.name("go");
	private By ol = By.tagName("ol");
	private By li = By.tagName("li");

    public void enterKeywords(String keyword) {
		find(searchTerms).type(keyword);
    }

    public void lookupTerms() {
        find(lookupButton).click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(ol);
        List<WebElement> results = definitionList.findElements(li);
        return results.stream().map(WebElement::getText).collect(toList());
    }

}