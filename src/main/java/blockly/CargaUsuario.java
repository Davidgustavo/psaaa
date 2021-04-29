package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/CargaUsuario")

@CronapiMetaData(type = "blockly")
@CronappSecurity(get = "Public", execute = "Public")
public class CargaUsuario {

public static final int TIMEOUT = 300;

/**
 *
 * @param email
 * @param senha
 * @param id_num_func
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/CarregarProfessor/{email}/{senha}/{id_num_func}")
// CargaUsuario
public static Var CarregarProfessor(@PathVariable("email") Var email ,@PathVariable("senha") Var senha ,@PathVariable("id_num_func") Var id_num_func ) throws Exception {
 return new Callable<Var>() {

   private Var vDocente = Var.VAR_NULL;
   private Var vSenhaCriptografada = Var.VAR_NULL;
   private Var vNovoUSER = Var.VAR_NULL;
   private Var vNovoUsuarioSistema = Var.VAR_NULL;

   public Var call() throws Exception {
    vDocente = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Docente"),Var.valueOf("select d from Docente d where d.idNumFunc = :idNumFunc"),Var.valueOf("idNumFunc",id_num_func));
    if (cronapi.logic.Operations.isNullOrEmpty(vDocente).negate().getObjectAsBoolean()) {
        vSenhaCriptografada = senha;
        vNovoUSER = cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.User"),Var.valueOf("email",email),Var.valueOf("name",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[0].nomeAbrev"))),Var.valueOf("login",email),Var.valueOf("password",vSenhaCriptografada));
        cronapi.database.Operations.insert(Var.valueOf("saaa.entity.User"),vNovoUSER);
        vNovoUsuarioSistema = cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.UsuarioSistema"),Var.valueOf("dataHoraInclusao",cronapi.dateTime.Operations.getNow()),Var.valueOf("docente",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[0].idNumFunc"))),Var.valueOf("motivoSituacao",Var.valueOf("Cadastro Inicial")),Var.valueOf("nomeAbrev",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[0].nomeAbrev"))),Var.valueOf("nomeCompl",cronapi.database.Operations.getField(vDocente, Var.valueOf("this[0].nomeCompl"))),Var.valueOf("situacaoUsuario",Var.valueOf("A")),Var.valueOf("user",cronapi.object.Operations.getObjectField(vNovoUSER, Var.valueOf("id"))));
        cronapi.database.Operations.insert(Var.valueOf("saaa.entity.UsuarioSistema"),vNovoUsuarioSistema);
        cronapi.database.Operations.insert(Var.valueOf("saaa.entity.Role"),cronapi.object.Operations.newObject(Var.valueOf("saaa.entity.Role"),Var.valueOf("id",Var.valueOf("Professor")),Var.valueOf("user",vNovoUSER)));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

