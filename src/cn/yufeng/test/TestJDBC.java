package cn.yufeng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJDBC {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate jdbc = ac.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jdbc.queryForObject("select count(*) from course", Integer.class));
	}
}
