package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CalcularPresencaFonteDados {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CalcularPresencaFonteDados
public static Var Calcular(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var vRetorno = Var.VAR_NULL;
   private Var vDataInvalidacao = Var.VAR_NULL;
   private Var vDataAutomatica = Var.VAR_NULL;
   private Var vDataManual = Var.VAR_NULL;

   public Var call() throws Exception {
    vRetorno = Var.VAR_FALSE;
    if (cronapi.logic.Operations.isNullOrEmpty(Entidade).negate().getObjectAsBoolean()) {
        vDataInvalidacao = cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("dataHoraInvalidacao"));
        vDataAutomatica = cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("dataHoraAutomatica"));
        vDataManual = cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("dataHoraManual"));
        vRetorno = Var.valueOf(Var.valueOf(vDataInvalidacao.equals(Var.VAR_NULL)).getObjectAsBoolean() && (Var.valueOf(Var.valueOf(!vDataAutomatica.equals(Var.VAR_NULL)).getObjectAsBoolean() || Var.valueOf(!vDataManual.equals(Var.VAR_NULL)).getObjectAsBoolean())).getObjectAsBoolean());
    }
    return vRetorno;
   }
 }.call();
}

}

