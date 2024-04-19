package mlkpx.testSteps;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;

public class WS_CashOut_Steps extends Base_Steps{

    public void navigationWalletServices()throws Exception{
        click(wsCashInToOwnAccountPageObjects.walletServicesLink(), "Wallet Services Page ");
        if(isVisible(wsCashInToOwnAccountPageObjects.walletServicesText(), getText(wsCashInToOwnAccountPageObjects.walletServicesText()))){
            ExtentReporter.logPass("Wallet Services navigation", "Successfully Validated Wallet Services Page");
        }else{
            ExtentReporter.logFail("Wallet Services navigation", "Failed to Validate Wallet Services Page");
            Assert.fail("Failed to Validate Wallet Services Page");
        }
        click(wsCashOutPageObjects.cashOutNavLink(), "Cash Out Nav Link");

    }
    public void CO_TC_01()throws Exception{
        CO_TC_03();
        click(wsCashOutPageObjects.cancelButtonInReceipt(),"Cancel Button Receipt");
    }

//    public void CO_TC_02()throws Exception{
//        QRCODE
//    }

    public void CO_TC_03()throws Exception{
        navigationWalletServices();
        String randomReferenceNum = reader.getRandomCashOutReferenceNum();
        type(wsCashOutPageObjects.referenceNumField(), "Reference Number Field", randomReferenceNum);
        click(wsCashOutPageObjects.searchButton(),"Search Button");
        if(isVisible(wsCashOutPageObjects.informationText(), getText(wsCashOutPageObjects.informationText()))){
            ExtentReporter.logPass("CO_TC_01", "Successfully Review the Transactions");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to Review the Transactions");
            Assert.fail("Failed to Review the Transactions");
        }
        click(wsCashOutPageObjects.cancelButton(),"Cancel BUtton");
        click(wsCashOutPageObjects.noStayOnThisPageButton(),"No Stay On this Posistion");
        click(wsCashOutPageObjects.proceedButton(),"Proceed Button");
        click(wsCashOutPageObjects.cancelButtonInProceed(), "Cancel BUtton");
        click(wsCashOutPageObjects.proceedButton(),"Proceed Button");
        click(wsCashOutPageObjects.confirmCashOut(),"Confirm Cash Out");
        waitSleep(4000);
        if(isVisible(wsCashOutPageObjects.cashOutSuccessfulText(), getText(wsCashOutPageObjects.cashOutSuccessfulText()))){
            ExtentReporter.logPass("CO_TC_01", "Transaction successfully process.");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to process Transactions");
            Assert.fail("Failed to process Transactions");
        }
        click(wsCashOutPageObjects.proceedButtonToReceipt(),"Proceed To Printing");
        if(isVisible(wsCashOutPageObjects.transactionReceipt(), getText(wsCashOutPageObjects.transactionReceipt()))){
            ExtentReporter.logPass("CO_TC_01", "Successfully Verify Transaction Receipt");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to Verify Transaction Receipt");
            Assert.fail("Failed to Verify Transaction Receipt");
        }
    }

    public void CO_TC_04()throws Exception{
        navigationWalletServices();
        type(wsCashOutPageObjects.referenceNumField(), "Reference Number Field", propertyReader.getproperty("invalidReferenceNum"));
        click(wsCashOutPageObjects.searchButton(),"Search Button");
        if(isVisible(wsCashOutPageObjects.invalidReferenceNum(), getText(wsCashOutPageObjects.invalidReferenceNum()))){
            ExtentReporter.logPass("CO_TC_04", "Successfully Verify invalid reference no.");
        }else{
            ExtentReporter.logFail("CO_TC_01", "Failed to Verify invalid reference no.");
            Assert.fail("Failed to Verify invalid reference no.");
        }
        click(wsCashOutPageObjects.okButton(),"Ok Button");
    }

//    public void CO_TC_05()throws Exception{
//        navigationWalletServices();
//    }


    public void CO_TC_06()throws Exception{
        navigationWalletServices();
        type(wsCashOutPageObjects.referenceNumField(), "Reference Number Field", propertyReader.getproperty("claimedTransactionNum"));
        click(wsCashOutPageObjects.searchButton(),"Search Button");
        if(isVisible(wsCashOutPageObjects.claimedTransactionText(), getText(wsCashOutPageObjects.claimedTransactionText()))){
            ExtentReporter.logPass("CO_TC_06", "Successfully Verify Claimed Transaction");
        }else{
            ExtentReporter.logFail("CO_TC_06", "Failed to Verify Claimed Transaction");
            Assert.fail("Failed to Verify Claimed Transaction");
        }
        click(wsCashOutPageObjects.okButton(),"Ok Button");
    }

    public void CO_TC_07()throws Exception{
        navigationWalletServices();
        click(wsCashOutPageObjects.referenceNumField(),"Reference Number Field");
        click(wsCashOutPageObjects.searchButton(),"Click Search Button without Reference Number");
        if(isVisible(wsCashOutPageObjects.kptnIsRequiredText(), getText(wsCashOutPageObjects.kptnIsRequiredText()))){
            ExtentReporter.logPass("CO_TC_06", "Successfully Verify cash out transaction with No reference Number");
        }else{
            ExtentReporter.logFail("CO_TC_06", "Failed to cash out transaction with No reference Number");
            Assert.fail("Failed to Verify cash out transaction with No reference Number");
        }
    }


}