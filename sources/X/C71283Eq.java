package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Eq  reason: invalid class name and case insensitive filesystem */
public final class C71283Eq<K, V> extends LinkedHashMap<K, V> {
    public final int maxSize = 200;

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.maxSize) {
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
