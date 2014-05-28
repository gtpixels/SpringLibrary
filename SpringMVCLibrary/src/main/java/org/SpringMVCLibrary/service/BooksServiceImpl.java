package org.SpringMVCLibrary.service;

import java.util.List;
import java.util.Set;

import org.SpringMVCLibrary.dao.BooksDAO;

import org.SpringMVCLibrary.domain.Books;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Books entities
 * 
 */

@Service("BooksService")
@Transactional
public class BooksServiceImpl implements BooksService {

	/**
	 * DAO injected by Spring that manages Books entities
	 * 
	 */
	@Autowired
	private BooksDAO booksDAO;

	/**
	 * Instantiates a new BooksServiceImpl.
	 *
	 */
	public BooksServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Books findBooksByPrimaryKey(Integer id) {
		return booksDAO.findBooksByPrimaryKey(id);
	}

	/**
	 * Return a count of all Books entity
	 * 
	 */
	@Transactional
	public Integer countBookss() {
		return ((Long) booksDAO.createQuerySingleResult("select count(o) from Books o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Books entity
	 * 
	 */
	@Transactional
	public Set<Books> loadBookss() {
		return booksDAO.findAllBookss();
	}

	/**
	 * Return all Books entity
	 * 
	 */
	@Transactional
	public List<Books> findAllBookss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Books>(booksDAO.findAllBookss(startResult, maxRows));
	}

	/**
	 * Delete an existing Books entity
	 * 
	 */
	@Transactional
	public void deleteBooks(Books books) {
		booksDAO.remove(books);
		booksDAO.flush();
	}

	/**
	 * Save an existing Books entity
	 * 
	 */
	@Transactional
	public void saveBooks(Books books) {
		Books existingBooks = booksDAO.findBooksByPrimaryKey(books.getId());

		if (existingBooks != null) {
			if (existingBooks != books) {
				existingBooks.setId(books.getId());
				existingBooks.setBookName(books.getBookName());
				existingBooks.setAuthor(books.getAuthor());
				existingBooks.setQty(books.getQty());
				existingBooks.setGenre(books.getGenre());
				existingBooks.setIsbn(books.getIsbn());
				existingBooks.setSectionNumber(books.getSectionNumber());
			}
			books = booksDAO.store(existingBooks);
		} else {
			books = booksDAO.store(books);
		}
		booksDAO.flush();
	}
}
