# cordova-plugin-imeigetter  [![License](https://img.shields.io/github/license/tomloprod/cordova-plugin-imeigetter.svg)](http://www.opensource.org/licenses/mit-license.php)

**IMEIGetter** is a cordova plugin to get the IMEI number in android devices.


## Supported Platforms

- Android

## Installation

Cordova:

    cordova plugin add https://github.com/tomloprod/cordova-plugin-imeigetter.git

## Usage

This plugin exports an object with one method called "get":

```javascript
window.plugins.imeiGetter.get(function(imei){
   console.log(imei);
}, function(){
   console.error("Oh... :(");
});
```

