package serenitytest.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.model.ExamplesTable;
import serenitytest.steps.serenity.EndUserSteps;

import java.util.Map;

public class Dictionary {

//    @Steps
//    EndUserSteps endUser;
//
//    @Given("the user is on the Wikionary home page")
//    public void givenTheUserIsOnTheWikionaryHomePage() {
//        endUser.is_the_home_page();
//    }
//
//    @When("the user looks up the definition of the word <fruct>")
//    public void whenTheUserLooksUpTheDefinitionOf(String fruct) {
//        endUser.looks_for(fruct);
//    }
//
//    @Then("they should see the definition <def>")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String def) {
//        endUser.should_see_definition(def);
//    }
//new scenario to find name of Teacher
    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Our Team page")
    public void gevenTheUserIsOnTheOurTeamPage (){
        endUser.goToTeacherPage();
    }

    @When("the user find teacher '$teacher'")
    @Alias("the user find teacher <teacher>")
    public void whenTheUserFindTeacher(String teacher){
        endUser.openTeacherPage(teacher);
    }

    @Then("they should see the name '$name'")
    @Alias("they should see the name <name> and cource <cource>")
    public void thenTheyShouldSeeTheNameOfTeacher(String name, String cource){
        endUser.shouldSeeNameOfTeacher(name);
        endUser.shouldSeeCourceForTeacher(cource);
    }


// new scenarion to find cource

    @Given("the user is on the Teacher page")
    public void gevenTheUserIsOnTheTeacherTeamPage (){
        endUser.goToTeacherPage();
    }

    @When("the user click on card of teacher '$teacher'")
    public void whenTheUserClickOnCardOfTeacher (String teacher) {endUser.openTeacherPage(teacher);}

    @Then("they should see the cource '$cource'")
    public void thenTheyShouldSeeTheCource(String cource) {endUser.shouldSeeCourceForTeacher(cource);}


    @Then ("they should see the name and cource contains: $coachTables")
    public void findAllCoaches (ExamplesTable coachTables){
        for (Map<String,String> row : coachTables.getRows()) {
            String name = row.get("name");
            String cource = row.get("cource");
            System.out.println(name +" "+ cource);
        }

    }
}
