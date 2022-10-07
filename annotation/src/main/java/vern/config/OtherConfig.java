package vern.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author 滨
 * @Date 2022/8/17 20:58
 * @Description: TODO
 * @Version 1.0
 */
public class OtherConfig {
    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }
}
