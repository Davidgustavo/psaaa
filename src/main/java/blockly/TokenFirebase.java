package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TokenFirebase {

public static final int TIMEOUT = 300;

/**
 *
 * @param token
 * @return Var
 */
// TokenFirebase
public static Var SalvarToken(Var token) throws Exception {
 return new Callable<Var>() {

   private Var vUser = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;
   private Var vUsuarioSistema = Var.VAR_NULL;

   public Var call() throws Exception {
    vUser = blockly.Acesso.ObterUsuarioLogado();
    item = cronapi.database.Operations.getField(vUser, Var.valueOf("this[1]"));
    vUsuarioSistema = cronapi.database.Operations.query(Var.valueOf("saaa.entity.UsuarioSistema"),Var.valueOf("select u.aluno, u.aluno.idAluno, u.aluno.nomeAbrev, u.user.id, u.user.login, u.idUsuario, u.tokenFirebase from UsuarioSistema u where u.user.id = :userId"),Var.valueOf("userId",item));
    if (cronapi.logic.Operations.isNullOrEmpty(cronapi.database.Operations.getField(vUsuarioSistema, Var.valueOf("this[6]"))).getObjectAsBoolean()) {
        cronapi.database.Operations.execute(Var.valueOf("saaa.entity.UsuarioSistema"), Var.valueOf("update UsuarioSistema set tokenFirebase = :tokenFirebase where idUsuario = :idUsuario"),Var.valueOf("tokenFirebase",token),Var.valueOf("idUsuario",cronapi.database.Operations.getField(vUsuarioSistema, Var.valueOf("this[5]"))));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

