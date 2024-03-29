package org.SpringMVCLibrary.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.SpringMVCLibrary.dao.BooksDAO;

import org.SpringMVCLibrary.domain.Books;

import org.SpringMVCLibrary.service.BooksService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Books entities
 * 
 */

@Controller("BooksController")
public class BooksController {

	/**
	 * DAO injected by Spring that manages Books entities
	 * 
	 */
	@Autowired
	private BooksDAO booksDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Books entities
	 * 
	 */
	@Autowired
	private BooksService booksService;

	/**
	 * Select an existing Books entity
	 * 
	 */
	@RequestMapping("/selectBooks")
	public ModelAndView selectBooks(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();
		
		

		mav.addObject("books", booksDAO.findBooksByPrimaryKey(idKey));
		mav.setViewName("books/viewBooks.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/booksController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all Books entities
	 * 
	 */
	public String indexBooks() {
		return "redirect:/indexBooks";
	}

	/**
	 * Edit an existing Books entity
	 * 
	 */
	@RequestMapping("/editBooks")
	public ModelAndView editBooks(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("books", booksDAO.findBooksByPrimaryKey(idKey));
		mav.setViewName("books/editBooks.jsp");

		return mav;
	}

	/**
	 * Save an existing Books entity
	 * 
	 */
	@RequestMapping("/saveBooks")
	public String saveBooks(@ModelAttribute Books books) {
		booksService.saveBooks(books);
		return "forward:/indexBooks";
	}

	/**
	 * Create a new Books entity
	 * 
	 */
	@RequestMapping("/newBooks")
	public ModelAndView newBooks() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("books", new Books());
		mav.addObject("newFlag", true);
		mav.setViewName("books/editBooks.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Delete an existing Books entity
	 * 
	 */
	@RequestMapping("/deleteBooks")
	public String deleteBooks(@RequestParam Integer idKey) {
		Books books = booksDAO.findBooksByPrimaryKey(idKey);
		booksService.deleteBooks(books);
		return "forward:/indexBooks";
	}

	/**
	 * Select the Books entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBooks")
	public ModelAndView confirmDeleteBooks(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("books", booksDAO.findBooksByPrimaryKey(idKey));
		mav.setViewName("books/deleteBooks.jsp");

		return mav;
	}

	/**
	 * Show all Books entities
	 * 
	 */
	@RequestMapping("/indexBooks")
	public ModelAndView listBookss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bookss", booksService.loadBookss());

		mav.setViewName("books/listBookss.jsp");

		return mav;
	}
	
	//Spring Security see this :
		
}