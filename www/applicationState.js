module.exports = {
    getState: function(packageName, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "ApplicationState", "getState", [packageName]);
    }
};
