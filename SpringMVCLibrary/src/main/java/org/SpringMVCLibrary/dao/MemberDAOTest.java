package org.SpringMVCLibrary.dao;

import org.SpringMVCLibrary.domain.Member;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.Rollback;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./src/main/resources/SpringMVCLibrary-security-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-service-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-dao-context.xml",
		"file:./src/main/resources/SpringMVCLibrary-web-context.xml" })
public class MemberDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	 */
	private MemberDAO dataStore;

	/**
	 * Instantiates a new MemberDAOTest.
	 *
	 */
	public MemberDAOTest() {
	}

	/**
	 * Method to test Member domain object.
	 *
	 */
	@Rollback(false)
	@Test
	public void Member() {
		Member instance = new Member();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	 */
	@Autowired
	public void setDataStore(MemberDAO dataStore) {
		this.dataStore = dataStore;
	}
}
