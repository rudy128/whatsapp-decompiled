package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.4Z2  reason: invalid class name */
public abstract class AnonymousClass4Z2 {
    public static AnonymousClass212 A01(AnonymousClass11S r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass1O2 r7, Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                if (A0Y != null && AnonymousClass25A.A0P(r4, A0Y)) {
                    AnonymousClass206 A00 = A00(r4, r5, r6, r7, A0Y);
                    if (A00 instanceof AnonymousClass212) {
                        return (AnonymousClass212) A00;
                    }
                }
            }
        }
        return null;
    }

    public static AnonymousClass4M0 A02(AnonymousClass11S r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass1O2 r6, AnonymousClass206 r7) {
        AnonymousClass212 A01;
        AnonymousClass212 r0;
        AnonymousClass212 A012;
        AnonymousClass212 A013;
        AnonymousClass206 r2 = null;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass206 A00 = A00(r3, r4, r5, r6, r7);
        if (A00 != null) {
            r2 = A00;
        }
        AnonymousClass8BG A014 = C63892tr.A01(r7);
        if (!(A014 == null || (A013 = A01(r3, r4, r5, r6, A014.BMv())) == null)) {
            A13.add(A013);
        }
        if ((r7 instanceof AnonymousClass22H) && (A012 = A01(r3, r4, r5, r6, ((AnonymousClass22H) r7).A17())) != null) {
            A13.add(A012);
        }
        AnonymousClass212 A015 = A01(r3, r4, r5, r6, Collections.singletonList(C63892tr.A02(r7)));
        if (A015 != null) {
            A13.add(A015);
        }
        AnonymousClass212 A016 = A01(r3, r4, r5, r6, Collections.singletonList(C63892tr.A03(r7)));
        if (A016 != null) {
            A13.add(A016);
        }
        if (r7 instanceof C444323k) {
            C693136s r02 = (C693136s) ((C444323k) r7).A00.A02;
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
            AnonymousClass212 A017 = A01(r3, r4, r5, r6, Collections.singletonList(r0));
            if (A017 != null) {
                A13.add(A017);
            }
        }
        if ((r7 instanceof C445823z) && (A01 = A01(r3, r4, r5, r6, ((C445823z) r7).A18())) != null) {
            A13.add(A01);
        }
        ArrayList A10 = C17880vN.A10(A13);
        if (r2 != null) {
            A10.add(0, r2);
        }
        return new AnonymousClass4M0(A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass206 A00(X.AnonymousClass11S r8, X.AnonymousClass11P r9, X.C18030ve r10, X.AnonymousClass1O2 r11, X.AnonymousClass206 r12) {
        /*
            long r6 = X.AnonymousClass25A.A01(r10, r12)
            boolean r1 = X.AnonymousClass25A.A0R(r8, r12)
            X.205 r5 = r12.A0v
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x003b
        L_0x0010:
            int r1 = r12.A0D()
            r0 = 4
            boolean r0 = X.C446824j.A03(r1, r0)
            if (r0 == 0) goto L_0x0034
            long r3 = r12.A0I
            long r3 = r3 + r6
            long r1 = X.AnonymousClass11P.A01(r9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0034
            java.util.Map r1 = r11.A03
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        L_0x0032:
            if (r0 == 0) goto L_0x003a
        L_0x0034:
            boolean r0 = X.AnonymousClass25A.A0a(r12)
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            return r12
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z2.A00(X.11S, X.11P, X.0ve, X.1O2, X.206):X.206");
    }
}
