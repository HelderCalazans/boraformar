package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Questao {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Questao
public static Var verificaCadastroQuestaoCorreta() throws Exception {
 return new Callable<Var>() {

   private Var contador = Var.VAR_NULL;

   public Var call() throws Exception {

    contador =
    Var.valueOf(0);

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.opt1")).equals(
    Var.valueOf("true"))).getObjectAsBoolean()) {

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    }

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.opt2")).equals(
    Var.valueOf("true"))).getObjectAsBoolean()) {

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    }

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.opt3")).equals(
    Var.valueOf("true"))).getObjectAsBoolean()) {

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    }

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.opt4")).equals(
    Var.valueOf("true"))).getObjectAsBoolean()) {

        contador =
        cronapi.math.Operations.sum(contador,
        Var.valueOf(1));
    }

    System.out.println(contador.getObjectAsString());

    if (
    Var.valueOf(contador.equals(
    Var.valueOf(1))).getObjectAsBoolean()) {

        if (
        Var.valueOf(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("vars.opt1")).equals(
        Var.valueOf("true"))).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
            Var.valueOf("Questao.active.respostaCorreta"),
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt1")));

            System.out.println(
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt1")).getObjectAsString());
        } else if (
        Var.valueOf(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("vars.opt2")).equals(
        Var.valueOf("true"))).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
            Var.valueOf("Questao.active.respostaCorreta"),
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt2")));

            System.out.println(
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt2")).getObjectAsString());
        } else if (
        Var.valueOf(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("vars.opt3")).equals(
        Var.valueOf("true"))).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
            Var.valueOf("Questao.active.respostaCorreta"),
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt3")));

            System.out.println(
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt3")).getObjectAsString());
        } else {

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
            Var.valueOf("Questao.active.respostaCorreta"),
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt4")));

            System.out.println(
            cronapi.screen.Operations.getValueOfField(
            Var.valueOf("vars.opt4")).getObjectAsString());
        }
    } else if (
    Var.valueOf(contador.compareTo(
    Var.valueOf(1)) < 0).getObjectAsBoolean()) {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("1 resposta correta precisa ser cadastrada")));
    } else {

        cronapi.util.Operations.throwException(
        cronapi.util.Operations.createException(
        Var.valueOf("Selecione apenas 1 resposta correta para ser cadastrada")));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

