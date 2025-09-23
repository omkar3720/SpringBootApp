package com.cjc.springbootcrudapp.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springbootcrudapp.app1.model.Author;
import com.cjc.springbootcrudapp.app1.servicei.AuthorServiceI;

@Controller
public class AuthorController 
{
@Autowired
AuthorServiceI asi;

@RequestMapping("/")
public String prelogin()
{
	System.out.println("Open login page");
	return "login";
}
@RequestMapping("/openregisterpage")
public String preregister()
{
	System.out.println("Open register page");
	return "register";
}
@RequestMapping("/save")
public String saveAuthor(@ModelAttribute Author a,Model m)
{
	System.out.println("In Controller");
	asi.saveAuthor(a);
	return "login";
}
@RequestMapping("/login")
public String loginAuthor(@RequestParam("username")String username,@RequestParam("password")String password ,Model m)
{
	List<Author> l = asi.loginAuthor(username,password);
	if(!l.isEmpty())
	{
		m.addAttribute("data", l);
		return "success";
	}
	else
	{
		return "login";
	}
}
@RequestMapping("/delete")
public String deleteAuthor(@RequestParam("id")int id,Model m)
{
	List<Author> l = asi.deleteAuthor(id);
	m.addAttribute("data", l);
	return "success";
}
@RequestMapping("/edit")
public String editAuthor(@RequestParam("id")int id,Model m)
{
	Author a = asi.editAuthor(id);
	m.addAttribute("au", a);
	return "edit";
}
@RequestMapping("/update")
public String updateAuthor(@ModelAttribute Author a,Model m)
{
	List<Author> l = asi.updateAuthor(a);
	m.addAttribute("data", l);
	return "success";
}
}
