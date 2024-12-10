package X;

import java.util.Map;

public final class DVJ implements Map.Entry, AnonymousClass3MS {
    public Object A00;
    public final Object A01;

    public Object getKey() {
        return this.A01;
    }

    public Object getValue() {
        return this.A00;
    }

    public Object setValue(Object obj) {
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public DVJ(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(getKey());
        A10.append('=');
        return C17890vO.A0V(getValue(), A10);
    }
}
