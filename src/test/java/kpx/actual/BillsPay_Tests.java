package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class BillsPay_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful bills payment transaction")
//    public void BillsPay_TC_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateSuccessfulBillsPayTransaction();
//
//        }
//
//    }



  //  B I L L S  P A Y    C A N C E L L A T I O N
//    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful Bills Pay Cancellation ")
//    public void BPC_TC_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateSuccessfulBillsPayCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "To validate remote successful Bills Pay Cancellation ")
//    public void BPC_TC_02()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateSuccessfulRemoteBillsPayCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate Empty Reference Bills Pay Cancellation ")
//    public void BPC_TC_03()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateEmptyRefBillsPayCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "To validate Invalid Reference Bills Pay Cancellation ")
//    public void BPC_TC_04()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateInvalidRefBillsPayCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "To validate Cancelled Reference Bills Pay Transaction ")
//    public void BPC_TC_05()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateCancelledBillsPayRefNum();
//
//        }
//
//    }
    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "To validate Invalid IR number Bills Pay Transaction ")
    public void BPC_TC_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayInvalidIRNumber();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To validate No Reason Bills Pay Transaction ")
    public void BPC_TC_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayNoReason();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "To validate NO IR number Bills Pay Transaction ")
    public void BPC_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayNoIRNumber();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 9, description = "To validate NO Initiated By Bills Pay Transaction ")
    public void BPC_TC_09()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayNoInitiatedBy();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "To validate Keep Transaction By Bills Pay Transaction ")
    public void BPC_TC_10()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayKeepTransaction();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 11, description = "To validate Stay Transaction By Bills Pay Transaction ")
    public void BPC_TC_11()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayStayInPage();

        }

    }



}
