package org.dao.Iml;

import org.dao.UserDAO;

import java.util.*;

/**
 * @Author 滨
 * @Date 2022/8/15 17:25
 * @Description: TODO
 * @Version 1.0
 */
public class UserDao implements UserDAO {

    /*//表示bean初始化时的操作
    public void init() {
        System.out.println("init...");
    }
    //表示bean销毁时的操作
    public void destory(){
        System.out.println("destory...");
    }*/
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("save userdao");
        System.out.println("array: "+ Arrays.toString(array));
        System.out.println("list: "+list);
        System.out.println("set: "+set);
        System.out.println("map: "+map);
        System.out.println("properties: "+properties);
    }
}
