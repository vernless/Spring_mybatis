package org.example;

import static org.junit.Assert.assertTrue;

import org.example.config.Springconfig;
import org.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Springconfig.class)
public class AppTest 
{
    @Autowired
    private AccountService accountService;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testFindAll()
    {
        accountService.transfer("my","mht",600.0);
    }
}
