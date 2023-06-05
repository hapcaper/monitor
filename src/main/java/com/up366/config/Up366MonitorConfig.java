package com.up366.config;

import com.up366.monitor.Up366Monitor;
import com.up366.properties.Up366MonitorProperties;
import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import io.prometheus.client.Info;
import io.prometheus.client.Summary;
import io.prometheus.client.exporter.PushGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2022/12/5
 */

@Configuration
@EnableConfigurationProperties(Up366MonitorProperties.class)
@Import(Up366Monitor.class)
public class Up366MonitorConfig {

    @Autowired
    private Up366MonitorProperties properties;


    @Bean
    public PushGateway pushGateway() {
        return new PushGateway(properties.getGatewayHost());
    }


    @Bean
    public Counter counter() {
        return Counter.build()
                .name(properties.getName() + "_counter")
                .labelNames(properties.getLabelName() + "_counter")
                .help("counter:" + properties.getHelp())
                .register(); //注：通常只能注册1次，1个实例中重复注册会报错
    }

    @Bean
    public Summary summary() {
        return Summary.build()
                .name(properties.getName() + "_summary")
                .labelNames(properties.getLabelName() + "_summary")
                .help("summary:" + properties.getHelp())
                .register();
    }
    @Bean
    public Gauge gauge() {
        return Gauge.build()
                .name(properties.getName() + "_gauge")
                .labelNames(properties.getLabelName() + "_gauge")
                .help("gauge:" + properties.getHelp())
                .register();
    }
    @Bean
    public Info info() {
        return Info.build()
                .name(properties.getName() + "_info")
                .labelNames(properties.getLabelName() + "_info")
                .help("info:" + properties.getHelp())
                .register();
    }
}
