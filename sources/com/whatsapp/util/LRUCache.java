package com.whatsapp.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache<K, V> extends LinkedHashMap<K, V> implements Serializable {
    public static final long serialVersionUID = 20240417001L;
    public final int cacheLimit;

    public LRUCache(int i) {
        super((int) (((float) Math.ceil((double) (((float) i) / 0.75f))) + 1.0f), 0.75f, true);
        this.cacheLimit = i;
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.cacheLimit) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }
}
