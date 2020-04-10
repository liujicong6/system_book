package com.book.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.book.pojo.BookInfo;
import com.book.pojo.Category;
import com.book.service.BookService;
import com.mysql.jdbc.StringUtils;


@WebServlet("/book_mgr")
public class mgrAccess extends HttpServlet {
	private BookService bookService = new BookService();
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	//	
		List<Category> categories=bookService.listCategories();
		request.setAttribute("categories", categories);
		
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/book_mgr.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
