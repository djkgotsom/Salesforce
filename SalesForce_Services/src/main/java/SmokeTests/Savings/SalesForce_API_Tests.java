package SmokeTests.Savings;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SalesForce_API_Tests {

    @BeforeTest(groups = { "savings" })
    public void setUp() throws Exception {
        try {

            RestAssured.baseURI = "https://account-service.ebi-uat.rbb-banking.sdc-nonprod.caas.absa.co.za/api/accounts,";
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "The service Open/Create account",groups = { "savings" })
    public void SavingsAccountCration_Service() throws Exception {

        JSONObject requestParams = new JSONObject();
        requestParams.put("applicationNumber", "1234098710");
        requestParams.put("organization", "ABS");
        requestParams.put("applicationDateTime", "2021-01-05 10:08:02");
        requestParams.put("sitecode", "8198");
        requestParams.put("sitetype", "034");
        requestParams.put("tellerNumber", "25698");
        requestParams.put("marketerCode", "12");
        requestParams.put("brokersSrc", "1");
        requestParams.put("brokersCode", "12");
        requestParams.put("supervisorCode", "25699");
        requestParams.put("agencyCode", "34");
        requestParams.put("divisionCode", "ABS");
        requestParams.put("userid", "absa");
        requestParams.put("deviceid", "laptop");
        requestParams.put("workStation", "12");
        requestParams.put("rbaRiskHoldIndicator", "VL");
        requestParams.put("fraudHold", "No");
        requestParams.put("casaHold", "No");
        requestParams.put("accountName", "1234");
        requestParams.put("accountOpenDate", "2021-06-01 10:08:02");
        requestParams.put("accountOpenReason", "");
        requestParams.put("investTerm", "0");
        requestParams.put("investmentAmount", "1000");
        requestParams.put("rateOption", "");
        requestParams.put("crpCode", "");
        requestParams.put("freqCode", "12");
        requestParams.put("groupSchCode", "1234");
        requestParams.put("homeEmpPlan", "A");
        requestParams.put("grantType", "1");
        requestParams.put("specAcctType", "A");
        requestParams.put("versionNbr", "");
        requestParams.put("productCode", "9040");
        requestParams.put("productVersionNumber", "0");
        requestParams.put("noticePeriod", "12");
        requestParams.put("withdrwlPerc", "10");
        requestParams.put("channelInd", "");
        requestParams.put("sourceOfFunds1", "");
        requestParams.put("sourceOfFunds2", "");
        requestParams.put("sourceOfFunds3", "");
        requestParams.put("sourceOfFunds4", "");
        requestParams.put("cifCode", "MNYANM 012");
        requestParams.put("creditChannel", "CASH");
        requestParams.put("creditSource", "income");
        requestParams.put("debitReason", "debitReason");


        //FileInputStream fileInputStream =  new FileInputStream(System.getProperty("user.dir")+"/src/Resources/soapXMLs/savings/listAccInterestRates.xml");
        Response response =
                given()
                        .header("Content-Type", "application/json")
                        .and()
                        .body(requestParams.toString())
                        .when()
                        .post
                                ("/savingsaccount")

                        .then()
                        .statusCode(200)
                        .and()
                        .log().all().extract().response();

    }
}
