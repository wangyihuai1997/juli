package cn.com.pism.juli.admin.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>乐观锁配置</p>
 * @author wangyihuai
 * @version 0.0.1
 * @date 2020/08/01 下午 06:53
 * @since 0.0.1
 */
@Configuration
public class OptimisticLockerConfig {
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
