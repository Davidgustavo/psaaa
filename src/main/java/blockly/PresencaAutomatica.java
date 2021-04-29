package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class PresencaAutomatica {

public static final int TIMEOUT = 300;

/**
 *
 * @param pLatitude
 * @param pLongitude
 * @param pAltitude
 * @return Var
 */
// PresencaAutomatica
public static Var Marcar(Var pLatitude, Var pLongitude, Var pAltitude) throws Exception {
 return new Callable<Var>() {

   private Var vAlunoLogado = Var.VAR_NULL;
   private Var vListaChamadas = Var.VAR_NULL;
   private Var vChamada = Var.VAR_NULL;
   private Var vIdChamada = Var.VAR_NULL;
   private Var vIdTurma = Var.VAR_NULL;
   private Var vObjChamada = Var.VAR_NULL;
   private Var vTESTEChamada = Var.VAR_NULL;
   private Var vIdMatricula = Var.VAR_NULL;
   private Var vPresencaAluno = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;

   public Var call() throws Exception {
    vAlunoLogado = blockly.Acesso.ObterAlunoLogado();
    if (cronapi.logic.Operations.isNullOrEmpty(vAlunoLogado).negate().getObjectAsBoolean()) {
        if (Var.valueOf(cronapi.logic.Operations.isNullOrEmpty(pAltitude).negate().getObjectAsBoolean() && cronapi.logic.Operations.isNullOrEmpty(pLatitude).negate().getObjectAsBoolean() && cronapi.logic.Operations.isNullOrEmpty(pLongitude).negate().getObjectAsBoolean() && Var.valueOf(cronapi.database.Operations.getField(vAlunoLogado, Var.valueOf("chamadaAutomatica")).equals(Var.VAR_TRUE)).getObjectAsBoolean()).getObjectAsBoolean()) {
            try {
                 vListaChamadas = blockly.AulaAluno.ListarChamadasDisponiveis();
                if (cronapi.logic.Operations.isNullOrEmpty(vListaChamadas).negate().getObjectAsBoolean()) {
                    for (Iterator it_vChamada = vListaChamadas.iterator(); it_vChamada.hasNext();) {
                        vChamada = Var.valueOf(it_vChamada.next());
                        vIdChamada = cronapi.database.Operations.getField(vChamada, Var.valueOf("idGChamada"));
                        vIdTurma = cronapi.database.Operations.getField(vChamada, Var.valueOf("aulaMinistrada.agenda.turma.idGTurma"));
                        if (blockly.ValidacaoCoordenadasChamada.LocalizacaoValida(vIdChamada, pLatitude, pLongitude, pAltitude).getObjectAsBoolean()) {
                            vObjChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c, c.aulaMinistrada.agenda.turma.idGTurma from Chamada c where c.idGChamada = :idGChamada"),Var.valueOf("idGChamada",vIdChamada));
                            vTESTEChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c from Chamada c where c.idGChamada = :idGChamada"),Var.valueOf("idGChamada",vIdChamada));
                            if (cronapi.logic.Operations.isNullOrEmpty(vObjChamada).negate().getObjectAsBoolean()) {
                                vIdMatricula = cronapi.database.Operations.getActiveData(cronapi.database.Operations.query(Var.valueOf("saaa.entity.Matricula"),Var.valueOf("select m.idGMatricula from Matricula m where m.turma.idGTurma = :turmaIdGTurma AND m.aluno = :aluno"),Var.valueOf("turmaIdGTurma",vIdTurma),Var.valueOf("aluno",blockly.Acesso.ObterAlunoLogado())));
                                vPresencaAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p from PresencaAluno p where p.chamada.idGChamada = :chamadaIdGChamada AND p.matricula.idGMatricula = :matriculaIdGMatricula"),Var.valueOf("chamadaIdGChamada",vIdChamada),Var.valueOf("matriculaIdGMatricula",vIdMatricula));
                                if (cronapi.logic.Operations.isNullOrEmpty(vPresencaAluno).negate().getObjectAsBoolean()) {
                                    try {
                                         if (Var.valueOf(cronapi.logic.Operations.isNullOrEmpty(vPresencaAluno).negate().getObjectAsBoolean() && cronapi.logic.Operations.isNullOrEmpty(cronapi.object.Operations.getObjectField(vPresencaAluno, Var.valueOf("dataHoraAutomatica"))).getObjectAsBoolean()).getObjectAsBoolean()) {
                                            cronapi.object.Operations.setObjectField(vPresencaAluno, Var.valueOf("dataHoraAutomatica"), cronapi.dateTime.Operations.getNow());
                                            cronapi.database.Operations.update(Var.valueOf("saaa.entity.PresencaAluno"),vPresencaAluno);
                                            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Presença realizada com sucesso!"));
                                        }
                                     } catch (Exception excecao_exception) {
                                          excecao = Var.valueOf(excecao_exception);
                                         cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), excecao);
                                     } finally {
                                     }
                                }
                            }
                        }
                    } // end for
                }
             } catch (Exception ex1_exception) {

             } finally {
             }
        }
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param pLatitude
 * @param pLongitude
 * @param pAltitude
 * @return Var
 */
// PresencaAutomatica
public static Var MarcarAnterior(Var pLatitude, Var pLongitude, Var pAltitude) throws Exception {
 return new Callable<Var>() {

   private Var vAlunoLogado = Var.VAR_NULL;
   private Var vListaChamadas = Var.VAR_NULL;
   private Var vChamada = Var.VAR_NULL;
   private Var vIdChamada = Var.VAR_NULL;
   private Var vIdTurma = Var.VAR_NULL;
   private Var vObjChamada = Var.VAR_NULL;
   private Var vIdMatricula = Var.VAR_NULL;
   private Var excecao = Var.VAR_NULL;
   private Var vRetornoLocalizacao = Var.VAR_NULL;
   private Var vQueryPresencaAlunoExistente = Var.VAR_NULL;
   private Var vIdAluno = Var.VAR_NULL;
   private Var vIdDocente = Var.VAR_NULL;
   private Var vIdDocente2 = Var.VAR_NULL;
   private Var vQueryMatricula = Var.VAR_NULL;

   public Var call() throws Exception {
    vAlunoLogado = blockly.Acesso.ObterAlunoLogado();
    if (cronapi.logic.Operations.isNullOrEmpty(vAlunoLogado).negate().getObjectAsBoolean()) {
        if (Var.valueOf(cronapi.logic.Operations.isNullOrEmpty(pAltitude).negate().getObjectAsBoolean() && cronapi.logic.Operations.isNullOrEmpty(pLatitude).negate().getObjectAsBoolean() && cronapi.logic.Operations.isNullOrEmpty(pLongitude).negate().getObjectAsBoolean() && Var.valueOf(cronapi.database.Operations.getField(vAlunoLogado, Var.valueOf("chamadaAutomatica")).equals(Var.VAR_TRUE)).getObjectAsBoolean()).getObjectAsBoolean()) {
            try {
                 vListaChamadas = blockly.AulaAluno.ListarChamadasDisponiveis();
                if (cronapi.logic.Operations.isNullOrEmpty(vListaChamadas).negate().getObjectAsBoolean()) {
                    for (Iterator it_vChamada = vListaChamadas.iterator(); it_vChamada.hasNext();) {
                        vChamada = Var.valueOf(it_vChamada.next());
                        vIdChamada = cronapi.database.Operations.getField(vChamada, Var.valueOf("idGChamada"));
                        vRetornoLocalizacao = Var.VAR_NULL;
                        if (blockly.ValidacaoCoordenadasChamada.LocalizacaoValida(vIdChamada, pAltitude, pLongitude, pAltitude).getObjectAsBoolean()) {
                            vObjChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c, c.aulaMinistrada.agenda.turma.idGTurma from Chamada c where c.idGChamada = :idGChamada"),Var.valueOf("idGChamada",vIdChamada));
                            if (cronapi.logic.Operations.isNullOrEmpty(vObjChamada).negate().getObjectAsBoolean()) {
                                vQueryPresencaAlunoExistente = cronapi.database.Operations.query(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("select p.idGPresencaAluno from PresencaAluno p where p.chamada.idGChamada = :chamadaIdGChamada AND p.matricula.idGMatricula = :matriculaIdGMatricula"),Var.valueOf("chamadaIdGChamada",cronapi.database.Operations.getColumn(vObjChamada, Var.valueOf("this[0].idGChamada"))),Var.valueOf("matriculaIdGMatricula",cronapi.database.Operations.query(Var.valueOf("saaa.entity.Matricula"),Var.valueOf("select m.idGMatricula from Matricula m where m.turma.idGTurma = :turmaIdGTurma AND m.aluno = :aluno"),Var.valueOf("turmaIdGTurma",cronapi.database.Operations.getColumn(vObjChamada, Var.valueOf("this[0].aulaMinistrada.agenda.turma.idGTurma"))),Var.valueOf("aluno",blockly.Acesso.ObterAlunoLogado()))));
                                if (cronapi.database.Operations.hasElement(vQueryPresencaAlunoExistente).negate().getObjectAsBoolean()) {
                                    try {
                                         vIdTurma = cronapi.database.Operations.getField(vChamada, Var.valueOf("aulaMinistrada.agenda.turma.idGTurma"));
                                        vIdAluno = cronapi.database.Operations.getField(vAlunoLogado, Var.valueOf("idAluno"));
                                        vIdDocente = cronapi.database.Operations.getField(vChamada, Var.valueOf("aulaMinistrada.docente.idNumFunc"));
                                        vIdDocente2 = cronapi.database.Operations.getField(vChamada, Var.valueOf("aulaMinistrada.docente2.idNumFunc"));
                                        vQueryMatricula = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Matricula"),Var.valueOf("select m from Matricula m where m.turma.idGTurma = :turmaIdGTurma AND m.aluno.idAluno = :alunoIdAluno"),Var.valueOf("turmaIdGTurma",vIdTurma),Var.valueOf("alunoIdAluno",vIdAluno));
                                        vIdMatricula = cronapi.database.Operations.getField(vQueryMatricula, Var.valueOf("this[0].idGMatricula"));
                                        cronapi.database.Operations.insert(Var.valueOf("saaa.entity.PresencaAluno"),Var.valueOf("chamada",vIdChamada),Var.valueOf("longitudeRegistro",pLongitude),Var.valueOf("dataHoraRegistro",cronapi.dateTime.Operations.getNow()),Var.valueOf("matricula",vIdMatricula),Var.valueOf("docente",vIdDocente),Var.valueOf("latitudeRegistro",pLatitude),Var.valueOf("altitudeRegistro",pAltitude),Var.valueOf("docente2",vIdDocente2),Var.valueOf("presencaValida",Var.valueOf("S")));
                                        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Presença realizada com sucesso!"));
                                     } catch (Exception excecao_exception) {
                                          excecao = Var.valueOf(excecao_exception);
                                         cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), excecao);
                                     } finally {
                                     }
                                }
                            }
                        }
                    } // end for
                }
             } catch (Exception ex1_exception) {

             } finally {
             }
        }
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

