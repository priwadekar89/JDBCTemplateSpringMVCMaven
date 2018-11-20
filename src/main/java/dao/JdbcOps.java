package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import model.People;

@Component
public class JdbcOps {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	//setters and getters
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	//Operations

	//Save
	public int saveData(People p)
	{
		String insert_query="insert into people values(?, ?, ?, ?)";
		return jdbcTemplate.update(insert_query, p.getId(), p.getFirst_name(), p.getLast_name(), p.getAge());
	}

	//	
}
