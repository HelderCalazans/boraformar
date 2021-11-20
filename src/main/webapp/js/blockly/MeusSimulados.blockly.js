window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.MeusSimulados = window.blockly.js.blockly.MeusSimulados || {};

/**
 * MeusSimulados
 */
window.blockly.js.blockly.MeusSimulados.responderSimuladosArgs = [];
window.blockly.js.blockly.MeusSimulados.responderSimulados = async function() {

  this.cronapi.screen.changeView("#/home/logged/respondesimulado",[ { simuladoId : this.cronapi.screen.getValueOfField("MeusSimulados.active.id") } ]);
}
