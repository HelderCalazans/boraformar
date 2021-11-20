package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RespostasSimulado {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Descreva esta função...
public static Var verificaRespostas(@ParamMetaData(description = "provaId") Var provaId, @ParamMetaData(description = "resp1") Var resp1, @ParamMetaData(description = "resp2") Var resp2, @ParamMetaData(description = "resp3") Var resp3, @ParamMetaData(description = "resp4") Var resp4, @ParamMetaData(description = "resp5") Var resp5, @ParamMetaData(description = "resp6") Var resp6, @ParamMetaData(description = "resp7") Var resp7, @ParamMetaData(description = "resp8") Var resp8, @ParamMetaData(description = "resp9") Var resp9, @ParamMetaData(description = "resp10") Var resp10) throws Exception {
 return new Callable<Var>() {

   private Var jsonResponse = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var erro = Var.VAR_NULL;

   public Var call() throws Exception {

    jsonResponse =
    cronapi.json.Operations.createObjectJson();

    contador =
    Var.valueOf(0);

    if (
    Var.valueOf((
    Var.valueOf(resp1.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest1_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta1"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta1"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp2.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest2_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta2"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta2"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp3.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest3_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta3"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta3"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp4.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest4_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta4"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta4"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp5.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest5_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta5"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta5"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp6.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest6_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta6"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta6"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp7.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest7_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta7"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta7"),
        Var.valueOf("ERROU\""));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp8.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest8_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta8"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta8"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp9.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest9_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta9"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta9"),
        Var.valueOf("ERROU!"));
    }

    if (
    Var.valueOf((
    Var.valueOf(resp10.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder.active.quest10_respostaCorreta"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta10"),
        Var.valueOf("ACERTOU!"));

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    } else {

        cronapi.json.Operations.setJsonOrMapField(jsonResponse,
        Var.valueOf("resposta10"),
        Var.valueOf("ERROU!"));
    }

    cronapi.json.Operations.setJsonOrMapField(jsonResponse,
    Var.valueOf("NOTA"), contador);

    try {

        cronapi.database.Operations.beginTransaction(Var.valueOf("app.entity.Simulado"));

        cronapi.database.Operations.execute(Var.valueOf("app.entity.Simulado"), Var.valueOf("update Simulado set acertos = :acertos where id = :id"),Var.valueOf("acertos",contador),Var.valueOf("id",provaId));

        cronapi.database.Operations.commitTransaction(Var.valueOf("app.entity.Simulado"));
     } catch (Exception erro_exception) {
          erro = Var.valueOf(erro_exception);

        System.out.println(erro.getObjectAsString());
     } finally {
     }
    return jsonResponse;
   }
 }.call();
}

}

