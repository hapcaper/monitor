package com.up366.monitor;

import com.up366.httpapi.service.GrafanaRemoteService;
import com.up366.properties.Up366MonitorProperties;
import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import io.prometheus.client.Info;
import io.prometheus.client.Summary;
import io.prometheus.client.exporter.PushGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2022/12/5
 */

@Component
public class Up366Monitor {

    private static final Logger logger = LoggerFactory.getLogger(Up366Monitor.class);

    @Autowired
    private Counter counter;

    @Autowired
    private Summary summary;

    @Autowired
    private Gauge gauge;

    @Autowired
    private Info info;

    @Autowired
    private PushGateway pushGateway;

    @Autowired
    private GrafanaRemoteService grafanaRemoteService;

    @Autowired
    private Up366MonitorProperties properties;


    public void incOne(String label) {
        counter.labels(label).inc();
        try {
            pushGateway.pushAdd(counter, properties.getJob());
        } catch (IOException e) {
            logger.error("gateWay counterIncOne push监控数据失败,label:{}", label, e);
        }
    }


    public void gaugeIncOne(String label) {
        gauge.labels(label).inc();
        try {
            pushGateway.pushAdd(gauge, properties.getJob());
        } catch (IOException e) {
            logger.error("gateWay gaugeInc push监控数据失败,label:{}", label, e);
        }
    }


    public void gaugeDecOne(String label) {
        gauge.labels(label).dec();
        try {
            pushGateway.pushAdd(gauge, properties.getJob());
        } catch (IOException e) {
            logger.error("gateWay gaugeDec push监控数据失败,label:{}", label, e);
        }
    }







}
