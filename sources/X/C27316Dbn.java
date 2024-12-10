package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Dbn  reason: case insensitive filesystem */
public final class C27316Dbn extends HashMap<C24360Bzv, C00> {
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof C24360Bzv)) {
            return false;
        }
        if (obj2 == null || (obj2 instanceof C00)) {
            return super.remove(obj, obj2);
        }
        return false;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof C24360Bzv)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof C00)) {
            return super.containsValue(obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof C24360Bzv)) {
            return super.get(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj == null || (obj instanceof C24360Bzv)) {
            return super.getOrDefault(obj, obj2);
        }
        return obj2;
    }

    public C27316Dbn() {
        put(C24360Bzv.FACEBOOK, C00.FACEBOOK);
        put(C24360Bzv.MESSENGER, C00.MESSENGER);
        put(C24360Bzv.FACEBOOK_LITE, C00.FACEBOOK_LITE);
        put(C24360Bzv.INSTAGRAM, C00.INSTAGRAM);
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
        if (obj == null || (obj instanceof C24360Bzv)) {
            return super.remove(obj);
        }
        return null;
    }
}
