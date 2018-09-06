import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Codigo\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Login\\Masuk\\20180906_152709\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: String actualURL = ''

not_run: String expectedURL = 'https://www.blanja.com/'

not_run: WebUI.openBrowser('')

not_run: WebUI.delay(1)

not_run: WebUI.navigateToUrl('https://www.blanja.com/')

not_run: WebUI.delay(2)

not_run: WebUI.maximizeWindow()

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Login/silang blanja pelajari hal baru'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Login/Click button Masuk'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Login/Username'), 'tblanja123')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Login/Password'), '123qwe')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Login/Button Masuk'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Setelah Login/Search Product'), 'Instax Mini')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Setelah Login/Button Cari'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Setelah Login/click product FujiFilm instax mini9'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Setelah Login/button blanja sekarang'))

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByIndex(findTestObject('Setelah Login/Jasa Pengiriman'), '1')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Setelah Login/Lanjutkan Pembayaran'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Setelah Login/Lanjutkan setelah lanjutkan pembayaran'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Setelah Login/Pilih payment'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Setelah Login/Konfirmasi Pembayaran'))

not_run: WebUI.delay(2)

WebUI.navigateToUrl('member.blanja.com/trades/orderList.html')

WebUI.delay(1)

WebUI.click(findTestObject('Setelah Login/Rincian Blanjaan'))

WebUI.delay(1)

WebUI.switchToWindowIndex('1')

detail = WebUI.getText(findTestObject('Setelah Login/Rincian Pesanan'))

WebUI.verifyMatch(detail, 'Rincian Pesanan', false)

WebUI.delay(2)

total = WebUI.getText(findTestObject('Setelah Login/total pemesanan'))

WebUI.delay(2)

KeywordLogger log = new KeywordLogger()

log.logInfo('total anda adalah' + total)

''', 'Test Cases/Login/Masuk', new TestCaseBinding('Test Cases/Login/Masuk',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
