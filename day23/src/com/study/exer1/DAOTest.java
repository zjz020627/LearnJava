package com.study.exer1;

import java.util.List;

/**
 * @author RenAshbell
 * @create 2022-04-05-11:25
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,20,"昆凌"));
        dao.save("1003",new User(1003,25,"蔡依林"));

        dao.update("1003",new User(1003,30,"方文山"));
        dao.delete("1002");

        List<User> list = dao.list();
        list.forEach(System.out::println);
    }
}
