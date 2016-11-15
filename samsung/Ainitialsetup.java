package samsung;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import junit.framework.Assert;

//import universal.test.R;
import samsung.test.R;
import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")

/* You can then create a test(Ainitialsetup) class by extending ActivityInstrumentationTestCase2 */

public class Ainitialsetup extends ActivityInstrumentationTestCase2 {
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.peel.main.Main";
	private static Class<?> launcherActivityClass;
	static 
	{
		try 
		
		{
			launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		}   catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	@SuppressWarnings("unchecked")
	public Ainitialsetup() throws ClassNotFoundException {
		super("", launcherActivityClass);
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	@Override
	public void tearDown() throws Exception
	{
		solo.finishOpenedActivities();
		solo.finishOpenedActivities();
	}
	
	long millis = System.currentTimeMillis();
	private Solo solo;
	
	/** App crashes while setup the Remote with combination of same Brands(LG TV + LG AC)
	 Jira link - https://peel-jira.atlassian.net/browse/PAR-6854 */
	
	
public void testA_6854() throws InterruptedException{
Common.testwifi_off(solo);
solo.waitForText(this.getInstrumentation().getContext().getString(R.string.label_select_device_type));
solo.goBack();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.splash_start));
solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.tv));
solo.clickOnText("LG");
solo.clickOnView(solo.getView("circle_img"));
solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.yes));
Boolean turnedOn = null;
solo.setWiFiData(turnedOn);
solo.setWiFiData(null);
}

public void testB_6854() throws InterruptedException{
solo.clickOnView(solo.getView("add_device_btn"));	
solo.clickOnText("Air Conditioner");
solo.clickOnText("LG");
solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.next_cap_btn));
solo.clickOnButton(0);
solo.clickOnText(".*Yes.*");
Thread.sleep(5000);
Common.testBapp_reset(solo);
}

/* Need to disable 'Send Feedback', 'Browse Forum' functionalities when the device is in offline mode
   Jira link - https://peel-jira.atlassian.net/browse/PAR-6854 */


public void testC_6856() throws InterruptedException{
testA_6854(); //Use testcase1 method here
Thread.sleep(4000);

View view = solo.getView("overflow_menu_btn");
solo.clickOnView(view);

Thread.sleep(1000);
String expected = "Send Feedback";
boolean actual = solo.searchText("Send Feedback");
assertEquals("Text found",expected,actual);
solo.goBack();
Thread.sleep(1000);
Common.testBapp_reset(solo);
}

public void testturnwifi_on() throws InterruptedException{
//Common.testwifi_off(solo);
//testA_6854();
Common.testwifi_on(solo);
Common.testBapp_reset(solo);
}

private void assertequals() {
	// TODO Auto-generated method stub
	
}
}