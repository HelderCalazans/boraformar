package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Util {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Util
public static Var obterIdUsuarioLogado(@ParamMetaData(description = "Entidade") Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var idUsuario = Var.VAR_NULL;

   public Var call() throws Exception {

    idUsuario =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));
    return idUsuario;
   }
 }.call();
}

}

