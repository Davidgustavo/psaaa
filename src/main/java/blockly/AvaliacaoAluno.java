package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AvaliacaoAluno {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// AvaliacaoAluno
public static Var Salvar() throws Exception {
 return new Callable<Var>() {

   private Var vObjAvaliacao = Var.VAR_NULL;
   private Var vDataHoraAtual = Var.VAR_NULL;
   private Var vQualificacao = Var.VAR_NULL;

   public Var call() throws Exception {
    vObjAvaliacao = cronapi.database.Operations.query(Var.valueOf("saaa.entity.AvaliacaoAula"),Var.valueOf("select a from AvaliacaoAula a where a.idAvaliacaoAula = :idAvaliacaoAula"),Var.valueOf("idAvaliacaoAula",cronapi.screen.Operations.getValueOfField(Var.valueOf("AvaliacaoAula.active.a_idAvaliacaoAula"))));
    if (cronapi.logic.Operations.isNullOrEmpty(vObjAvaliacao).negate().getObjectAsBoolean()) {
        vDataHoraAtual = cronapi.dateTime.Operations.getNow();
        vQualificacao = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.combo_qualificacao"));
        if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.combo_aproveitamento")).equals(Var.valueOf("1"))).getObjectAsBoolean()) {
            cronapi.database.Operations.updateField(vObjAvaliacao, Var.valueOf("aproveitamentoPleno"), Var.valueOf("1"));
        } else if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.combo_aproveitamento")).equals(Var.valueOf("0"))).getObjectAsBoolean()) {
            cronapi.database.Operations.updateField(vObjAvaliacao, Var.valueOf("aproveitamentoPleno"), Var.valueOf("0"));
        }
        cronapi.database.Operations.updateField(vObjAvaliacao, Var.valueOf("dataAvaliacao"), vDataHoraAtual);
        cronapi.database.Operations.updateField(vObjAvaliacao, Var.valueOf("qualificacao"), vQualificacao);
        cronapi.database.Operations.update(Var.valueOf("saaa.entity.AvaliacaoAula"),cronapi.database.Operations.getActiveData(vObjAvaliacao));
        if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.combo_aproveitamento")).equals(Var.valueOf("0"))).getObjectAsBoolean()) {
            if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.checkboxConteudoInadequado")).equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
                cronapi.database.Operations.insert(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),Var.valueOf("avaliacao",cronapi.screen.Operations.getValueOfField(Var.valueOf("AvaliacaoAula.active.a_idAvaliacaoAula"))),Var.valueOf("tipoNaoAproveitamento",Var.valueOf("1")),Var.valueOf("descricao",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.inputComentarioConteudoInadequado")))));
            }
            if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.checkboxAtividadesInadequadas")).equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
                cronapi.database.Operations.insert(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),Var.valueOf("avaliacao",cronapi.screen.Operations.getValueOfField(Var.valueOf("AvaliacaoAula.active.a_idAvaliacaoAula"))),Var.valueOf("tipoNaoAproveitamento",Var.valueOf("2")),Var.valueOf("descricao",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.inputComentarioAtividadesInadequadas")))));
            }
            if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.checkboxRequisitosNecessarios")).equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
                cronapi.database.Operations.insert(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),Var.valueOf("avaliacao",cronapi.screen.Operations.getValueOfField(Var.valueOf("AvaliacaoAula.active.a_idAvaliacaoAula"))),Var.valueOf("tipoNaoAproveitamento",Var.valueOf("3")),Var.valueOf("descricao",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.inputComentarioRequisitosNecessarios")))));
            }
            if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.checkboxAmbienteInadequado")).equals(Var.VAR_TRUE)).getObjectAsBoolean()) {
                cronapi.database.Operations.insert(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.CausaNaoAproveitamento"),Var.valueOf("avaliacao",cronapi.screen.Operations.getValueOfField(Var.valueOf("AvaliacaoAula.active.a_idAvaliacaoAula"))),Var.valueOf("tipoNaoAproveitamento",Var.valueOf("4")),Var.valueOf("descricao",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.inputComentarioAmbienteInadequado")))));
            }
        }
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Avaliação realizada com sucesso!"));
    }
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/home"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

