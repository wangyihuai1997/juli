package cn.com.pism.juli.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author PerccyKing
 */
@SpringBootApplication(scanBasePackages = {
        "cn.com.pism.juli"
})
public class JuliApplication {

    public static void main(String[] args) {
        SpringApplication.run(JuliApplication.class, args);
    }

}
