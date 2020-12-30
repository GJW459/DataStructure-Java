package com.gjw.SqlList;

import java.io.Serializable;

/**
 * @author gjw
 * 顺序表 逻辑结构为线性表 a->b->c 存储结构
 */
public class ArrayList<T> implements List<T> , Serializable {

    /**
     * 初始化大小
     */
    private static int DEFAULT_CAPACITY=10;
    /**
     * 空的Object数组
     */
    private  Object [] ELEMENT_DATA;

    private int size;

    private int MAXSIZE;
    public ArrayList()
    {
        ELEMENT_DATA=new Object[DEFAULT_CAPACITY];
        this.MAXSIZE=DEFAULT_CAPACITY;
        this.size=0;
    }
    /**
     * 初始化ArrayList
     * @param capacity
     */
    public ArrayList(int capacity)
    {
        if (capacity>0)
        {
            ELEMENT_DATA=new Object[capacity];
            this.MAXSIZE=capacity;
            this.size=0;
        }
        else
        {
            throw new IllegalArgumentException("initCapacity："+capacity);
        }
    }

    @Override
    public void insert(T t) {

        if (this.size==MAXSIZE)
        {
            System.out.println("线性表已满，不能再插入了!");
            return;
        }
        this.ELEMENT_DATA[size++]=t;
    }

    @Override
    public void insert(T t, int index) {
        if (this.size==MAXSIZE)
        {
            System.out.println("线性表已满，不能再插入了！");
            return;
        }
        if (index>MAXSIZE||index<0)
        {
            System.out.println("输入数据异常!");
            return;
        }
        for (int i=this.size;i>=index;i--)
        {
            this.ELEMENT_DATA[i+1]=this.ELEMENT_DATA[i];
        }
        this.ELEMENT_DATA[index]=t;
        size++;
    }

    @Override
    public void delete(int index) {

        if (this.size==0)
        {
            System.out.println("线性表为空,不能再删除了!");
            return;
        }
        for (int i=index;i<this.size;i++)
        {
            this.ELEMENT_DATA[i]=this.ELEMENT_DATA[i+1];
        }
        this.size--;
    }

    @Override
    public T search(int index) {
        return (T) ELEMENT_DATA[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {

        return this.size==0;
    }
}
