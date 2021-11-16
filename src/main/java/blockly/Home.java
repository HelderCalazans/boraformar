package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Home {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Home
public static Var gerarSimuladoPorCodigo() throws Exception {
 return new Callable<Var>() {

   private Var simuladoBase = Var.VAR_NULL;
   private Var creator = Var.VAR_NULL;
   private Var e = Var.VAR_NULL;

   public Var call() throws Exception {

    simuladoBase =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Simulado"),Var.valueOf("select s from Simulado s where s.compCod = :compCod"),Var.valueOf("compCod",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.codNewProva"))));

    try {

        creator =
        cronapi.list.Operations.getFirst((
        cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
        cronapi.util.Operations.getCurrentUserName()))));

        cronapi.database.Operations.beginTransaction(Var.valueOf("app.entity.Simulado"));

        cronapi.database.Operations.insert(Var.valueOf("app.entity.Simulado"),Var.valueOf("quest6",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest6.id"))),Var.valueOf("quest7",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest7.id"))),Var.valueOf("quest8",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest8.id"))),Var.valueOf("quest9",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest9.id"))),Var.valueOf("quest2",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest2.id"))),Var.valueOf("quest3",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest3.id"))),Var.valueOf("criador",creator),Var.valueOf("quest4",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest4.id"))),Var.valueOf("quest5",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest5.id"))),Var.valueOf("quest10",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest10.id"))),Var.valueOf("compCod",
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("vars.codNewProva"))),Var.valueOf("id",
        cronapi.util.Operations.generateUUID()),Var.valueOf("quest1",
        cronapi.database.Operations.getField(simuladoBase,
        Var.valueOf("this[0].quest1.id"))));

        cronapi.database.Operations.commitTransaction(Var.valueOf("app.entity.Simulado"));
     } catch (Exception e_exception) {
          e = Var.valueOf(e_exception);

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), e);
     } finally {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Prova gerada com sucesso!"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
        Var.valueOf("gerarProvaComCodigo"));

        cronapi.util.Operations.sleep(
        Var.valueOf(1));
    }

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/logged/meussimulados"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterIdUsuarioLog() throws Exception {
 return new Callable<Var>() {

   private Var id2 = Var.VAR_NULL;

   public Var call() throws Exception {

    id2 =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));
    return id2;
   }
 }.call();
}

}

