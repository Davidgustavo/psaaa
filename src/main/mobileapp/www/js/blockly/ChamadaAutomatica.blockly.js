window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ChamadaAutomatica = window.blockly.js.blockly.ChamadaAutomatica || {};

/**
 * ChamadaAutomatica
 */
window.blockly.js.blockly.ChamadaAutomatica.Executar = function() {
 var item, altitude, longitude, latitude, cantoGPS, vChamadaAutomaticaAtivada;
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Aluno:ChamadaAutomaticaAtivada', function(sender_vChamadaAutomaticaAtivada) {
      vChamadaAutomaticaAtivada = sender_vChamadaAutomaticaAtivada;
    if (!this.cronapi.logic.isNullOrEmpty(vChamadaAutomaticaAtivada)) {
      this.cronapi.util.scheduleExecution(function() {
         try {
           this.cronapi.cordova.geolocation.getCurrentPosition(function(sender_cantoGPS) {
              cantoGPS = sender_cantoGPS;
            latitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.latitude'));
            longitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.longitude'));
            altitude = String(this.cronapi.object.getProperty(cantoGPS, 'coords.altitude'));
            if (altitude == 'null') {
              altitude = 0;
            }
            if (latitude == 'null') {
              latitude = 0;
            }
            if (longitude == 'null') {
              longitude = 0;
            }
          }.bind(this), function(sender_item) {
              item = sender_item;
          }.bind(this));
          this.cronapi.util.callServerBlocklyNoReturn('blockly.PresencaAutomatica:Marcar', latitude, longitude, altitude);
         } finally {
         }
      }.bind(this), 0, 20, 'seconds', 'false');
    }
  }.bind(this));
}
