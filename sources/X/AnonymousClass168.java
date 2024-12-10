package X;

import java.util.HashMap;

/* renamed from: X.168  reason: invalid class name */
public class AnonymousClass168 {
    public final HashMap A00 = new HashMap();

    public C115295ti A00(C62572rc r3) {
        C115295ti r0;
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            r0 = (C115295ti) hashMap.get(r3);
        }
        return r0;
    }

    public void A01(C62572rc r3) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            hashMap.remove(r3);
        }
    }
}
