package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6ot  reason: invalid class name and case insensitive filesystem */
public final class C133516ot {
    public final AnonymousClass00H A00;
    public final AnonymousClass1Cd A01;

    public final void A00() {
        Long l;
        Iterator A0h = C17890vO.A0h(this.A00);
        while (A0h.hasNext()) {
            C123466Uo r5 = (C123466Uo) A0h.next();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(r5.A00());
            C17890vO.A1A(A10, "/resolveOrphanMessages");
            LinkedHashSet A14 = C17880vN.A14();
            boolean z = true;
            long j = -1;
            do {
                ArrayList A012 = r5.A01(200, j);
                r5.A03(A012, A14);
                if (A012.size() < 200) {
                    z = false;
                }
                if (A012.isEmpty() || (l = ((C195749tq) C29431cG.A0d(A012)).A07) == null) {
                    A01(A14);
                } else {
                    j = l.longValue();
                }
            } while (z);
            A01(A14);
        }
    }

    public C133516ot(AnonymousClass1Cd r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.Set r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageOrphanResolverManager/deleteMessageOrphans count = "
            r1.append(r0)
            int r0 = r9.size()
            X.C17900vP.A0o(r1, r0)
            int r0 = r9.size()
            java.lang.String[] r5 = new java.lang.String[r0]
            java.util.Iterator r4 = r9.iterator()
            r3 = 0
        L_0x001b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002c
            long r1 = X.C17890vO.A07(r4)
            int r0 = r3 + 1
            X.C17880vN.A1V(r5, r3, r1)
            r3 = r0
            goto L_0x001b
        L_0x002c:
            r0 = 100
            X.23b r1 = new X.23b
            r1.<init>(r5, r0)
            X.1Cd r0 = r8.A01
            X.1au r5 = r0.A05()
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x007d }
        L_0x003d:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x007d }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x007d }
            X.1xA r4 = r5.BD0()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0072 }
            int r0 = r6.length     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0072 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0072 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanResolverManager/deleteMessageOrphans"
            r2.A04(r1, r3, r0, r6)     // Catch:{ all -> 0x0072 }
            r4.A00()     // Catch:{ all -> 0x0072 }
            r4.close()     // Catch:{ all -> 0x007d }
            goto L_0x003d
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x007d }
            throw r0     // Catch:{ all -> 0x007d }
        L_0x0079:
            r5.close()
            return
        L_0x007d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133516ot.A01(java.util.Set):void");
    }
}
