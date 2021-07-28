package SmokeTests.SavingsAccountController;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Savings_ServiceFlows {

    @BeforeTest(groups = { "savings Account Controller" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

//    @Test(description = "Get Account Activity",groups = {"savings Account Controller"})
//    public void GetAccountActivity_savings()  {
//
//        given()
//                .header("Content-Type", "application/json")
//                .and()
//                .pathParam("accountNumber","9051436750")
//                .log()
//                .all()
//                .when()
//                .get
//                        ("/api/accounts/savingsaccount/{accountNumber}")
//                .then()
//                .log()
//                .all()
//                .assertThat()
//                .statusCode(200);
//
//        //Need test with account that will return statusCode 200
//    }
//
//    @Test(description = "Update Account Activity",groups = {"savings Account Controller"})
//    public void UpdateAccountActivity_savings() {
//
//        given()
//                .header("Content-Type", "application/json")
//                .and()
//                .pathParam("accountNumber","9051436750")
//                .body("{ \"creditChannel\": \"ATM\", \"creditSource\": \"string\", \"debitReason\": \"string\"}")
//                .log()
//                .all()
//                .when()
//                .get
//                        ("/api/accounts/savingsaccount/{accountNumber}")
//                .then()
//                .log()
//                .all()
//                .assertThat()
//                .statusCode(200);
//
//        //Need test with account that will return statusCode 200
//    }

    @Test(description = "Savings Account Creation",groups = {"savings Account Controller"})
    public void SavingsAccountCreation_Service() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .queryParams("applicationNumber","1234098711")
                .queryParams("organization","ABS")
                .queryParams("applicationDateTime","2021-07-22 10:08:02")
                .queryParams("sitecode","8198")
                .queryParams("sitetype","034")
                .queryParams("tellerNumber","25698")

                .queryParams("marketerCode",12)
                .queryParams("brokersSrc","1")
                .queryParams("brokersCode",12)
                .queryParams("supervisorCode","25699")
                .queryParams("agencyCode",34)
                .queryParams("divisionCode","ABS")
                .queryParams("userid","absa")
                .queryParams("deviceid","laptop")
                .queryParams("workStation","12")
                .queryParams("rbaRiskHoldIndicator","VL")
                .queryParams("fraudHold","Y")
                .queryParams("casaHold","Y")
                .queryParams("digitalRiskIndicator","Y")
                .queryParams("accountName",1234)
                .queryParams("accountOpenDate","2021-07-22 10:08:02")
                .queryParams("accountOpenReason","")
                .queryParams("investTerm","0")
                .queryParams("investmentAmount",1000)
                .queryParams("rateOption","")
                .queryParams("crpCode","")
                .queryParams("freqCode","12")
                .queryParams("groupSchCode","1234")
                .queryParams("homeEmpPlan","A")
                .queryParams("grantType",1)
                .queryParams("specAcctType","A")
                .queryParams("versionNbr","")
                .queryParams("productCode","9040")
                .queryParams("productVersionNumber",0)
                .queryParams("noticePeriod","12")
                .queryParams("withdrwlPerc","10")
                .queryParams("channelInd","")
                .queryParams("sourceOfFunds1","")
                .queryParams("sourceOfFunds2","")
                .queryParams("sourceOfFunds3","")
                .queryParams("sourceOfFunds4","")
                .queryParams("cifCode","MNYANM 012")
                .queryParams("creditChannel","CASH")
                .queryParams("creditSource","income")
                .queryParams("debitReason","debitReason")

                //.body("{ \"applicationNumber\": 1234098711, \"organization\": \"ABS\", \"applicationDateTime\": \"2021-07-22 10:08:02\" }, \"header\": { \"sitecode\": \"8198\", \"sitetype\": \"034\", \"tellerNumber\": \"25698\", \"marketerCode\": 12, \"brokersSrc\": \"1\", \"brokersCode\": 12, \"supervisorCode\": \"25699\", \"agencyCode\": 34, \"divisionCode\": \"ABS\", \"userid\": \"absa\", \"deviceid\": \"laptop\", \"workStation\": \"12\" }, \"productdetails\": { \"rbaRiskHoldIndicator\": \"VL\", \"fraudHold\":\"Y\", \"casaHold\":\"Y\", \"digitalRiskIndicator\":\"Y\", \"accountName\": 1234, \"accountOpenDate\": \"2021-07-22 10:08:02\", \"accountOpenReason\": \"\", \"investTerm\": \"0\", \"investmentAmount\": 1000, \"rateOption\": \"\", \"crpCode\": \"\", \"freqCode\": \"12\", \"groupSchCode\": \"1234\", \"homeEmpPlan\": \"A\", \"grantType\": 1, \"specAcctType\": \"A\", \"versionNbr\": \"\", \"productCode\": \"9040\", \"productVersionNumber\": 0, \"noticePeriod\": \"12\", \"withdrwlPerc\": \"10\", \"channelInd\": \"\" }, \"incomedetails\": { \"sourceOfIncome\": { \"sourceOfFunds1\": \"\", \"sourceOfFunds2\": \"\", \"sourceOfFunds3\": \"\", \"sourceOfFunds4\": \"\" } }, \"customerdetails\": { \"cifCode\": \"MNYANM 012\" }, \"expAccActivity\": { \"creditChannel\": \"CASH\", \"creditSource\": \"income\", \"debitReason\": \"debitReason\" }}")
                //.body("{ \"application\": { \"applicationDateTime\": \"2021-07-04T18:34:50.660Z\", \"applicationNumber\": \"string\", \"organization\": \"string\" }, \"customerDetails\": { \"cifCode\": \"string\" }, \"customerDetailsDto\": { \"cifCode\": \"string\" }, \"expAccActivity\": { \"creditChannel\": \"ATM\", \"creditSource\": \"string\", \"debitReason\": \"string\" }, \"header\": { \"agencyCode\": 0, \"brandCode\": \"string\", \"brokersCode\": 0, \"brokersSrc\": \"string\", \"deviceId\": \"string\", \"deviceid\": \"string\", \"divisionCode\": \"string\", \"marketerCode\": 0, \"sitecode\": 0, \"sitetype\": \"string\", \"supervisorCode\": 0, \"tellerNumber\": 0, \"userId\": \"string\", \"userid\": \"string\", \"workStation\": \"string\" }, \"headerDto\": { \"agencyCode\": 0, \"brandCode\": \"string\", \"brokersCode\": 0, \"brokersSrc\": \"string\", \"deviceId\": \"string\", \"deviceid\": \"string\", \"divisionCode\": \"string\", \"marketerCode\": 0, \"sitecode\": 0, \"sitetype\": \"string\", \"supervisorCode\": 0, \"tellerNumber\": 0, \"userId\": \"string\", \"userid\": \"string\", \"workStation\": \"string\" }, \"incomeDetails\": { \"sourceOfIncome\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" }, \"sourceOfIncomeDto\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" } }, \"incomeDetailsDto\": { \"sourceOfIncome\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" }, \"sourceOfIncomeDto\": { \"sourceOfFunds1\": \"string\", \"sourceOfFunds2\": \"string\", \"sourceOfFunds3\": \"string\", \"sourceOfFunds4\": \"string\", \"sourceOfFunds5\": \"string\" } }, \"productDetails\": { \"accountName\": \"string\", \"accountOpenDate\": \"2021-07-04T18:34:50.660Z\", \"accountOpenReason\": 0, \"casaHold\": \"string\", \"channelInd\": \"string\", \"crpCode\": \"string\", \"digitalRiskIndicator\": \"string\", \"fraudHold\": \"string\", \"freqCode\": 0, \"grantType\": 0, \"groupSchCode\": 0, \"homeEmpPlan\": \"string\", \"investTerm\": 0, \"investmentAmount\": 0, \"noticePeriod\": 0, \"productCode\": 0, \"productVersionNumber\\\": 0, \"rateOption\": \"string\", \"rbaRiskHoldIndicator\": \"H\", \"specAcctType\": \"string\", \"versionNbr\": 0, \"withdrwlPerc\": 0 }, \"productDetailsDto\": { \"accountName\": \"string\", \"accountOpenDate\": \"2021-07-04T18:34:50.660Z\", \"accountOpenReason\": 0, \"casaHold\": \"string\", \"channelInd\": \"string\", \"crpCode\": \"string\", \"digitalRiskIndicator\": \"string\", \"fraudHold\": \"string\", \"freqCode\": 0, \"grantType\": 0, \"groupSchCode\": 0, \"homeEmpPlan\": \"string\", \"investTerm\": 0, \"investmentAmount\": 0, \"noticePeriod\": 0, \"productCode\": 0, \"productVersionNumber\": 0, \"rateOption\": \"string\", \"rbaRiskHoldIndicator\": \"H\", \"specAcctType\": \"string\", \"versionNbr\": 0, \"withdrwlPerc\": 0 }}")
                .when()
                .post
                        ("/api/accounts/savingsaccount")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need to fix inputs
    }
}
