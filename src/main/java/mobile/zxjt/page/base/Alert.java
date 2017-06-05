package mobile.zxjt.page.base;

import io.appium.java_client.MobileElement;
import mobile.zxjt.wait.WaitUtil;

public class Alert extends PageBase {
	private MobileElement oTextMsg;
	private MobileElement oBtnCancel;
	private MobileElement oBtnOK;

	public void doAccept() {
		oBtnOK.click();
	}

	public void doCancel() {
		oBtnCancel.click();
	}

	public String doGetMsg() {
		return oTextMsg.getText();
	}

	public boolean exists(int seconds) {
		return WaitUtil.exists(driver, oTextMsg, seconds);
	}

}
