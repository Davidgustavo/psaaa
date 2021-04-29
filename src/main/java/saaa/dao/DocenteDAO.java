package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class DocenteDAO extends BasicDAO<String, Docente> implements Serializable {

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
  public DocenteDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Docente utilizando os identificadores
   * 
   * @param idNumFunc
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Long idNumFunc){
      Query query = this.entityManager.createQuery("DELETE FROM Docente entity WHERE entity.idNumFunc = :idNumFunc");
      query.setParameter("idNumFunc", idNumFunc);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Docente utilizando os identificadores
   * 
   * @param idNumFunc
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Docente findById(java.lang.Long idNumFunc){
      TypedQuery<Docente> query = this.entityManager.createQuery("SELECT entity FROM Docente entity WHERE entity.idNumFunc = :idNumFunc", Docente.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Agenda> findAgenda(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<Agenda> query = this.entityManager.createQuery("SELECT entity FROM Agenda entity WHERE entity.docente2.idNumFunc = :idNumFunc", Agenda.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Agenda> findAgenda_2(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<Agenda> query = this.entityManager.createQuery("SELECT entity FROM Agenda entity WHERE entity.docente.idNumFunc = :idNumFunc", Agenda.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<AulaMinistrada> findAulaMinistrada(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<AulaMinistrada> query = this.entityManager.createQuery("SELECT entity FROM AulaMinistrada entity WHERE entity.docente2.idNumFunc = :idNumFunc", AulaMinistrada.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<AulaMinistrada> findAulaMinistrada_2(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<AulaMinistrada> query = this.entityManager.createQuery("SELECT entity FROM AulaMinistrada entity WHERE entity.docente.idNumFunc = :idNumFunc", AulaMinistrada.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Chamada> findChamada(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<Chamada> query = this.entityManager.createQuery("SELECT entity FROM Chamada entity WHERE entity.docente.idNumFunc = :idNumFunc", Chamada.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<DiarioEletronico> findDiarioEletronico(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<DiarioEletronico> query = this.entityManager.createQuery("SELECT entity FROM DiarioEletronico entity WHERE entity.docente.idNumFunc = :idNumFunc", DiarioEletronico.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<PresencaAluno> findPresencaAluno(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<PresencaAluno> query = this.entityManager.createQuery("SELECT entity FROM PresencaAluno entity WHERE entity.docente.idNumFunc = :idNumFunc", PresencaAluno.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<PresencaAluno> findPresencaAluno_2(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<PresencaAluno> query = this.entityManager.createQuery("SELECT entity FROM PresencaAluno entity WHERE entity.docente2.idNumFunc = :idNumFunc", PresencaAluno.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<UsuarioSistema> findUsuarioSistema(java.lang.Long idNumFunc, int limit, int offset) {
      TypedQuery<UsuarioSistema> query = this.entityManager.createQuery("SELECT entity FROM UsuarioSistema entity WHERE entity.docente.idNumFunc = :idNumFunc", UsuarioSistema.class);
      query.setParameter("idNumFunc", idNumFunc);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}