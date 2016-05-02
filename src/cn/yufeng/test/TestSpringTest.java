package cn.yufeng.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestSpringTest extends AbstractJUnit4SpringContextTests{
	@Resource(name="jdbcTemplate")
    private JdbcTemplate jdbc;
	@Test
	public void test(){
		System.out.println(jdbc.queryForObject("select count(*) from course", Integer.class));
	}
}
