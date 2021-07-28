package SmokeTests.SourceEntity;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SourceEntity_Source {

    @BeforeTest(groups = { "Source Entity" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Source Application",groups = {"Source Entity"})
    public void GetSourceApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/sources/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "post Source Application",groups = {"Source Entity"})
    public void PostSourceApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .post
                        ("/api/accounts/sources/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Put Source Application",groups = {"Source Entity"})
    public void PutSourceApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/sources/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Source Application",groups = {"Source Entity"})
    public void DeleteSourceApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/sources/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Patch Source Application",groups = {"Source Entity"})
    public void PatchSourceApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/sources/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }
}
