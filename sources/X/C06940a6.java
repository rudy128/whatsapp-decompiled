package X;

import java.util.Map;

/* renamed from: X.0a6  reason: invalid class name and case insensitive filesystem */
public class C06940a6 implements Map.Entry, C18450wR {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !C18070vi.A18(entry.getKey(), getKey()) || !C18070vi.A18(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public C06940a6(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public Object getKey() {
        return this.A00;
    }

    public Object getValue() {
        return this.A01;
    }

    public int hashCode() {
        int i = 0;
        int A0l = AnonymousClass001.A0l(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A0l ^ i;
    }

    public Object setValue(Object obj) {
        throw AnonymousClass000.A12();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(getKey());
        A10.append('=');
        A10.append(getValue());
        return A10.toString();
    }
}
