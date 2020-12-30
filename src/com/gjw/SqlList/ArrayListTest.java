package com.gjw.SqlList;

public class ArrayListTest {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setAge(12);
        person1.setName("郭经伟");
        person1.setStudentNum(1);
        person2.setAge(13);
        person2.setName("郭经伟3");
        person2.setStudentNum(2);
        person3.setAge(14);
        person3.setName("郭经伟4");
        person3.setStudentNum(3);
        ArrayList<Person> list = new ArrayList<>();
        list.insert(person1);
        list.insert(person2);
        list.insert(person3);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.search(i));
        }
        Person person4 = new Person();
        person4.setStudentNum(4);
        person4.setName("小明");
        person4.setAge(22);
        list.insert(person4,1);
        System.out.println(list.size());
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.search(i));
        }
        System.out.println("============");
        list.delete(1);
        System.out.println(list.size());
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.search(i));
        }

    }
}
