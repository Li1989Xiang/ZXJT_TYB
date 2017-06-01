package mobile.zxjt;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;

import mobile.zxjt.driver.DriverFactory;
import mobile.zxjt.report.db.DBConnection;
import mobile.zxjt.testng.HTMLReporter;
import mobile.zxjt.testng.Runner;
import mobile.zxjt.wait.WaitUtil;
import up.light.LightContext;
import up.light.folder.FolderTypes;
import up.light.pojo.ImplicitlyWait;

public class Main {

	public static void main(String[] args) {
		//System.out.println(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
/*		System.out.println("main.dir:"+System.getProperty("user.dir"));
		System.out.println("main.getresource:"+Main.class.getResource("/").getPath());
		LightContext.setPlatform("android");
		System.out.println(LightContext.getRootPath());*/
		init("android");
		try {
			Runner.run();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HTMLReporter.generate();
			DBConnection.close();
			DriverFactory.close();
		}
	}

	private static void init(String platform) {
		// 设置平台
		LightContext.setPlatform(platform);
		// 初始化Log4J
		System.out.println("---"+LightContext.getFolderPath(FolderTypes.CONFIG));
		String file = LightContext.getFolderPath(FolderTypes.CONFIG) + "log4j.properties";
		System.out.println(file);
		PropertyConfigurator.configure(file);
		// 设置默认等待时间
		ImplicitlyWait wait = new ImplicitlyWait(5, TimeUnit.SECONDS);
		LightContext.setAttribute(WaitUtil.KEY, wait);
		// 初始化Navigator
		//Navigator.parseXml();
	}

}
