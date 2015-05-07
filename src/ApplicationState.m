#import "ApplicationState.h"
#import <Cordova/CDV.h>

@implementation ApplicationState

- (void)getState:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* applicationState = @"";

    UIApplicationState state = [UIApplication sharedApplication].applicationState;
    switch (state) {
        case UIApplicationStateActive:
            //NSLog(@"***** STATE ***** ACTIVE");
            applicationState = @"active";
            break;
        case UIApplicationStateBackground:
            //NSLog(@"***** STATE ***** BACKGROUND");
            applicationState = @"background";
            break;
        case UIApplicationStateInactive:
            //NSLog(@"***** STATE ***** INACTIVE");
            applicationState = @"inactive";
            break;
    }

    if (applicationState != nil && [applicationState length] > 0) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:applicationState];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
