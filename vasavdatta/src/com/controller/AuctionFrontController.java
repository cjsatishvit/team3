package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.action.TemplateCommand;
import com.action.item.AuctionItemDeleteCommand;
import com.action.item.AuctionItemInsertCommand;
import com.action.item.AuctionItemListCommand;
import com.action.user.UserDeleteCommand;
import com.action.user.UserListCommand;
import com.action.user.UserLoginCommand;
import com.action.user.UserMainCommand;


/**
 * Servlet implementation class AuctionFrontController
 */
@WebServlet("*.do")
public class AuctionFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String com = requestURI.substring(contextPath.length());
		
		TemplateCommand command = null;
		String nextPage = null;
		

		HttpSession session = request.getSession();
		
		if(com.equals("/login.do")) {
			command = new UserLoginCommand();
			nextPage = command.execute(request, response);
		}
		
		// TODO: filter????
		if(session == null || session.getAttribute("user") == null) {
			System.out.println("[Session]expired some way...");
			nextPage = "login.jsp";
		} else {
			if(com.equals("/main.do")) {
				command = new UserMainCommand();
				command.execute(request, response);
				nextPage = "main.jsp";
			}
			if(com.equals("/userManage.do")) {
				command = new UserListCommand();
				command.execute(request, response);
				nextPage = "userManage.jsp";
			}
			if(com.equals("/userDelete.do")) {
				command = new UserDeleteCommand();
				command.execute(request, response);
				nextPage = "userManage.do";
			}
			if(com.equals("/auctionManage.do")) {
				command = new AuctionItemListCommand();
				command.execute(request, response);
				nextPage = "auctionManage.jsp";
			}
			if(com.equals("/auctionList.do")) {
				command = new AuctionItemListCommand();
				command.execute(request, response);
				nextPage = "auctionList.jsp";
			}
			
			if(com.equals("/auctionItemDelete.do")) {
				command = new AuctionItemDeleteCommand();
				command.execute(request, response);
				nextPage = "auctionManage.do";
			}
			
			if(com.equals("/auctionItemInsertForm.do")) {
				nextPage = "auctionItemInsert.jsp";
			}
			
			if(com.equals("/auctionItemInsert.do")) {
				command = new AuctionItemInsertCommand();
				command.execute(request, response);
				nextPage = "auctionList.do";
			}
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
	}

}
