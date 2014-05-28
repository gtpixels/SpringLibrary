package org.SpringMVCLibrary.service;

import java.util.List;
import java.util.Set;

import org.SpringMVCLibrary.dao.MemberDAO;

import org.SpringMVCLibrary.domain.Member;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Member entities
 * 
 */

@Service("MemberService")
@Transactional
public class MemberServiceImpl implements MemberService {

	/**
	 * DAO injected by Spring that manages Member entities
	 * 
	 */
	@Autowired
	private MemberDAO memberDAO;

	/**
	 * Instantiates a new MemberServiceImpl.
	 *
	 */
	public MemberServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Member findMemberByPrimaryKey(String name) {
		return memberDAO.findMemberByPrimaryKey(name);
	}

	/**
	 * Return all Member entity
	 * 
	 */
	@Transactional
	public List<Member> findAllMembers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Member>(memberDAO.findAllMembers(startResult, maxRows));
	}

	/**
	 * Delete an existing Member entity
	 * 
	 */
	@Transactional
	public void deleteMember(Member member) {
		memberDAO.remove(member);
		memberDAO.flush();
	}

	/**
	 * Return a count of all Member entity
	 * 
	 */
	@Transactional
	public Integer countMembers() {
		return ((Long) memberDAO.createQuerySingleResult("select count(o) from Member o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Member entity
	 * 
	 */
	@Transactional
	public void saveMember(Member member) {
		Member existingMember = memberDAO.findMemberByPrimaryKey(member.getName());

		if (existingMember != null) {
			if (existingMember != member) {
				existingMember.setName(member.getName());
				existingMember.setAddress(member.getAddress());
				existingMember.setAddress2(member.getAddress2());
				existingMember.setTown(member.getTown());
				existingMember.setContactNumber(member.getContactNumber());
				existingMember.setBookAllowance(member.getBookAllowance());
				existingMember.setBalance(member.getBalance());
				existingMember.setActive(member.getActive());
				existingMember.setId(member.getId());
			}
			member = memberDAO.store(existingMember);
		} else {
			member = memberDAO.store(member);
		}
		memberDAO.flush();
	}

	/**
	 * Load an existing Member entity
	 * 
	 */
	@Transactional
	public Set<Member> loadMembers() {
		return memberDAO.findAllMembers();
	}
}
