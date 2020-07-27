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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('C:\\Program Files (x86)\\7-Zip\\7zFM.exe', '')

Windows.click(findWindowsObject('Object Repository/Objectsofzipandunzip/Edit'))

Windows.click(findWindowsObject('Object Repository/Objectsofzipandunzip/Button'))

Windows.switchToWindowTitle('Add to Archive')

Windows.click(findWindowsObject('Object Repository/Objectsofzipandunzip/Button(1)'))

Windows.switchToWindowTitle('A:\\')

Windows.click(findWindowsObject('Object Repository/Objectsofzipandunzip/Edit(1)'))

Windows.click(findWindowsObject('Object Repository/Objectsofzipandunzip/Button(2)'))

Windows.switchToWindowTitle('A:\\TestAutoWinZip.7z')

Windows.click(findWindowsObject('Object Repository/Objectsofzipandunzip/Button(3)'))

Windows.closeApplication()

