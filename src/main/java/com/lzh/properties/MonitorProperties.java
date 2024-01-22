package com.lzh.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2022/12/5
 */
@ConfigurationProperties(prefix = "com.lzh.monitor")
@Data
public class MonitorProperties {

    private String gatewayHost;
    private String name;

    private String labelName;

    private String help;

    private String job;

}
