package com.action.item;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.action.TemplateCommand;
import com.model.AuctionDAO;
import com.model.AuctionDTO;
import com.model.UserDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class AuctionItemInsertCommand implements TemplateCommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse resonse) {
		// TODO Auto-generated method stub
		AuctionDAO dao = new AuctionDAO();
		AuctionDTO dto = new AuctionDTO();
		
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("user");
		
		String root = request.getSession().getServletContext().getRealPath("/");
		int maxSize  = 1024*1024*10;  
		String savePath = root + "img";
		System.out.println("[target-path]"+savePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(request, savePath);
			
			dto.setAuctioneer_id(user.getUserid());
			dto.setItem_name(multi.getParameter("item_name"));
			dto.setEnd_date(multi.getParameter("end_date"));
			dto.setCurrent_bid_amount(new Integer(multi.getParameter("current_bid_amount")));
			dto.setFile_name(multi.getOriginalFileName("upload_image"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		dto.setAuctioneer_id(user.getUserid());
//		dto.setItem_name(request.getParameter("item_name"));
//		dto.setEnd_date(request.getParameter("end_date"));
//		dto.setCurrent_bid_amount(Integer.parseInt(request.getParameter("current_bid_amount")));
		
		
		dao.insert(dto);
		System.out.println("[+]Auction Item is inserted");
		
		
		return "";
	}

}
