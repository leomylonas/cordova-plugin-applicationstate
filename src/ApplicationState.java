package co.mylonas.cordova.applicationstate;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import android.content.Context;
import android.content.Intent;
import android.app.ActivityManager;
import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONArray;
import android.util.Log;
import android.app.Activity;
import android.content.Intent;
import java.util.*;

public class ApplicationState extends CordovaPlugin {
	protected static final String TAG = "ApplicationState";

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		Log.i(TAG, "Executing action: " + action);
		
		if (action.equals("getState")) {
			boolean foreground = isForeground(args.get(0).toString());
			String state = foreground ? "active" : "background";
			callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, state));
			return true;
		}
		
		callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, "Not a valid action"));
		return true;
	}
	
	public boolean isForeground(String myPackage) {
		ActivityManager manager = (ActivityManager) this.cordova.getActivity().getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
		List<ActivityManager.RunningTaskInfo> runningTaskInfo = manager.getRunningTasks(1); 
		ComponentName componentInfo = runningTaskInfo.get(0).topActivity;
		return componentInfo.getPackageName().equals(myPackage);
	}
}