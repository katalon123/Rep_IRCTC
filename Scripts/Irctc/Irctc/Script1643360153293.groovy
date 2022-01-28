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

WebUI.navigateToUrl('https://www.irctc.co.in/nget/train-search')

WebUI.click(findTestObject('Object Repository/Page_IRCTC Next Generation eTicketing System/form_Honble Prime Minister message on Publi_25ee2d'))

WebUI.click(findTestObject('Object Repository/Page_IRCTC Next Generation eTicketing System/div_Honble Prime Minister message on Public_f9db89'))

WebUI.click(findTestObject('Object Repository/Page_IRCTC Next Generation eTicketing System/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_IRCTC Next Generation eTicketing System/a_BUSES'))

WebUI.switchToWindowTitle('IRCTC Bus - Online Bus Ticket Booking | Bus Reservation')

WebUI.click(findTestObject('Object Repository/Page_IRCTC Bus - Online Bus Ticket Booking _7462d0/div_Hotels_Nav-icons BusTickets'))

WebUI.click(findTestObject('Object Repository/Page_IRCTC Bus - Online Bus Ticket Booking _7462d0/div_Hotels_Nav-icons BusTickets'))

WebUI.click(findTestObject('Object Repository/Page_IRCTC Bus - Online Bus Ticket Booking _7462d0/div_Bus Tickets_Nav-icons RetiringRoom'))

WebUI.closeBrowser()

