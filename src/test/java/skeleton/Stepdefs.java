package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Stepdefs {
    //
    private static final WebDriver driver = new FirefoxDriver();

    public static WebDriver getWebDriver(){return driver;}

    @Given("^I am on the google home page$")
    public void iAmOnTheGoogleHomePage() throws Throwable {
        driver.get("https://www.google.com");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String query) throws Throwable {
        WebElement element = getWebDriver().findElement(By.name("q"));
        element.sendKeys(query);
        element.submit();
        System.out.println(getWebDriver().getTitle());
        System.out.println("hi");
    }

    @Then("^I should see \"([^\"]*)\" on the first link$")
    public void iShouldSeeOnTheFirstLink(String linktitle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /*@After()
    public void closeBrowser(){
        driver.quit();
    }*/



}
