package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import GeoLoc.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ValidacaoCoordenadasChamada {

public static final int TIMEOUT = 300;

/**
 *
 * @param pIdChamada
 * @param pLatitude
 * @param pLongitude
 * @param pAltitude
 * @return boolean
 */
// ValidacaoCoordenadasChamada
public static Var LocalizacaoValida(Var pIdChamada, Var pLatitude, Var pLongitude, Var pAltitude) throws Exception {
 return new Callable<Var>() {

   private boolean vDentroDependencia;
   private Var vObjChamada = Var.VAR_NULL;
   private Var vObjAulaMinistrada = Var.VAR_NULL;
   private Var vObjDependencia = Var.VAR_NULL;
   private double vLatitude1Dep = 0;
   private double vLatitude2Dep = 0;
   private double vLatitude3Dep = 0;
   private double vLatitude4Dep = 0;
   private double vLongitude1Dep = 0;
   private double vLongitude2Dep = 0;
   private double vLongitude3Dep = 0;
   private double vLongitude4Dep = 0;
   private double vAltitudeDep = 0;
   private double vPrecisaoAltitude = 0;
   private double vPrecisaoLatitudeLongitude = 0;

   public Var call() throws Exception {
    vDentroDependencia = false;
    if (Var.valueOf(cronapi.logic.Operations.isNullOrEmpty(pIdChamada).negate().getObjectAsBoolean()).getObjectAsBoolean()) {
        vObjChamada = cronapi.database.Operations.query(Var.valueOf("saaa.entity.Chamada"),Var.valueOf("select c from Chamada c where c.idGChamada = :idGChamada"),Var.valueOf("idGChamada",pIdChamada));
        if (cronapi.logic.Operations.isNullOrEmpty(vObjChamada).negate().getObjectAsBoolean()) {
            vObjAulaMinistrada = cronapi.object.Operations.getObjectField(vObjChamada, Var.valueOf("aulaMinistrada"));
            if (vObjAulaMinistrada != null) {
            //if (cronapi.logic.Operations.isNullOrEmpty(vObjAulaMinistrada).negate().getObjectAsBoolean()) {
                vObjDependencia = cronapi.object.Operations.getObjectField(vObjAulaMinistrada, Var.valueOf("dependencia"));
                if (vObjDependencia != null) {
                //if (cronapi.logic.Operations.isNullOrEmpty(vObjDependencia).negate().getObjectAsBoolean()) {
                    vLatitude1Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("latitudeCanto1")).getObjectAsDouble();
                    vLatitude2Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("latitudeCanto2")).getObjectAsDouble();
                    vLatitude3Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("latitudeCanto3")).getObjectAsDouble();
                    vLatitude4Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("latitudeCanto4")).getObjectAsDouble();
                    vLongitude1Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("longitudeCanto1")).getObjectAsDouble();
                    vLongitude2Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("longitudeCanto2")).getObjectAsDouble();
                    vLongitude3Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("longitudeCanto3")).getObjectAsDouble();
                    vLongitude4Dep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("longitudeCanto4")).getObjectAsDouble();
                    vAltitudeDep = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("altitude")).getObjectAsDouble();
                    vPrecisaoAltitude = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("precisaoAltitude")).getObjectAsDouble();
                    vPrecisaoLatitudeLongitude = cronapi.object.Operations.getObjectField(vObjDependencia, Var.valueOf("precisaoLatLong")).getObjectAsDouble();
                   
                    double vLatitudeAluno = pLatitude.getObjectAsDouble();
                    double vLongitudeAluno = pLongitude.getObjectAsDouble();
                    Point pointAluno = new Point(vLatitudeAluno, vLongitudeAluno);
                    
                    ArrayList<Point> pointsDep = new ArrayList<Point>();
                    Point point1Dep = new Point(vLatitude1Dep, vLongitude1Dep);
                    Point point2Dep = new Point(vLatitude2Dep, vLongitude2Dep);
                    Point point3Dep = new Point(vLatitude3Dep, vLongitude3Dep);
                    Point point4Dep = new Point(vLatitude4Dep, vLongitude4Dep);
                    pointsDep.add(point1Dep);
                    pointsDep.add(point2Dep);
                    pointsDep.add(point3Dep);
                    pointsDep.add(point4Dep);
                    
                    Polygon vPolygon = new Polygon();
                    vPolygon.setPoints(pointsDep);
                    vDentroDependencia = vPolygon.IsPointInPolygon(pointAluno, vPolygon);
                    
                    if (vPrecisaoLatitudeLongitude != 0)
                    {
                        //Caso não esteja dentro do polígono, utilizar a precisão (+Latitude)
                        if (!vDentroDependencia) 
                        {
                            pointAluno.setLatitude(vLatitudeAluno + vPrecisaoLatitudeLongitude);
                            pointAluno.setLongitude(vLongitudeAluno);
                            vDentroDependencia = vPolygon.IsPointInPolygon(pointAluno, vPolygon);
                        }

                        //Caso não esteja dentro do polígono, utilizar a precisão (-Latitude)
                        if (!vDentroDependencia)
                        {
                            pointAluno.setLatitude(vLatitudeAluno - vPrecisaoLatitudeLongitude);
                            pointAluno.setLongitude(vLongitudeAluno);
                            vDentroDependencia = vPolygon.IsPointInPolygon(pointAluno, vPolygon);
                        }
                            
                        //Caso não esteja dentro do polígono, utilizar a precisão (+Longitude)
                        if (!vDentroDependencia)
                        {
                            pointAluno.setLatitude(vLatitudeAluno);
                            pointAluno.setLongitude(vLongitudeAluno + vPrecisaoLatitudeLongitude);
                            vDentroDependencia = vPolygon.IsPointInPolygon(pointAluno, vPolygon);
                        }

                        //Caso não esteja dentro do polígono, utilizar a precisão (-Longitude)
                        if (!vDentroDependencia) 
                        {
                            pointAluno.setLatitude(vLatitudeAluno);
                            pointAluno.setLongitude(vLongitudeAluno - vPrecisaoLatitudeLongitude);
                            vDentroDependencia = vPolygon.IsPointInPolygon(pointAluno, vPolygon);
                        }
                    }

                    if (vDentroDependencia) //Se tiver no polígono, validar a altitude.
                    {
                        double vAltitudeAluno = pAltitude.getObjectAsDouble();
                        vDentroDependencia = (vAltitudeDep <= (vAltitudeAluno + vPrecisaoAltitude)) || (vAltitudeDep >= (vAltitudeAluno - vPrecisaoAltitude));
                    }
                }
            }
        }
    }
    return Var.valueOf(vDentroDependencia);
   }
 }.call();
}

}

