window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.SimuladoControlado = window.blockly.js.blockly.SimuladoControlado || {};

/**
 * SimuladoControlado
 */
window.blockly.js.blockly.SimuladoControlado.abrirAjudaArgs = [];
window.blockly.js.blockly.SimuladoControlado.abrirAjuda = async function() {

  this.cronapi.screen.showModal("ajuda");
}
