package com.bob.spring.cloud.zuul.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Map<String, List<String>> whiteList = new HashMap<>();

    public Map<String, List<String>> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(Map<String, List<String>> whiteList) {
        this.whiteList = whiteList;
    }

    /**
     * @param address
     * @return
     */
    public boolean inWhiteList(String serviceId, String address) {
        Assert.notNull(serviceId, "服务名称不能为空");
        List<String> addrList = whiteList.get(serviceId);
        return addrList != null && addrList.contains(address);
    }
}
