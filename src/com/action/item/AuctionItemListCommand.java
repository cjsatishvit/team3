package com.action.item;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.action.TemplateCommand;
import com.model.AuctionDAO;
import com.model.AuctionDTO;

public class AuctionItemListCommand implements TemplateCommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse resonse) {
		// TODO Auto-generated method stub
		AuctionDAO dao = new AuctionDAO();
		
		ArrayList<AuctionDTO> list = dao.getAll();
		System.out.println("[Auction-Item-List]length: "+ list.size());
		
		request.setAttribute("list", list);
		
		return "";
	}

}
