package SmokeTests.ConversionController;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Conversion_Controller {

    @BeforeTest(groups = {"Conversion Controller Controller"})
    public void setUp()  {
        try {

            RestAssured.baseURI= "https://account-service.ebi-uat.rbb-banking.270-nonprod.caas.absa.co.za";

        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Test(description = "Create Credit Account",groups = {"Conversion Controller Controller"})
    public void CreateCreditAccount() {

        given()
                .header("Content-Type", "application/json")
                .and()
                .body("{ \\\"CAS130I\\\": { \\\"CardApp\\\": { \\\"AccountDDAType\\\": \\\"string\\\", \\\"AccountType\\\": \\\"string\\\", \\\"ActIndicator\\\": \\\"string\\\", \\\"ActType\\\": \\\"string\\\", \\\"AdjustedRate\\\": 0, \\\"AdjustmentCategory\\\": \\\"string\\\", \\\"ApplicationReferenceNumber\\\": \\\"string\\\", \\\"AssociateBank\\\": \\\"string\\\", \\\"AutoPayFixedPercentage\\\": 0, \\\"BehaviouralScore\\\": 0, \\\"BehaviouralScoreDate\\\": \\\"string\\\", \\\"BillingCycle\\\": 0, \\\"CASAPrimaryVersionNumber\\\": 0, \\\"CASAReferenceNumber\\\": 0, \\\"CMTScore\\\": 0, \\\"CardType\\\": \\\"string\\\", \\\"ChannelIndicator\\\": \\\"string\\\", \\\"ClientCellphoneNumber\\\": 0, \\\"CostCentre\\\": 0, \\\"CreditBuroRating\\\": \\\"string\\\", \\\"CreditLifeCode\\\": \\\"string\\\", \\\"CreditLifeType\\\": \\\"string\\\", \\\"CreditLine\\\": 0, \\\"CustomerKey\\\": \\\"string\\\", \\\"DateAdjustmentRuleIndicator\\\": \\\"string\\\", \\\"DateOfBirth\\\": \\\"string\\\", \\\"DebitOrderAccountNumber\\\": \\\"string\\\", \\\"DebitOrderAmount\\\": 0, \\\"DebitOrderDate\\\": 0, \\\"DebitOrderRoutingNumber\\\": 0, \\\"DebitOrderSubtype\\\": \\\"string\\\", \\\"DebitOrderType\\\": \\\"string\\\", \\\"DebtorEmail\\\": \\\"string\\\", \\\"DebtorId\\\": \\\"string\\\", \\\"DebtorIdType\\\": \\\"string\\\", \\\"DebtorPhoneNumber\\\": \\\"string\\\", \\\"DebtorValueType\\\": \\\"string\\\", \\\"DeliverCardIndicator\\\": \\\"string\\\", \\\"DeliveryAddress1\\\": \\\"string\\\", \\\"DeliveryAddress2\\\": \\\"string\\\", \\\"DeliveryAddress3\\\": \\\"string\\\", \\\"DeliveryAddress4\\\": \\\"string\\\", \\\"DeliveryAddress5\\\": \\\"string\\\", \\\"DeliveryEmail\\\": \\\"string\\\", \\\"DistributionReason\\\": \\\"string\\\", \\\"DistributionSiteCode\\\": 0, \\\"EmailAddress\\\": [ \\\"string\\\" ], \\\"EmbossLine1\\\": \\\"string\\\", \\\"EmbossLine2\\\": \\\"string\\\", \\\"EmployeeIndicator\\\": \\\"string\\\", \\\"FinalScore\\\": 0, \\\"FullNames\\\": \\\"string\\\", \\\"HomeDialCode\\\": \\\"string\\\", \\\"HomeTelephone\\\": \\\"string\\\", \\\"ITCScore\\\": 0, \\\"IdNumber\\\": \\\"string\\\", \\\"IdType\\\": \\\"string\\\", \\\"InstalmentOccurrence\\\": \\\"string\\\", \\\"JointVentureReferenceNumber\\\": \\\"string\\\", \\\"LVPIndicator\\\": \\\"string\\\", \\\"Language\\\": \\\"string\\\", \\\"LinkAccountNumber\\\": \\\"string\\\", \\\"LostCardProtection\\\": \\\"string\\\", \\\"MailCode\\\": \\\"string\\\", \\\"MandateContractReferenceNumber\\\": \\\"string\\\", \\\"MandateDate\\\": \\\"string\\\", \\\"MandateDebtorName\\\": \\\"string\\\", \\\"MandateInstalmentAmount\\\": \\\"string\\\", \\\"MandateReferenceNumber\\\": \\\"string\\\", \\\"MandateRequestTransactionId\\\": \\\"string\\\", \\\"MandateStatus\\\": \\\"string\\\", \\\"MaximumAmount\\\": 0, \\\"OperatorId\\\": \\\"string\\\", \\\"PCIDual\\\": \\\"string\\\", \\\"PCITen\\\": \\\"string\\\", \\\"PCIYesNo\\\": \\\"string\\\", \\\"PackageClient\\\": \\\"string\\\", \\\"PackageId\\\": 0, \\\"PostalCode\\\": 0, \\\"PrincipleBank\\\": \\\"string\\\", \\\"Product\\\": \\\"string\\\", \\\"ProductFam\\\": \\\"string\\\", \\\"QuotationNumber\\\": 0, \\\"RMSCollectionStartDate\\\": \\\"string\\\", \\\"RiskBasedPricingIndicator\\\": \\\"string\\\", \\\"RiskBasedPricingLImitAllocation\\\": \\\"string\\\", \\\"RiskBasedPricingRiskDisp\\\": \\\"string\\\", \\\"ScoreDate\\\": \\\"string\\\", \\\"SiteCode\\\": 0, \\\"Source\\\": \\\"string\\\", \\\"SourceOfFunds\\\": { \\\"SourceOfFunds1\\\": \\\"string\\\", \\\"SourceOfFunds2\\\": \\\"string\\\", \\\"SourceOfFunds3\\\": \\\"string\\\", \\\"SourceOfFunds4\\\": \\\"string\\\", \\\"SourceOfFunds5\\\": \\\"string\\\" }, \\\"StockCode\\\": \\\"string\\\", \\\"SubProduct\\\": \\\"string\\\", \\\"SystematicIncrease\\\": \\\"string\\\", \\\"TrackingIndicator\\\": \\\"string\\\", \\\"UltimateDebtorName\\\": \\\"string\\\", \\\"WaLateCharge\\\": \\\"string\\\", \\\"WaMemberFee\\\": \\\"string\\\", \\\"WaPin\\\": \\\"string\\\", \\\"WaTransactionFee\\\": \\\"string\\\", \\\"WorkDialCode\\\": \\\"string\\\", \\\"WorkTelephone\\\": \\\"string\\\" } }, \\\"NBSAPDPI\\\": { \\\"NBSAPLI\\\": { \\\"Application\\\": \\\"string\\\", \\\"Channel\\\": \\\"string\\\", \\\"Trace\\\": \\\"string\\\" } }}")
                .when()
                .post
                        ("/api/accounts/request-converters/cams-instant-account")

                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        //Need inputs to create and service to retutn same status code
    }
}
