package X;

import java.util.Map;

public abstract class DDF implements E4W {
    public final E4W A00;
    public final String A01;
    public final String A02;
    public final Map A03 = C17880vN.A11();

    public synchronized void A00(C26269CwE cwE, Object obj) {
        Map map = this.A03;
        if (map.get(obj) == cwE) {
            map.remove(obj);
        }
    }

    public DDF(E4W e4w, String str, String str2) {
        this.A00 = e4w;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3.A06.add(r5);
        r7 = X.C26269CwE.A02(r3);
        r6 = X.C26269CwE.A03(r3);
        r0 = X.C26269CwE.A01(r3);
        r4 = r3.A04;
        r2 = r3.A00;
        r1 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.DDI.A01(r7);
        X.DDI.A02(r6);
        X.DDI.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0096, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r4 != r3.A04) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
        if (r4 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a3, code lost:
        if ((r8 instanceof X.C22861BSp) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a5, code lost:
        r4 = (X.DRJ) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a7, code lost:
        if (r4 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a9, code lost:
        r4 = r4.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ad, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00af, code lost:
        r4 = (X.DRN) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b1, code lost:
        if (r4 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b3, code lost:
        r4 = r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b8, code lost:
        if (r4 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bd, code lost:
        if (r2 <= 0.0f) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r11.A05(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c2, code lost:
        r11.A07(r4, r1);
        X.C26269CwE.A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c8, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.C25027CUe.A00(r12, r5, r3, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cd, code lost:
        if (r9 == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cf, code lost:
        X.C26269CwE.A04(com.facebook.common.util.TriState.valueOf(r12.Bfu()), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e1, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCn(X.C25268CcD r11, X.ECs r12) {
        /*
            r10 = this;
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "MultiplexProducer#produceResults"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x00f0 }
        L_0x000b:
            r5 = r12
            X.DDI r5 = (X.DDI) r5     // Catch:{ all -> 0x00f0 }
            X.E9w r1 = r5.A05     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x00f0 }
            r1.C1r(r12, r0)     // Catch:{ all -> 0x00f0 }
            boolean r0 = r10 instanceof X.C22861BSp     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x005f
            X.Cbv r0 = r5.A07     // Catch:{ all -> 0x00f0 }
            android.net.Uri r0 = r0.A03     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f0 }
            X.DAK r4 = new X.DAK     // Catch:{ all -> 0x00f0 }
            r4.<init>(r0)     // Catch:{ all -> 0x00f0 }
        L_0x0026:
            X.BzR r0 = r5.A06     // Catch:{ all -> 0x00f0 }
            android.util.Pair r2 = android.util.Pair.create(r4, r0)     // Catch:{ all -> 0x00f0 }
        L_0x002c:
            monitor-enter(r10)     // Catch:{ all -> 0x00f0 }
            r1 = r10
            monitor-enter(r1)     // Catch:{ all -> 0x00ed }
            java.util.Map r0 = r10.A03     // Catch:{ all -> 0x00ea }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x00ea }
            X.CwE r3 = (X.C26269CwE) r3     // Catch:{ all -> 0x00ea }
            monitor-exit(r1)     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x0046
            monitor-enter(r1)     // Catch:{ all -> 0x00ed }
            X.CwE r3 = new X.CwE     // Catch:{ all -> 0x00ea }
            r3.<init>(r10, r2)     // Catch:{ all -> 0x00ea }
            r0.put(r2, r3)     // Catch:{ all -> 0x00ea }
            monitor-exit(r1)     // Catch:{ all -> 0x00ed }
            r9 = 1
            goto L_0x0047
        L_0x0046:
            r9 = 0
        L_0x0047:
            monitor-exit(r10)     // Catch:{ all -> 0x00ed }
            android.util.Pair r5 = android.util.Pair.create(r11, r12)     // Catch:{ all -> 0x00f0 }
            monitor-enter(r3)     // Catch:{ all -> 0x00f0 }
            X.DDF r8 = r3.A07     // Catch:{ all -> 0x00e7 }
            java.lang.Object r1 = r3.A05     // Catch:{ all -> 0x00e7 }
            monitor-enter(r8)     // Catch:{ all -> 0x00e7 }
            java.util.Map r0 = r8.A03     // Catch:{ all -> 0x00e4 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00e4 }
            X.CwE r0 = (X.C26269CwE) r0     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e7 }
            if (r0 == r3) goto L_0x0075
            monitor-exit(r3)     // Catch:{ all -> 0x00e7 }
            goto L_0x002c
        L_0x005f:
            X.Cbv r4 = r5.A07     // Catch:{ all -> 0x00f0 }
            java.lang.Object r3 = r5.A08     // Catch:{ all -> 0x00f0 }
            android.net.Uri r0 = r4.A03     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x00f0 }
            X.Clx r1 = r4.A06     // Catch:{ all -> 0x00f0 }
            X.CmA r0 = r4.A04     // Catch:{ all -> 0x00f0 }
            X.DAM r4 = new X.DAM     // Catch:{ all -> 0x00f0 }
            r4.<init>(r0, r1, r2)     // Catch:{ all -> 0x00f0 }
            r4.A00 = r3     // Catch:{ all -> 0x00f0 }
            goto L_0x0026
        L_0x0075:
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A06     // Catch:{ all -> 0x00e7 }
            r0.add(r5)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayList r7 = X.C26269CwE.A02(r3)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayList r6 = X.C26269CwE.A03(r3)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayList r0 = X.C26269CwE.A01(r3)     // Catch:{ all -> 0x00e7 }
            java.io.Closeable r4 = r3.A04     // Catch:{ all -> 0x00e7 }
            float r2 = r3.A00     // Catch:{ all -> 0x00e7 }
            int r1 = r3.A01     // Catch:{ all -> 0x00e7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e7 }
            X.DDI.A01(r7)     // Catch:{ all -> 0x00f0 }
            X.DDI.A02(r6)     // Catch:{ all -> 0x00f0 }
            X.DDI.A00(r0)     // Catch:{ all -> 0x00f0 }
            monitor-enter(r5)     // Catch:{ all -> 0x00f0 }
            monitor-enter(r3)     // Catch:{ all -> 0x00e1 }
            java.io.Closeable r0 = r3.A04     // Catch:{ all -> 0x00de }
            if (r4 != r0) goto L_0x009f
            if (r4 == 0) goto L_0x00ad
            goto L_0x00a1
        L_0x009f:
            r4 = 0
            goto L_0x00ad
        L_0x00a1:
            boolean r0 = r8 instanceof X.C22861BSp     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00af
            X.DRJ r4 = (X.DRJ) r4     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x009f
            X.DRJ r4 = r4.A07()     // Catch:{ all -> 0x00de }
        L_0x00ad:
            monitor-exit(r3)     // Catch:{ all -> 0x00de }
            goto L_0x00b8
        L_0x00af:
            X.DRN r4 = (X.DRN) r4     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x009f
            X.DRN r4 = r4.A04()     // Catch:{ all -> 0x00de }
            goto L_0x00ad
        L_0x00b8:
            if (r4 == 0) goto L_0x00c8
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c2
            r11.A05(r2)     // Catch:{ all -> 0x00e1 }
        L_0x00c2:
            r11.A07(r4, r1)     // Catch:{ all -> 0x00e1 }
            X.C26269CwE.A05(r4)     // Catch:{ all -> 0x00e1 }
        L_0x00c8:
            monitor-exit(r5)     // Catch:{ all -> 0x00e1 }
            r0 = 5
            X.C25027CUe.A00(r12, r5, r3, r0)     // Catch:{ all -> 0x00f0 }
            if (r9 == 0) goto L_0x00da
            boolean r0 = r12.Bfu()     // Catch:{ all -> 0x00f0 }
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf((boolean) r0)     // Catch:{ all -> 0x00f0 }
            X.C26269CwE.A04(r0, r3)     // Catch:{ all -> 0x00f0 }
        L_0x00da:
            X.C26212Cuq.A00()
            return
        L_0x00de:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ef
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ef
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ed }
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00ed }
        L_0x00ef:
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            X.C26212Cuq.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDF.CCn(X.CcD, X.ECs):void");
    }
}
