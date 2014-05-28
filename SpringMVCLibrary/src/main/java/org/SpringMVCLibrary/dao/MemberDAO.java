package org.SpringMVCLibrary.dao;

import java.util.Set;

import org.SpringMVCLibrary.domain.Member;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Member entities.
 * 
 */
public interface MemberDAO extends JpaDao<Member> {

	/**
	 * JPQL Query - findMemberByBalance
	 *
	 */
	public Set<Member> findMemberByBalance(Integer balance) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByBalance
	 *
	 */
	public Set<Member> findMemberByBalance(Integer balance, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByContactNumberContaining
	 *
	 */
	public Set<Member> findMemberByContactNumberContaining(String contactNumber) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByContactNumberContaining
	 *
	 */
	public Set<Member> findMemberByContactNumberContaining(String contactNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByActive
	 *
	 */
	public Set<Member> findMemberByActive(Boolean active) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByActive
	 *
	 */
	public Set<Member> findMemberByActive(Boolean active, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByNameContaining
	 *
	 */
	public Set<Member> findMemberByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByNameContaining
	 *
	 */
	public Set<Member> findMemberByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddress2Containing
	 *
	 */
	public Set<Member> findMemberByAddress2Containing(String address2) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddress2Containing
	 *
	 */
	public Set<Member> findMemberByAddress2Containing(String address2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllMembers
	 *
	 */
	public Set<Member> findAllMembers() throws DataAccessException;

	/**
	 * JPQL Query - findAllMembers
	 *
	 */
	public Set<Member> findAllMembers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberById
	 *
	 */
	public Set<Member> findMemberById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findMemberById
	 *
	 */
	public Set<Member> findMemberById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddress
	 *
	 */
	public Set<Member> findMemberByAddress(String address) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddress
	 *
	 */
	public Set<Member> findMemberByAddress(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByPrimaryKey
	 *
	 */
	public Member findMemberByPrimaryKey(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByPrimaryKey
	 *
	 */
	public Member findMemberByPrimaryKey(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByContactNumber
	 *
	 */
	public Set<Member> findMemberByContactNumber(String contactNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByContactNumber
	 *
	 */
	public Set<Member> findMemberByContactNumber(String contactNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddress2
	 *
	 */
	public Set<Member> findMemberByAddress2(String address2_1) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddress2
	 *
	 */
	public Set<Member> findMemberByAddress2(String address2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByTown
	 *
	 */
	public Set<Member> findMemberByTown(String town) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByTown
	 *
	 */
	public Set<Member> findMemberByTown(String town, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByBookAllowance
	 *
	 */
	public Set<Member> findMemberByBookAllowance(Integer bookAllowance) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByBookAllowance
	 *
	 */
	public Set<Member> findMemberByBookAllowance(Integer bookAllowance, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddressContaining
	 *
	 */
	public Set<Member> findMemberByAddressContaining(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByAddressContaining
	 *
	 */
	public Set<Member> findMemberByAddressContaining(String address_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByTownContaining
	 *
	 */
	public Set<Member> findMemberByTownContaining(String town_1) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByTownContaining
	 *
	 */
	public Set<Member> findMemberByTownContaining(String town_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByName
	 *
	 */
	public Member findMemberByName(String name_2) throws DataAccessException;

	/**
	 * JPQL Query - findMemberByName
	 *
	 */
	public Member findMemberByName(String name_2, int startResult, int maxRows) throws DataAccessException;

}