# Cordova Application State
This is a very simple Cordova plugin for iOS to determine the state of the application

### Licence
This is licenced under Creative Commons 4.0 International (http://creativecommons.org/licenses/by/4.0/)

You are free to:  
Share — copy and redistribute the material in any medium or format  
Adapt — remix, transform, and build upon the material for any purpose, even commercially.  
The licensor cannot revoke these freedoms as long as you follow the license terms.  

Attribution — You **must** give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.

### Requirements
* iOS only
* Cordova >= 3.0.0

### Version
0.0.1

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
// NOTE: this below method can only be called after the cordova device is ready
window.applicationState.getState(function(state) {
    /*
    Do something within this callback with the retrieved state.
    [state] will be a string with the value of one of:
        "active", "background", or "inactive"
    */
}, function(error) {
    // do something within this callback if there was an error
});
```
