package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cgd  reason: case insensitive filesystem */
public class C25482Cgd {
    public final ConcurrentHashMap A00 = AnonymousClass8BR.A17();

    public static void A00(C26045Cr9 cr9, C25482Cgd cgd, DDm dDm, String str) {
        ConcurrentHashMap concurrentHashMap = cgd.A00;
        Object obj = concurrentHashMap.get(str);
        if (obj instanceof E98) {
            cr9.A04((E98) obj);
        }
        if (dDm instanceof E98) {
            cr9.A03(dDm);
        }
        if (dDm == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, dDm);
        }
    }
}
