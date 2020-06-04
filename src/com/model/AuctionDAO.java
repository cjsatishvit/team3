package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuctionDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	
	public AuctionDAO() {
		super();
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<AuctionDTO> getAll() {
		ArrayList<AuctionDTO> list = new ArrayList<AuctionDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		AuctionDTO dto = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM AUCTION_ITEM ORDER BY AUCTION_ID";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new AuctionDTO();
				
				dto.setAuction_id(rs.getInt("AUCTION_ID"));
				dto.setAuctioneer_id(rs.getInt("AUCTIONEER_ID"));
				dto.setItem_name(rs.getString("ITEM_NAME"));
				dto.setStart_date(rs.getString("START_DATE"));
				dto.setEnd_date(rs.getString("END_DATE"));
				dto.setState(rs.getInt("STATE"));
				dto.setCurrent_bid_amount(rs.getInt("CURRENT_BID_AMOUNT"));
				dto.setFile_name(rs.getString("FILE_NAME"));
				
				list.add(dto);
			}
			System.out.println("[Auction-Item]getAll: " + list.size());			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
		
	}
	
	public void delete(String auction_id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "DELETE FROM AUCTION_ITEM WHERE AUCTION_ID = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, auction_id);
			
			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void insert(AuctionDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "INSERT INTO AUCTION_ITEM "
					+ "(AUCTIONEER_ID, ITEM_NAME, START_DATE, END_DATE, CURRENT_BID_AMOUNT, FILE_NAME) values"
					+ "(?,?,SYSDATE,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getAuctioneer_id());
			pstmt.setString(2, dto.getItem_name());
			pstmt.setString(3, dto.getEnd_date());
			pstmt.setInt(4, dto.getCurrent_bid_amount());
			pstmt.setString(5, dto.getFile_name());
			
			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

