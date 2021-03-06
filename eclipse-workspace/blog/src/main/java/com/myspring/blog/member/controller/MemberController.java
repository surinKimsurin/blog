package com.myspring.blog.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.blog.member.vo.MemberVO;

public interface MemberController {
	
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ResponseEntity register(@ModelAttribute("memberVO") MemberVO _memberVO,
			HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView login(@RequestParam Map<String,String> loginMap, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView registerForm(HttpServletRequest request, HttpServletResponse response)throws Exception;
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ResponseEntity overlapped(@RequestParam("id")String id, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
