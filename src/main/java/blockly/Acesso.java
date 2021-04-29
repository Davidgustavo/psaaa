package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class Acesso {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Acesso
public static synchronized Var ObterAlunoLogado() throws Exception {
 return new Callable<Var>() {

   private Var vUsuarioSistema = Var.VAR_NULL;
   private Var vUser = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;
   private Var vAluno = Var.VAR_NULL;

   public Var call() throws Exception {
    vUser = blockly.Acesso.ObterUsuarioLogado();
    item = cronapi.database.Operations.getField(vUser, Var.valueOf("this[1]"));
    vUsuarioSistema = cronapi.database.Operations.query(Var.valueOf("saaa.entity.UsuarioSistema"),Var.valueOf("select u.aluno, u.aluno.idAluno, u.aluno.nomeAbrev, u.user.id, u.user.login, u.idUsuario from UsuarioSistema u where u.user.id = :userId"),Var.valueOf("userId",item));
    vAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Aluno"),Var.valueOf("select a.idAluno, a.nomeAbrev, a.nomeCompl, a.chamadaAutomatica, a.foto from Aluno a where a.idAluno = :idAluno"),Var.valueOf("idAluno",cronapi.database.Operations.getField(vUsuarioSistema, Var.valueOf("this[1]"))));
    return cronapi.database.Operations.newEntity(Var.valueOf("saaa.entity.Aluno"),Var.valueOf("idAluno",cronapi.database.Operations.getField(vAluno, Var.valueOf("this[0]"))),Var.valueOf("nomeAbrev",cronapi.database.Operations.getField(vAluno, Var.valueOf("this[1]"))),Var.valueOf("nomeCompl",cronapi.database.Operations.getField(vAluno, Var.valueOf("this[2]"))),Var.valueOf("chamadaAutomatica",cronapi.database.Operations.getField(vAluno, Var.valueOf("this[3]"))),Var.valueOf("foto",cronapi.database.Operations.getField(vAluno, Var.valueOf("this[4]"))));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Acesso
public static synchronized Var ObterProfessorLogado() throws Exception {
 return new Callable<Var>() {

   private Var vUsuarioSistema = Var.VAR_NULL;
   private Var vUser = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;
   private Var vDocente = Var.VAR_NULL;

   public Var call() throws Exception {
    vUser = blockly.Acesso.ObterUsuarioLogado();
    item = cronapi.database.Operations.getField(vUser, Var.valueOf("this[1]"));
    vUsuarioSistema = cronapi.database.Operations.query(Var.valueOf("saaa.entity.UsuarioSistema"),Var.valueOf("select u.docente, u.docente.idNumFunc, u.docente.nomeAbrev, u.user.id, u.user.login, u.idUsuario from UsuarioSistema u where u.user.id = :userId"),Var.valueOf("userId",item));
    vDocente = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Docente"),Var.valueOf("select d.idNumFunc, d.nomeAbrev, d.nomeCompl from Docente d where d.idNumFunc = :idNumFunc"),Var.valueOf("idNumFunc",cronapi.database.Operations.getField(vUsuarioSistema, Var.valueOf("this[1]"))));
    return cronapi.database.Operations.newEntity(Var.valueOf("saaa.entity.Docente"),Var.valueOf("idNumFunc",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[0]"))),Var.valueOf("nomeAbrev",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[1]"))),Var.valueOf("nomeCompl",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[2]"))));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Acesso
public static synchronized Var ObterUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var vUser = Var.VAR_NULL;

   public Var call() throws Exception {
    vUser = cronapi.database.Operations.query(Var.valueOf("saaa.entity.User"),Var.valueOf("select u.email, u.id, u.login, u.name from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    return vUser;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Acesso
public static synchronized Var ObterUsuarioSistemaLogado() throws Exception {
 return new Callable<Var>() {

   private Var vUsuarioSistema = Var.VAR_NULL;
   private Var vUser = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    vUser = blockly.Acesso.ObterUsuarioLogado();
    if (cronapi.logic.Operations.isNullOrEmpty(vUser).negate().getObjectAsBoolean()) {
        item = cronapi.database.Operations.getField(vUser, Var.valueOf("this[1]"));
        if (cronapi.logic.Operations.isNullOrEmpty(item).negate().getObjectAsBoolean()) {
            vUsuarioSistema = cronapi.database.Operations.query(Var.valueOf("saaa.entity.UsuarioSistema"),Var.valueOf("select u from UsuarioSistema u where u.user.id = :userId"),Var.valueOf("userId",item));
        }
    }
    return vUsuarioSistema;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static synchronized void FazerLogoff() throws Exception {
  new Callable<Var>() {

   private Var vUsuarioSistema = Var.VAR_NULL;
   private Var vQueryLogAcesso = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         vUsuarioSistema = blockly.Acesso.ObterUsuarioSistemaLogado();
        if (cronapi.logic.Operations.isNullOrEmpty(vUsuarioSistema).negate().getObjectAsBoolean()) {
            vQueryLogAcesso = cronapi.database.Operations.query(Var.valueOf("saaa.entity.LogAcessoSistema"),Var.valueOf("select l from LogAcessoSistema l where l.dataHoraLogoff IS NULL AND l.usuarioSistema = :usuarioSistema   order by l.dataHoraAcesso desc"),Var.valueOf("usuarioSistema",vUsuarioSistema));
            if (cronapi.logic.Operations.isNullOrEmpty(vQueryLogAcesso).negate().getObjectAsBoolean()) {
                while (cronapi.database.Operations.hasElement(vQueryLogAcesso).getObjectAsBoolean()) {
                    cronapi.database.Operations.execute(Var.valueOf("saaa.entity.LogAcessoSistema"), Var.valueOf("update LogAcessoSistema set dataHoraLogoff = :dataHoraLogoff where idGLogAcessoSistema = :idGLogAcessoSistema"),Var.valueOf("dataHoraLogoff",cronapi.dateTime.Operations.getNow()),Var.valueOf("idGLogAcessoSistema",cronapi.database.Operations.getField(vQueryLogAcesso, Var.valueOf("this[0].idGLogAcessoSistema"))));
                    break;
                } // end while
            }
        }
     } catch (Exception ex1_exception) {

     } finally {
     }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static synchronized void IncluirLogAcesso() throws Exception {
  new Callable<Var>() {

   private Var vUsuarioSistema = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         vUsuarioSistema = blockly.Acesso.ObterUsuarioSistemaLogado();
        if (cronapi.logic.Operations.isNullOrEmpty(vUsuarioSistema).negate().getObjectAsBoolean()) {
            cronapi.database.Operations.insert(Var.valueOf("saaa.entity.LogAcessoSistema"),cronapi.database.Operations.newEntity(Var.valueOf("saaa.entity.LogAcessoSistema"),Var.valueOf("dataHoraAcesso",cronapi.dateTime.Operations.getNow()),Var.valueOf("usuarioSistema",cronapi.database.Operations.getField(vUsuarioSistema, Var.valueOf("this[0].idUsuario")))));
        }
        try {
             cronapi.util.Operations.callClientFunction(Var.valueOf("blockly.js.blockly.ObterTokenFirebase.Obter"));
         } catch (Exception ex1_exception) {

         } finally {
         }
     } catch (Exception ex1_exception) {

     } finally {
     }
   return Var.VAR_NULL;
   }
 }.call();
}

}

