package org.SpringMVCLibrary.service;

import java.util.List;
import java.util.Set;

import org.SpringMVCLibrary.domain.Books;

/**
 * Spring service that handles CRUD requests for Books entities
 * 
 */
public interface BooksService {

	/**
	 */
	public Books findBooksByPrimaryKey(Integer id);

	/**
	 * Return a count of all Books entity
	 * 
	 */
	public Integer countBookss();

	/**
	 * Load an existing Books entity
	 * 
	 */
	public Set<Books> loadBookss();

	/**
	 * Return all Books entity
	 * 
	 */
	public List<Books> findAllBookss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Books entity
	 * 
	 */
	public void deleteBooks(Books books);

	/**
	 * Save an existing Books entity
	 * 
	 */
	public void saveBooks(Books books_1);
}