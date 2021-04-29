window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Acesso = window.blockly.js.blockly.Acesso || {};

/**
 * Acesso
 */
window.blockly.js.blockly.Acesso.ObterUsuarioLogado = function() {
 var item, vUsuarioLogado;
  this.cronapi.screen.notify('success','Início');
  vUsuarioLogado = this.blockly.js.blockly.Acesso.ObterUsuarioLogado();
  this.cronapi.screen.notify('success','Fim');
  this.cronapi.screen.notify('success',vUsuarioLogado);
}
