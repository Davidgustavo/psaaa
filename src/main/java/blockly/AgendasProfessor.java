package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AgendasProfessor {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// AgendasProfessor
public static Var AgendasDisponiveis() throws Exception {
 return new Callable<Var>() {

   private Var ListaAgendas = Var.VAR_NULL;
   private Var queryAgenda = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var aulaLoop = Var.VAR_NULL;

   public Var call() throws Exception {
    ListaAgendas = cronapi.list.Operations.newList();
    queryAgenda = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Agenda"),Var.valueOf("select a from Agenda a where a.docente.idNumFunc = 447"));
    i = Var.valueOf(1);
    while (cronapi.database.Operations.hasElement(queryAgenda).getObjectAsBoolean()) {
        aulaLoop = cronapi.database.Operations.query(Var.valueOf("saaa.entity.AulaMinistrada"),Var.valueOf("select a from AulaMinistrada a where a.agenda.idAgenda = :agendaIdAgenda"),Var.valueOf("agendaIdAgenda",cronapi.database.Operations.getField(queryAgenda, Var.valueOf("this[0].idAgenda"))));
        if (cronapi.logic.Operations.isNullOrEmpty(aulaLoop).negate().getObjectAsBoolean()) {
          {}
        }
        i = cronapi.math.Operations.sum(i,Var.valueOf(1));
        cronapi.database.Operations.next(queryAgenda);
    } // end while
    return queryAgenda;
   }
 }.call();
}

}

