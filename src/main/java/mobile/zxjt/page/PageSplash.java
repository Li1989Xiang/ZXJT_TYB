package mobile.zxjt.page;

import io.appium.java_client.MobileElement;
import mobile.zxjt.page.base.Alert;
import mobile.zxjt.page.base.PageBase;
import mobile.zxjt.wait.WaitUtil;

public class PageSplash extends PageBase {
	private MobileElement oSplash;
	private MobileElement oBtnNoticeCancel;

	public void doWaitForStart() {
		while (WaitUtil.exists(driver, oSplash, WaitUtil.WAIT_SHORT))
			;
		Alert alert = getAlert();
		if (alert.exists(WaitUtil.WAIT_SHORT)) {
			throw new RuntimeException(alert.doGetText());
		}
	}

	public void doCloseAlert() {
		if (WaitUtil.exists(driver, oBtnNoticeCancel, WaitUtil.WAIT_SHORT)) {
			oBtnNoticeCancel.click();
		}
	}

}
