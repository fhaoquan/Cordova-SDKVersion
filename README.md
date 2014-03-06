Cordova-SDKVersion
==================

Cordova Plugin for getting the version of the Android SDK

If you find this plugin useful, feel free to upvote the question so that more people will find it.


## Adding the Plugin to your project ##

$ cordova plugin add https://github.com/jzarnikov/Cordova-SDKVersion.git

## Using the plugin ##

The plugin creates the object `window.plugins.androidSDKVersion`.  To use, call one of the following, available methods:

	window.plugins.androidSDKVersion.getCodename(
		function(version_codename) {
			console.log(version_codename);
		},
		function(errorMessage) {
			console.log(errorMessage);
		}
	);

	window.plugins.androidSDKVersion.getIncremental(
		function(version_incremental) {
			console.log(version_incremental);

		},
		function(errorMessage) {
			console.log(errorMessage);
		}
	);
	
	window.plugins.androidSDKVersion.getRelease(
		function(version_release) {
			console.log(version_release);

		},
		function(errorMessage) {
			console.log(errorMessage);
		}
	);
		
	window.plugins.androidSDKVersion.getSdk(
		function(version_sdk) {
			console.log(version_sdk);

		},
		function(errorMessage) {
			console.log(errorMessage);
		}
	);
		
		
See also: http://developer.android.com/reference/android/os/Build.VERSION.html

## BUGS AND CONTRIBUTIONS ##

This plugin is based on by the following plugin: https://github.com/chrisekelley/Version by Chris E. Kelley.
Thanks!

## LICENSE ##

The MIT License

Copyright (c) 2013 Giuseppe Catalfamo

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
