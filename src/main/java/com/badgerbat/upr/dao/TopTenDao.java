package com.badgerbat.upr.dao;

import javax.sql.DataSource;

import com.badgerbat.upr.models.TopTenModel;

public interface TopTenDao{
	public TopTenModel getTopTen(String title);
	
	public void setDataSource(DataSource dataSource);
}
