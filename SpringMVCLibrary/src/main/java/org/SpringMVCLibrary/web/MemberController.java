package org.SpringMVCLibrary.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.SpringMVCLibrary.dao.MemberDAO;

import org.SpringMVCLibrary.domain.Member;

import org.SpringMVCLibrary.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Member entities
 * 
 */

@Controller("MemberController")
public class MemberController {

	/**
	 * DAO injected by Spring that manages Member entities
	 * 
	 */
	@Autowired
	private MemberDAO memberDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Member entities
	 * 
	 */
	@Autowired
	private MemberService memberService;

	/**
	 * Delete an existing Member entity
	 * 
	 */
	@RequestMapping("/deleteMember")
	public String deleteMember(@RequestParam String nameKey) {
		Member member = memberDAO.findMemberByPrimaryKey(nameKey);
		memberService.deleteMember(member);
		return "forward:/indexMember";
	}

	/**
	 * Save an existing Member entity
	 * 
	 */
	@RequestMapping("/saveMember")
	public String saveMember(@ModelAttribute Member member) {
		memberService.saveMember(member);
		return "forward:/indexMember";
	}

	/**
	 * Select an existing Member entity
	 * 
	 */
	@RequestMapping("/selectMember")
	public ModelAndView selectMember(@RequestParam String nameKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("member", memberDAO.findMemberByPrimaryKey(nameKey));
		mav.setViewName("member/viewMember.jsp");

		return mav;
	}

	/**
	 * Show all Member entities
	 * 
	 */
	@RequestMapping("/indexMember")
	public ModelAndView listMembers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("members", memberService.loadMembers());

		mav.setViewName("member/listMembers.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/memberController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the Member entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteMember")
	public ModelAndView confirmDeleteMember(@RequestParam String nameKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("member", memberDAO.findMemberByPrimaryKey(nameKey));
		mav.setViewName("member/deleteMember.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Member entities
	 * 
	 */
	public String indexMember() {
		return "redirect:/indexMember";
	}

	/**
	 * Edit an existing Member entity
	 * 
	 */
	@RequestMapping("/editMember")
	public ModelAndView editMember(@RequestParam String nameKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("member", memberDAO.findMemberByPrimaryKey(nameKey));
		mav.setViewName("member/editMember.jsp");

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
	 * Create a new Member entity
	 * 
	 */
	@RequestMapping("/newMember")
	public ModelAndView newMember() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("member", new Member());
		mav.addObject("newFlag", true);
		mav.setViewName("member/editMember.jsp");

		return mav;
	}
}