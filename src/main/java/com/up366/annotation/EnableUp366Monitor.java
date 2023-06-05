package com.up366.annotation;

import com.up366.config.Up366MonitorConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2023/1/5
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(Up366MonitorConfig.class)
public @interface EnableUp366Monitor {

}
