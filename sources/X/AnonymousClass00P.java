package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.00P  reason: invalid class name */
public class AnonymousClass00P<K, V> extends AnonymousClass00O<K, V> implements Map<K, V> {
    public C07210aZ A00;
    public C06980aA A01;
    public C06630Zb A02;

    public AnonymousClass00P() {
        super(0);
    }

    public Set entrySet() {
        C07210aZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C07210aZ r02 = new C07210aZ(this);
        this.A00 = r02;
        return r02;
    }

    public Set keySet() {
        C06980aA r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C06980aA r02 = new C06980aA(this);
        this.A01 = r02;
        return r02;
    }

    public Collection values() {
        C06630Zb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C06630Zb r02 = new C06630Zb(this);
        this.A02 = r02;
        return r02;
    }

    public boolean A0A(Collection collection) {
        int size = size();
        for (int i = size - 1; i >= 0; i--) {
            if (!collection.contains(A04(i))) {
                A05(i);
            }
        }
        if (size == size()) {
            return false;
        }
        return true;
    }

    public void putAll(Map map) {
        A08(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
