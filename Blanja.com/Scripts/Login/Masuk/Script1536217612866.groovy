import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String actualURL = ''

String expectedURL = 'https://www.blanja.com/'

WebUI.openBrowser('')

WebUI.delay(1)

WebUI.navigateToUrl('https://www.blanja.com/')

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.click(findTestObject('Login/silang blanja pelajari hal baru'))

WebUI.delay(1)

WebUI.click(findTestObject('Login/Click button Masuk'))

WebUI.delay(1)

WebUI.setText(findTestObject('Login/Username'), 'tblanja123')

WebUI.delay(1)

WebUI.setText(findTestObject('Login/Password'), '123qwe')

WebUI.delay(1)

WebUI.click(findTestObject('Login/Button Masuk'))

WebUI.delay(1)

WebUI.setText(findTestObject('Setelah Login/Search Product'), 'Instax Mini')

WebUI.delay(1)

WebUI.click(findTestObject('Setelah Login/Button Cari'))

WebUI.delay(1)

WebUI.click(findTestObject('Setelah Login/click product FujiFilm instax mini9'))

WebUI.delay(2)

WebUI.click(findTestObject('Setelah Login/button blanja sekarang'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Setelah Login/Jasa Pengiriman'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('Setelah Login/Lanjutkan Pembayaran'))

WebUI.delay(1)

WebUI.click(findTestObject('Setelah Login/Lanjutkan setelah lanjutkan pembayaran'))

WebUI.delay(1)

WebUI.click(findTestObject('Setelah Login/Pilih payment'))

WebUI.delay(2)

WebUI.click(findTestObject('Setelah Login/Konfirmasi Pembayaran'))

WebUI.delay(2)

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

log.logInfo("total anda adalah"+total)

