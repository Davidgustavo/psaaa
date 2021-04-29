package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class UsuarioSistemaDAO extends BasicDAO<String, UsuarioSistema> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public UsuarioSistemaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de UsuarioSistema utilizando os identificadores
   * 
   * @param idUsuario
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idUsuario){
      Query query = this.entityManager.createQuery("DELETE FROM UsuarioSistema entity WHERE entity.idUsuario = :idUsuario");
      query.setParameter("idUsuario", idUsuario);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de UsuarioSistema utilizando os identificadores
   * 
   * @param idUsuario
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public UsuarioSistema findById(java.lang.String idUsuario){
      TypedQuery<UsuarioSistema> query = this.entityManager.createQuery("SELECT entity FROM UsuarioSistema entity WHERE entity.idUsuario = :idUsuario", UsuarioSistema.class);
      query.setParameter("idUsuario", idUsuario);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<LogAcessoSistema> findLogAcessoSistema(java.lang.String idUsuario, int limit, int offset) {
      TypedQuery<LogAcessoSistema> query = this.entityManager.createQuery("SELECT entity FROM LogAcessoSistema entity WHERE entity.usuarioSistema.idUsuario = :idUsuario", LogAcessoSistema.class);
      query.setParameter("idUsuario", idUsuario);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}