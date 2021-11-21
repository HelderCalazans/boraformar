window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.RespondeSimulado = window.blockly.js.blockly.RespondeSimulado || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.RespondeSimulado.modalVoltarParaSimuladosArgs = [];
window.blockly.js.blockly.RespondeSimulado.modalVoltarParaSimulados = async function() {
 var contador, listaT, j, item;
  this.cronapi.screen.changeView("#/home/logged/meussimulados",[  ]);
}

/**
 * RespondeSimulado
 */
window.blockly.js.blockly.RespondeSimulado.obterIdProvaArgs = [];
window.blockly.js.blockly.RespondeSimulado.obterIdProva = async function() {
 var contador, listaT, j, item;
  return this.cronapi.screen.getParam('simuladoId');
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.RespondeSimulado.verificaQuestoesArgs = [];
window.blockly.js.blockly.RespondeSimulado.verificaQuestoes = async function() {
 var contador, listaT, j, item;
  contador = 0;
  listaT = [this.cronapi.screen.getValueOfField("vars.q1r1"), this.cronapi.screen.getValueOfField("vars.q1r2"), this.cronapi.screen.getValueOfField("vars.q1r3"), this.cronapi.screen.getValueOfField("vars.q1r4"), this.cronapi.screen.getValueOfField("vars.q2r1"), this.cronapi.screen.getValueOfField("vars.q2r2"), this.cronapi.screen.getValueOfField("vars.q2r3"), this.cronapi.screen.getValueOfField("vars.q2r4"), this.cronapi.screen.getValueOfField("vars.q3r1"), this.cronapi.screen.getValueOfField("vars.q3r2"), this.cronapi.screen.getValueOfField("vars.q3r3"), this.cronapi.screen.getValueOfField("vars.q3r4"), this.cronapi.screen.getValueOfField("vars.q4r1"), this.cronapi.screen.getValueOfField("vars.q4r2"), this.cronapi.screen.getValueOfField("vars.q4r3"), this.cronapi.screen.getValueOfField("vars.q4r4"), this.cronapi.screen.getValueOfField("vars.q5r1"), this.cronapi.screen.getValueOfField("vars.q5r2"), this.cronapi.screen.getValueOfField("vars.q5r3"), this.cronapi.screen.getValueOfField("vars.q5r4"), this.cronapi.screen.getValueOfField("vars.q6r1"), this.cronapi.screen.getValueOfField("vars.q6r2"), this.cronapi.screen.getValueOfField("vars.q6r3"), this.cronapi.screen.getValueOfField("vars.q6r4"), this.cronapi.screen.getValueOfField("vars.q7r1"), this.cronapi.screen.getValueOfField("vars.q7r2"), this.cronapi.screen.getValueOfField("vars.q7r3"), this.cronapi.screen.getValueOfField("vars.q7r4"), this.cronapi.screen.getValueOfField("vars.q8r1"), this.cronapi.screen.getValueOfField("vars.q8r2"), this.cronapi.screen.getValueOfField("vars.q8r3"), this.cronapi.screen.getValueOfField("vars.q8r4"), this.cronapi.screen.getValueOfField("vars.q9r1"), this.cronapi.screen.getValueOfField("vars.q9r2"), this.cronapi.screen.getValueOfField("vars.q9r3"), this.cronapi.screen.getValueOfField("vars.q9r4"), this.cronapi.screen.getValueOfField("vars.q10r1"), this.cronapi.screen.getValueOfField("vars.q10r2"), this.cronapi.screen.getValueOfField("vars.q10r3"), this.cronapi.screen.getValueOfField("vars.q10r4")];
  for (var j_index in listaT) {
    j = listaT[j_index];
    if (j == 'true') {
      contador = (contador + 1);
    }
  }
  if (contador > 10) {
    this.cronapi.notification.customNotify('error', 'Escolha apenas uma resposta em cada questão', 'fade', 'top', 'center', 'true');
  } else if (contador < 10) {
    this.cronapi.notification.customNotify('error', 'Selecione ao menos uma resposta para cada questão', 'fade', 'top', 'center', 'true');
  } else {
    if (this.cronapi.screen.getValueOfField("vars.q1r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp1", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest1_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q1r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp1", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest1_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q1r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp1", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest1_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp1", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest1_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q2r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp2", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest2_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q2r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp2", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest2_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q2r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp2", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest2_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp2", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest2_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q3r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp3", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest3_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q3r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp3", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest3_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q3r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp3", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest3_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp3", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest3_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q4r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp4", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest4_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q4r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp4", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest4_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q4r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp4", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest4_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp4", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest4_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q5r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp5", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest5_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q5r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp5", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest5_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q5r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp5", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest5_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp5", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest5_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q6r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp6", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest6_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q6r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp6", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest6_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q6r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp6", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest6_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp6", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest6_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q7r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp7", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest7_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q7r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp7", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest7_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q7r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp7", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest7_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp7", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest7_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q8r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp8", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest8_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q8r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp8", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest8_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q8r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp8", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest8_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp8", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest8_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q9r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp9", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest9_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q9r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp9", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest9_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q9r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp9", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest9_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp9", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest9_resposta4"));
    }
    if (this.cronapi.screen.getValueOfField("vars.q10r1") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp10", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest10_resposta1"));
    } else if (this.cronapi.screen.getValueOfField("vars.q10r2") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp10", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest10_resposta2"));
    } else if (this.cronapi.screen.getValueOfField("vars.q10r3") == 'true') {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp10", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest10_resposta3"));
    } else {
      this.cronapi.screen.changeValueOfField("SimuladosParaResponder.active.resp10", this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.quest10_resposta4"));
    }
    this.cronapi.util.callServerBlocklyAsynchronous('blockly.RespostasSimulado:verificaRespostas', async function(sender_item) {
        item = sender_item;
      console.log(item);
      console.log(this.cronapi.json.getProperty(item, 'NOTA'));
      this.cronapi.screen.changeContent("R1Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta1')), 'false');
      this.cronapi.screen.changeContent("R2Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta2')), 'false');
      this.cronapi.screen.changeContent("R3Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta3')), 'false');
      this.cronapi.screen.changeContent("R4Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta4')), 'false');
      this.cronapi.screen.changeContent("R5Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta5')), 'false');
      this.cronapi.screen.changeContent("R6Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta6')), 'false');
      this.cronapi.screen.changeContent("R7Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta7')), 'false');
      this.cronapi.screen.changeContent("R8Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta8')), 'false');
      this.cronapi.screen.changeContent("R9Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta9')), 'false');
      this.cronapi.screen.changeContent("R10Response", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'resposta10')), 'false');
      this.cronapi.screen.changeContent("NotaResponse", this.cronapi.conversion.toString(this.cronapi.json.getProperty(item, 'NOTA')), 'false');
      this.cronapi.screen.showComponent("txtR1");
      this.cronapi.screen.showComponent("R1Response");
      this.cronapi.screen.showComponent("txtR2");
      this.cronapi.screen.showComponent("R2Response");
      this.cronapi.screen.showComponent("txtR3");
      this.cronapi.screen.showComponent("R3Response");
      this.cronapi.screen.showComponent("txtR4");
      this.cronapi.screen.showComponent("R4Response");
      this.cronapi.screen.showComponent("txtR5");
      this.cronapi.screen.showComponent("R5Response");
      this.cronapi.screen.showComponent("txtR6");
      this.cronapi.screen.showComponent("R6Response");
      this.cronapi.screen.showComponent("txtR7");
      this.cronapi.screen.showComponent("R7Response");
      this.cronapi.screen.showComponent("txtR8");
      this.cronapi.screen.showComponent("R8Response");
      this.cronapi.screen.showComponent("txtR9");
      this.cronapi.screen.showComponent("R9Response");
      this.cronapi.screen.showComponent("txtR10");
      this.cronapi.screen.showComponent("R10Response");
      this.cronapi.screen.disableComponent("btnFinalizaSimulado");
      this.cronapi.screen.showComponent("crn-simple-text-550084");
      this.cronapi.screen.showComponent("NotaResponse");
    }.bind(this), this.cronapi.screen.getParam('simuladoId'), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp1"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp2"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp3"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp4"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp5"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp6"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp7"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp8"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp9"), this.cronapi.screen.getValueOfField("SimuladosParaResponder.active.resp10"));
  }
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.RespondeSimulado.carregaDadosArgs = [];
window.blockly.js.blockly.RespondeSimulado.carregaDados = async function() {
 var contador, listaT, j, item;
  this.cronapi.screen.load("SimuladosParaResponder");
}
