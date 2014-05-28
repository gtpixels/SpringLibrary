package org.SpringMVCLibrary.service;

import java.util.List;
import java.util.Set;

import org.SpringMVCLibrary.domain.Member;

/**
 * Spring service that handles CRUD requests for Member entities
 * 
 */
public interface MemberService {

	/**
	 */
	public Member findMemberByPrimaryKey(String name);

	/**
	 * Return all Member entity
	 * 
	 */
	public List<Member> findAllMembers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Member entity
	 * 
	 */
	public void deleteMember(Member member);

	/**
	 * Return a count of all Member entity
	 * 
	 */
	public Integer countMembers();

	/**
	 * Save an existing Member entity
	 * 
	 */
	public void saveMember(Member member_1);

	/**
	 * Load an existing Member entity
	 * 
	 */
	public Set<Member> loadMembers();
}