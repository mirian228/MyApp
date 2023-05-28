package com.mirian.myapp.dao;

import java.util.List;

public interface IAbstractDAO<Object> {
    void save(Object object);

    Object readById(int id);

    List<Object> readAll();

    void update(Object object);

    void deleteById(int id);
}
