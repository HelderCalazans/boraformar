package blockly.GeradoresSimulados;

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
   private Var idQ1 = Var.VAR_NULL;
   private Var idQ2 = Var.VAR_NULL;
   private Var idQ3 = Var.VAR_NULL;
   private Var idQ4 = Var.VAR_NULL;
   private Var idQ5 = Var.VAR_NULL;
   private Var idQ6 = Var.VAR_NULL;
   private Var idQ7 = Var.VAR_NULL;
   private Var idQ8 = Var.VAR_NULL;
   private Var idQ9 = Var.VAR_NULL;
   private Var idQ10 = Var.VAR_NULL;
   private Var creator = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    listaIdsQuestoes =
    cronapi.list.Operations.newList();

    if (
    Var.valueOf((
    cronapi.math.Operations.sum(qntd1,qntd2,qntd3)).compareTo(
    Var.valueOf(10)) > 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Você só pode gerar um simulado 10 questões"));
    } else if (
    Var.valueOf((
    cronapi.math.Operations.sum(qntd1,qntd2,qntd3)).compareTo(
    Var.valueOf(10)) < 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Você só pode gerar um simulado 10 questões"));
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
        Var.valueOf("====================== LISTA DE IDS DE QUESTÕES").getObjectAsString());

        System.out.println(listaIdsQuestoes.getObjectAsString());

        idQ1 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ2 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ3 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ4 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ5 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ6 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ7 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ8 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ9 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        idQ10 =
        cronapi.list.Operations.getAndRemoveLast(listaIdsQuestoes);

        try {

            creator =
            cronapi.list.Operations.getLast((
            cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
            cronapi.util.Operations.getCurrentUserName()))));

            cronapi.database.Operations.beginTransaction(Var.valueOf("app.entity.Simulado"));

            cronapi.database.Operations.insert(Var.valueOf("app.entity.Simulado"),Var.valueOf("quest6",idQ6),Var.valueOf("quest7",idQ7),Var.valueOf("quest8",idQ8),Var.valueOf("quest9",idQ9),Var.valueOf("quest2",idQ2),Var.valueOf("quest3",idQ3),Var.valueOf("criador",creator),Var.valueOf("quest4",idQ4),Var.valueOf("quest5",idQ5),Var.valueOf("quest10",idQ10),Var.valueOf("compCod",
            cronapi.util.Operations.random(
            Var.valueOf(100000))),Var.valueOf("id",
            cronapi.util.Operations.generateUUID()),Var.valueOf("quest1",idQ1));

            cronapi.database.Operations.commitTransaction(Var.valueOf("app.entity.Simulado"));
         } catch (Exception exception_exception) {
              exception = Var.valueOf(exception_exception);

            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), exception);
         } finally {

            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
            Var.valueOf("Simulado gerado com sucesso"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
            Var.valueOf("gerarProvaAleatoria"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
            Var.valueOf("Simulado"),
            Var.valueOf("true"));
        }
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

