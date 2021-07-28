package SmokeTests.AccountHoldController;

import SmokeTests.Utility.AccountHoldController_Base.AccountHoldController_BaseClass;
import SmokeTests.Utility.Excel_Function.ExcelFunctions;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class Account_Holds_Controller extends AccountHoldController_BaseClass {

    //QTDF_Report.ReportDirectory();
   // extentMaintenance = new ExtentReports(QTDF_Report.fullReportPath, true);


    @BeforeTest(groups = { "Account Hold Controller" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Account Holds",groups = {"Account Hold Controller"})
    public void GetAccountHold()  {

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
        //Done
    }

    @Test(description = "Get CIF",groups = {"Account Hold Controller"})
    public void GetCIF() throws FileNotFoundException {

        String filePath = System.getProperty("user.home")+"\\SavingsRegressionAutomation\\TermDepositEnquiryMenu_QTDF_Pack\\TestDataFile\\DisplayTermDepositNewInterestRate_QTDF_Enquiries.xlsx";
        ExcelFunctions.input_document = new FileInputStream(String.valueOf(new File(filePath)));
        excel = new ExcelFunctions("Sheet1");

        _AccountNumber = excel.columnsNames.indexOf("Account_Number");
        _ClientCode = excel.columnsNames.indexOf("ClientCode");
        _SiteCode = excel.columnsNames.indexOf("SiteCode");

        given()
                .header("Content-Type", "application/json")
                .and()
                .pathParam("accNo","4048136596")
                .queryParam("clientCode","QAMBEK 001")
                .pathParam("siteCode","8198")
                .when()
                .get
                        ("/api/accounts/AccountHolds/cif{accNo}&{clientCode}&{siteCode}")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need to be fixed
    }

    @Test(description = "Get Producer",groups = {"Account Hold Controller"})
    public void GetProducer()  {

                given()
                        .header("Content-Type", "application/json")
                        .and()
                        .queryParam("message","Absaa")
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

        @Test(description = "Validate Account Holds",groups = {"Account Hold Controller"})
    public void ValidateAccountHolds()  {

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
        //Done
    }
}
