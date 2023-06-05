package com.up366.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2022/12/5
 */
@ConfigurationProperties(prefix = "com.up366.monitor")
public class Up366MonitorProperties {

    private String gatewayHost;
    private String name;

    private String labelName;

    private String help;

    public String getGatewayHost() {
        return gatewayHost;
    }

    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }
}
