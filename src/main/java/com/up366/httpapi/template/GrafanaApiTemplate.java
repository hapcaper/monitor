package com.up366.httpapi.template;

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
    String TEMPLATE = "{" +
            "  \"dashboard\":  {" +
            "    \"panels\": [" +
            "      {" +
            "        \"gridPos\": {" +
            "          \"h\": 8," +
            "          \"w\": 12," +
            "          \"x\": 0," +
            "          \"y\": 9" +
            "        }," +
            "        \"type\": \"timeseries\"," +
            "        \"title\": \"wdaiowdijo\"," +
            "        \"datasource\": {" +
            "          \"type\": \"prometheus\"," +
            "          \"uid\": \"zi6wiCD4z\"" +
            "        }," +
            "        \"fieldConfig\": {" +
            "          \"defaults\": {" +
            "            \"custom\": {" +
            "              \"drawStyle\": \"line\"," +
            "              \"lineInterpolation\": \"linear\"," +
            "              \"barAlignment\": 0," +
            "              \"lineWidth\": 1," +
            "              \"fillOpacity\": 0," +
            "              \"gradientMode\": \"none\"," +
            "              \"spanNulls\": false," +
            "              \"showPoints\": \"auto\"," +
            "              \"pointSize\": 5," +
            "              \"stacking\": {" +
            "                \"mode\": \"none\"," +
            "                \"group\": \"A\"" +
            "              }," +
            "              \"axisPlacement\": \"auto\"," +
            "              \"axisLabel\": \"\"," +
            "              \"axisColorMode\": \"text\"," +
            "              \"scaleDistribution\": {" +
            "                \"type\": \"linear\"" +
            "              }," +
            "              \"axisCenteredZero\": false," +
            "              \"hideFrom\": {" +
            "                \"tooltip\": false," +
            "                \"viz\": false," +
            "                \"legend\": false" +
            "              }," +
            "              \"thresholdsStyle\": {" +
            "                \"mode\": \"off\"" +
            "              }" +
            "            }," +
            "            \"color\": {" +
            "              \"mode\": \"palette-classic\"" +
            "            }," +
            "            \"mappings\": []," +
            "            \"thresholds\": {" +
            "              \"mode\": \"absolute\"," +
            "              \"steps\": [" +
            "                {" +
            "                  \"color\": \"green\"," +
            "                  \"value\": null" +
            "                }," +
            "                {" +
            "                  \"color\": \"red\"," +
            "                  \"value\": 80" +
            "                }" +
            "              ]" +
            "            }" +
            "          }," +
            "          \"overrides\": []" +
            "        }," +
            "        \"options\": {" +
            "          \"tooltip\": {" +
            "            \"mode\": \"single\"," +
            "            \"sort\": \"none\"" +
            "          }," +
            "          \"legend\": {" +
            "            \"showLegend\": true," +
            "            \"displayMode\": \"list\"," +
            "            \"placement\": \"bottom\"," +
            "            \"calcs\": []" +
            "          }" +
            "        }," +
            "        \"targets\": [" +
            "          {" +
            "            \"datasource\": {" +
            "              \"type\": \"prometheus\"," +
            "              \"uid\": \"zi6wiCD4z\"" +
            "            }," +
            "            \"editorMode\": \"builder\"," +
            "            \"exemplar\": false," +
            "            \"expr\": \"idelta({}{{}=\\\"{}\\\"}[1h])\"," +
            "            \"format\": \"time_series\"," +
            "            \"instant\": false," +
            "            \"interval\": \"\"," +
            "            \"key\": \"Q-6347fd2a-3673-4304-a92a-dc21410d4105-0\"," +
            "            \"legendFormat\": \"__auto\"," +
            "            \"range\": true," +
            "            \"refId\": \"A\"" +
            "          }" +
            "        ]" +
            "      }" +
            "    ]," +
            "    \"refresh\": \"5s\"," +
            "    \"title\": \"zzzzz300043\"" +
            "  }" +
            "}";

}
