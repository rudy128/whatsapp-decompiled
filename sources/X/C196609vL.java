package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9vL  reason: invalid class name and case insensitive filesystem */
public abstract class C196609vL {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r9.A06(r7.A06, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C63872tp r7, X.C188419hO r8, X.AnonymousClass1R3 r9) {
        /*
            r6 = 0
            r5 = 1
            X.C18070vi.A0d(r7, r5)
            int r1 = r7.A06()
            int r0 = r8.A02
            if (r1 > r0) goto L_0x001e
            X.1E9 r0 = r7.A06
            X.206 r0 = r9.A06(r0, r5)
            if (r0 == 0) goto L_0x001e
            long r3 = r0.A0I
            long r1 = r8.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
            return r5
        L_0x001e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196609vL.A01(X.2tp, X.9hO, X.1R3):boolean");
    }

    public static final ArrayList A00(AnonymousClass1M9 r4, Collection collection, Set set) {
        ArrayList A13 = AnonymousClass000.A13();
        if (set.containsAll(collection)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                if (!collection.contains(A0Q)) {
                    C18070vi.A0z(A0Q, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    if (r4.A0z(A0Q)) {
                        A13.add(A0Q);
                    }
                }
            }
        }
        return A13;
    }
}
