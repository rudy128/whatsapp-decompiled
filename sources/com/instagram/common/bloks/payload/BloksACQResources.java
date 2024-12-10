package com.instagram.common.bloks.payload;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class BloksACQResources implements Serializable {
    public static final long serialVersionUID = 1;
    public String appId;
    public Set cacheKeys;
    public Long cacheTtl;
    public Map consumedParams;
}
