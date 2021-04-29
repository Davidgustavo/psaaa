package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// Bloco
public static Var Executar(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf(cronapi.dateTime.Operations.formatDateTime(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("data")), Var.valueOf("dd/MM/yyyy")).toString() + Var.valueOf(" - ").toString() + cronapi.dateTime.Operations.formatDateTime(cronapi.dateTime.Operations.formatDateTime(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("horaInicio")), Var.valueOf("dd/MM/yyyy HH:mm:ss"), Var.valueOf(-3)), Var.valueOf("HH:mm")).toString() + Var.valueOf(" a ").toString() + cronapi.dateTime.Operations.formatDateTime(cronapi.dateTime.Operations.formatDateTime(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("horaFim")), Var.valueOf("dd/MM/yyyy HH:mm:ss"), Var.valueOf(-3)), Var.valueOf("HH:mm")).toString());
   }
 }.call();
}

/**
 *
 * @param Entidade
 * @return Var
 */
// Bloco
public static Var GetTurmaQtdeAlunos(Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.valueOf(cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("turma")).toString() + Var.valueOf(" - ").toString() + cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("qtdeAlunos")).toString() + Var.valueOf(" Alunos").toString());
   }
 }.call();
}

}

