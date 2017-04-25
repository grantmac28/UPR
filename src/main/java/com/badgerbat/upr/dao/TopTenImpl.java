package com.badgerbat.upr.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.badgerbat.upr.dao.TopTenDao;
import com.badgerbat.upr.models.TopTenModel;

@Repository
public class TopTenImpl implements TopTenDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;


	@Override
	public TopTenModel getTopTen(String title) {
		return null;

	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}
}
