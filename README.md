# Cordova Application State
This is a very simple Cordova plugin for iOS and Android to determine the state of the application

### Licence
This is licenced under Creative Commons 4.0 International (http://creativecommons.org/licenses/by/4.0/)

You are free to:  
Share — copy and redistribute the material in any medium or format  
Adapt — remix, transform, and build upon the material for any purpose, even commercially.  
The licensor cannot revoke these freedoms as long as you follow the license terms.  

Attribution — You **must** give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.

### Requirements
* iOS and Android only (specific versions not tested, but known to be working on iOS 8.3 and Android 5.0)
* Cordova >= 3.0.0

### Version
0.0.2

### Installation
```sh
$ cordova plugin add https://github.com/leomylonas/cordova-plugin-applicationstate.git
```

### Uninstallation
```sh
cordova plugin remove co.mylonas.cordova.applicationstate
```

### Usage
```JavaScript
/**
 * Gets the current state of the application
 *
 * @param packageName		- the full package name of the application (eg com.example.myapp)
 * @param successCallback	- the function to call when the application state is determined
 * @param errorCallback		- the function to call if an error occurs
 */
window.ApplicationState.getState(packageName, function(state) {
    /*
    Do something within this callback with the retrieved state.
    [state] will be a string with the value of one of:
        "active", "background", or "inactive"
    */
}, function(error) {
    // do something within this callback if there was an error
});
```

### Description of States
#### iOS
- **active:** The app is running in the foreground and currently receiving events. (https://developer.apple.com/reference/uikit/uiapplicationstate/uiapplicationstateactive)
- **background:** The app is running in the background. (https://developer.apple.com/reference/uikit/uiapplicationstate/uiapplicationstatebackground)
- **inactive:** The app is running in the foreground but is not receiving events. This might happen as a result of an interruption or because the app is transitioning to or from the background. (https://developer.apple.com/reference/uikit/uiapplicationstate/uiapplicationstateinactive)

#### Android
(https://developer.android.com/reference/android/app/ActivityManager.RunningTaskInfo.html#topActivity)
- **active:** The app is the topmost activity
- **background:** The app is NOT the topmost activity
