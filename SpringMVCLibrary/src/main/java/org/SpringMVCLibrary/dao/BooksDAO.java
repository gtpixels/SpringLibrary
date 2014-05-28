package org.SpringMVCLibrary.dao;

import java.util.Set;

import org.SpringMVCLibrary.domain.Books;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;


public interface BooksDAO extends JpaDao<Books> {

	
	public Books findBooksByPrimaryKey(Integer id) throws DataAccessException;

	
	public Books findBooksByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findBooksBySectionNumber(Integer sectionNumber) throws DataAccessException;

	
	public Set<Books> findBooksBySectionNumber(Integer sectionNumber, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findBooksByBookName(String bookName) throws DataAccessException;

	
	public Set<Books> findBooksByBookName(String bookName, int startResult, int maxRows) throws DataAccessException;

	
	public Books findBooksById(Integer id_1) throws DataAccessException;

	
	public Books findBooksById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findBooksByBookNameContaining(String bookName_1) throws DataAccessException;

	
	public Set<Books> findBooksByBookNameContaining(String bookName_1, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findBooksByIsbn(Integer isbn) throws DataAccessException;

	
	public Set<Books> findBooksByIsbn(Integer isbn, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findAllBookss() throws DataAccessException;

	
	public Set<Books> findAllBookss(int startResult, int maxRows) throws DataAccessException;


	public Set<Books> findBooksByQty(Integer qty) throws DataAccessException;

	
	public Set<Books> findBooksByQty(Integer qty, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findBooksByAuthorContaining(String author) throws DataAccessException;

	
	public Set<Books> findBooksByAuthorContaining(String author, int startResult, int maxRows) throws DataAccessException;

	
	
	public Set<Books> findBooksByAuthor(String author_1) throws DataAccessException;

	
	public Set<Books> findBooksByAuthor(String author_1, int startResult, int maxRows) throws DataAccessException;

	
	public Set<Books> findBooksByGenre(Integer genre) throws DataAccessException;

	
	public Set<Books> findBooksByGenre(Integer genre, int startResult, int maxRows) throws DataAccessException;

}