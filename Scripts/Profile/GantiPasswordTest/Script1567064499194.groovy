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

WebUI.callTestCase(findTestCase('Profile/LoginCase'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Account/LabelLihatUbahProfile'), 0)

CustomKeywords.'scrolling.Scroll.swipeTopToBottom'()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Account/LabelKataSandi'), 0)

Mobile.waitForElementPresent(findTestObject('Account/GantiPassword/LabelUbahKataSandi'), 0)

Mobile.setText(findTestObject('Account/FieldOldPass'), oldPassword, 0)

Mobile.setText(findTestObject('Account/FieldNewPass'), newPassword, 0)

Mobile.setText(findTestObject('Account/FieldConfirmNewPass'), newConfPassword, 0)

switch (result.toString()) {
    case 'Failed':
        if (condition.toString() == 'oldPassNotMatch') {
            Mobile.verifyElementVisible(findTestObject('Account/GantiPassword/WarnOldPassNotMatch'), 0)
        } else if (condition.toString() == 'newPassShort') {
            Mobile.tap(findTestObject('Account/BtnSimpanPass'), 0)

            Mobile.verifyElementVisible(findTestObject('Account/GantiPassword/WarnNewPassShort'), 0)
        }
        
        break
}

Mobile.tap(findTestObject('Account/BtnSimpanPass'), 0)

Mobile.closeApplication()

