package org.SpringMVCLibrary.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>MemberController</code> controller.
 *
 * @see org.SpringMVCLibrary.web.MemberController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/SpringMVCLibrary-security-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-service-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-dao-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-web-context.xml" })
public class MemberControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteMember()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteMember() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteMember");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>memberControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetmemberControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/memberController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		MemberController controller = (MemberController) context.getBean("MemberController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}