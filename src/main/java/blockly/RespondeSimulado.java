package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RespondeSimulado {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// RespondeSimulado
public static Var checarRespostas(@ParamMetaData(description = "idProva") Var idProva, @ParamMetaData(description = "resp1") Var resp1, @ParamMetaData(description = "resp2") Var resp2, @ParamMetaData(description = "resp3") Var resp3, @ParamMetaData(description = "resp4") Var resp4, @ParamMetaData(description = "resp5") Var resp5, @ParamMetaData(description = "resp6") Var resp6, @ParamMetaData(description = "resp7") Var resp7, @ParamMetaData(description = "resp8") Var resp8, @ParamMetaData(description = "resp9") Var resp9, @ParamMetaData(description = "resp10") Var resp10) throws Exception {
 return new Callable<Var>() {

   private Var nota = Var.VAR_NULL;

   public Var call() throws Exception {

    nota =
    Var.valueOf(0);

    if (
    Var.valueOf((
    Var.valueOf(resp1.equals(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("SimuladosParaResponder"))))).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        nota =
        cronapi.math.Operations.sum(nota,
        Var.valueOf(1));
    }

    System.out.println(nota.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

