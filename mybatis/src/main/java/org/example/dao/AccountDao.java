package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.domain.Account;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/8/17 21:25
 * @Description: TODO
 * @Version 1.0
 */
public interface AccountDao {
    @Insert("insert into account values(null,#{name},#{money})")
    void save(Account accountt);
    @Delete("delete from account where id=#{id}")
    void delete(Integer id);
    @Update("update account set name=#{name},balance=#{balance}")
    void update(Account accountt);
    @Select("select * from account")
    List<Account> findAll();
    @Select("select * from account where id=#{id}")
    Account findById(Integer id);
    @Update("update account set balance = balance + #{balance} where name = #{name}")
    void inMoney(@Param("balance") Double balance, @Param("name")String name);
    @Update("update account set balance = balance - #{balance} where name = #{name}")
    void outMoney(@Param("balance")Double balance,@Param("name")String name);
}
