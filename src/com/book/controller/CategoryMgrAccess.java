package com.book.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.pojo.Category;
import com.book.service.BookService;

@WebServlet("/category_mgr")
public class CategoryMgrAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookService bookService = new BookService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// 调用服务，获取图书分类信息列表
		List<Category> categories = bookService.listCategories();
		// 把分类信息列表放入request中
		request.setAttribute("categories", categories);
		request.getRequestDispatcher("/WEB-INF/jsp/category_mgr.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
