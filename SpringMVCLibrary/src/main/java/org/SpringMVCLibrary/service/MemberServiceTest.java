package org.SpringMVCLibrary.service;

import java.util.List;
import java.util.Set;

import org.SpringMVCLibrary.domain.Member;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/SpringMVCLibrary-security-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-service-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-dao-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-web-context.xml" })
@Transactional
public class MemberServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected MemberService service;

	/**
	 * Instantiates a new MemberServiceTest.
	 *
	 */
	public MemberServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findMemberByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findMemberByPrimaryKey 
		String name = null;
		Member response = null;
		response = service.findMemberByPrimaryKey(name);
		// TODO: JUnit - Add assertions to test outputs of operation: findMemberByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Member entity
	 * 
	 */
	@Test
	public void findAllMembers() {
		// TODO: JUnit - Populate test inputs for operation: findAllMembers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Member> response = null;
		response = service.findAllMembers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllMembers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Member entity
	 * 
	 */
	@Test
	public void deleteMember() {
		// TODO: JUnit - Populate test inputs for operation: deleteMember 
		Member member = new org.SpringMVCLibrary.domain.Member();
		service.deleteMember(member);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Member entity
	 * 
	 */
	@Test
	public void countMembers() {
		Integer response = null;
		response = service.countMembers();
		// TODO: JUnit - Add assertions to test outputs of operation: countMembers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Member entity
	 * 
	 */
	@Test
	public void saveMember() {
		// TODO: JUnit - Populate test inputs for operation: saveMember 
		Member member_1 = new org.SpringMVCLibrary.domain.Member();
		service.saveMember(member_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Member entity
	 * 
	 */
	@Test
	public void loadMembers() {
		Set<Member> response = null;
		response = service.loadMembers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadMembers
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
