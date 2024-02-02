package com.virgingames.virgingamesinfo;


import com.virgingames.constants.EndPoints;
import com.virgingames.constants.Path;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class VirginSteps {
    @Step
    public Response getAllPostsByCurrencyByGBP(String currency){
        return SerenityRest.given().log().all()
                .when()
                .get(Path.PATH + EndPoints.CURRENCY);
    }
}
