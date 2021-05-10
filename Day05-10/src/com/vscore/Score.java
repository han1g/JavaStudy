package com.vscore;

public interface Score {
//추가,변경,삭제,현재리스트,학번검색,이름검색
	public void insert();
	public void update();  
	public void delete();
	public void listAll();
	public void searchHak();
	public void searchName();
}
