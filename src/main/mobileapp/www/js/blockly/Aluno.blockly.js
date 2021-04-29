window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Aluno = window.blockly.js.blockly.Aluno || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Aluno.VerificarChamadaAutomatica = function() {
 var item, altitude, cantoGPS, latitude, longitude;
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("Aluno.active.chamadaAutomatica"))) {
    this.cronapi.screen.changeValueOfField("Aluno.active.chamadaAutomatica", false);
  }
  this.cronapi.screen.notify('success',this.cronapi.screen.getValueOfField("Aluno.active.chamadaAutomatica"));
}

/**
 * Aluno
 */
window.blockly.js.blockly.Aluno.ObterCoordenadas = function() {
 var item, altitude, cantoGPS, latitude, longitude;
  this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
      cantoGPS = sender_cantoGPS;
    latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude')) + String('');
    longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude')) + String('');
    altitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.altitude')) + String('');
    if (altitude == 'null') {
      altitude = 0;
    }
    this.cronapi.util.callServerBlocklyNoReturn('blockly.AulaAluno:RealizarChamadaAutomatica', altitude, latitude, longitude);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}
