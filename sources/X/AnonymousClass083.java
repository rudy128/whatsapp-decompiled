package X;

import java.util.Map;

/* renamed from: X.083  reason: invalid class name */
public final class AnonymousClass083 extends C06940a6 implements Map.Entry, AnonymousClass3MS {
    public Object A00;
    public final C06790Zr A01;

    public AnonymousClass083(C06790Zr r1, Object obj, Object obj2) {
        super(obj, obj2);
        this.A01 = r1;
        this.A00 = obj2;
    }

    public Object getValue() {
        return this.A00;
    }

    public Object setValue(Object obj) {
        Object value = getValue();
        this.A00 = obj;
        this.A01.A00(getKey(), obj);
        return value;
    }
}
