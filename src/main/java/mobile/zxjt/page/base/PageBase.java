package mobile.zxjt.page.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobile.zxjt.driver.DriverFactory;
import up.light.LightContext;
import up.light.folder.FolderTypes;
import up.light.supports.pagefactory.ILocatorFactory;
import up.light.supports.pagefactory.JsonLocatorFactory;
import up.light.supports.pagefactory.PageFactory;

public abstract class PageBase {
	protected static AppiumDriver<MobileElement> driver = DriverFactory.getDriver();
	private static final ILocatorFactory FACTORY = new JsonLocatorFactory(
			LightContext.getFolderPath(FolderTypes.REPOSITORY));

	public PageBase() {
		PageFactory.setFactory(FACTORY);
		PageFactory.initElements(DriverFactory.getFinder(), this, MobileElement.class);
	}

	public Alert getAlert() {
		return PageManager.getPage(Alert.class);
	}

	public void reset() {
	}

}
