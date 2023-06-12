package com.lyj.writemybatis.binding;

import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @program: write-mybatis
 * @description: 映射器代理工厂
 * @author: lyj
 * @create: 2023-06-12 23:29
 **/
public class MapperProxyFactory<T> {

    private final Class<T> mapperInterface;

    public MapperProxyFactory(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public T newInstance(Map<String, String> sqlSession) {
        final MapperProxy<T> mapperProxy = new MapperProxy<>(sqlSession, mapperInterface);
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[]{mapperInterface}, mapperProxy);
    }

}
