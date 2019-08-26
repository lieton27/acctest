package scrolling

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Scroll {
	@Keyword
	public static void swipeTopToBottom(){
		//	'Get Device Height and Store in to device_height variable'
		int	device_Height = Mobile.getDeviceHeight()
		
		
		 
		//'Get Width Height and Store in to device_Width variable'
		int	device_Width = Mobile.getDeviceWidth()
		
		//	'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2
		
		//	'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX
		
		//	'Storing the value in startY variable'
		int startY = device_Height * 0.30
		
		//	'Storing the value in endY variable'
		int endY = device_Height * 0.70
		
		//	'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)
		
		
		 
		//'Swipe Vertical from bottom to top'
		//Mobile.swipe(startX, startY, endX, endY)
		}
		
		public static void swipeLeftToWrite(){
		//	'Get Device Height and Store in to device_height variable'
		int	device_Height = Mobile.getDeviceHeight()
		
		//'Get Width Height and Store in to device_Width variable'
		int	device_Width = Mobile.getDeviceWidth()
		
		//	'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2
		
		//	'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX
		
		//	'Storing the value in startY variable'
		int startY = device_Height * 0.30
		
		//	'Storing the value in endY variable'
		int endY = device_Height * 0.70
		
		//'Swipe Vertical from bottom to top'
		Mobile.swipe(startX, startY, endX, endY)
		}
}
