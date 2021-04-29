package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EventoAcademico {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// EventoAcademico
public static Var Abrir() throws Exception {
 return new Callable<Var>() {

   private Var vObjetoDependencia = Var.VAR_NULL;
   private Var pAltitude = Var.VAR_NULL;
   private Var pLatitude = Var.VAR_NULL;
   private Var vIdAulaJaMinistrada = Var.VAR_NULL;
   private Var vDataHoraAtual = Var.VAR_NULL;
   private Var pLongitude = Var.VAR_NULL;
   private Var vIdDependencia = Var.VAR_NULL;
   private Var vObjetoAgenda = Var.VAR_NULL;
   private Var vDocenteLogado = Var.VAR_NULL;
   private Var objetoNovaAula = Var.VAR_NULL;
   private Var vObjetoNovaChamada = Var.VAR_NULL;

   public Var call() throws Exception {
    vIdDependencia = cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.dependencia_idGDependencia"));
    pLongitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.longitude"));
    pLatitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.latitude"));
    pAltitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.altitude"));
    vObjetoDependencia = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Dependencia"),Var.valueOf("select d, d.altitude, d.dependencia, d.descricao, d.idGDependencia, d.latitudeCanto1, d.latitudeCanto2, d.latitudeCanto3, d.latitudeCanto4, d.longitudeCanto1, d.longitudeCanto2, d.longitudeCanto3, d.longitudeCanto4, d.numAlunos, d.precisaoAltitude, d.precisaoLatLong, d.tipoDependencia, d.unidadeFisica, d.unidadeFisica.idUnidFisica, d.unidadeFisica.nomeAbrev, d.unidadeFisica.nomeCompl from Dependencia d where d.idGDependencia = :idGDependencia"),Var.valueOf("idGDependencia",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.dependencia_idGDependencia"))));
    if (Var.valueOf(vObjetoDependencia.equals(Var.VAR_NULL)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Dependência não encontrada."));
    }
    vObjetoAgenda = cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.Agenda"),Var.valueOf("idAgenda",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.idAgenda"))));
    if (Var.valueOf(vObjetoAgenda.equals(Var.VAR_NULL)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Agenda não encontrada."));
    }
    vDocenteLogado = blockly.Acesso.ObterProfessorLogado();
    if (Var.valueOf(vDocenteLogado.equals(Var.VAR_NULL)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Docente não logado."));
    }
    vIdAulaJaMinistrada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.AulaMinistrada"),Var.valueOf("select a.idGAulaMinistrada from AulaMinistrada a where a.agenda.idAgenda = :agendaIdAgenda"),Var.valueOf("agendaIdAgenda",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.idAgenda"))));
    if (cronapi.logic.Operations.isNullOrEmpty(vIdAulaJaMinistrada).negate().getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Evento já foi aberto anteriormente."));
    } else {
        try {
             vDataHoraAtual = cronapi.dateTime.Operations.getNow();
            objetoNovaAula = cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.AulaMinistrada"),Var.valueOf("agenda",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.idAgenda"))),Var.valueOf("dataAula",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.data"))),Var.valueOf("dataHoraAbertura",vDataHoraAtual),Var.valueOf("dependencia",vIdDependencia),Var.valueOf("docente",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.docente_idNumFunc"))),Var.valueOf("docente2",vDocenteLogado),Var.valueOf("latitudeAbertura",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.latitude"))),Var.valueOf("longitudeAbertura",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.longitude"))),Var.valueOf("observacoes",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.observacoes"))),Var.valueOf("altitudeAbertura",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.altitude"))));
            cronapi.database.Operations.insert(Var.valueOf("saaa.entity.AulaMinistrada"),objetoNovaAula);
            vObjetoNovaChamada = cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("aulaMinistrada",cronapi.object.Operations.getObjectField(objetoNovaAula, Var.valueOf("idGAulaMinistrada"))),Var.valueOf("chamadaAutomatica",Var.valueOf("S")),Var.valueOf("dataHoraInicio",vDataHoraAtual),Var.valueOf("docente2",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.docente_idNumFunc"))),Var.valueOf("docente",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.docente_idNumFunc"))));
            cronapi.database.Operations.insert(Var.valueOf("saaa.entity.Chamada"),vObjetoNovaChamada);
            blockly.EventoAcademico.CriarPresencasAluno(cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.idAgenda")), cronapi.object.Operations.getObjectField(vObjetoNovaChamada, Var.valueOf("idGChamada")));
            vObjetoAgenda = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Agenda"),Var.valueOf("select a from Agenda a where a.idAgenda = :idAgenda"),Var.valueOf("idAgenda",cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.idAgenda"))));
            cronapi.database.Operations.updateField(vObjetoAgenda, Var.valueOf("horaAbertura"), vDataHoraAtual);
            cronapi.database.Operations.update(Var.valueOf("saaa.entity.Agenda"),cronapi.database.Operations.getActiveData(vObjetoAgenda));
            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.statusEvento"), Var.valueOf("Evento aberto"));
            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.statusChamada"), Var.valueOf("Chamada Automática Ligada"));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Evento Aberto com sucesso"));
            if (cronapi.logic.Operations.isNullOrEmpty(pAltitude).negate().getObjectAsBoolean()) {
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Altitude:").toString() + pAltitude.toString()));
            }
            if (cronapi.logic.Operations.isNullOrEmpty(pLatitude).negate().getObjectAsBoolean()) {
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Latitude:").toString() + pLatitude.toString()));
            }
            if (cronapi.logic.Operations.isNullOrEmpty(pLongitude).negate().getObjectAsBoolean()) {
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Logintude:").toString() + pLongitude.toString()));
            }
            blockly.EventoAcademico.EnviarNotificacaoAlunos(cronapi.screen.Operations.getValueOfField(Var.valueOf("Agenda.active.idAgenda")));
         } catch (Exception ex1_exception) {
                  cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Não foi possível abrir o Evento."));
         }
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/home"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// EventoAcademico
public static Var Fechar() throws Exception {
 return new Callable<Var>() {

   private Var pAltitude = Var.VAR_NULL;
   private Var pLatitude = Var.VAR_NULL;
   private Var vDataHoraAtual = Var.VAR_NULL;
   private Var pLongitude = Var.VAR_NULL;
   private Var vObjAulaMinistrada = Var.VAR_NULL;
   private Var vObjChamada = Var.VAR_NULL;

   public Var call() throws Exception {
    pLongitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.LongitudeEncerramento"));
    pLatitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.LatitudeEncerramento"));
    pAltitude = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.AltitudeEncerramento"));
    vObjAulaMinistrada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.AulaMinistrada"),Var.valueOf("select a from AulaMinistrada a where a.idGAulaMinistrada = :idGAulaMinistrada"),Var.valueOf("idGAulaMinistrada",cronapi.screen.Operations.getValueOfField(Var.valueOf("AulaMinistrada.active.idGAulaMinistrada"))));
    if (cronapi.logic.Operations.isNullOrEmpty(vObjAulaMinistrada).negate().getObjectAsBoolean()) {
        try {
             vDataHoraAtual = cronapi.dateTime.Operations.getNow();
            cronapi.database.Operations.updateField(vObjAulaMinistrada, Var.valueOf("dataHoraEncerramento"), vDataHoraAtual);
            cronapi.database.Operations.updateField(vObjAulaMinistrada, Var.valueOf("latitudeEncerramento"), pLatitude);
            cronapi.database.Operations.updateField(vObjAulaMinistrada, Var.valueOf("longitudeEncerramento"), pLongitude);
            cronapi.database.Operations.updateField(vObjAulaMinistrada, Var.valueOf("altitudeEncerramento"), pAltitude);
            cronapi.database.Operations.update(Var.valueOf("saaa.entity.AulaMinistrada"),cronapi.database.Operations.getActiveData(vObjAulaMinistrada));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Evento Fechado com sucesso"));
            if (cronapi.logic.Operations.isNullOrEmpty(pAltitude).negate().getObjectAsBoolean()) {
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Altitude:").toString() + pAltitude.toString()));
            }
            if (cronapi.logic.Operations.isNullOrEmpty(pLatitude).negate().getObjectAsBoolean()) {
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Latitude:").toString() + pLatitude.toString()));
            }
            if (cronapi.logic.Operations.isNullOrEmpty(pLongitude).negate().getObjectAsBoolean()) {
                cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf(Var.valueOf("Logintude:").toString() + pLongitude.toString()));
            }
            vObjChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c from Chamada c where c.aulaMinistrada.idGAulaMinistrada = :aulaMinistradaIdGAulaMinistrada"),Var.valueOf("aulaMinistradaIdGAulaMinistrada",cronapi.screen.Operations.getValueOfField(Var.valueOf("AulaMinistrada.active.idGAulaMinistrada"))));
            if (cronapi.logic.Operations.isNullOrEmpty(vObjChamada).negate().getObjectAsBoolean()) {
                cronapi.database.Operations.updateField(vObjChamada, Var.valueOf("dataHoraFim"), vDataHoraAtual);
                cronapi.database.Operations.update(Var.valueOf("saaa.entity.Chamada"),cronapi.database.Operations.getActiveData(vObjChamada));
                blockly.EventoAcademico.CriarAvaliacoesAluno(cronapi.object.Operations.getObjectField(vObjChamada, Var.valueOf("idGChamada")));
            }
         } catch (Exception ex1_exception) {
                  cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Não foi possível fechar o Evento."));
         }
    } else {
      {}
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/home"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param pIdChamada
 */
// Descreva esta função...
public static void CriarAvaliacoesAluno(Var pIdChamada) throws Exception {
  new Callable<Var>() {

   private Var vDataHoraAtual = Var.VAR_NULL;
   private Var vQueryPresencasAluno = Var.VAR_NULL;

   public Var call() throws Exception {
    if (cronapi.logic.Operations.isNullOrEmpty(pIdChamada).negate().getObjectAsBoolean()) {
        vDataHoraAtual = cronapi.dateTime.Operations.getNow();
        vQueryPresencasAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p.idGPresencaAluno from PresencaAluno p where p.dataHoraInvalidacao IS NULL AND (p.dataHoraAutomatica IS NOT NULL OR p.dataHoraManual IS NOT NULL ) AND p.chamada.idGChamada = :chamadaIdGChamada"),Var.valueOf("chamadaIdGChamada",pIdChamada));
        while (cronapi.database.Operations.hasElement(vQueryPresencasAluno).getObjectAsBoolean()) {
            cronapi.database.Operations.insert(Var.valueOf("saaa.entity.AvaliacaoAula"),Var.valueOf("presencaAluno",cronapi.database.Operations.getField(vQueryPresencasAluno, Var.valueOf("this[0]"))));
            cronapi.database.Operations.next(vQueryPresencasAluno);
        } // end while
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param pIdAgenda
 * @param pIdChamada
 */
// Descreva esta função...
public static void CriarPresencasAluno(Var pIdAgenda, Var pIdChamada) throws Exception {
  new Callable<Var>() {

   private Var vObjAgendaNotificacao = Var.VAR_NULL;
   private Var vQueryMatriculasNotificacao = Var.VAR_NULL;
   private Var vDataHoraAtual = Var.VAR_NULL;

   public Var call() throws Exception {
    if (cronapi.logic.Operations.isNullOrEmpty(pIdAgenda).negate().getObjectAsBoolean()) {
        vObjAgendaNotificacao = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Agenda"),Var.valueOf("select a.idAgenda, a.turma, a.turma.idGTurma, a.docente.idNumFunc from Agenda a where a.idAgenda = :idAgenda"),Var.valueOf("idAgenda",pIdAgenda));
        vDataHoraAtual = cronapi.dateTime.Operations.getNow();
        if (cronapi.logic.Operations.isNullOrEmpty(vObjAgendaNotificacao).negate().getObjectAsBoolean()) {
            vQueryMatriculasNotificacao = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Matricula"),Var.valueOf("select m from Matricula m where m.turma.idGTurma = :turmaIdGTurma"),Var.valueOf("turmaIdGTurma",cronapi.database.Operations.getField(vObjAgendaNotificacao, Var.valueOf("this[2]"))));
            while (cronapi.database.Operations.hasElement(vQueryMatriculasNotificacao).getObjectAsBoolean()) {
                cronapi.database.Operations.insert(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("chamada",pIdChamada),Var.valueOf("dataHoraRegistro",vDataHoraAtual),Var.valueOf("matricula",cronapi.database.Operations.getField(vQueryMatriculasNotificacao, Var.valueOf("this[0].idGMatricula"))),Var.valueOf("docente",cronapi.database.Operations.getField(vObjAgendaNotificacao, Var.valueOf("this[3]"))),Var.valueOf("docente2",cronapi.database.Operations.getField(vObjAgendaNotificacao, Var.valueOf("this[3]"))));
                cronapi.database.Operations.next(vQueryMatriculasNotificacao);
            } // end while
        }
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param pIdAgenda
 */
// Descreva esta função...
public static void EnviarNotificacaoAlunos(Var pIdAgenda) throws Exception {
  new Callable<Var>() {

   private Var vObjAgendaNotificacao = Var.VAR_NULL;
   private Var vQueryMatriculasNotificacao = Var.VAR_NULL;
   private Var vQueryUsuarioAluno = Var.VAR_NULL;

   public Var call() throws Exception {
    if (cronapi.logic.Operations.isNullOrEmpty(pIdAgenda).negate().getObjectAsBoolean()) {
        vObjAgendaNotificacao = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Agenda"),Var.valueOf("select a.idAgenda, a.turma, a.turma.idGTurma from Agenda a where a.idAgenda = :idAgenda"),Var.valueOf("idAgenda",pIdAgenda));
        if (cronapi.logic.Operations.isNullOrEmpty(vObjAgendaNotificacao).negate().getObjectAsBoolean()) {
            vQueryMatriculasNotificacao = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Matricula"),Var.valueOf("select m from Matricula m where m.turma.idGTurma = :turmaIdGTurma"),Var.valueOf("turmaIdGTurma",cronapi.database.Operations.getField(vObjAgendaNotificacao, Var.valueOf("this[2]"))));
            while (cronapi.database.Operations.hasElement(vQueryMatriculasNotificacao).getObjectAsBoolean()) {
                if (Var.valueOf(cronapi.database.Operations.getField(vQueryMatriculasNotificacao, Var.valueOf("this[0].aluno.chamadaAutomatica")).equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
                    vQueryUsuarioAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.UsuarioSistema"),Var.valueOf("select u from UsuarioSistema u where u.aluno.idAluno = :alunoIdAluno"),Var.valueOf("alunoIdAluno",cronapi.database.Operations.getField(vQueryMatriculasNotificacao, Var.valueOf("this[0].aluno.idAluno"))));
                    if (Var.valueOf(cronapi.logic.Operations.isNullOrEmpty(vQueryUsuarioAluno).negate().getObjectAsBoolean() && cronapi.logic.Operations.isNullOrEmpty(cronapi.database.Operations.getField(vQueryUsuarioAluno, Var.valueOf("this[0].tokenFirebase"))).negate().getObjectAsBoolean()).getObjectAsBoolean()) {
                        blockly.EnviarNotificacao.Enviar(cronapi.database.Operations.getField(vQueryUsuarioAluno, Var.valueOf("this[0].tokenFirebase")), Var.valueOf(Var.valueOf("Aula \'").toString() + cronapi.database.Operations.getField(vQueryMatriculasNotificacao, Var.valueOf("this[0].turma.disciplina.nome")).toString() + Var.valueOf("\' Aberta").toString()), Var.valueOf("Para que a chamada automática seja realizada, seu GPS deve está ativado"));
                    }
                }
                cronapi.database.Operations.next(vQueryMatriculasNotificacao);
            } // end while
        }
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterDataAtual() throws Exception {
 return new Callable<Var>() {

   private Var vObjetoDependencia = Var.VAR_NULL;
   private Var pIdDependencia = Var.VAR_NULL;
   private Var vRetornoValidaLocalizacao = Var.VAR_NULL;
   private Var pAltitude = Var.VAR_NULL;
   private Var pLatitude = Var.VAR_NULL;
   private Var vRetornoValidaLocalizacaoExata = Var.VAR_NULL;
   private Var vCoordenadaAceitavelSuperior = Var.VAR_NULL;
   private Var pValorCoordenada = Var.VAR_NULL;
   private Var pPrecisaoCoordenada = Var.VAR_NULL;
   private Var vCoordenadaAceitavelInferior = Var.VAR_NULL;
   private Var pCoordenadaDependencia = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.dateTime.Operations.getNowNoHour();
   }
 }.call();
}

/**
 *
 * @param pCoordenadaDependencia
 * @param pPrecisaoCoordenada
 * @param pValorCoordenada
 * @return Var
 */
// Descreva esta função...
public static Var ValidarLocalizacaoExata(Var pCoordenadaDependencia, Var pPrecisaoCoordenada, Var pValorCoordenada) throws Exception {
 return new Callable<Var>() {

   private Var vRetornoValidaLocalizacaoExata = Var.VAR_NULL;
   private Var vCoordenadaAceitavelSuperior = Var.VAR_NULL;
   private Var vCoordenadaAceitavelInferior = Var.VAR_NULL;

   public Var call() throws Exception {
    vRetornoValidaLocalizacaoExata = Var.VAR_TRUE;
    vCoordenadaAceitavelSuperior = cronapi.math.Operations.sum(pValorCoordenada,pPrecisaoCoordenada);
    vCoordenadaAceitavelInferior = cronapi.math.Operations.subtract(pValorCoordenada,pPrecisaoCoordenada);
    if (Var.valueOf(Var.valueOf(pCoordenadaDependencia.compareTo(vCoordenadaAceitavelInferior) < 0).getObjectAsBoolean() || Var.valueOf(pCoordenadaDependencia.compareTo(vCoordenadaAceitavelSuperior) > 0).getObjectAsBoolean()).getObjectAsBoolean()) {
        vRetornoValidaLocalizacaoExata = Var.VAR_FALSE;
    }
    return vRetornoValidaLocalizacaoExata;
   }
 }.call();
}

/**
 *
 * @param pIdDependencia
 * @param pAltitude
 * @param pLongitude
 * @param pLatitude
 * @return Var
 */
// Descreva esta função...
public static Var ValidarLocalizacaoGeral(Var pIdDependencia, Var pAltitude, Var pLongitude, Var pLatitude) throws Exception {
 return new Callable<Var>() {

   private Var vObjetoDependencia = Var.VAR_NULL;
   private Var vRetornoValidaLocalizacao = Var.VAR_NULL;

   public Var call() throws Exception {
    if (Var.valueOf(vObjetoDependencia.equals(Var.VAR_NULL)).getObjectAsBoolean()) {
        vObjetoDependencia = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Dependencia"),Var.valueOf("select d, d.altitude, d.dependencia, d.descricao, d.idGDependencia, d.latitudeCanto1, d.latitudeCanto2, d.latitudeCanto3, d.latitudeCanto4, d.longitudeCanto1, d.longitudeCanto2, d.longitudeCanto3, d.longitudeCanto4, d.numAlunos, d.precisaoAltitude, d.precisaoLatLong, d.tipoDependencia, d.unidadeFisica, d.unidadeFisica.idUnidFisica, d.unidadeFisica.nomeAbrev, d.unidadeFisica.nomeCompl from Dependencia d where d.idGDependencia = :idGDependencia"),Var.valueOf("idGDependencia",pIdDependencia));
        if (Var.valueOf(vObjetoDependencia.equals(Var.VAR_NULL)).getObjectAsBoolean()) {
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Dependência não encontrada."));
        }
    }
    vRetornoValidaLocalizacao = Var.VAR_TRUE;
    vRetornoValidaLocalizacao = Var.valueOf(ValidarLocalizacaoExata(cronapi.object.Operations.getObjectField(vObjetoDependencia, Var.valueOf("altitude")), cronapi.object.Operations.getObjectField(vObjetoDependencia, Var.valueOf("precisaoAltitude")), pAltitude));
    if (Var.valueOf(vRetornoValidaLocalizacao.equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
        vRetornoValidaLocalizacao = Var.valueOf(ValidarLocalizacaoExata(cronapi.object.Operations.getObjectField(vObjetoDependencia, Var.valueOf("latitudeCanto1")), cronapi.object.Operations.getObjectField(vObjetoDependencia, Var.valueOf("precisaoLatLong")), pLatitude));
        if (Var.valueOf(vRetornoValidaLocalizacao.equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
            vRetornoValidaLocalizacao = Var.valueOf(ValidarLocalizacaoExata(cronapi.object.Operations.getObjectField(vObjetoDependencia, Var.valueOf("latitudeCanto2")), cronapi.object.Operations.getObjectField(vObjetoDependencia, Var.valueOf("precisaoLatLong")), pLatitude));
            if (Var.valueOf(vRetornoValidaLocalizacao.equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
                vRetornoValidaLocalizacao = Var.valueOf(ValidarLocalizacaoExata(Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL));
            }
        }
    }
    return vRetornoValidaLocalizacao;
   }
 }.call();
}

/**
 *
 * @param pIdAgenda
 * @return Var
 */
// Descreva esta função...
public static Var VerificarAulaAberta(Var pIdAgenda) throws Exception {
 return new Callable<Var>() {

   private Var vIdAulaJaMinistrada = Var.VAR_NULL;

   public Var call() throws Exception {
    vIdAulaJaMinistrada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.AulaMinistrada"),Var.valueOf("select a.idGAulaMinistrada from AulaMinistrada a where a.agenda.idAgenda = :agendaIdAgenda"),Var.valueOf("agendaIdAgenda",pIdAgenda));
    return cronapi.logic.Operations.isNullOrEmpty(vIdAulaJaMinistrada);
   }
 }.call();
}

}

