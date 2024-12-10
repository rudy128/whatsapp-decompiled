package X;

import java.util.HashMap;

/* renamed from: X.01G  reason: invalid class name */
public class AnonymousClass01G extends C001200q {
    public final HashMap A00 = new HashMap();

    public C001300r A00(Object obj) {
        return (C001300r) this.A00.get(obj);
    }

    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }

    public Object A02(Object obj, Object obj2) {
        C001300r A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        HashMap hashMap = this.A00;
        C001300r r1 = new C001300r(obj, obj2);
        this.A00++;
        C001300r r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        hashMap.put(obj, r1);
        return null;
    }
}
