package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CamposCalculados {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// CamposCalculados
public static Var DataHoraInicioFim(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf(cronapi.dateTime.Operations.formatDateTime(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("data")), Var.valueOf("dd/MM/yyyy")).toString() + Var.valueOf(" - ").toString() + cronapi.dateTime.Operations.formatDateTime(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("horaInicio")), Var.valueOf("hh:mm:ss")).toString() + Var.valueOf(" a ").toString() + cronapi.dateTime.Operations.formatDateTime(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("horaFim")), Var.valueOf("hh:mm:ss")).toString());
   }
 }.call();
}

}

