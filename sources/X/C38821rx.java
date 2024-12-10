package X;

import java.util.HashMap;

/* renamed from: X.1rx  reason: invalid class name and case insensitive filesystem */
public final class C38821rx {
    public final HashMap A00;
    public final AnonymousClass10I A01;

    public C38821rx(AnonymousClass10I r2, HashMap hashMap) {
        C18070vi.A0d(hashMap, 2);
        this.A01 = r2;
        this.A00 = hashMap;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1s1, java.lang.Object] */
    public C38861s1 A00(String str) {
        ? obj = new Object();
        obj.A05 = str;
        obj.A04 = null;
        obj.A02 = null;
        obj.A00 = 0;
        obj.A01 = null;
        obj.A03 = null;
        obj.A06 = false;
        return obj;
    }

    public void A01(C38861s1 r5) {
        String str = r5.A05;
        AnonymousClass10I r2 = this.A01;
        if (str != null) {
            r2.CGO(new C448825d(this, r5, 10), str);
        } else {
            r2.CGN(new C448825d(this, r5, 11));
        }
    }
}
