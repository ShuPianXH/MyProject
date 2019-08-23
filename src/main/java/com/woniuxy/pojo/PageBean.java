package com.woniuxy.pojo;

public class PageBean {
	private int offset;//第几条
	private int limit = 10;//显示几条
	private int pageNow = 1;//当前页
	private int count;//总条数
	private int pageCount;//总页数
	public int getOffset() {
		return (pageNow-1)*limit;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageCount() {
		return (count+limit-1)/limit;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
