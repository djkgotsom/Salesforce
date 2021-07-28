package SmokeTests.ApplicationEntity;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApplicationEntity_Application {

    @BeforeTest(groups = { "Application Entity" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Applicant Set",groups = {"Application Entity"})
    public void GetApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/applications/{id}/applicantSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Post Applicant Set",groups = {"Application Entity"})
    public void PostApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .post
                        ("/api/accounts/applications/{id}/applicantSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Put Applicant Set",groups = {"Application Entity"})
    public void PutApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/applications/{id}/applicantSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Applicant Set",groups = {"Application Entity"})
    public void DeleteApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/applications/{id}/applicantSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "patch Applicant Set",groups = {"Application Entity"})
    public void PatchApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/applications/{id}/applicantSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Get Application Applicant Set",groups = {"Application Entity"})
    public void GetApplicationApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("applicantId","1")
                .when()
                .get
                        ("/api/accounts/applications/{id}/applicantSet/{applicantId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Application Applicant Set",groups = {"Application Entity"})
    public void DeleteApplicationApplicantSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("applicantId","1")
                .when()
                .delete
                        ("/api/accounts/applications/{id}/applicantSet/{applicantId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }


    @Test(description = "Get Application Product Set",groups = {"Application Entity"})
    public void GetApplicationProductSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/applications/{id}/productSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Post Application Product Set",groups = {"Application Entity"})
    public void PostApplicationProductSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .post
                        ("/api/accounts/applications/{id}/productSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Put Application Product Set",groups = {"Application Entity"})
    public void PutApplicationProductSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/applications/{id}/productSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Application Product Set",groups = {"Application Entity"})
    public void DeleteApplicationProductSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/applications/{id}/productSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Patch Application Product Set",groups = {"Application Entity"})
    public void PatchApplicationProductSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/applications/{id}/productSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Get Application Product Set using ID and ProductId",groups = {"Application Entity"})
    public void GetApplicationProductSet_IDandProductID() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("productId","7001220753082")

                .when()
                .get
                        ("/api/accounts/applications/{id}/productSet/{productId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Application Product Set using ID and ProductId",groups = {"Application Entity"})
    public void DeleteApplicationProductSet_IDandProductID() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("productId","1")

                .when()
                .delete
                        ("/api/accounts/applications/{id}/productSet/{productId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Get Application Source Set",groups = {"Application Entity"})
    public void GetApplicationSourceSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/applications/{id}/sourceSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Post Application Source Set",groups = {"Application Entity"})
    public void PostApplicationSourceSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .post
                        ("/api/accounts/applications/{id}/sourceSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Put Application Source Set",groups = {"Application Entity"})
    public void PutApplicationSourceSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/applications/{id}/sourceSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Application Source Set",groups = {"Application Entity"})
    public void DeleteApplicationSourceSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/applications/{id}/sourceSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Patch Application Source Set",groups = {"Application Entity"})
    public void PatchApplicationSourceSet() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/applications/{id}/sourceSet")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Get Application Source Set Using ID and SourceID",groups = {"Application Entity"})
    public void GetApplicationSourceSet_UsingIDandSourceID() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("sourceId","1")
                .when()
                .get
                        ("/api/accounts/applications/{id}/sourceSet/{sourceId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }

    @Test(description = "Delete Application Source Set Using ID and SourceID",groups = {"Application Entity"})
    public void DeleteApplicationSourceSet_UsingIDandSourceID() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .pathParam("sourceId","1")
                .when()
                .delete
                        ("/api/accounts/applications/{id}/sourceSet/{sourceId}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }
}
