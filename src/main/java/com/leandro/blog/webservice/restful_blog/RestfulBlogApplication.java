package com.leandro.blog.webservice.restful_blog;

import com.leandro.blog.webservice.restful_blog.dao.DAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RestfulBlogApplication {

	private static DAO<Article> dao;

	public RestfulBlogApplication(DAO<Article> dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(RestfulBlogApplication.class, args);

		System.out.println("\n Create Article -----------------------------\n");
		Article art1 = new Article("JDBC Entry", "jdbc@dummyaddress.com", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIME", "{JDBCTEST}", "New Horizons","An account of a programmer learning new things.");
		dao.create(art1);

		System.out.println("\n ALL Articles -----------------------------\n");
		List<Article> articles = dao.list();
		articles.forEach(System.out::println);
	}

}
