package org.SpringMVCLibrary.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllBookss", query = "select myBooks from Books myBooks"),
		@NamedQuery(name = "findBooksByAuthor", query = "select myBooks from Books myBooks where myBooks.author = ?1"),
		@NamedQuery(name = "findBooksByAuthorContaining", query = "select myBooks from Books myBooks where myBooks.author like ?1"),
		@NamedQuery(name = "findBooksByBookName", query = "select myBooks from Books myBooks where myBooks.bookName = ?1"),
		@NamedQuery(name = "findBooksByBookNameContaining", query = "select myBooks from Books myBooks where myBooks.bookName like ?1"),
		@NamedQuery(name = "findBooksByGenre", query = "select myBooks from Books myBooks where myBooks.genre = ?1"),
		@NamedQuery(name = "findBooksById", query = "select myBooks from Books myBooks where myBooks.id = ?1"),
		@NamedQuery(name = "findBooksByIsbn", query = "select myBooks from Books myBooks where myBooks.isbn = ?1"),
		@NamedQuery(name = "findBooksByPrimaryKey", query = "select myBooks from Books myBooks where myBooks.id = ?1"),
		@NamedQuery(name = "findBooksByQty", query = "select myBooks from Books myBooks where myBooks.qty = ?1"),
		@NamedQuery(name = "findBooksBySectionNumber", query = "select myBooks from Books myBooks where myBooks.sectionNumber = ?1") })
@Table(catalog = "Library", name = "books")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "SpringMVCLibrary/org/SpringMVCLibrary/domain", name = "Books")
public class Books implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "book_name", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bookName;
	/**
	 */

	@Column(name = "author", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String author;
	/**
	 */

	@Column(name = "qty", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer qty;
	/**
	 */

	@Column(name = "genre", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer genre;
	/**
	 */

	@Column(name = "ISBN", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer isbn;
	/**
	 */

	@Column(name = "Section_Number", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer sectionNumber;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 */
	public String getBookName() {
		return this.bookName;
	}

	/**
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 */
	public String getAuthor() {
		return this.author;
	}

	/**
	 */
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	/**
	 */
	public Integer getQty() {
		return this.qty;
	}

	/**
	 */
	public void setGenre(Integer genre) {
		this.genre = genre;
	}

	/**
	 */
	public Integer getGenre() {
		return this.genre;
	}

	/**
	 */
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	/**
	 */
	public Integer getIsbn() {
		return this.isbn;
	}

	/**
	 */
	public void setSectionNumber(Integer sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	/**
	 */
	public Integer getSectionNumber() {
		return this.sectionNumber;
	}

	/**
	 */
	public Books() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Books that) {
		setId(that.getId());
		setBookName(that.getBookName());
		setAuthor(that.getAuthor());
		setQty(that.getQty());
		setGenre(that.getGenre());
		setIsbn(that.getIsbn());
		setSectionNumber(that.getSectionNumber());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("bookName=[").append(bookName).append("] ");
		buffer.append("author=[").append(author).append("] ");
		buffer.append("qty=[").append(qty).append("] ");
		buffer.append("genre=[").append(genre).append("] ");
		buffer.append("isbn=[").append(isbn).append("] ");
		buffer.append("sectionNumber=[").append(sectionNumber).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Books))
			return false;
		Books equalCheck = (Books) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
