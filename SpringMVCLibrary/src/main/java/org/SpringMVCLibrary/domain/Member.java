package org.SpringMVCLibrary.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllMembers", query = "select myMember from Member myMember"),
		@NamedQuery(name = "findMemberByActive", query = "select myMember from Member myMember where myMember.active = ?1"),
		@NamedQuery(name = "findMemberByAddress", query = "select myMember from Member myMember where myMember.address = ?1"),
		@NamedQuery(name = "findMemberByAddress2", query = "select myMember from Member myMember where myMember.address2 = ?1"),
		@NamedQuery(name = "findMemberByAddress2Containing", query = "select myMember from Member myMember where myMember.address2 like ?1"),
		@NamedQuery(name = "findMemberByAddressContaining", query = "select myMember from Member myMember where myMember.address like ?1"),
		@NamedQuery(name = "findMemberByBalance", query = "select myMember from Member myMember where myMember.balance = ?1"),
		@NamedQuery(name = "findMemberByBookAllowance", query = "select myMember from Member myMember where myMember.bookAllowance = ?1"),
		@NamedQuery(name = "findMemberByContactNumber", query = "select myMember from Member myMember where myMember.contactNumber = ?1"),
		@NamedQuery(name = "findMemberByContactNumberContaining", query = "select myMember from Member myMember where myMember.contactNumber like ?1"),
		@NamedQuery(name = "findMemberById", query = "select myMember from Member myMember where myMember.id = ?1"),
		@NamedQuery(name = "findMemberByName", query = "select myMember from Member myMember where myMember.name = ?1"),
		@NamedQuery(name = "findMemberByNameContaining", query = "select myMember from Member myMember where myMember.name like ?1"),
		@NamedQuery(name = "findMemberByPrimaryKey", query = "select myMember from Member myMember where myMember.name = ?1"),
		@NamedQuery(name = "findMemberByTown", query = "select myMember from Member myMember where myMember.town = ?1"),
		@NamedQuery(name = "findMemberByTownContaining", query = "select myMember from Member myMember where myMember.town like ?1") })
@Table(catalog = "Library", name = "Member")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "SpringMVCLibrary/org/SpringMVCLibrary/domain", name = "Member")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue
	@XmlElement
	Integer id;

	@Column(name = "Name", length = 999, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	

	@Column(name = "Address", length = 999, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	

	@Column(name = "Address2", length = 999, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address2;
	

	@Column(name = "Town", length = 999, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String town;
	

	@Column(name = "ContactNumber", length = 999, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactNumber;
	

	@Column(name = "bookAllowance", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer bookAllowance;
	

	@Column(name = "balance", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer balance;
	

	@Column(name = "Active", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean active;
	

	

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return this.name;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getAddress() {
		return this.address;
	}

	
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	
	public String getAddress2() {
		return this.address2;
	}

	
	public void setTown(String town) {
		this.town = town;
	}

	
	public String getTown() {
		return this.town;
	}

	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	public String getContactNumber() {
		return this.contactNumber;
	}

	
	public void setBookAllowance(Integer bookAllowance) {
		this.bookAllowance = bookAllowance;
	}

	
	public Integer getBookAllowance() {
		return this.bookAllowance;
	}

	
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	
	public Integer getBalance() {
		return this.balance;
	}

	
	public void setActive(Boolean active) {
		this.active = active;
	}

	
	public Boolean getActive() {
		return this.active;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getId() {
		return this.id;
	}

	
	public Member() {
	}

	
	public void copy(Member that) {
		setName(that.getName());
		setAddress(that.getAddress());
		setAddress2(that.getAddress2());
		setTown(that.getTown());
		setContactNumber(that.getContactNumber());
		setBookAllowance(that.getBookAllowance());
		setBalance(that.getBalance());
		setActive(that.getActive());
		setId(that.getId());
	}

	
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("name=[").append(name).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("address2=[").append(address2).append("] ");
		buffer.append("town=[").append(town).append("] ");
		buffer.append("contactNumber=[").append(contactNumber).append("] ");
		buffer.append("bookAllowance=[").append(bookAllowance).append("] ");
		buffer.append("balance=[").append(balance).append("] ");
		buffer.append("active=[").append(active).append("] ");
		buffer.append("id=[").append(id).append("] ");

		return buffer.toString();
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((name == null) ? 0 : name.hashCode()));
		return result;
	}

	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Member))
			return false;
		Member equalCheck = (Member) obj;
		if ((name == null && equalCheck.name != null) || (name != null && equalCheck.name == null))
			return false;
		if (name != null && !name.equals(equalCheck.name))
			return false;
		return true;
	}
}
