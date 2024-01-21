package com.lzh.httpapi.template;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2023/2/27
 */
public interface GrafanaApiTemplate {

    /**
     * 指标   tag   tag值
     */
    String TEMPLATE = "{\n" +
            "    \"dashboard\":  {\n" +
            "      \"panels\": [\n" +
            "        {\n" +
            "          \"type\": \"timeseries\",\n" +
            "          \"title\": \"test1\",\n" +
            "          \"targets\": [\n" +
            "            {\n" +
            "              \"datasource\": {\n" +
            "                \"type\": \"prometheus\",\n" +
            "                \"uid\": \"zi6wiCD4z\"\n" +
            "              },\n" +
            "              \"expr\": \"idelta({}{{}=\\\"{}\\\"}[1h])\",\n" +
            "              \"format\": \"time_series\"\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"refresh\": \"5s\",\n" +
            "      \"title\": \"test5\"\n" +
            "    },\n" +
            "    \"folderUid\": \"00M3w45Ik\"\n" +
            "}";

}
