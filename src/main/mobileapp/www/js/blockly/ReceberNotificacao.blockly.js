window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ReceberNotificacao = window.blockly.js.blockly.ReceberNotificacao || {};

/**
 * ReceberNotificacao
 */
window.blockly.js.blockly.ReceberNotificacao.Receber = function() {
 var item, notificacao;
  this.cronapi.cordova.device.getFirebaseNotificationData(function(sender_notificacao) {
      notificacao = sender_notificacao;
    this.cronapi.screen.notify('success',this.cronapi.object.getProperty(notificacao, 'msg'));
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
}
