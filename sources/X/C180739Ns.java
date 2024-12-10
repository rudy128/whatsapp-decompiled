package X;

import java.util.HashMap;

/* renamed from: X.9Ns  reason: invalid class name and case insensitive filesystem */
public abstract class C180739Ns {
    public final String A01(String str) {
        String A0s = C17880vN.A0s(str, ((AnonymousClass8R7) this).A05);
        if (A0s == null) {
            return "";
        }
        return A0s;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.9tB] */
    public C195339tB A00() {
        ? obj = new Object();
        AnonymousClass8R7 r2 = (AnonymousClass8R7) this;
        String str = r2.A04;
        if (str != null) {
            obj.A04 = str;
            obj.A01 = r2.A03;
            C193289pq r0 = r2.A02;
            if (r0 != null) {
                obj.A00 = r0;
                obj.A02 = Long.valueOf(r2.A00);
                obj.A03 = Long.valueOf(r2.A01);
                obj.A05 = new HashMap(r2.A05);
                return obj;
            }
            throw AnonymousClass000.A0s("Null encodedPayload");
        }
        throw AnonymousClass000.A0s("Null transportName");
    }
}
