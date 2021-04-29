package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AulaAluno {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// AulaAluno
public static Var ListarChamadasDisponiveis() throws Exception {
 return new Callable<Var>() {

   private Var vAluno = Var.VAR_NULL;
   private Var queryMatriculasAluno = Var.VAR_NULL;
   private Var vObjChamada = Var.VAR_NULL;
   private Var vDataHoraAtual = Var.VAR_NULL;
   private Var pLatitude = Var.VAR_NULL;
   private Var pLongitude = Var.VAR_NULL;
   private Var pAltitude = Var.VAR_NULL;
   private Var vQueryPresencaExistente = Var.VAR_NULL;
   private Var vAltitude = Var.VAR_NULL;
   private Var vLatitude = Var.VAR_NULL;
   private Var vLongitude = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c from Chamada c, Matricula m where c.dataHoraFim IS NULL AND c.aulaMinistrada.agenda.turma.idGTurma = m.turma.idGTurma AND m.aluno = :aluno"),Var.valueOf("aluno",blockly.Acesso.ObterAlunoLogado()));
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void RealizarChamada() throws Exception {
  new Callable<Var>() {

   private Var vDataHoraAtual = Var.VAR_NULL;
   private Var vQueryPresencaExistente = Var.VAR_NULL;
   private Var vAltitude = Var.VAR_NULL;
   private Var vLatitude = Var.VAR_NULL;
   private Var vLongitude = Var.VAR_NULL;

   public Var call() throws Exception {
    vQueryPresencaExistente = cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p.idGPresencaAluno from PresencaAluno p where p.chamada.idGChamada = :chamadaIdGChamada AND p.matricula.idGMatricula = :matriculaIdGMatricula"),Var.valueOf("chamadaIdGChamada",cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.idGChamada"))),Var.valueOf("matriculaIdGMatricula",cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.idGMatricula"))));
    if (cronapi.logic.Operations.isNullOrEmpty(vQueryPresencaExistente).getObjectAsBoolean()) {
        vAltitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.altitude"));
        vLatitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.latitude"));
        vLongitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.longitude"));
        vDataHoraAtual = cronapi.dateTime.Operations.getNow();
        if (blockly.ValidacaoCoordenadasChamada.LocalizacaoValida(cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.idGChamada")), vLatitude, vLongitude, vAltitude).getObjectAsBoolean()) {
            cronapi.database.Operations.insert(Var.valueOf("saaa.entity.PresencaAluno"),cronapi.database.Operations.newEntity(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("chamada",cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.idGChamada"))),Var.valueOf("dataHoraRegistro",vDataHoraAtual),Var.valueOf("docente",cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.docente_idNumFunc"))),Var.valueOf("docente2",cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.docente_idNumFunc"))),Var.valueOf("latitudeRegistro",vLatitude),Var.valueOf("longitudeRegistro",vLongitude),Var.valueOf("matricula",cronapi.screen.Operations.getValueOfField(Var.valueOf("Chamada.active.idGMatricula"))),Var.valueOf("presencaValida",Var.valueOf("S")),Var.valueOf("altitudeRegistro",vAltitude)));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Chamada realizada com sucesso!"));
        } else {
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Você não está nas coordenadas da sala."));
        }
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Chamada realizada com sucesso anteriormente!"));
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/home"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param pAltitude
 * @param pLatitude
 * @param pLongitude
 */
// Descreva esta função...
public static void RealizarChamadaAutomatica(Var pAltitude, Var pLatitude, Var pLongitude) throws Exception {
  new Callable<Var>() {

   private Var vAluno = Var.VAR_NULL;
   private Var queryMatriculasAluno = Var.VAR_NULL;
   private Var vObjChamada = Var.VAR_NULL;
   private Var vDataHoraAtual = Var.VAR_NULL;

   public Var call() throws Exception {
    vAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Aluno"),Var.valueOf("select a from Aluno a where a = :a"),Var.valueOf("a",blockly.Acesso.ObterAlunoLogado()));
    if (Var.valueOf(cronapi.logic.Operations.isNullOrEmpty(vAluno).negate().getObjectAsBoolean() && Var.valueOf(cronapi.object.Operations.getObjectField(vAluno, Var.valueOf("chamadaAutomatica")).equals(Var.VAR_TRUE)).getObjectAsBoolean()).getObjectAsBoolean()) {
        queryMatriculasAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Matricula"),Var.valueOf("select m from Matricula m where m.aluno = :aluno"),Var.valueOf("aluno",blockly.Acesso.ObterAlunoLogado()));
        while (cronapi.database.Operations.hasElement(queryMatriculasAluno).getObjectAsBoolean()) {
            vObjChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c from Chamada c where c.aulaMinistrada.agenda.turma.idGTurma = :idGTurma AND c.dataHoraFim IS NULL"),Var.valueOf("idGTurma",cronapi.database.Operations.getField(queryMatriculasAluno, Var.valueOf("this[0].turma.idGTurma"))));
            if (cronapi.logic.Operations.isNullOrEmpty(vObjChamada).negate().getObjectAsBoolean()) {
                vDataHoraAtual = cronapi.dateTime.Operations.getNow();
                cronapi.database.Operations.insert(Var.valueOf("saaa.entity.PresencaAluno"),cronapi.database.Operations.newEntity(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("chamada",cronapi.object.Operations.getObjectField(vObjChamada, Var.valueOf("idGChamada"))),Var.valueOf("dataHoraRegistro",vDataHoraAtual),Var.valueOf("docente",cronapi.object.Operations.getObjectField(vObjChamada, Var.valueOf("docente"))),Var.valueOf("docente2",cronapi.object.Operations.getObjectField(vObjChamada, Var.valueOf("docente2"))),Var.valueOf("latitudeRegistro",pLatitude),Var.valueOf("longitudeRegistro",pLongitude),Var.valueOf("matricula",cronapi.database.Operations.getField(queryMatriculasAluno, Var.valueOf("this[0].turma.idGTurma"))),Var.valueOf("altitudeRegistro",pAltitude)));
            }
            cronapi.database.Operations.next(queryMatriculasAluno);
        } // end while
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

