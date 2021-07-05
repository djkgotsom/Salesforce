package SmokeTests.Savings;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Savings_ServiceFlows {

    @BeforeTest(groups = { "savings" })
    public void setUp()  {
        try {

            //RestAssured.baseURI = "https://account-service.ebi-uat.rbb-banking.sdc-nonprod.caas.absa.co.za/api/accounts";
            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Account Activity",groups = {"savings"})
    public void GetAccountActivity_savings()  {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("accountNumber","9051436750")
                .log()
                .all()
                .when()
                .get
                        ("/api/accounts/savingsaccount/{accountNumber}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need test with account that will return statusCode 200
    }

    @Test(description = "Update Account Activity",groups = {"savings"})
    public void UpdateAccountActivity_savings() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("accountNumber","9051436750")
                .body("{ \"creditChannel\": \"ATM\", \"creditSource\": \"string\", \"debitReason\": \"string\"}")
                .log()
                .all()
                .when()
                .get
                        ("/api/accounts/savingsaccount/{accountNumber}")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need test with account that will return statusCode 200
    }




    @Test(description = "Savings Account Creation",groups = {"savings"})
    public void SavingsAccountCration_Service() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \"application\": { \"applicationDateTime\": \"2021-07-04T18:34:50.660Z\", \"applicationNumber\": \"string\", \"organization\": \"string\" }, \"customerDetails\": { \"cifCode\": \"string\" }, \"customerDetailsDto\": { \"cifCode\": \"string\" }, \"expAccActivity\": { \"creditChannel\": \"ATM\", \"creditSource\": \"string\", \"debitReason\": \"string\" }, \"header\": { \"agencyCode\": 0, \"brandCode\": \"string\", \"brokersCode\": 0, \"brokersSrc\": \"string\", \"deviceId\": \"string\", \"deviceid\": \"string\", \"divisionCode\": \"string\", \"marketerCode\": 0, \"sitecode\": 0, \"sitetype\": \"string\", \"supervisorCode\": 0, \"tellerNumber\": 0, \"userId\": \"string\", \"userid\": \"string\", \"workStation\": \"string\" }, \"headerDto\": { \"agencyCode\": 0, \"brandCode\": \"string\", \"brokersCode\": 0, \"brokersSrc\": \"string\", \"deviceId\": \"string\", \"deviceid\": \"string\", \"divisionCode\": \"string\", \"marketerCode\": 0, \"sitecode\": 0, \"sitetype\": \"string\", \"supervisorCode\": 0, \"tellerNumber\": 0, \"userId\": \"string\", \"userid\": \"string\", \"workStation\": \"string\" }, \"incomeDetails\": { \"sourceOfIncome\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" }, \"sourceOfIncomeDto\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" } }, \"incomeDetailsDto\": { \"sourceOfIncome\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" }, \"sourceOfIncomeDto\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" } }, \"productDetails\": { \"accountName\": \"string\", \"accountOpenDate\": \"2021-07-04T18:34:50.660Z\", \"accountOpenReason\": 0, \"casaHold\": \"string\", \"channelInd\": \"string\", \"crpCode\": \"string\", \"digitalRiskIndicator\": \"string\", \"fraudHold\": \"string\", \"freqCode\": 0, \"grantType\": 0, \"groupSchCode\": 0, \"homeEmpPlan\": \"string\", \"investTerm\": 0, \"investmentAmount\": 0, \"noticePeriod\": 0, \"productCode\": 0, \"productVersionNumber\\\": 0, \"rateOption\": \"string\", \"rbaRiskHoldIndicator\": \"H\", \"specAcctType\": \"string\", \"versionNbr\": 0, \"withdrwlPerc\": 0 }, \"productDetailsDto\": { \"accountName\": \"string\", \"accountOpenDate\": \"2021-07-04T18:34:50.660Z\", \"accountOpenReason\": 0, \"casaHold\": \"string\", \"channelInd\": \"string\", \"crpCode\": \"string\", \"digitalRiskIndicator\": \"string\", \"fraudHold\": \"string\", \"freqCode\": 0, \"grantType\": 0, \"groupSchCode\": 0, \"homeEmpPlan\": \"string\", \"investTerm\": 0, \"investmentAmount\": 0, \"noticePeriod\": 0, \"productCode\": 0, \"productVersionNumber\": 0, \"rateOption\": \"string\", \"rbaRiskHoldIndicator\": \"H\", \"specAcctType\": \"string\", \"versionNbr\": 0, \"withdrwlPerc\": 0 }}")
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
