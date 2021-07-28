package SmokeTests.CreditAccountController;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreditAccount {

    @BeforeTest(groups = { "Credit Account" })
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Create Credit Account",groups = {"Credit Account"})
    public void CreateCreditAccount() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \"accountDDAType\": \"string\", \"accountType\": \"string\", \"adjustedRate\\\": 0, \\\"adjustmentCategory\\\": \\\"string\\\", \\\"applicationReferenceNumber\\\": \\\"string\\\", \\\"associateBank\\\": \\\"string\\\", \\\"billingCycle\\\": 0, \\\"cardType\\\": \\\"B\\\", \\\"casaPrimaryVersionNumber\\\": 0, \\\"casaReferenceNumber\\\": 0, \\\"channelIndicator\\\": \\\"BRANCH\\\", \\\"clientCellphoneNumber\\\": 0, \\\"costCentre\\\": 0, \\\"creditLifeCode\\\": \\\"string\\\", \\\"creditLifeType\\\": \\\"string\\\", \\\"creditLimit\\\": 0, \\\"customerKey\\\": \\\"string\\\", \\\"dateAdjustmentRuleIndicator\\\": \\\"string\\\", \\\"dateOfBirth\\\": \\\"string\\\", \\\"debitOrderDetails\\\": { \\\"accountNumber\\\": \\\"string\\\", \\\"amount\\\": 0, \\\"autoPayFixedPercentage\\\": 0, \\\"day\\\": 0, \\\"routingNumber\\\": 0, \\\"type\\\": \\\"string\\\" }, \\\"debitOrderSubtype\\\": \\\"string\\\", \\\"debtorEmail\\\": \\\"string\\\", \\\"debtorId\\\": \\\"string\\\", \\\"debtorIdType\\\": \\\"string\\\", \\\"debtorPhoneNumber\\\": \\\"string\\\", \\\"debtorValueType\\\": \\\"string\\\", \\\"deliverCardIndicator\\\": \\\"string\\\", \\\"deliveryAddress1\\\": \\\"string\\\", \\\"deliveryAddress2\\\": \\\"string\\\", \\\"deliveryAddress3\\\": \\\"string\\\", \\\"deliveryAddress4\\\": \\\"string\\\", \\\"deliveryAddress5\\\": \\\"string\\\", \\\"deliveryEmail\\\": \\\"string\\\", \\\"distributionDetails\\\": { \\\"cardDistributionReason\\\": \\\"string\\\", \\\"cardDistributionSiteCode\\\": 0, \\\"mailCode\\\": \\\"string\\\", \\\"operatorId\\\": \\\"string\\\" }, \\\"emailAddresses\\\": [ \\\"string\\\" ], \\\"embossDetails\\\": { \\\"lines\\\": [ \\\"string\\\" ] }, \\\"employeeIndicator\\\": \\\"string\\\", \\\"homeDialCode\\\": \\\"string\\\", \\\"homeTelephone\\\": \\\"string\\\", \\\"instalmentOccurrence\\\": \\\"string\\\", \\\"jointVentureReferenceNumber\\\": \\\"string\\\", \\\"language\\\": \\\"string\\\", \\\"linkedAccountNumber\\\": \\\"string\\\", \\\"lostCardProtection\\\": \\\"string\\\", \\\"lowValuePaymentsIndicator\\\": \\\"NO\\\", \\\"mandateContractReferenceNumber\\\": \\\"string\\\", \\\"mandateDate\\\": \\\"string\\\", \\\"mandateDebtorName\\\": \\\"string\\\", \\\"mandateInstalmentAmount\\\": \\\"string\\\", \\\"mandateReferenceNumber\\\": \\\"string\\\", \\\"mandateRequestTransactionId\\\": \\\"string\\\", \\\"mandateStatus\\\": \\\"string\\\", \\\"maximumAmount\\\": 0, \\\"nationalCreditActDetails\\\": { \\\"indicator\\\": \\\"EXEMPTED\\\", \\\"type\\\": \\\"INTERMEDIATE\\\" }, \\\"packageDetails\\\": { \\\"packageClient\\\": \\\"string\\\", \\\"packageId\\\": 0 }, \\\"paymentCardIndustryStandardDetails\\\": { \\\"dual\\\": \\\"string\\\", \\\"indicator\\\": \\\"NO\\\", \\\"ten\\\": \\\"string\\\" }, \\\"postalCode\\\": 0, \\\"primaryTenantDetails\\\": { \\\"fullNames\\\": \\\"string\\\", \\\"identity\\\": { \\\"number\\\": \\\"string\\\", \\\"type\\\": \\\"ID_NUMBER\\\" } }, \\\"principleBank\\\": \\\"string\\\", \\\"product\\\": \\\"string\\\", \\\"productFamily\\\": \\\"string\\\", \\\"quotationNumber\\\": 0, \\\"riskBasedPricingDetails\\\": { \\\"limitAllocated\\\": \\\"string\\\", \\\"riskBasedPricing\\\": \\\"NO\\\", \\\"riskDispositionAllocated\\\": \\\"string\\\" }, \\\"rmsCollectionStartDate\\\": \\\"string\\\", \\\"scoringDetails\\\": { \\\"behaveScore\\\": 0, \\\"behaveScoreDt\\\": \\\"string\\\", \\\"cmtScore\\\": 0, \\\"creditBuroRating\\\": \\\"string\\\", \\\"finalScore\\\": 0, \\\"itcScore\\\": 0, \\\"scoreDate\\\": \\\"string\\\" }, \\\"siteCode\\\": 0, \\\"source\\\": \\\"string\\\", \\\"sourceOfFunds\\\": [ \\\"string\\\" ], \\\"stockCode\\\": \\\"string\\\", \\\"subProduct\\\": \\\"string\\\", \\\"systematicCreditLineIncreaseIndicator\\\": \\\"string\\\", \\\"trackingIndicator\\\": \\\"string\\\", \\\"ultimateDebtorName\\\": \\\"string\\\", \\\"waivers\\\": { \\\"waiveLateCharge\\\": \\\"string\\\", \\\"waiveMemberFee\\\": \\\"string\\\", \\\"waivePin\\\": \\\"string\\\", \\\"waiveTransactionFee\\\": \\\"string\\\" }, \\\"workDialCode\\\": \\\"string\\\", \\\"workTelephone\\\": \\\"string\\\"}")
                .when()
                .post
                        ("/api/accounts/credit")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need to fix Service
    }

    @Test(description = "Create Credit Account Tenant",groups = {"Credit Account"})
    public void CreateCreditAccountTenant() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \"accountNumber\": \"string\", \"cardType\": \"string\", \"distributionReason\": \"string\", \"distributionSite\": 0, \"operatorId\": \"string\", \"primaryCIFKey\": \"string\", \"primaryCasaRefNumber\": 0, \"stockCode\": \"string\", \"tenantCIFKey\": \"string\", \"tenantCasaRefNumber\": 0, \"tenantEmbossLine1\": \"string\", \"tenantFullNames\": \"string\", \"tenantIdNumber\": \"string\", \"tenantIdType\": \"string\", \"tenantType\": \"string\"}")
                .when()
                .post
                        ("/api/accounts/credit/addTenant")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need to fix Service
    }
}
