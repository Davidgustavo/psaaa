package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Localizacao {

public static final int TIMEOUT = 300;

/**
 *
 * @param tX1
 * @param tY1
 * @param tX2
 * @param tY2
 * @param tX3
 * @param tY3
 * @return Var
 */
// Descreva esta função...
public static Var CalcularAreaTriangulo(Var tX1, Var tY1, Var tX2, Var tY2, Var tX3, Var tY3) throws Exception {
 return new Callable<Var>() {

   private Var vTRetorno = Var.VAR_NULL;
   private Var vTSomaCoordenadas = Var.VAR_NULL;

   public Var call() throws Exception {
    vTRetorno = Var.valueOf(0);
    vTSomaCoordenadas = cronapi.math.Operations.sum(cronapi.math.Operations.multiply(tX1,cronapi.math.Operations.subtract(tY2,tY3)),cronapi.math.Operations.multiply(tX2,cronapi.math.Operations.subtract(tY3,tY1)),cronapi.math.Operations.multiply(tX3,cronapi.math.Operations.subtract(tY1,tY2)));
    vTRetorno = cronapi.math.Operations.divisor(vTSomaCoordenadas,Var.valueOf(2));
    if (Var.valueOf(vTRetorno.compareTo(Var.valueOf(0)) < 0).getObjectAsBoolean()) {
        vTRetorno = cronapi.math.Operations.multiply(vTRetorno,Var.valueOf(-1));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 * @param x3
 * @param y3
 * @param x4
 * @param y4
 * @param x
 * @param y
 * @param precisao
 * @return Var
 */
// Função para validar se uma coordenada está dentro de um retângulo
public static Var ValidarCoordenadas(Var x1, Var y1, Var x2, Var y2, Var x3, Var y3, Var x4, Var y4, Var x, Var y, Var precisao) throws Exception {
 return new Callable<Var>() {

   private Var vAreaA = Var.VAR_NULL;
   private Var vAreaA1 = Var.VAR_NULL;
   private Var vAreaA2 = Var.VAR_NULL;
   private Var vAreaA3 = Var.VAR_NULL;
   private Var vAreaA4 = Var.VAR_NULL;
   private Var vCRetorno = Var.VAR_NULL;

   public Var call() throws Exception {
    vAreaA = cronapi.math.Operations.sum(Var.valueOf(CalcularAreaTriangulo(x1, y1, x2, y2, x3, y3)),Var.valueOf(CalcularAreaTriangulo(x1, y1, x4, y4, x3, y3)));
    vAreaA1 = Var.valueOf(CalcularAreaTriangulo(x, y, x1, y1, x2, y2));
    vAreaA2 = Var.valueOf(CalcularAreaTriangulo(x, y, x2, y2, x3, y3));
    vAreaA3 = Var.valueOf(CalcularAreaTriangulo(x, y, x3, y3, x4, y4));
    vAreaA4 = Var.valueOf(CalcularAreaTriangulo(x, y, x1, y1, x4, y4));
    vCRetorno = Var.valueOf(vAreaA.equals((cronapi.math.Operations.sum(vAreaA1,vAreaA2,vAreaA3,vAreaA4))));
    if (Var.valueOf(vCRetorno.equals(Var.VAR_FALSE)).getObjectAsBoolean()) {
        vAreaA = cronapi.math.Operations.sum(Var.valueOf(CalcularAreaTriangulo(x1, y1, x2, y2, x3, y3)),Var.valueOf(CalcularAreaTriangulo(x1, y1, x4, y4, x3, y3)));
        vAreaA1 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.sum(x,precisao), cronapi.math.Operations.sum(y,precisao), x1, y1, x2, y2));
        vAreaA2 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.sum(x,precisao), cronapi.math.Operations.sum(y,precisao), x2, y2, x3, y3));
        vAreaA3 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.sum(x,precisao), cronapi.math.Operations.sum(y,precisao), x3, y3, x4, y4));
        vAreaA4 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.sum(x,precisao), cronapi.math.Operations.sum(y,precisao), x1, y1, x4, y4));
        vCRetorno = Var.valueOf(vAreaA.equals((cronapi.math.Operations.sum(vAreaA1,vAreaA2,vAreaA3,vAreaA4))));
        if (Var.valueOf(vCRetorno.equals(Var.VAR_FALSE)).getObjectAsBoolean()) {
            vAreaA = cronapi.math.Operations.sum(Var.valueOf(CalcularAreaTriangulo(x1, y1, x2, y2, x3, y3)),Var.valueOf(CalcularAreaTriangulo(x1, y1, x4, y4, x3, y3)));
            vAreaA1 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.subtract(x,precisao), cronapi.math.Operations.subtract(y,precisao), x1, y1, x2, y2));
            vAreaA2 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.subtract(x,precisao), cronapi.math.Operations.subtract(y,precisao), x2, y2, x3, y3));
            vAreaA3 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.subtract(x,precisao), cronapi.math.Operations.subtract(y,precisao), x3, y3, x4, y4));
            vAreaA4 = Var.valueOf(CalcularAreaTriangulo(cronapi.math.Operations.subtract(x,precisao), cronapi.math.Operations.subtract(y,precisao), x1, y1, x4, y4));
            vCRetorno = Var.valueOf(vAreaA.equals((cronapi.math.Operations.sum(vAreaA1,vAreaA2,vAreaA3,vAreaA4))));
        }
    }
    return vCRetorno;
   }
 }.call();
}

}

