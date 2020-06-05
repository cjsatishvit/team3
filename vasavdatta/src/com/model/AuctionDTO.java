package com.model;

public class AuctionDTO {
	private int auction_id;
	private int auctioneer_id;
	private String item_name;
	private String start_date;
	private String end_date;
	private int state;
	private int current_bid_amount;
	private String file_name;
	
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public int getAuction_id() {
		return auction_id;
	}
	public void setAuction_id(int auction_id) {
		this.auction_id = auction_id;
	}
	public int getAuctioneer_id() {
		return auctioneer_id;
	}
	public void setAuctioneer_id(int auctioneer_id) {
		this.auctioneer_id = auctioneer_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getCurrent_bid_amount() {
		return current_bid_amount;
	}
	public void setCurrent_bid_amount(int current_bid_amount) {
		this.current_bid_amount = current_bid_amount;
	}
	
	
}
