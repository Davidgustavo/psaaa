package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ChamadaManualProfessor {

public static final int TIMEOUT = 300;

/**
 *
 * @param pIdAulaMinistrada
 * @return Var
 */
// ChamadaManualProfessor
public static Var ListarAlunos(Var pIdAulaMinistrada) throws Exception {
 return new Callable<Var>() {

   private Var vQueryPresencaAluno = Var.VAR_NULL;
   private Var pIdMatricula = Var.VAR_NULL;
   private Var vPresencaAluno = Var.VAR_NULL;
   private Var pPresencaValida = Var.VAR_NULL;
   private Var pPresenca = Var.VAR_NULL;
   private Var vQueryChamada = Var.VAR_NULL;
   private Var pIdPresenca = Var.VAR_NULL;
   private Var pPresente = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p from PresencaAluno p where p.chamada.aulaMinistrada.idGAulaMinistrada = :chamadaAulaMinistradaIdGAulaMinistrada"),Var.valueOf("chamadaAulaMinistradaIdGAulaMinistrada",pIdAulaMinistrada));
   }
 }.call();
}

/**
 *
 * @param pIdPresenca
 * @param pPresente
 */
// Descreva esta função...
public static void EfetuarChamada(Var pIdPresenca, Var pPresente) throws Exception {
  new Callable<Var>() {

   private Var vQueryPresencaAluno = Var.VAR_NULL;
   private Var vPresencaAluno = Var.VAR_NULL;

   public Var call() throws Exception {
    vQueryPresencaAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p from PresencaAluno p where p.idGPresencaAluno = :idGPresencaAluno"),Var.valueOf("idGPresencaAluno",pIdPresenca));
    if (cronapi.database.Operations.hasElement(vQueryPresencaAluno).getObjectAsBoolean()) {
        vPresencaAluno = cronapi.database.Operations.getActiveData(vQueryPresencaAluno);
        if (Var.valueOf(cronapi.logic.Operations.isNull(pPresente).getObjectAsBoolean() || Var.valueOf(pPresente.equals(Var.VAR_FALSE)).getObjectAsBoolean()).getObjectAsBoolean()) {
            cronapi.object.Operations.setObjectField(vPresencaAluno, Var.valueOf("dataHoraInvalidacao"), cronapi.dateTime.Operations.getNow());
            cronapi.database.Operations.update(Var.valueOf("saaa.entity.PresencaAluno"),vPresencaAluno);
        } else {
            if (cronapi.logic.Operations.isNullOrEmpty(cronapi.object.Operations.getObjectField(vPresencaAluno, Var.valueOf("dataHoraAutomatica"))).getObjectAsBoolean()) {
                cronapi.object.Operations.setObjectField(vPresencaAluno, Var.valueOf("dataHoraManual"), cronapi.dateTime.Operations.getNow());
                cronapi.database.Operations.update(Var.valueOf("saaa.entity.PresencaAluno"),vPresencaAluno);
            }
            cronapi.object.Operations.setObjectField(vPresencaAluno, Var.valueOf("dataHoraInvalidacao"), Var.VAR_NULL);
            cronapi.database.Operations.update(Var.valueOf("saaa.entity.PresencaAluno"),vPresencaAluno);
        }
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param pIdAulaMinistrada
 * @param pIdMatricula
 * @param pPresenca
 * @param pPresencaValida
 */
// Descreva esta função...
public static void EfetuarChamadaAntiga(Var pIdAulaMinistrada, Var pIdMatricula, Var pPresenca, Var pPresencaValida) throws Exception {
  new Callable<Var>() {

   private Var vQueryPresencaAluno = Var.VAR_NULL;
   private Var vPresencaAluno = Var.VAR_NULL;
   private Var vQueryChamada = Var.VAR_NULL;

   public Var call() throws Exception {
    vQueryPresencaAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p from PresencaAluno p where p.chamada.aulaMinistrada.idGAulaMinistrada = :chamadaAulaMinistradaIdGAulaMinistrada AND p.matricula.idGMatricula = :matriculaIdGMatricula"),Var.valueOf("chamadaAulaMinistradaIdGAulaMinistrada",pIdAulaMinistrada),Var.valueOf("matriculaIdGMatricula",pIdMatricula));
    if (cronapi.database.Operations.hasElement(vQueryPresencaAluno).getObjectAsBoolean()) {
        vPresencaAluno = cronapi.database.Operations.getActiveData(vQueryPresencaAluno);
        cronapi.object.Operations.setObjectField(vPresencaAluno, Var.valueOf("presencaValida"), pPresencaValida);
        cronapi.database.Operations.update(Var.valueOf("saaa.entity.PresencaAluno"),vPresencaAluno);
    } else if (Var.valueOf(Var.valueOf(pPresenca.equals(Var.VAR_TRUE)).getObjectAsBoolean()).getObjectAsBoolean()) {
        vQueryChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c from Chamada c where c.aulaMinistrada.idGAulaMinistrada = :aulaMinistradaIdGAulaMinistrada"),Var.valueOf("aulaMinistradaIdGAulaMinistrada",pIdAulaMinistrada));
        vPresencaAluno = cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("chamada",cronapi.database.Operations.getColumn(vQueryChamada, Var.valueOf("this[0].idGChamada"))),Var.valueOf("dataHoraRegistro",cronapi.dateTime.Operations.getNow()),Var.valueOf("docente",cronapi.database.Operations.getColumn(vQueryChamada, Var.valueOf("this[0].docente"))),Var.valueOf("docente2",cronapi.database.Operations.getColumn(vQueryChamada, Var.valueOf("this[0].docente2"))),Var.valueOf("matricula",pIdMatricula),Var.valueOf("presencaValida",pPresencaValida));
        cronapi.database.Operations.insert(Var.valueOf("saaa.entity.PresencaAluno"),vPresencaAluno);
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

