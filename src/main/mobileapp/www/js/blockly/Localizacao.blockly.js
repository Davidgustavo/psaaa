window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Localizacao = window.blockly.js.blockly.Localizacao || {};

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoCanto2 = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    this.cronapi.screen.changeValueOfField("Dependencia.active.latitudeCanto2", latitude);
    this.cronapi.screen.changeValueOfField("Dependencia.active.longitudeCanto2", longitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterAltitude = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    altitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.altitude')) + String('');
    this.cronapi.screen.changeValueOfField("Dependencia.active.altitude", altitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoCanto1 = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    this.cronapi.screen.changeValueOfField("Dependencia.active.latitudeCanto1", latitude);
    this.cronapi.screen.changeValueOfField("Dependencia.active.longitudeCanto1", longitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoCanto4 = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    this.cronapi.screen.changeValueOfField("Dependencia.active.latitudeCanto4", latitude);
    this.cronapi.screen.changeValueOfField("Dependencia.active.longitudeCanto4", longitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoCanto3 = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    this.cronapi.screen.changeValueOfField("Dependencia.active.latitudeCanto3", latitude);
    this.cronapi.screen.changeValueOfField("Dependencia.active.longitudeCanto3", longitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Localizacao.ValidarLocalizacaoPoligono = function() {
 var item, longitude, latitude, cantoGPS, altitude;
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoAberturaEvento = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    altitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.altitude')) + String('');
    if (altitude == 'null') {
      altitude = 0;
    }
    this.cronapi.screen.changeValueOfField("vars.latitude", latitude);
    this.cronapi.screen.changeValueOfField("vars.longitude", longitude);
    this.cronapi.screen.changeValueOfField("vars.altitude", altitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoChamadaAluno = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    altitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.altitude')) + String('');
    if (altitude == 'null') {
      altitude = 0;
    }
    this.cronapi.screen.changeValueOfField("vars.latitude", latitude);
    this.cronapi.screen.changeValueOfField("vars.longitude", longitude);
    this.cronapi.screen.changeValueOfField("vars.altitude", altitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}

/**
 * Localizacao
 */
window.blockly.js.blockly.Localizacao.ObterLocalizacaoEncerramentoEvento = function() {
 var item, longitude, latitude, cantoGPS, altitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    altitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.altitude')) + String('');
    if (altitude == 'null') {
      altitude = 0;
    }
    this.cronapi.screen.changeValueOfField("vars.LatitudeEncerramento", latitude);
    this.cronapi.screen.changeValueOfField("vars.LongitudeEncerramento", longitude);
    this.cronapi.screen.changeValueOfField("vars.AltitudeEncerramento", altitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}
