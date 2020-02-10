package Steps;

import Classes.Base;
import Classes.PropertiesReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BaseSD {
    private Base base;

    public BaseSD(){
        base = new Base();
    }

    @Given("the user opens the {string} web browser")
    public void theUserOpensTheWebBrowser(String browser) {
        base.openBrowser(browser);
    }

    @Then("the user closes the web browser")
    public void theUserClosesTheWebBrowser() {
        base.closeBrowser();
    }

    @And("the user navigates to {string} website")
    public void theUserNavigatesToWebsite(String arg0) {
        base.navigate(arg0);
    }
}
