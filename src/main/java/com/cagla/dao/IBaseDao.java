package com.cagla.dao;
import java.util.List;

public interface IBaseDao<T> {
    void kaydet(T t);
    List<T> listele(Class<T> clazz);
}