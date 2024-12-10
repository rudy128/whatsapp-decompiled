package X;

import java.util.HashMap;

/* renamed from: X.2ig  reason: invalid class name and case insensitive filesystem */
public class C57192ig {
    public final HashMap A00 = C17880vN.A11();
    public final HashMap A01 = C17880vN.A11();

    public void A00(AnonymousClass2Q4 r3) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            hashMap.put(r3.A00, r3);
        }
        if (r3.A02 != null) {
            HashMap hashMap2 = this.A01;
            synchronized (hashMap2) {
                hashMap2.put(r3.A02, r3);
            }
        }
    }
}
