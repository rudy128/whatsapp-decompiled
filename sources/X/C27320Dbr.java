package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Dbr  reason: case insensitive filesystem */
public final class C27320Dbr extends HashMap<String, String> {
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        if (obj2 == null || (obj2 instanceof String)) {
            return super.remove(obj, obj2);
        }
        return false;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsValue(obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.get(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj == null || (obj instanceof String)) {
            return super.getOrDefault(obj, obj2);
        }
        return obj2;
    }

    public C27320Dbr() {
        put("resolver_type", "content_provider");
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.remove(obj);
        }
        return null;
    }
}
