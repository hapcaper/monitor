package com.lzh.httpapi.param;

/**
 * Description:
 *
 * @author 李自豪 lzh
 * @since 2023/2/27
 */
public class CreatePanelParam {

    /**
     * 指标
     */
    private String index;

    /**
     * tag
     */
    private String tag;

    /**
     * tag的值
     */
    private String tagValue;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }


}
