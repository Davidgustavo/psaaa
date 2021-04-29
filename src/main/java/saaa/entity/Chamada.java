package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela chamada
 * @generated
 */
@Entity
@Table(name = "\"chamada\"")
@NamedQueries({
  
})
@XmlRootElement
public class Chamada implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_aula_ministrada", referencedColumnName = "id_g_aula_ministrada", insertable=true, updatable=true)
  private AulaMinistrada aulaMinistrada;
  
  /**
  * @generated
  */
  @Column(name = "chamada_automatica", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String chamadaAutomatica;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_fim", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraFim;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_inicio", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraInicio;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_num_func1", referencedColumnName = "id_num_func", insertable=true, updatable=true)
  private Docente docente2;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_num_func", referencedColumnName = "id_num_func", insertable=true, updatable=true)
  private Docente docente;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGChamada = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "observacao", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String observacao;

	/**
	 * Construtor
	 * @generated
	 */
	public Chamada(){
	}

  /**
   * Obtém aulaMinistrada
   * 
   * return aulaMinistrada
   * @generated
   */
  public AulaMinistrada getAulaMinistrada(){
    return this.aulaMinistrada;
  }
  
  /**
   * Define aulaMinistrada
   * @param aulaMinistrada aulaMinistrada
   * @generated
   */
  public Chamada setAulaMinistrada(AulaMinistrada aulaMinistrada){
    this.aulaMinistrada = aulaMinistrada;
    return this;
  }
  
  /**
   * Obtém chamadaAutomatica
   * 
   * return chamadaAutomatica
   * @generated
   */
  public java.lang.String getChamadaAutomatica(){
    return this.chamadaAutomatica;
  }
  
  /**
   * Define chamadaAutomatica
   * @param chamadaAutomatica chamadaAutomatica
   * @generated
   */
  public Chamada setChamadaAutomatica(java.lang.String chamadaAutomatica){
    this.chamadaAutomatica = chamadaAutomatica;
    return this;
  }
  
  /**
   * Obtém dataHoraFim
   * 
   * return dataHoraFim
   * @generated
   */
  public java.util.Date getDataHoraFim(){
    return this.dataHoraFim;
  }
  
  /**
   * Define dataHoraFim
   * @param dataHoraFim dataHoraFim
   * @generated
   */
  public Chamada setDataHoraFim(java.util.Date dataHoraFim){
    this.dataHoraFim = dataHoraFim;
    return this;
  }
  
  /**
   * Obtém dataHoraInicio
   * 
   * return dataHoraInicio
   * @generated
   */
  public java.util.Date getDataHoraInicio(){
    return this.dataHoraInicio;
  }
  
  /**
   * Define dataHoraInicio
   * @param dataHoraInicio dataHoraInicio
   * @generated
   */
  public Chamada setDataHoraInicio(java.util.Date dataHoraInicio){
    this.dataHoraInicio = dataHoraInicio;
    return this;
  }
  
  /**
   * Obtém docente2
   * 
   * return docente2
   * @generated
   */
  public Docente getDocente2(){
    return this.docente2;
  }
  
  /**
   * Define docente2
   * @param docente2 docente2
   * @generated
   */
  public Chamada setDocente2(Docente docente2){
    this.docente2 = docente2;
    return this;
  }
  
  /**
   * Obtém docente
   * 
   * return docente
   * @generated
   */
  public Docente getDocente(){
    return this.docente;
  }
  
  /**
   * Define docente
   * @param docente docente
   * @generated
   */
  public Chamada setDocente(Docente docente){
    this.docente = docente;
    return this;
  }
  
  /**
   * Obtém idGChamada
   * 
   * return idGChamada
   * @generated
   */
  public java.lang.String getIdGChamada(){
    return this.idGChamada;
  }
  
  /**
   * Define idGChamada
   * @param idGChamada idGChamada
   * @generated
   */
  public Chamada setIdGChamada(java.lang.String idGChamada){
    this.idGChamada = idGChamada;
    return this;
  }
  
  /**
   * Obtém observacao
   * 
   * return observacao
   * @generated
   */
  public java.lang.String getObservacao(){
    return this.observacao;
  }
  
  /**
   * Define observacao
   * @param observacao observacao
   * @generated
   */
  public Chamada setObservacao(java.lang.String observacao){
    this.observacao = observacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Chamada object = (Chamada)obj;
    if (idGChamada != null ? !idGChamada.equals(object.idGChamada) : object.idGChamada != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGChamada == null) ? 0 : idGChamada.hashCode());
    return result;
  }

}