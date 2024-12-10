package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1hi  reason: invalid class name and case insensitive filesystem */
public final class C32761hi extends LinkedHashMap<AnonymousClass205, Long> {
    public final /* synthetic */ C32741hg this$0;

    public C32761hi(C32741hg r1) {
        this.this$0 = r1;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AnonymousClass205)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof AnonymousClass205)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass205)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof AnonymousClass205)) {
            return null;
        }
        return super.remove(obj);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (((long) size()) > 240) {
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

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass205) || !(obj2 instanceof Long)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
