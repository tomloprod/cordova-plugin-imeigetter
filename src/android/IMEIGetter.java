package tomloprod;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import android.telephony.TelephonyManager;
import android.content.Context;


public class IMEIGetter extends CordovaPlugin {
	@Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) {
		PluginResult.Status status = PluginResult.Status.OK;
        String imei = "";
		if (action.equals("get")) {
			TelephonyManager telManager  = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
			imei = telManager.getDeviceId();
		}else{
			status = PluginResult.Status.INVALID_ACTION;
		}
		callbackContext.sendPluginResult(new PluginResult(status, imei));
		return true;
    }
}
