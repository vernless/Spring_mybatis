package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author 滨
 * @Date 2022/8/17 22:14
 * @Description: TODO
 * @Version 1.0
 */
@Configuration
@ComponentScan("org.example")
@PropertySource("mysql.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement
public class Springconfig {
}
