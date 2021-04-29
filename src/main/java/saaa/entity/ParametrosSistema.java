package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela parametros_sistema
 * @generated
 */
@Entity
@Table(name = "\"parametros_sistema\"")
@NamedQueries({
  
})
@XmlRootElement
public class ParametrosSistema implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "aberura_fora_horario", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String aberuraForaHorario;
  
  /**
  * @generated
  */
  @Column(name = "antecedencia_abertura_aula", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double antecedenciaAberturaAula;
  
  /**
  * @generated
  */
  @Column(name = "atraso_abertura_aula", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double atrasoAberturaAula;
  
  /**
   * @generated
   */
  @Id
  private java.lang.Integer idParametros;
  
  /**
  * @generated
  */
  @Column(name = "tolerancia_chamada_manual", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double toleranciaChamadaManual;
  
  /**
  * @generated
  */
  @Column(name = "tolerancia_encerramento_aula", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double toleranciaEncerramentoAula;

	/**
	 * Construtor
	 * @generated
	 */
	public ParametrosSistema(){
	}

  /**
   * Obtém aberuraForaHorario
   * 
   * return aberuraForaHorario
   * @generated
   */
  public java.lang.String getAberuraForaHorario(){
    return this.aberuraForaHorario;
  }
  
  /**
   * Define aberuraForaHorario
   * @param aberuraForaHorario aberuraForaHorario
   * @generated
   */
  public ParametrosSistema setAberuraForaHorario(java.lang.String aberuraForaHorario){
    this.aberuraForaHorario = aberuraForaHorario;
    return this;
  }
  
  /**
   * Obtém antecedenciaAberturaAula
   * 
   * return antecedenciaAberturaAula
   * @generated
   */
  public java.lang.Double getAntecedenciaAberturaAula(){
    return this.antecedenciaAberturaAula;
  }
  
  /**
   * Define antecedenciaAberturaAula
   * @param antecedenciaAberturaAula antecedenciaAberturaAula
   * @generated
   */
  public ParametrosSistema setAntecedenciaAberturaAula(java.lang.Double antecedenciaAberturaAula){
    this.antecedenciaAberturaAula = antecedenciaAberturaAula;
    return this;
  }
  
  /**
   * Obtém atrasoAberturaAula
   * 
   * return atrasoAberturaAula
   * @generated
   */
  public java.lang.Double getAtrasoAberturaAula(){
    return this.atrasoAberturaAula;
  }
  
  /**
   * Define atrasoAberturaAula
   * @param atrasoAberturaAula atrasoAberturaAula
   * @generated
   */
  public ParametrosSistema setAtrasoAberturaAula(java.lang.Double atrasoAberturaAula){
    this.atrasoAberturaAula = atrasoAberturaAula;
    return this;
  }
  
  /**
   * Obtém idParametros
   * 
   * return idParametros
   * @generated
   */
  public java.lang.Integer getIdParametros(){
    return this.idParametros;
  }
  
  /**
   * Define idParametros
   * @param idParametros idParametros
   * @generated
   */
  public ParametrosSistema setIdParametros(java.lang.Integer idParametros){
    this.idParametros = idParametros;
    return this;
  }
  
  /**
   * Obtém toleranciaChamadaManual
   * 
   * return toleranciaChamadaManual
   * @generated
   */
  public java.lang.Double getToleranciaChamadaManual(){
    return this.toleranciaChamadaManual;
  }
  
  /**
   * Define toleranciaChamadaManual
   * @param toleranciaChamadaManual toleranciaChamadaManual
   * @generated
   */
  public ParametrosSistema setToleranciaChamadaManual(java.lang.Double toleranciaChamadaManual){
    this.toleranciaChamadaManual = toleranciaChamadaManual;
    return this;
  }
  
  /**
   * Obtém toleranciaEncerramentoAula
   * 
   * return toleranciaEncerramentoAula
   * @generated
   */
  public java.lang.Double getToleranciaEncerramentoAula(){
    return this.toleranciaEncerramentoAula;
  }
  
  /**
   * Define toleranciaEncerramentoAula
   * @param toleranciaEncerramentoAula toleranciaEncerramentoAula
   * @generated
   */
  public ParametrosSistema setToleranciaEncerramentoAula(java.lang.Double toleranciaEncerramentoAula){
    this.toleranciaEncerramentoAula = toleranciaEncerramentoAula;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ParametrosSistema object = (ParametrosSistema)obj;
    if (idParametros != null ? !idParametros.equals(object.idParametros) : object.idParametros != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idParametros == null) ? 0 : idParametros.hashCode());
    return result;
  }

}