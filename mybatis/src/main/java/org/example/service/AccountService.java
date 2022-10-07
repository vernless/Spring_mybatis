package org.example.service;

import org.example.dao.AccountDao;
import org.example.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/8/17 22:15
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void save(Account account){
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id){
        accountDao.delete(id);
    }

    public Account findById(Integer id){
        return accountDao.findById(id);
    }

    public List<Account> findAll(){
        return accountDao.findAll();
    }

    @Transactional
    public void transfer(String out, String in, Double balance){
        accountDao.outMoney(balance,out);
        accountDao.inMoney(balance,in);
    }
}
