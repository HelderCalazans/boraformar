window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Simulados = window.blockly.js.blockly.Simulados || {};
window.blockly.js.blockly.Simulados.GerarProvaAleatoria = window.blockly.js.blockly.Simulados.GerarProvaAleatoria || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Simulados.GerarProvaAleatoria.cancelarGeracaoAleatoriaArgs = [];
window.blockly.js.blockly.Simulados.GerarProvaAleatoria.cancelarGeracaoAleatoria = async function() {

  this.cronapi.screen.changeValueOfField("vars.disciplinaSimulado", '');
  this.cronapi.screen.changeValueOfField("vars.assuntoSimulado1", '');
  this.cronapi.screen.changeValueOfField("vars.assuntoSimulado2", '');
  this.cronapi.screen.changeValueOfField("vars.assuntoSimulado3", '');
  this.cronapi.screen.changeValueOfField("vars.qntdQuestoes1", '');
  this.cronapi.screen.changeValueOfField("vars.qntdQuestoes2", '');
  this.cronapi.screen.changeValueOfField("vars.qntdQuestoes3", '');
  this.cronapi.screen.hideModal("gerarProvaAleatoria");
}

/**
 * GerarProvaAleatoria
 */
window.blockly.js.blockly.Simulados.GerarProvaAleatoria.abreGeradorAleatorioArgs = [];
window.blockly.js.blockly.Simulados.GerarProvaAleatoria.abreGeradorAleatorio = async function() {

  this.cronapi.screen.showModal("gerarProvaAleatoria");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Simulados.GerarProvaAleatoria.abreAjudaArgs = [];
window.blockly.js.blockly.Simulados.GerarProvaAleatoria.abreAjuda = async function() {

  this.cronapi.screen.showModal("ajuda");
}
