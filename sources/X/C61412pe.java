package X;

import java.util.Iterator;

/* renamed from: X.2pe  reason: invalid class name and case insensitive filesystem */
public class C61412pe {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;

    public static boolean A00(AnonymousClass206 r4, C61412pe r5, int i) {
        if (r4 instanceof C48392Mh) {
            C48392Mh r42 = (C48392Mh) r4;
            if (r42.A00 == i) {
                Iterator it = r42.A01.iterator();
                while (it.hasNext()) {
                    if (r5.A00.A0O(C17880vN.A0Q(it))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C61412pe(AnonymousClass11S r1, AnonymousClass1CJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
