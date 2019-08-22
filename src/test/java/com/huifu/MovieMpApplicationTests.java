package com.huifu;

import com.huifu.movie.entity.CompanyUser;
import com.huifu.movie.service.ICompanyUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieMpApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private ICompanyUserService iCompanyUserService;

	@Test
	public void testSelect(){
		List<CompanyUser> list = iCompanyUserService.list();
		list.forEach(System.out::println);
	}

}
