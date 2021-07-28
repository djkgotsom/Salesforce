package SmokeTests.ProductEntity;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ProductEntity_Product {

    @BeforeTest(groups = { "Product Entity" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Production Application",groups = {"Product Entity"})
    public void GetProductApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .get
                        ("/api/accounts/products/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    //COMPLETE Need to be tested with ID that will return statusCode 200

    }

    @Test(description = "Post Production Application",groups = {"Product Entity"})
    public void PostProductApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .post
                        ("/api/accounts/products/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200

    }

    @Test(description = "Put Production Application",groups = {"Product Entity"})
    public void PutProductApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .put
                        ("/api/accounts/products/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200

    }

    @Test(description = "Delete Production Application",groups = {"Product Entity"})
    public void DeleteProductApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .delete
                        ("/api/accounts/products/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200

    }

    @Test(description = "Patch Production Application",groups = {"Product Entity"})
    public void PatchProductApplication() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .when()
                .patch
                        ("/api/accounts/products/{id}/application")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
        //COMPLETE Need to be tested with ID that will return statusCode 200
    }
}
