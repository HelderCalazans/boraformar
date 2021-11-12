package blockly.Professor;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.lang.Math;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GeradorDeSimulados {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// GeradorDeSimulados
public static Var gerarSimuladoAleatorio(@ParamMetaData(description = "assunto1") Var assunto1, @ParamMetaData(description = "assunto2") Var assunto2, @ParamMetaData(description = "assunto3") Var assunto3, @ParamMetaData(description = "qntd1") Var qntd1, @ParamMetaData(description = "qntd2") Var qntd2, @ParamMetaData(description = "qntd3") Var qntd3) throws Exception {
 return new Callable<Var>() {

   private Var listaIdsQuestoes = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var listaAssunto1 = Var.VAR_NULL;
   private Var tamanholista = Var.VAR_NULL;
   private Var numerorandomico = Var.VAR_NULL;
   private Var idQuestao = Var.VAR_NULL;
   private Var listaAssunto2 = Var.VAR_NULL;
   private Var listaAssunto3 = Var.VAR_NULL;

   public Var call() throws Exception {

    listaIdsQuestoes =
    cronapi.list.Operations.newList();

    if (
    Var.valueOf((
    cronapi.math.Operations.sum(qntd1,qntd2,qntd3)).compareTo(
    Var.valueOf(10)) > 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Você só pode gerar um simulado com até 10 questões"));
    } else if (
    Var.valueOf((
    cronapi.math.Operations.sum(qntd1,qntd2,qntd3)).compareTo(
    Var.valueOf(0)) <= 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Seu simulado precisa ter ao menos 1 questão"));
    } else {

        if (
        Var.valueOf(qntd1.compareTo(
        Var.valueOf(0)) <= 0).getObjectAsBoolean()) {

            System.out.println(
            Var.valueOf("qntd1 = 0").getObjectAsString());
        } else {

            System.out.println(
            Var.valueOf("=================== PRIMEIRO =====================").getObjectAsString());

            contador =
            Var.valueOf(1);

            listaAssunto1 =
            cronapi.database.Operations.query(Var.valueOf("app.entity.Questao"),Var.valueOf("select q.id from Questao q where q.assuntoDisciplina.id = :assuntoDisciplinaId"),Var.valueOf("assuntoDisciplinaId",assunto1));

            tamanholista =
            cronapi.list.Operations.size(listaAssunto1);

            System.out.println(tamanholista.getObjectAsString());

            while (
            Var.valueOf(contador.compareTo(qntd1) <= 0).getObjectAsBoolean()) {

                numerorandomico =
                cronapi.math.Operations.randomInt(
                Var.valueOf(1), tamanholista);

                idQuestao =
                cronapi.list.Operations.get(listaAssunto1, (
                cronapi.math.Operations.sum(numerorandomico,
                Var.valueOf(1))));

                cronapi.list.Operations.addLast(listaIdsQuestoes,idQuestao);

                contador =
                cronapi.math.Operations.sum(contador,
                Var.valueOf(1));
            } // end while
        }

        if (
        Var.valueOf(qntd2.compareTo(
        Var.valueOf(0)) <= 0).getObjectAsBoolean()) {

            System.out.println(
            Var.valueOf("qntd2 = 0").getObjectAsString());
        } else {

            System.out.println(
            Var.valueOf("=================== SEGUNDO =====================").getObjectAsString());

            contador =
            Var.valueOf(1);

            listaAssunto2 =
            cronapi.database.Operations.query(Var.valueOf("app.entity.Questao"),Var.valueOf("select q.id from Questao q where q.assuntoDisciplina.id = :assuntoDisciplinaId"),Var.valueOf("assuntoDisciplinaId",assunto2));

            tamanholista =
            cronapi.list.Operations.size(listaAssunto2);

            System.out.println(tamanholista.getObjectAsString());

            while (
            Var.valueOf(contador.compareTo(qntd2) <= 0).getObjectAsBoolean()) {

                numerorandomico =
                cronapi.math.Operations.randomInt(
                Var.valueOf(1), tamanholista);

                idQuestao =
                cronapi.list.Operations.get(listaAssunto2, (
                cronapi.math.Operations.sum(numerorandomico,
                Var.valueOf(1))));

                cronapi.list.Operations.addLast(listaIdsQuestoes,idQuestao);

                contador =
                cronapi.math.Operations.sum(contador,
                Var.valueOf(1));
            } // end while
        }

        if (
        Var.valueOf(qntd3.compareTo(
        Var.valueOf(0)) <= 0).getObjectAsBoolean()) {

            System.out.println(
            Var.valueOf("qntd3 = 0").getObjectAsString());
        } else {

            System.out.println(
            Var.valueOf("=================== TERCEIRO =====================").getObjectAsString());

            contador =
            Var.valueOf(1);

            listaAssunto3 =
            cronapi.database.Operations.query(Var.valueOf("app.entity.Questao"),Var.valueOf("select q.id from Questao q where q.assuntoDisciplina.id = :assuntoDisciplinaId"),Var.valueOf("assuntoDisciplinaId",assunto3));

            tamanholista =
            cronapi.list.Operations.size(listaAssunto3);

            System.out.println(tamanholista.getObjectAsString());

            while (
            Var.valueOf(contador.compareTo(qntd3) <= 0).getObjectAsBoolean()) {

                numerorandomico =
                cronapi.math.Operations.randomInt(
                Var.valueOf(1), tamanholista);

                idQuestao =
                cronapi.list.Operations.get(listaAssunto3, (
                cronapi.math.Operations.sum(numerorandomico,
                Var.valueOf(1))));

                cronapi.list.Operations.addLast(listaIdsQuestoes,idQuestao);

                contador =
                cronapi.math.Operations.sum(contador,
                Var.valueOf(1));
            } // end while
        }

        System.out.println(
        Var.valueOf("=================================================================").getObjectAsString());

        System.out.println(listaIdsQuestoes.getObjectAsString());

        System.out.println(
        cronapi.list.Operations.size(listaIdsQuestoes).getObjectAsString());

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Simulado gerado com sucesso"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

