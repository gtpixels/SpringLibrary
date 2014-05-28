package org.SpringMVCLibrary.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.SpringMVCLibrary.domain.Member;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Member entities.
 * 
 */
@Repository("MemberDAO")
@Transactional
public class MemberDAOImpl extends AbstractJpaDao<Member> implements MemberDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Member.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MYSQLLibrary
	 *
	 */
	@PersistenceContext(unitName = "MYSQLLibrary")
	private EntityManager entityManager;

	/**
	 * Instantiates a new MemberDAOImpl
	 *
	 */
	public MemberDAOImpl() {
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

	/**
	 * JPQL Query - findMemberByBalance
	 *
	 */
	@Transactional
	public Set<Member> findMemberByBalance(Integer balance) throws DataAccessException {

		return findMemberByBalance(balance, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByBalance
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByBalance(Integer balance, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByBalance", startResult, maxRows, balance);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByContactNumberContaining
	 *
	 */
	@Transactional
	public Set<Member> findMemberByContactNumberContaining(String contactNumber) throws DataAccessException {

		return findMemberByContactNumberContaining(contactNumber, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByContactNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByContactNumberContaining(String contactNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByContactNumberContaining", startResult, maxRows, contactNumber);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByActive
	 *
	 */
	@Transactional
	public Set<Member> findMemberByActive(Boolean active) throws DataAccessException {

		return findMemberByActive(active, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByActive
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByActive(Boolean active, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByActive", startResult, maxRows, active);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByNameContaining
	 *
	 */
	@Transactional
	public Set<Member> findMemberByNameContaining(String name) throws DataAccessException {

		return findMemberByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByAddress2Containing
	 *
	 */
	@Transactional
	public Set<Member> findMemberByAddress2Containing(String address2) throws DataAccessException {

		return findMemberByAddress2Containing(address2, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByAddress2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByAddress2Containing(String address2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByAddress2Containing", startResult, maxRows, address2);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllMembers
	 *
	 */
	@Transactional
	public Set<Member> findAllMembers() throws DataAccessException {

		return findAllMembers(-1, -1);
	}

	/**
	 * JPQL Query - findAllMembers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findAllMembers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllMembers", startResult, maxRows);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberById
	 *
	 */
	@Transactional
	public Set<Member> findMemberById(Integer id) throws DataAccessException {

		return findMemberById(id, -1, -1);
	}

	/**
	 * JPQL Query - findMemberById
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberById(Integer id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberById", startResult, maxRows, id);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByAddress
	 *
	 */
	@Transactional
	public Set<Member> findMemberByAddress(String address) throws DataAccessException {

		return findMemberByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByPrimaryKey
	 *
	 */
	@Transactional
	public Member findMemberByPrimaryKey(String name) throws DataAccessException {

		return findMemberByPrimaryKey(name, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByPrimaryKey
	 *
	 */

	@Transactional
	public Member findMemberByPrimaryKey(String name, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMemberByPrimaryKey", startResult, maxRows, name);
			return (org.SpringMVCLibrary.domain.Member) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findMemberByContactNumber
	 *
	 */
	@Transactional
	public Set<Member> findMemberByContactNumber(String contactNumber) throws DataAccessException {

		return findMemberByContactNumber(contactNumber, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByContactNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByContactNumber(String contactNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByContactNumber", startResult, maxRows, contactNumber);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByAddress2
	 *
	 */
	@Transactional
	public Set<Member> findMemberByAddress2(String address2) throws DataAccessException {

		return findMemberByAddress2(address2, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByAddress2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByAddress2(String address2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByAddress2", startResult, maxRows, address2);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByTown
	 *
	 */
	@Transactional
	public Set<Member> findMemberByTown(String town) throws DataAccessException {

		return findMemberByTown(town, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByTown
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByTown(String town, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByTown", startResult, maxRows, town);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByBookAllowance
	 *
	 */
	@Transactional
	public Set<Member> findMemberByBookAllowance(Integer bookAllowance) throws DataAccessException {

		return findMemberByBookAllowance(bookAllowance, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByBookAllowance
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByBookAllowance(Integer bookAllowance, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByBookAllowance", startResult, maxRows, bookAllowance);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByAddressContaining
	 *
	 */
	@Transactional
	public Set<Member> findMemberByAddressContaining(String address) throws DataAccessException {

		return findMemberByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByTownContaining
	 *
	 */
	@Transactional
	public Set<Member> findMemberByTownContaining(String town) throws DataAccessException {

		return findMemberByTownContaining(town, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByTownContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Member> findMemberByTownContaining(String town, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findMemberByTownContaining", startResult, maxRows, town);
		return new LinkedHashSet<Member>(query.getResultList());
	}

	/**
	 * JPQL Query - findMemberByName
	 *
	 */
	@Transactional
	public Member findMemberByName(String name) throws DataAccessException {

		return findMemberByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findMemberByName
	 *
	 */

	@Transactional
	public Member findMemberByName(String name, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findMemberByName", startResult, maxRows, name);
			return (org.SpringMVCLibrary.domain.Member) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Member entity) {
		return true;
	}
}
