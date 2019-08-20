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

Mobile.tap(findTestObject('Homepage/IconPesan'), 0)

Mobile.setText(findTestObject('LoginPage/LoginUnameField'), loginUsername, 0)

Mobile.setText(findTestObject('LoginPage/LoginPassField'), loginPass, 0)

Mobile.tap(findTestObject('LoginPage/BtnLanjut'), 0)

switch (vExpectedResult.toString()) {
    case 'Failed':
        Mobile.verifyElementExist(findTestObject('LoginPage/BtnLanjut'), 0)

        break
    case 'Passed':
        Mobile.waitForElementPresent(findTestObject('Homepage/HomeIcon'), 0)

        Mobile.verifyElementExist(findTestObject('Homepage/HomeIcon'), 0)

        Mobile.tap(findTestObject('Homepage/IconAccount'), 0)

        Mobile.verifyElementVisible(findTestObject('Account/AkunSayaLabel'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Account/btnKeluar'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Account/btnYa'), 0)

        Mobile.waitForElementPresent(findTestObject('LoginPage/BtnLanjut'), 0)

        Mobile.verifyElementVisible(findTestObject('LoginPage/LabelLogin1'), 0)

        Mobile.verifyElementVisible(findTestObject('LoginPage/LabelLogin2'), 0)

        break
    default:
        break
}

