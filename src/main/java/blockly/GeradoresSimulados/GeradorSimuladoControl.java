package blockly.GeradoresSimulados;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GeradorSimuladoControl {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// GeradorSimuladoControl
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var questoesSelecionadas = Var.VAR_NULL;
   private Var q1 = Var.VAR_NULL;
   private Var q2 = Var.VAR_NULL;
   private Var q3 = Var.VAR_NULL;
   private Var q4 = Var.VAR_NULL;
   private Var q5 = Var.VAR_NULL;
   private Var q6 = Var.VAR_NULL;
   private Var q7 = Var.VAR_NULL;
   private Var q8 = Var.VAR_NULL;
   private Var q9 = Var.VAR_NULL;
   private Var q10 = Var.VAR_NULL;
   private Var creator = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    questoesSelecionadas =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.grid7756"));

    q1 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q2 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q3 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q4 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q5 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q6 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q7 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q8 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q9 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    q10 =
    cronapi.list.Operations.getAndRemoveFirst(questoesSelecionadas);

    try {

        creator =
        cronapi.list.Operations.getLast((
        cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
        cronapi.util.Operations.getCurrentUserName()))));

        cronapi.database.Operations.beginTransaction(Var.valueOf("app.entity.Simulado"));

        cronapi.database.Operations.insert(Var.valueOf("app.entity.Simulado"),Var.valueOf("quest6",q6),Var.valueOf("quest7",q7),Var.valueOf("quest8",q8),Var.valueOf("quest9",q9),Var.valueOf("quest2",q2),Var.valueOf("quest3",q3),Var.valueOf("criador",creator),Var.valueOf("quest4",q4),Var.valueOf("quest5",q5),Var.valueOf("quest10",q10),Var.valueOf("compCod",
        cronapi.util.Operations.random(
        Var.valueOf(100000))),Var.valueOf("id",
        cronapi.util.Operations.generateUUID()),Var.valueOf("quest1",q1));

        cronapi.database.Operations.commitTransaction(Var.valueOf("app.entity.Simulado"));
     } catch (Exception exception_exception) {
          exception = Var.valueOf(exception_exception);

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), exception);
     } finally {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Simulado Criado com sucesso!"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

