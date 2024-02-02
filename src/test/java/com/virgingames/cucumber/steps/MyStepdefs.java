package com.virgingames.cucumber.steps;
import com.virgingames.virgingamesinfo.VirginSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class MyStepdefs {

    static Response response;

    @Steps
    VirginSteps virginSteps;

    @When("I send a GET request with currency {string} endpoints")
    public void iSendAGETRequestWithCurrencyEndpoints(String currency) {
        response = virginSteps.getAllPostsByCurrencyByGBP(currency);
    }

    @Then("I must get a valid status code {int}")
    public void iMustGetAValidStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("I must verify all data has currency {string}")
    public void iMustVerifyAllDataHasCurrency(String currency) {
        List<String> currencyValue = response.then().extract().path("data.pots.currency");
        Assert.assertTrue(currencyValue.contains(currency));

    }
}