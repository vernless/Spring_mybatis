package vern.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author 滨
 * @Date 2022/8/17 11:03
 * @Description: TODO
 * @Version 1.0
 */
@Configuration
@ComponentScan("vern")
@PropertySource("jdbc.properties")
@Import(OtherConfig.class)
public class springConfig {
}
