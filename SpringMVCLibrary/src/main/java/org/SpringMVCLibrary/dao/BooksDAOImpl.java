package org.SpringMVCLibrary.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.SpringMVCLibrary.domain.Books;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Books entities.
 * 
 */
@Repository("BooksDAO")
@Transactional
public class BooksDAOImpl extends AbstractJpaDao<Books> implements BooksDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Books.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MYSQLLibrary
	 *
	 */
	@PersistenceContext(unitName = "MYSQLLibrary")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BooksDAOImpl
	 *
	 */
	public BooksDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	
	@Transactional
	public Books findBooksByPrimaryKey(Integer id) throws DataAccessException {

		return findBooksByPrimaryKey(id, -1, -1);
	}

	

	@Transactional
	public Books findBooksByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBooksByPrimaryKey", startResult, maxRows, id);
			return (org.SpringMVCLibrary.domain.Books) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	
	@Transactional
	public Set<Books> findBooksBySectionNumber(Integer sectionNumber) throws DataAccessException {

		return findBooksBySectionNumber(sectionNumber, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksBySectionNumber(Integer sectionNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksBySectionNumber", startResult, maxRows, sectionNumber);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findBooksByBookName(String bookName) throws DataAccessException {

		return findBooksByBookName(bookName, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByBookName(String bookName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByBookName", startResult, maxRows, bookName);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Books findBooksById(Integer id) throws DataAccessException {

		return findBooksById(id, -1, -1);
	}

	

	@Transactional
	public Books findBooksById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBooksById", startResult, maxRows, id);
			return (org.SpringMVCLibrary.domain.Books) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	
	@Transactional
	public Set<Books> findBooksByBookNameContaining(String bookName) throws DataAccessException {

		return findBooksByBookNameContaining(bookName, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByBookNameContaining(String bookName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByBookNameContaining", startResult, maxRows, bookName);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findBooksByIsbn(Integer isbn) throws DataAccessException {

		return findBooksByIsbn(isbn, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByIsbn(Integer isbn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByIsbn", startResult, maxRows, isbn);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findAllBookss() throws DataAccessException {

		return findAllBookss(-1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findAllBookss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBookss", startResult, maxRows);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findBooksByQty(Integer qty) throws DataAccessException {

		return findBooksByQty(qty, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByQty(Integer qty, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByQty", startResult, maxRows, qty);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findBooksByAuthorContaining(String author) throws DataAccessException {

		return findBooksByAuthorContaining(author, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByAuthorContaining(String author, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByAuthorContaining", startResult, maxRows, author);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findBooksByAuthor(String author) throws DataAccessException {

		return findBooksByAuthor(author, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByAuthor(String author, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByAuthor", startResult, maxRows, author);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	@Transactional
	public Set<Books> findBooksByGenre(Integer genre) throws DataAccessException {

		return findBooksByGenre(genre, -1, -1);
	}

	

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Books> findBooksByGenre(Integer genre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBooksByGenre", startResult, maxRows, genre);
		return new LinkedHashSet<Books>(query.getResultList());
	}

	
	public boolean canBeMerged(Books entity) {
		return true;
	}
}
