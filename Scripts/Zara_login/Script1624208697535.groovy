import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.zara.com/ca/')

WebUI.click(findTestObject('Object Repository/Zara_Login/Page_ZARA Canada  SALE/span_LOG IN'))

WebUI.click(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/input_Log in_logonId'))

WebUI.click(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/div_Email'))

WebUI.setText(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/input_Log in_logonId'), 
    'jasmine24@gmail.com')

WebUI.click(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/form_EmailPasswordForgot your passwordLOG IN'))

WebUI.setEncryptedText(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/input_Email_password'), 
    'p7SbmDQeaZ0mZ0JzHZgY4g==')

WebUI.click(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Zara_Login/Page_LOG IN  CREATE ACCOUNT - ZARA Canada -_3d537f/button_CLOSE'))

WebUI.closeBrowser()

