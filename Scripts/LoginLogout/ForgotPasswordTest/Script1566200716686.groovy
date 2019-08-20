import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\State\'s Secret\\Internsheeepppppp\\Project\\accmart.apk', true)

Mobile.tap(findTestObject('Homepage/IconAccount'), 0)

Mobile.tap(findTestObject('ForgotPassword/BtnLogin'), 0)

Mobile.tap(findTestObject('ForgotPassword/LabelForgotPass'), 0)

Mobile.setText(findTestObject('ForgotPassword/EmailField'), vEmailLupa, 0)

Mobile.tap(findTestObject('ForgotPassword/BtnLanjutkan'), 0)

switch (vExpectedResult.toString()) {
    case 'Failed':
        if (vCondition.toString() == 'wrongEmail') {
            Mobile.verifyElementVisible(findTestObject('ForgotPassword/WarnNoEmail'), 0)
        } else if (vCondition.toString() == 'emptyEmail') {
            Mobile.verifyElementVisible(findTestObject('ForgotPassword/WarnEmptyEmail'), 0)
        }
        
        break
    case 'Passed':
        Mobile.verifyElementVisible(findTestObject('ForgotPassword/OTPNotif'), 0)

        Mobile.waitForElementPresent(findTestObject('ForgotPassword/ChangePassword/LabelEnterNewPass'), 0)

        Mobile.setText(findTestObject('ForgotPassword/ChangePassword/FieldNewPass'), '', 0)

        Mobile.setText(findTestObject('ForgotPassword/ChangePassword/FieldNewVpass'), '', 0)

        switch (vExpectedChange.toString()) {
            case 'Failed':
                break
                
                if (changeCondition.toString() == 'nPassEmpty') {
                    Mobile.verifyElementVisible(findTestObject('ForgotPassword/ChangePassword/WarnEmptyPass'), 0)
                }
            case Passed:
                break
                
                Mobile.verifyElementVisible(findTestObject('LoginPage/LabelSelamatDatang'), 0)
            default:
                break
        }
        
        break
}

Mobile.closeApplication()

