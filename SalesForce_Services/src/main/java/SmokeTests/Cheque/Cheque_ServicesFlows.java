package SmokeTests.Cheque;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Cheque_ServicesFlows {

    @BeforeTest(groups = { "Cheque" })
    public void setUp()  {
        try {

            //RestAssured.baseURI = "https://account-service.ebi-uat.rbb-banking.sdc-nonprod.caas.absa.co.za";
            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

            } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Account Holds",groups = {"Cheque"})
    public void GetAccountHolds_Cheque() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \"cqn503I_ACCOUNT_NBR\": \"string\", \"cqn503I_AGENCY_CODE\": \"string\", \"cqn503I_BRANCH_CODE\": \"string\", \"cqn503I_BRANCH_SITE_TYPE\": \"string\", \"cqn503I_CORP_CODE\": \"string\", \"cqn503I_SITE_TYPE_AGENCY\": \"string\", \"cqn503I_SUPERVISOR_CODE\": \"string\", \"cqn503I_TELLER_CODE\": \"string\"}")
                .log()
                .all()
                .when()
                .post
                        ("/api/accounts/AccountHolds")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Account Holds Cheques",groups = {"Cheque"})
    public void AccountHoldsCheques() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .log()
                .all()
                .when()
                .get
                        ("/api/accounts/AccountHolds/cheques")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Account Holds CIF",groups = {"Cheque"})
    public void AccountHolds_CIF_Cheque()  {

        given()
                .header("Content-Type", "application/json")
                .and()
                .log()
                .all()
                .when()
                .get
                        ("/api/accounts/AccountHolds/cif")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Validate Account Holds",groups = {"Cheque"})
    public void AccountHolds_Validate_Cheque()  {

        given()
                .header("Content-Type", "application/json")
                .and()
                .log()
                .all()
                .when()
                .post
                        ("/api/accounts/AccountHolds/validate")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

    }

    @Test(description = "Get Account Holds Producer",groups = {"Cheque"})
    public void GetAccountHolds_Producer_Cheque()  {

                given()
                        .header("Content-Type", "application/json")
                        .and()
                        .queryParam("message","Absa")
                        .log()
                        .all()
                        .when()
                        .get
                                ("/api/accounts/AccountHolds/producer")

                        .then()
                        .log()
                        .all()
                        .assertThat()
                        .statusCode(200);

    }


    @Test(description = "Add Product",groups = {"Cheque"})
    public void AddProduct_Cheque() {

        JSONObject requestParams = new JSONObject();
        requestParams.put("id", "7001220753082");

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("id","7001220753082")
                .body("{ \"state\": \"string\", \"type\": \"string\", \"subtype\": \"string\", \"accountType\": \"string\", \"packageId\": 0, \"referringProduct\": 0, \"accountNumber\": \"string\", \"featureJson\": {}, \"additionalDetail\": {}}")
                .when()
                .put
                        ("/api/accounts/cheque/{id}/addProduct")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    //Neeed to be tested with ID that will return statusCode 200

    }

    @Test(description = "Create Cheque Account",groups = {"Cheque"})
    public void CreateChequeAccount() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \"applicationNumber\": 0, \"channel\": { \"controlSite\": 0, \"controlSiteType\": \"string\", \"controllerNumber\": 0, \"deviceId\": \"string\", \"deviceType\": \"string\", \"digitalChannel\": \"string\", \"marketersCode\": 0, \"openSite\": 0, \"openSiteType\": \"string\", \"tellerNumber\": 0, \"userId\": \"string\", \"workStationNumber\": 0 }, \"clientDetails\": { \"customerKey\": \"string\", \"fraudIndicator\": \"string\", \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" }, \"productDetails\": { \"cbpPrimaryAccount\": 0, \"odIndicator\": \"string\", \"packageId\": 0, \"pricingSchemeCode\": \"string\", \"product\": 0, \"providedChequeBookIndicator\": \"string\", \"rbaEdd\": \"string\" }}")
                .when()
                .post
                        ("/api/accounts/cheque/create")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need to fix inputs

    }
}
