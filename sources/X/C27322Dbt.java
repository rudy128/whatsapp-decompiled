package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Dbt  reason: case insensitive filesystem */
public final class C27322Dbt extends HashMap<C24360Bzv, BCK> {
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof C24360Bzv)) {
            return false;
        }
        if (obj2 == null || (obj2 instanceof BCK)) {
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
        if (obj == null || (obj instanceof BCK)) {
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

    public C27322Dbt() {
        put(C24360Bzv.FACEBOOK, new Object());
        put(C24360Bzv.MESSENGER, new Object());
        put(C24360Bzv.MESSENGER_WITH_LITE_PROVIDER, new Object());
        put(C24360Bzv.FACEBOOK_LITE, new Object());
        put(C24360Bzv.INSTAGRAM, new Object());
        put(C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER, new Object());
        put(C24360Bzv.OCULUS, new C21562Am9(C00.OCULUS));
        put(C24360Bzv.MWA, new C21562Am9(C00.MWA));
        put(C24360Bzv.MWA_DEBUG, new C21562Am9(C00.MWA_DEBUG));
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
