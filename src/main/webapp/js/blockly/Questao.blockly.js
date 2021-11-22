window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Questao = window.blockly.js.blockly.Questao || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Questao.limparCamposArgs = [];
window.blockly.js.blockly.Questao.limparCampos = async function() {

  this.cronapi.screen.changeValueOfField("vars.disciplinaFiltro", '');
  this.cronapi.screen.changeValueOfField("vars.opt1", 'false');
  this.cronapi.screen.changeValueOfField("vars.opt2", 'false');
  this.cronapi.screen.changeValueOfField("vars.opt3", 'false');
  this.cronapi.screen.changeValueOfField("vars.opt4", 'false');
}

/**
 * Questao
 */
window.blockly.js.blockly.Questao.verificaQuestaoCorretaArgs = [];
window.blockly.js.blockly.Questao.verificaQuestaoCorreta = async function() {

  contador = 0;
  if (this.cronapi.screen.getValueOfField("vars.opt1") == 'true') {
    contador = (contador + 1);
  }
  if (this.cronapi.screen.getValueOfField("vars.opt2") == 'true') {
    contador = (contador + 1);
  }
  if (this.cronapi.screen.getValueOfField("vars.opt3") == 'true') {
    contador = (contador + 1);
  }
  if (this.cronapi.screen.getValueOfField("vars.opt4") == 'true') {
    contador = (contador + 1);
  }
  console.log(contador);
  if (contador == 1) {
    if (this.cronapi.screen.getValueOfField("vars.opt1") == 'true') {
      this.cronapi.screen.changeValueOfField("Questao.active.respostaCorreta", this.cronapi.screen.getValueOfField("Questao.active.resposta1"));
      console.log(this.cronapi.screen.getValueOfField("Questao.active.resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.opt2") == 'true') {
      this.cronapi.screen.changeValueOfField("Questao.active.respostaCorreta", this.cronapi.screen.getValueOfField("Questao.active.resposta2"));
      console.log(this.cronapi.screen.getValueOfField("Questao.active.resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.opt3") == 'true') {
      this.cronapi.screen.changeValueOfField("Questao.active.respostaCorreta", this.cronapi.screen.getValueOfField("Questao.active.resposta3"));
      console.log(this.cronapi.screen.getValueOfField("Questao.active.resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("Questao.active.respostaCorreta", this.cronapi.screen.getValueOfField("Questao.active.resposta4"));
      console.log(this.cronapi.screen.getValueOfField("Questao.active.resposta4"));
    }
  } else if (contador < 1) {
    this.cronapi.util.throwException(this.cronapi.util.createException('Selecione 1 opção de resposta correta'));
  } else {
    this.cronapi.util.throwException(this.cronapi.util.createException('Selecione apenas 1 resposta correta'));
    await this.cronapi.screen.startEditingMode("Questao");
  }
}
