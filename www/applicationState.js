module.exports = {
    getState: function(successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "ApplicationState", "getState", []);
    }
};
