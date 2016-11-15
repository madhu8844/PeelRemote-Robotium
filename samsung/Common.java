package samsung;

import com.robotium.solo.Solo;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.view.View;
import samsung.test.R;


public class Common {

// App reset condition
	public static void testBapp_reset(Solo solo){
		 //solo.sleep(5000);
		  solo.clickOnView(solo.getView("overflow_menu_btn"));
		  //solo.clickOnText(this.getInstrumentation().getContext().getString(R.string.basic_profile));
		  solo.clickOnText("Reset Peel App.*");
		  solo.sleep(5000);
		  solo.clickOnText("OK");
		 //solo.waitForText(this.getInstrumentation().getContext().getString(R.string.privacy_policy));
	}
	
// Turn_off Device wifi
public static void testwifi_off(Solo solo) throws InterruptedException{
	WifiManager wifiman=(WifiManager)solo.getCurrentActivity().getSystemService(Context.WIFI_SERVICE);
	wifiman.setWifiEnabled(false);
	
}	

// Turn_on Device wifi
public static void testwifi_on(Solo solo) throws InterruptedException{
	WifiManager wifiman=(WifiManager)solo.getCurrentActivity().getSystemService(Context.WIFI_SERVICE);
	wifiman.setWifiEnabled(true);
	Thread.sleep(4000);
	solo.clickOnText("OK");
}

public static void unlock(Solo solo){
	
	
}
	
public static void testhomebutton(Solo solo){
    solo.clickOnActionBarHomeButton();
}	
}