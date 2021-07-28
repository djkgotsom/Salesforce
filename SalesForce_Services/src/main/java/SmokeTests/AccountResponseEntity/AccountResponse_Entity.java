package SmokeTests.AccountResponseEntity;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AccountResponse_Entity {

    @BeforeTest(groups = { "Account Response Entity" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Account Response Entity Request",groups = {"Account Response Entity"})
    public void GetAccountResponseEntityRequest() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/accountResponseEntities/{id}/request")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Post Account Response Entity Request",groups = {"Account Response Entity"})
    public void PostAccountResponseEntityRequest() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                // .body("[ \"string\"]")
                .when()
                .post
                        ("/api/accounts/accountResponseEntities/{id}/request")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Put Account Response Entity Request",groups = {"Account Response Entity"})
    public void PutAccountResponseEntityRequest() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/accountResponseEntities/{id}/request")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Account Response Entity Request",groups = {"Account Response Entity"})
    public void DeleteAccountResponseEntityRequest() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/accountResponseEntities/{id}/request")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Patch Account Request Entity Response",groups = {"Account Response Entity"})
    public void PatchAccountResponseEntityRequest() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/accountResponseEntities/{id}/request")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }
}
