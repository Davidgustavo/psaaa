window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AvaliacaoAula = window.blockly.js.blockly.AvaliacaoAula || {};

/**
 * AvaliacaoAula
 */
window.blockly.js.blockly.AvaliacaoAula.HabilitarDesabilitarNaoAproveitamento = function() {

  if (this.cronapi.screen.getValueOfField("vars.combo_aproveitamento") == '0') {
    this.cronapi.screen.showComponent("crn-container-CausaNaoAproveitamento");
  } else if (this.cronapi.screen.getValueOfField("vars.combo_aproveitamento") == '1') {
    this.cronapi.screen.hideComponent("crn-container-CausaNaoAproveitamento");
  }
}
