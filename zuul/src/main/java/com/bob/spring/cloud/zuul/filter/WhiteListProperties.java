package com.bob.spring.cloud.zuul.filter;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.Assert;

/**
 * 白名单配置
 *
 * @author Administrator
 * @create 2018-10-27 20:32
 */
@RefreshScope
@ConfigurationProperties(prefix = "zuul")
public class WhiteListProperties {

    /**
     * key : serviceId
     * value: IP Set
     */
    private List<String> whiteList;

    public List<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }

    /**
     * @param address
     * @return
     */
    public boolean isWhiteAddress(String address) {
        Assert.notNull(address, "IP不能为空");
        return whiteList.contains(address);
    }
}
