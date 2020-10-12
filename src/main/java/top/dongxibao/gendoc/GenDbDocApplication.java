package top.dongxibao.gendoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * screw有两种执行方式：
 *      第一种是pom文件配置(配置好后在 Maven -> Plugins -> screw -> screw:run执行)
 *      第二种是代码执行
 */
@SpringBootApplication
public class GenDbDocApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenDbDocApplication.class, args);
    }

}
