package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class DisciplinaDAO extends BasicDAO<String, Disciplina> implements Serializable {

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
  public DisciplinaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Disciplina utilizando os identificadores
   * 
   * @param idDisciplina
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idDisciplina){
      Query query = this.entityManager.createQuery("DELETE FROM Disciplina entity WHERE entity.idDisciplina = :idDisciplina");
      query.setParameter("idDisciplina", idDisciplina);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Disciplina utilizando os identificadores
   * 
   * @param idDisciplina
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Disciplina findById(java.lang.String idDisciplina){
      TypedQuery<Disciplina> query = this.entityManager.createQuery("SELECT entity FROM Disciplina entity WHERE entity.idDisciplina = :idDisciplina", Disciplina.class);
      query.setParameter("idDisciplina", idDisciplina);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<DisciplinaxBarema> findDisciplinaxBarema(java.lang.String idDisciplina, int limit, int offset) {
      TypedQuery<DisciplinaxBarema> query = this.entityManager.createQuery("SELECT entity FROM DisciplinaxBarema entity WHERE entity.idDisciplina.idDisciplina = :idDisciplina", DisciplinaxBarema.class);
      query.setParameter("idDisciplina", idDisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Subdisciplina> findSubdisciplina(java.lang.String idDisciplina, int limit, int offset) {
      TypedQuery<Subdisciplina> query = this.entityManager.createQuery("SELECT entity FROM Subdisciplina entity WHERE entity.disciplina.idDisciplina = :idDisciplina", Subdisciplina.class);
      query.setParameter("idDisciplina", idDisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Subdisciplina> findSubdisciplina_2(java.lang.String idDisciplina, int limit, int offset) {
      TypedQuery<Subdisciplina> query = this.entityManager.createQuery("SELECT entity FROM Subdisciplina entity WHERE entity.disciplina2.idDisciplina = :idDisciplina", Subdisciplina.class);
      query.setParameter("idDisciplina", idDisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Turma> findTurma(java.lang.String idDisciplina, int limit, int offset) {
      TypedQuery<Turma> query = this.entityManager.createQuery("SELECT entity FROM Turma entity WHERE entity.disciplina.idDisciplina = :idDisciplina", Turma.class);
      query.setParameter("idDisciplina", idDisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<BaremaAvaliacao> listBaremaAvaliacao(java.lang.String idDisciplina, int limit, int offset) {
      TypedQuery<BaremaAvaliacao> query = this.entityManager.createQuery("SELECT entity.idGBaremaAvaliacao FROM DisciplinaxBarema entity WHERE entity.idDisciplina.idDisciplina = :idDisciplina", BaremaAvaliacao.class);
      query.setParameter("idDisciplina", idDisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteBaremaAvaliacao(java.lang.String instanceIdDisciplina, java.lang.String relationId) {
    Query query = this.entityManager.createQuery("DELETE FROM DisciplinaxBarema entity WHERE entity.idDisciplina.idDisciplina = :instanceIdDisciplina AND entity.idGBaremaAvaliacao.id = :relationId");
    query.setParameter("instanceIdDisciplina", instanceIdDisciplina);
    query.setParameter("relationId", relationId);
    return query.executeUpdate();	  
  }
  
}