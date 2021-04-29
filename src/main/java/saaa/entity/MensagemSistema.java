package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela mensagem_sistema
 * @generated
 */
@Entity
@Table(name = "\"mensagem_sistema\"")
@NamedQueries({
  
})
@XmlRootElement
public class MensagemSistema implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.Long idMensagem;
  
  /**
  * @generated
  */
  @Column(name = "texto_mensagem", nullable = false, unique = false, length=200, insertable=true, updatable=true)
  private java.lang.String textoMensagem;

	/**
	 * Construtor
	 * @generated
	 */
	public MensagemSistema(){
	}

  /**
   * Obtém idMensagem
   * 
   * return idMensagem
   * @generated
   */
  public java.lang.Long getIdMensagem(){
    return this.idMensagem;
  }
  
  /**
   * Define idMensagem
   * @param idMensagem idMensagem
   * @generated
   */
  public MensagemSistema setIdMensagem(java.lang.Long idMensagem){
    this.idMensagem = idMensagem;
    return this;
  }
  
  /**
   * Obtém textoMensagem
   * 
   * return textoMensagem
   * @generated
   */
  public java.lang.String getTextoMensagem(){
    return this.textoMensagem;
  }
  
  /**
   * Define textoMensagem
   * @param textoMensagem textoMensagem
   * @generated
   */
  public MensagemSistema setTextoMensagem(java.lang.String textoMensagem){
    this.textoMensagem = textoMensagem;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MensagemSistema object = (MensagemSistema)obj;
    if (idMensagem != null ? !idMensagem.equals(object.idMensagem) : object.idMensagem != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idMensagem == null) ? 0 : idMensagem.hashCode());
    return result;
  }

}