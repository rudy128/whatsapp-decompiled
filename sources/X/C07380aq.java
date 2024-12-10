package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0aq  reason: invalid class name and case insensitive filesystem */
public final class C07380aq<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    public final C07370ap A00;

    public int A00() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C07370ap r2 = this.A00;
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
        return new C06790Zr(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        return this.A00.remove(entry.getKey(), entry.getValue());
    }

    public C07380aq(C07370ap r1) {
        this();
        this.A00 = r1;
    }

    public C07380aq() {
    }
}
