package com.lzh.httpapi.service;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.lzh.httpapi.param.CreatePanelParam;
import com.lzh.httpapi.template.GrafanaApiTemplate;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2023/2/27
 */
@Component
public class GrafanaRemoteApi {

    public String createPanel(CreatePanelParam param) {
        String requestBody = StrUtil.format(GrafanaApiTemplate.TEMPLATE, param.getIndex(), param.getTag(), param.getTagValue());
        String response = HttpUtil.post("", requestBody, 5000);
        return response;
    }



}
