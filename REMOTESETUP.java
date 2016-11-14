package samsung;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;
//import universal.test.R;
import samsung.test.R;

import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
public class REMOTESETUP extends ActivityInstrumentationTestCase2 {
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
	public REMOTESETUP() throws ClassNotFoundException {
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

public void testAremotesetup() {

  solo.waitForText(this.getInstrumentation().getContext().getString(R.string.choose_device_brand));
  solo.goBack();
// Please remove all files in "resource bundle" except values file for all regions:
// Samsung.test is package name that we are using here. *
// Solo.clickOnText(this.getInstrumentation().getContext().getString(samsung.test.R.string.splash_start));
// solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.splash_start));
// solo.clickOnText(solo.getString(R.string.splash_start));
  solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.splash_start));
  //solo.searchText("Samsung");
  solo.clickOnText("Samsung");
  solo.clickOnView(solo.getView("circle_img"));
  solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.yes));
  solo.clickOnView(solo.getView("circle_img"));
  solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.yes));
  solo.sleep(6000);
  solo.clickOnText("Tata Sky");
  solo.clickOnView(solo.getView("circle_img"));
  solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.yes));
  solo.clickOnView(solo.getView("circle_img"));
  solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.yes));
  solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.label_skip));
  solo.sleep(6000);
  Common.testhomebutton(solo);
  //solo.clickOnView(solo.getView("id/menu_settings"));
  //assertTrue(solo.waitForText(this.getInstrumentation().getContext().getString(R.string.my_room)));
   //solo.clickOnView(solo.getView("id/menu_settings"));
  //solo.sleep(1000);
  //solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.basic_profile));
  //solo.sleep(5000);
  //solo.clickOnText("^here$");
  //solo.sleep(5000);
//solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.privacy));
  
}

public void testBapp_reset(){
	Common.testBapp_reset(solo);
  //solo.sleep(5000);
  //solo.clickOnView(solo.getView("id/menu_settings"));
  //solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.basic_profile));
  //solo.clickOnText("^((?!here).)*$");
  //solo.sleep(5000);
  //solo.waitForText(this.getInstrumentation().getContext().getString(R.string.privacy_policy));
  //solo.goBack();
  //solo.sleep(5000);
//solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.resetpeelapp));
//solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.ok));
//solo.waitForText(this.getInstrumentation().getContext().getString(R.string.choose_device_brand));
}

public void testCeditchannels(){
	
}
}
