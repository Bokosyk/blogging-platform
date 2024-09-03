package com.leandro.blog.webservice.restful_blog.dao;

import com.leandro.blog.webservice.restful_blog.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component //Tells spring to include this into dependency injection
public class ArticleJDBCDao implements DAO<Article>{

    private static final Logger log = LoggerFactory.getLogger(ArticleJDBCDao.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Article> rowMapper = (rs,rowNum) -> { // Map every column name to our Article object
        Article article = new Article();
        article.setArticleId(rs.getInt("id"));
        article.setCreatedBy(rs.getString("created_by"));
        article.setEmailAddress(rs.getString("email"));
        article.setPublishedDate(rs.getString("published_date"));
        article.setPublishedTimeStamp(rs.getString("published_timestamp"));
        article.setModifiedDate(rs.getString("modified_date"));
        article.setModifiedTimeStamp(rs.getString("modified_timestamp"));
        article.setTags(rs.getString("tags"));
        article.setBlogTitle(rs.getString("blog_title"));
        article.setBlogText(rs.getString("blog_text"));
        return article;
    };

    public ArticleJDBCDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Article> list() {
        String sql = "SELECT id, created_by, email, published_date, published_timestamp, modified_date, modified_timestamp, tags, blog_title, blog_text FROM public.articles;";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create(Article article) {
    String sql = "INSERT INTO articles(created_by ,email, published_date, published_timestamp, modified_date, modified_timestamp, tags, blog_title, blog_text) VALUES(?,?,?,?,?,?,?,?,?)";
    int insert = jdbcTemplate.update(sql, article.getCreatedBy(),article.getEmailAddress(),article.getPublishedDate(), article.getPublishedTimeStamp(), article.getModifiedDate(), article.getModifiedTimeStamp(), article.getTags(), article.getBlogTitle(), article.getBlogText());

    if (insert == 1) {
        log.info("New article created: " + article.getBlogTitle());
    }
    }

    @Override
    public Optional<Article> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Article article, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
