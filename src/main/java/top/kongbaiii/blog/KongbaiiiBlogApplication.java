package top.kongbaiii.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.kongbaiii.blog.common.IdWorker;

/**
 * @author kongbaiii
 * @create 2019-07-09
 */
@SpringBootApplication
public class KongbaiiiBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(KongbaiiiBlogApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }

}
