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

WebUI.navigateToUrl('http://localhost/BALM_ORCL_PL/Account/se.aspx?ReturnUrl=%2fBALM_ORCL_PL%2fBALM%2fAccount%2fLogin.aspx')

WebUI.click(findTestObject('Object Repository/Page_Session Expired/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Login - BALM/input_Invalid input, special characters are_7cf199'), 
    'RMUSER_m')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - BALM/input_Field is mandatory_ctl00MCLoginUserPassword'), 
    'mT8LvUsNm+YdiPz5sDqrjA==')

WebUI.click(findTestObject('Object Repository/Page_Login - BALM/input_Invalid input,Please enter 6 digits_c_da073e'))

WebUI.click(findTestObject('Object Repository/Page_BALM/li_Parameters-MC                           _ca47ab'))

WebUI.click(findTestObject('Object Repository/Page_BALM/li_Set Distribution Rules'))

WebUI.click(findTestObject('Object Repository/Page_Set Distribution Rules/input_Cashflow Type_ctl00ctl00PCMCbtnDownload'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Download Distribution rule/select_--Select--ALCODLS SchemeDemo SchemeI_32be7b'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Download Distribution rule/select_--Select--Version 1version2'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Download Distribution rule/select_--Select--InflowOutflow'), 
    'I', true)

WebUI.click(findTestObject('Object Repository/Page_Download Distribution rule/input_Field is mandatory_ctl00ctl00PCMCbtnDownload'))

WebUI.click(findTestObject('Object Repository/Page_Download Distribution rule/input_Field is mandatory_ctl00ctl00PCMCbtn_Back'))

WebUI.click(findTestObject('Object Repository/Page_Set Distribution Rules/input_Cashflow Type_ctl00ctl00PCMCbtnUpload'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Upload Distribution rule/select_--Select--ALCODLS SchemeDemo SchemeI_32be7b'), 
    '100', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Upload Distribution rule/select_--Select--Version 1version2'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Upload Distribution rule/select_--Select--InflowOutflow'), 
    'I', true)
WebUI.uploadFile(findTestObject('Upload File'), 'C:\\\\Users\\\\priyankav\\\\Documents\\\\BASEL\\\\Calendar.xlsx')
WebUI.click(findTestObject('Object Repository/Page_Upload Distribution rule/input_Warning_ctl00ctl00PCMCbtnUpload'))

WebUI.click(findTestObject('Object Repository/Page_Upload Distribution rule/input_Do you want to save_ctl00ctl00PCMCbtnOk'))

