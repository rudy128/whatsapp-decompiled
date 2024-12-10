package X;

/* renamed from: X.3CU  reason: invalid class name */
public class AnonymousClass3CU implements Runnable {
    public final AnonymousClass11S A00;
    public final C25161Nd A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1R3 A05;
    public final C70313Ao A06;
    public final C28611ac A07;
    public final AnonymousClass1Nb A08;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r0.A0H() != null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            X.1Nd r0 = r9.A01
            java.util.ArrayList r0 = r0.A0B()
            r0.size()
            java.util.Iterator r8 = r0.iterator()
            r3 = 0
        L_0x000e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007e
            X.1BI r2 = X.C17880vN.A0Q(r8)
            X.1CJ r1 = r9.A04
            boolean r0 = r1.A0S(r2)
            if (r0 != 0) goto L_0x000e
            int r6 = r1.A03(r2)
            if (r6 <= 0) goto L_0x000e
            X.1Nb r5 = r9.A08
            X.1yM r0 = r5.A0a(r2)
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x007c
            X.1R3 r1 = r9.A05
            r0 = 7
            int r0 = java.lang.Math.min(r6, r0)
            java.util.ArrayList r0 = r1.A07(r2, r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0041:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x000e
            X.206 r4 = X.C17880vN.A0Y(r7)
            java.util.List r1 = r4.A0h
            X.11S r0 = r9.A00
            boolean r2 = X.AnonymousClass4aJ.A05(r0, r1)
            X.206 r0 = r4.A0K()
            if (r0 == 0) goto L_0x0060
            X.1BI r0 = r0.A0H()
            r1 = 1
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            boolean r0 = X.C22971Dz.A0f(r4)
            if (r0 == 0) goto L_0x0041
            if (r1 != 0) goto L_0x006b
            if (r2 == 0) goto L_0x0041
        L_0x006b:
            X.1BI r0 = r4.A0H()
            X.C17960vV.A07(r0)
            X.1yM r0 = r5.A0a(r0)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0041
        L_0x007c:
            int r3 = r3 + r6
            goto L_0x000e
        L_0x007e:
            X.3Ao r1 = r9.A06
            X.C70313Ao.A02(r1)
            X.2qZ r0 = r1.A01
            if (r0 == 0) goto L_0x009a
            java.util.ArrayList r0 = r0.A01()
        L_0x008b:
            int r0 = r0.size()
            int r3 = r3 + r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WidgetUpdater/updatebadge count:"
            X.C17900vP.A0j(r0, r1, r3)
            goto L_0x009d
        L_0x009a:
            java.util.List r0 = r1.A00
            goto L_0x008b
        L_0x009d:
            X.1ac r2 = r9.A07     // Catch:{ Exception -> 0x00a9 }
            X.118 r0 = r9.A03     // Catch:{ Exception -> 0x00a9 }
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x00a9 }
            X.11C r0 = r9.A02     // Catch:{ Exception -> 0x00a9 }
            r2.A03(r1, r0, r3)     // Catch:{ Exception -> 0x00a9 }
            return
        L_0x00a9:
            r1 = move-exception
            java.lang.String r0 = "WidgetUpdater/updateBadge failure"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CU.run():void");
    }

    public AnonymousClass3CU(AnonymousClass11S r1, C25161Nd r2, AnonymousClass11C r3, AnonymousClass118 r4, AnonymousClass1CJ r5, AnonymousClass1R3 r6, C70313Ao r7, C28611ac r8, AnonymousClass1Nb r9) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r9;
        this.A01 = r2;
        this.A06 = r7;
    }
}
