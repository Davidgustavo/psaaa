package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Aluno {

public static final int TIMEOUT = 300;

/**
 */
// Descreva esta função...
public static void AtivarChamadaAutomatica() throws Exception {
  new Callable<Var>() {

   private Var chamadaAutomatica = Var.VAR_NULL;

   public Var call() throws Exception {
    chamadaAutomatica = Var.VAR_TRUE;
    if (cronapi.logic.Operations.isNullOrEmpty(cronapi.screen.Operations.getValueOfField(Var.valueOf("Aluno.active.chamadaAutomatica"))).getObjectAsBoolean()) {
        chamadaAutomatica = Var.VAR_FALSE;
    }
    cronapi.database.Operations.execute(Var.valueOf("saaa.entity.Aluno"), Var.valueOf("update Aluno set chamadaAutomatica = :chamadaAutomatica where idAluno = :idAluno"),Var.valueOf("chamadaAutomatica",chamadaAutomatica),Var.valueOf("idAluno",cronapi.screen.Operations.getValueOfField(Var.valueOf("Aluno.active.idAluno"))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("blockly.js.blockly.MudaParaHome.Executar"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param false
 * @return ativada
 */
// Retorna se o aluno logado está com chamada automática ativada (true ou false)
public static Var ChamadaAutomaticaAtivada() throws Exception {
 return new Callable<Var>() {

   private Var vRetornoChamadaAutomatica = Var.VAR_NULL;
   private Var vAluno = Var.VAR_NULL;

   public Var call() throws Exception {
    vRetornoChamadaAutomatica = Var.VAR_FALSE;
    vAluno = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Aluno"),Var.valueOf("select a.chamadaAutomatica from Aluno a where a = :a"),Var.valueOf("a",blockly.Acesso.ObterAlunoLogado()));
    if (cronapi.logic.Operations.isNullOrEmpty(vAluno).negate().getObjectAsBoolean()) {
        vRetornoChamadaAutomatica = cronapi.object.Operations.getObjectField(vAluno, Var.valueOf("chamadaAutomatica"));
    }
    return vRetornoChamadaAutomatica;
   }
 }.call();
}

}

