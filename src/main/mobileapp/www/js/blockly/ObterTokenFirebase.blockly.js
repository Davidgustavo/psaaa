window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ObterTokenFirebase = window.blockly.js.blockly.ObterTokenFirebase || {};

/**
 * ObterTokenFirebase
 */
window.blockly.js.blockly.ObterTokenFirebase.Obter = function() {
 var item, token;
  this.cronapi.cordova.device.getFirebaseToken(function(sender_token) {
      token = sender_token;
    this.cronapi.util.callServerBlocklyNoReturn('blockly.TokenFirebase:SalvarToken', token);
  }.bind(this), function(sender_token) {
      token = sender_token;
  }.bind(this));
}
