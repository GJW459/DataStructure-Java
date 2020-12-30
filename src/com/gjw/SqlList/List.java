package com.gjw.SqlList;

/**
 * 线性表公共结构供扩展
 * @param <T> 数据类型
 *           insert delete edit search
 */
public interface List<T> {

    void insert(T t);

    void insert(T t,int index);

    void delete(int index);

    T search(int index);

    int size();

    boolean isEmpty();



}
