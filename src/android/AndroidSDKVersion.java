package org.apache.cordova.plugin.androidsdkversion;

import org.json.JSONArray;

import android.os.Build;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

public class AndroidSDKVersion extends CordovaPlugin {

    public final String ACTION_GET_CODENAME = "codename";
    public final String ACTION_GET_INCREMENTAL = "incremental";
    public final String ACTION_GET_RELEASE = "release";
    public final String ACTION_GET_SDK = "sdk";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
	
        if(action.equals(ACTION_GET_CODENAME)) {
	    callbackContext.success(Build.VERSION.CODENAME);
        } else if(action.equals(ACTION_GET_INCREMENTAL)) {
            callbackContext.success(Build.VERSION.INCREMENTAL);
        } else if(action.equals(ACTION_GET_RELEASE)) {
            callbackContext.success(Build.VERSION.RELEASE);
        } else if(action.equals(ACTION_GET_SDK)) {
            callbackContext.success(Build.VERSION.SDK_INT);
        } else {
	    return false;
        }
        
        return true;
    }
}