window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ChamadaProfessor = window.blockly.js.blockly.ChamadaProfessor || {};

/**
 * ChamadaProfessor
 */
window.blockly.js.blockly.ChamadaProfessor.AbrirModal = function(imagem, nome) {

  this.cronapi.screen.changeValueOfField('vars.nome', nome);
  this.cronapi.screen.changeValueOfField('vars.imagem', imagem);
  this.cronapi.screen.showIonicModal("modal73512");
}

/**
 * ChamadaProfessor
 */
window.blockly.js.blockly.ChamadaProfessor.FecharModal = function() {
 var nome, imagem;
  this.cronapi.screen.hideIonicModal("modal73512");
}
