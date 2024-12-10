package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1aO  reason: invalid class name and case insensitive filesystem */
public final class C28531aO {
    public final AnonymousClass1Cd A00;
    public final C28521aN A01;
    public final AnonymousClass1RU A02;

    public C28531aO(AnonymousClass1Cd r2, C28521aN r3, AnonymousClass1RU r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.util.Collection r8) {
        /*
            r7 = this;
            X.1Cd r0 = r7.A00
            X.1au r3 = r0.A05()
            X.1xA r5 = r3.BD0()     // Catch:{ all -> 0x0054 }
            X.1aN r6 = r7.A01     // Catch:{ all -> 0x004d }
            X.00H r0 = r6.A0A     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x004d }
            X.A74 r4 = (X.A74) r4     // Catch:{ all -> 0x004d }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x004d }
        L_0x0018:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x004d }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ all -> 0x004d }
            r0 = 1
            X.A74.A03(r4, r1, r0)     // Catch:{ all -> 0x004d }
            goto L_0x0018
        L_0x0029:
            r0 = 1
            X.C28521aN.A00(r6, r8, r0)     // Catch:{ all -> 0x004d }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x004d }
        L_0x0031:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x004d }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ all -> 0x004d }
            X.1RU r0 = r7.A02     // Catch:{ all -> 0x004d }
            r0.BjL(r3, r1)     // Catch:{ all -> 0x004d }
            goto L_0x0031
        L_0x0043:
            r5.A00()     // Catch:{ all -> 0x004d }
            r5.close()     // Catch:{ all -> 0x0054 }
            r3.close()
            return
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28531aO.A00(java.util.Collection):void");
    }

    public boolean A01(Collection collection) {
        boolean z;
        long j;
        C28521aN r5 = this.A01;
        HashSet A04 = r5.A02.A04();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            AnonymousClass206 r2 = (AnonymousClass206) it.next();
            AnonymousClass1BI r1 = r2.A0v.A00;
            if (A04.contains(r1)) {
                long j2 = r2.A0y;
                AnonymousClass1CJ r0 = r5.A00;
                C17960vV.A07(r1);
                C29691ci A0A = r0.A0A(r1);
                if (A0A == null) {
                    j = Long.MIN_VALUE;
                } else {
                    j = A0A.A0H;
                }
                if (j2 < j) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return false;
        }
        C28521aN.A00(r5, collection, false);
        return true;
    }
}
