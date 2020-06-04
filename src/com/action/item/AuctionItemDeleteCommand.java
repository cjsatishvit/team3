package com.action.item;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.action.TemplateCommand;
import com.model.AuctionDAO;
import com.model.AuctionDTO;

public class AuctionItemDeleteCommand implements TemplateCommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse resonse) {
		// TODO Auto-generated method stub
		AuctionDAO dao = new AuctionDAO();
		String auction_id = request.getParameter("auction_id");
		
		dao.delete(auction_id);
		System.out.println("[-]Auction Item is Deleted(auction_id: "+auction_id+")");
		
		return "";
	}

}
