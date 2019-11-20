package xyz.taoqz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author :almostTao
 * @date :Created in 2019/11/20 19:52
 */
// 扫描指定包中mapper tk包下的
@MapperScan("xyz.taoqz.mapper")
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }

}
