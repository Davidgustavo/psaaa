package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EditarPerfilAluno {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// EditarPerfilAluno
public static Var IniciarDataSource() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.startEditingMode"), Var.valueOf("Aluno"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

