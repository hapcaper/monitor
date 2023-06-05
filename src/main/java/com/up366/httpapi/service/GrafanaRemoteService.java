package com.up366.httpapi.service;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.up366.httpapi.param.CreatePanelParam;
import com.up366.httpapi.template.GrafanaApiTemplate;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2023/2/27
 */
@Service
public class GrafanaRemoteService {

    public String createPanel(CreatePanelParam param) {
        String requestBody = StrUtil.format(GrafanaApiTemplate.TEMPLATE, param.getIndex(), param.getTag(), param.getTagValue());
        String response = HttpUtil.post("", requestBody, 5000);
        return response;
    }



}
