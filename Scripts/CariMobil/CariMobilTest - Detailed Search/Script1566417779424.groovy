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

Mobile.tap(findTestObject('Homepage/FieldCariMobil'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('CariMobilObjects/DropdownMerek'), 0)

Mobile.tap(findTestObject('CariMobilObjects/SearchMerek'), 0)

Mobile.setText(findTestObject('CariMobilObjects/SearchMerek'), 'Toyota', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CariMobilObjects/OptionToyota'), 0)

Mobile.tap(findTestObject('CariMobilObjects/DropdownTipe'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CariMobilObjects/SearchTipe'), 0)

Mobile.setText(findTestObject('CariMobilObjects/SearchTipe'), 'Alphard', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CariMobilObjects/OptionAlphard'), 0)

Mobile.tap(findTestObject('CariMobilObjects/DropdownLokasi'), 0)

Mobile.tap(findTestObject('CariMobilObjects/SearchLokasi'), 0)

Mobile.setText(findTestObject('CariMobilObjects/SearchLokasi'), 'Semarang', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CariMobilObjects/OptionSemarang'), 0)

Mobile.tap(findTestObject('CariMobilObjects/BtnPencarianLanjutan'), 0)

not_run: Mobile.setSliderValue(findTestObject('CariMobilObjects/SliderHarga'), 90, 0)

CustomKeywords.'scrolling.Scroll.swipeTopToBottom'()

Mobile.tap(findTestObject('CariMobilObjects/BtnCariMobil'), 0)

Mobile.verifyElementVisible(findTestObject('CariMobilObjects/LabelAlphard'), 0)

Mobile.tap(findTestObject('CariMobilObjects/LabelAlphard'), 0)

Mobile.closeApplication()

