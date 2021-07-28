package SmokeTests.AccountRequestEntity;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AccountRequest_Entity {

    @BeforeTest(groups = { "Account Request Entity" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Account Request Entity Response",groups = {"Account Request Entity"})
    public void GetAccountRequestEntityResponse() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/accountRequestEntities/{id}/response")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Post Account Request Entity Response",groups = {"Account Request Entity"})
    public void PostAccountRequestEntityResponse() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
               // .body("[ \"string\"]")
                .when()
                .post
                        ("/api/accounts/accountRequestEntities/{id}/response")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Put Account Request Entity Response",groups = {"Account Request Entity"})
    public void PutAccountRequestEntityResponse() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/accountRequestEntities/{id}/response")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Account Request Entity Response",groups = {"Account Request Entity"})
    public void DeleteAccountRequestEntityResponse() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/accountRequestEntities/{id}/response")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Patch Account Request Entity Response",groups = {"Account Request Entity"})
    public void PatchAccountRequestEntityResponse() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/accountRequestEntities/{id}/response")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Get Account Response ID",groups = {"Account Request Entity"})
    public void GetAccountResponseID() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("accountresponseentityId","12")
                .when()
                .get
                        ("/api/accounts/accountRequestEntities/{id}/response/{accountresponseentityId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Account Response ID",groups = {"Account Request Entity"})
    public void DeleteAccountResponseID() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("accountresponseentityId","12")
                .when()
                .delete
                        ("/api/accounts/accountRequestEntities/{id}/response/{accountresponseentityId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //COMPLETE Need to be tested with ID that will return statusCode 200
    }
}
