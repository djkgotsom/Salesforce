package SmokeTests.MetaDataController;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MetaData_Controller {

    @BeforeTest(groups = {"Meta Data Controller"})
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Get Meta Data",groups = {"Meta Data Controller"})
    public void GetMetaData()  {

        given()
                        .header("Content-Type", "application/json")
                        .and()
                        .queryParam("applicationNumber","1234098710")
                        .log()
                        .all()
                        .when()
                        .get
                                ("/api/accounts/metadata")
                        .then()
                        .log()
                        .all()
                        .assertThat()
                        .statusCode(200);

        //Still busy with it
    }

    @Test(description = "Create Meta Data",groups = {"Meta Data Controller"})
    public void CreateMetaData() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \"accountNumber\": 0, \"accountnumber\": 0, \"applicationDateTime\": \"string\", \"applicationNumber\": \"string\", \"channel\": { \"channelDetailDtos\": { \"agencyCode\": 0, \"agencycode\": 0, \\branchCode\": 0, \"branchSiteType\": \"string\", \"branchcode\": 0, \"branchsitetype\": \"string\", \"channelName\": \"string\", \"channelname\": \"string\", \"siteTypeAgency\": \"string\", \"sitetypeagency\": \"string\", \"supervisorCode\": 0, \"supervisorcode\": 0, \"tellerNumber\": 0, \"tellernumber\": 0 }, \"channelDetails\": { \"agencyCode\": 0, \"agencycode\": 0, \"branchCode\": 0, \"branchSiteType\": \"string\", \"branchcode\": 0, \"branchsitetype\": \"string\", \"channelName\": \"string\", \"channelname\": \"string\", \"siteTypeAgency\": \"string\", \"sitetypeagency\": \"string\", \"supervisorCode\": 0, \"supervisorcode\": 0, \"tellerNumber\": 0, \"tellernumber\": 0 }, \"channelName\": \"string\" }, \"channelDto\": { \"channelDetailDtos\": { \"agencyCode\": 0, \"agencycode\": 0, \"branchCode\": 0, \"branchSiteType\": \"string\", \"branchcode\": 0, \"branchsitetype\": \"string\", \"channelName\": \"string\", \"channelname\": \"string\", \"siteTypeAgency\": \"string\", \"sitetypeagency\": \"string\", \"supervisorCode\": 0, \"supervisorcode\": 0, \"tellerNumber\": 0, \"tellernumber\": 0 }, \"channelDetails\": { \"agencyCode\": 0, \"agencycode\": 0, \"branchCode\": 0, \"branchSiteType\": \"string\", \"branchcode\": 0, \"branchsitetype\": \"string\", \"channelName\": \"string\", \"channelname\": \"string\", \"siteTypeAgency\": \"string\", \"sitetypeagency\": \"string\", \"supervisorCode\": 0, \"supervisorcode\": 0, \"tellerNumber\": 0, \"tellernumber\": 0 }, \"channelName\": \"string\" }, \"channelReference\": \"string\", \"cifcode\": \"string\", \"crpCode\": \"string\", \"holddetails\": { \"casa\": \"MATCHED\", \"fraud\": \"CLEAN\", \"rba\": \"H\" }}")
                .when()
                .post
                        ("/api/accounts/metadata")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need to fix Service
    }
}
