package com.lyj.writemybatis.dao;

/**
 * @program: write-mybatis
 * @description:
 * @author: lyj
 * @create: 2023-06-12 23:32
 **/
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);
}
