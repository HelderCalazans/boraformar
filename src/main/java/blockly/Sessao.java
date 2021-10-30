package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Sessao {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Sessao
public static Var maisDeUm() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.util.Operations.throwException(
    cronapi.util.Operations.createException(
    Var.valueOf("Selecione apenas 1 resposta como correta")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

