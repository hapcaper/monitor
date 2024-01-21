package com.lzh.annotation;

import com.lzh.config.GrafanaMonitorConfig;
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
@Import(GrafanaMonitorConfig.class)
public @interface EnableGrafanaMonitor {

}
