package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DbY  reason: case insensitive filesystem */
public abstract class C27302DbY<K, V> extends AbstractMap<K, V> implements Map<K, V>, C41611wl {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.0aq, java.util.Set] */
    public final /* bridge */ Set entrySet() {
        return new C07380aq((C07370ap) this);
    }

    public final /* bridge */ Set keySet() {
        return new C07390ar((C07370ap) this);
    }

    public abstract Object put(Object obj, Object obj2);

    public final /* bridge */ int size() {
        return ((C07370ap) this).A00;
    }

    public final /* bridge */ Collection values() {
        return new C07350an((C07370ap) this);
    }
}
