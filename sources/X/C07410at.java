package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0at  reason: invalid class name and case insensitive filesystem */
public final class C07410at<K, V> extends AnonymousClass3F0<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>>, Collection, C18450wR {
    public final C07340am A00;

    public int A0B() {
        return this.A00.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C07340am r2 = this.A00;
        Object obj2 = r2.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != null) {
            return obj2.equals(value);
        }
        if (value != null || !r2.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new AnonymousClass085(this.A00.A05());
    }

    public C07410at(C07340am r1) {
        this.A00 = r1;
    }
}
