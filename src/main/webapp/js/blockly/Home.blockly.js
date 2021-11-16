window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Home = window.blockly.js.blockly.Home || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Home.cancelarCriacaoPorCodigoArgs = [];
window.blockly.js.blockly.Home.cancelarCriacaoPorCodigo = async function() {

  this.cronapi.screen.changeValueOfField("vars.codNewProva", '');
  this.cronapi.screen.hideModal("gerarProvaComCodigo");
}

/**
 * Home
 */
window.blockly.js.blockly.Home.abreModalSimuladoPorCodigoArgs = [];
window.blockly.js.blockly.Home.abreModalSimuladoPorCodigo = async function() {

  this.cronapi.screen.showModal("gerarProvaComCodigo");
}
