package com.joshua.ordermanagement.dao;

public interface CrudDao<T> {
    void create(T entity);
    T read(Long id);
    void update(T entity);
    void delate(Long id);
}
