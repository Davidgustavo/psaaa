package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EnviarNotificacao {

public static final int TIMEOUT = 300;

/**
 *
 * @param token
 * @param titulo
 * @param subtitulo
 * @return Var
 */
// EnviarNotificacao
public static Var Enviar(Var token, Var titulo, Var subtitulo) throws Exception {
 return new Callable<Var>() {

   private Var dado = Var.VAR_NULL;

   public Var call() throws Exception {
    dado = cronapi.json.Operations.createObjectJson();
    cronapi.json.Operations.setJsonOrMapField(dado, Var.valueOf("msg"), Var.valueOf("Você recebeu uma mensagem!!"));
    cronapi.pushnotification.Operations.sendNotification(Var.valueOf("AAAAq8vNYgk:APA91bFEgdno8i5R_7AFh9m0Enh4XArazcCvPD5AQuNuMPnKm1g9r6mHY6nrip9d_cgiQVikrHJDAL1FOlPBsei0EqZ8hNDNH558EUniPx4eULKSqjW2-LH2KfJ19mC6FOZr0Ju8dAt5"), token, titulo, subtitulo, dado);
    return Var.VAR_NULL;
   }
 }.call();
}

}

