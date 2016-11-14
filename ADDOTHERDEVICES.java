package samsung;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import junit.framework.Assert;
//import universal.test.R;
import samsung.test.R;

import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
public class ADDOTHERDEVICES extends ActivityInstrumentationTestCase2 {
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
	public ADDOTHERDEVICES() throws ClassNotFoundException {
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
	
public void testAwlan(){
// verify Wlan popup
//solo.waitForText("Connect to WLAN");
//Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.network_connect_to_wlan)));
//solo.waitForText("CONNECT");
//solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.network_connect));	
Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.choose_device_brand)));
//solo.scrollUp();
Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.i_have_a_projector)));
solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.i_have_a_projector));
solo.clickOnEditText(0);
solo.enterText(0, "I Can't find My brand");
solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.cant_find_my_brand));

}	

public void testBdddevices() {
	 solo.waitForText(this.getInstrumentation().getContext().getString(R.string.choose_device_brand));
	 Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.choose_device_brand)));
	 solo.goBack();
	 solo.sleep(6000);
	 solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.splash_start));
 	 solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.add_other_devices));
     solo.waitForText(this.getInstrumentation().getContext().getString(R.string.label_select_device_type));
     Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.label_select_device_type)));
     //Use COMMON METHOD here:
     Common.testhomebutton(solo);
}

public void testCverifydevicetype(){
	solo.waitForText(this.getInstrumentation().getContext().getString(R.string.label_select_device_type));
    Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.label_select_device_type)));

	//Search Assertion using - Assert.assertTrue:
	Assert.assertTrue(solo.searchText(this.getInstrumentation().getContext().getString(R.string.label_select_device_type)));
	
}
}
