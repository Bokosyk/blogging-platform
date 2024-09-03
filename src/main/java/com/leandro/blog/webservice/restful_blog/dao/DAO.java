package com.leandro.blog.webservice.restful_blog.dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> { //Every Data Access Object in the system should fulfill this contract.

    List<T> list();

    void create(T t);

    Optional<T> get(int id);

    void update(T t, int id);

    void delete(int id);


}
