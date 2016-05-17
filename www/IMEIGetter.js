var imeiGetter = {
  get: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, 'IMEIGetter', 'get', []);
  }
}

if (!window.plugins) { window.plugins = {}; }

window.plugins.imeiGetter = imeiGetter;
return window.plugins.imeiGetter;
