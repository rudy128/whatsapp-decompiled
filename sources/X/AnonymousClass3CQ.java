package X;

/* renamed from: X.3CQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass2H8 A04;
    public final /* synthetic */ AnonymousClass1BI A05;
    public final /* synthetic */ C36331ni A06;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        if (r8 != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            X.1ni r6 = r11.A06
            X.2H8 r5 = r11.A04
            int r4 = r11.A00
            long r0 = r11.A03
            X.1BI r3 = r11.A05
            int r8 = r11.A01
            int r2 = r11.A02
            if (r5 != 0) goto L_0x0015
            X.2H8 r5 = new X.2H8
            r5.<init>()
        L_0x0015:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r5.A05 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0B = r0
            r7 = 3
            if (r4 != r7) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x0170
            r0 = 1
        L_0x002d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0031:
            r5.A04 = r9
        L_0x0033:
            if (r8 <= 0) goto L_0x0043
            long r0 = (long) r8
            r9 = 32
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x003d
            r9 = r0
        L_0x003d:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A0A = r0
        L_0x0043:
            if (r2 <= 0) goto L_0x005d
            long r0 = (long) r2
            r9 = 32
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x004d
            r9 = r0
        L_0x004d:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A09 = r0
            int r0 = X.C64002u3.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A03 = r0
        L_0x005d:
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r1 = X.C36321nh.A00(r3)
            if (r1 != 0) goto L_0x0168
            r8 = 0
        L_0x0066:
            boolean r1 = X.C22971Dz.A0T(r3)
            r2 = 1
            if (r4 == r7) goto L_0x0104
            r0 = 8
            if (r4 == r0) goto L_0x00fe
            r0 = 10
            if (r4 != r0) goto L_0x007b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
        L_0x0079:
            r5.A00 = r0
        L_0x007b:
            java.lang.Integer r0 = r5.A05
            int r1 = r0.intValue()
            r0 = 12
            X.18K r3 = r6.A09
            if (r1 != r0) goto L_0x00fa
            X.0vt r0 = new X.0vt
            r0.<init>(r2, r2)
            r3.CC6(r5, r0)
        L_0x008f:
            X.2Et r1 = new X.2Et
            r1.<init>()
            X.1Hc r0 = r6.A03
            boolean r0 = r0.A02()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            r3.CC7(r1)
            X.0ve r7 = r6.A08
            r0 = 7747(0x1e43, float:1.0856E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r7, r0)
            if (r0 == 0) goto L_0x00cd
            X.2FG r4 = new X.2FG
            r4.<init>()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A01 = r0
            r3.CC7(r4)
            X.2EW r0 = new X.2EW
            r0.<init>()
            r3.CC7(r0)
        L_0x00cd:
            r0 = 8011(0x1f4b, float:1.1226E-41)
            boolean r0 = X.C18020vd.A05(r5, r7, r0)
            if (r0 == 0) goto L_0x00f9
            java.util.Random r1 = r6.A0G
            r0 = 100
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x00f9
            X.2Ec r2 = new X.2Ec
            r2.<init>()
            r0 = 4248(0x1098, double:2.099E-320)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r2.A00 = r1
            r3.CC7(r2)
            X.2Eu r0 = new X.2Eu
            r0.<init>()
            r0.A00 = r1
            r3.CC7(r0)
        L_0x00f9:
            return
        L_0x00fa:
            r3.CC7(r5)
            goto L_0x008f
        L_0x00fe:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0079
        L_0x0104:
            if (r1 != 0) goto L_0x0109
            r0 = 0
            if (r8 == 0) goto L_0x010a
        L_0x0109:
            r0 = 1
        L_0x010a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            if (r3 == 0) goto L_0x0148
            X.0zA r1 = r6.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r1.A03()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r7 = r1.A03()
            X.1PW r7 = (X.AnonymousClass1PW) r7
            r4 = 0
            X.00H r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.1UD r0 = (X.AnonymousClass1UD) r0
            boolean r0 = r0.A06()
            r1 = 0
            if (r0 == 0) goto L_0x0146
            boolean r0 = X.C42701yb.A01(r3)
            if (r0 == 0) goto L_0x0164
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L_0x0146:
            r5.A01 = r1
        L_0x0148:
            X.0zA r1 = r6.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.A03()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            int r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x007b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A02 = r0
            goto L_0x007b
        L_0x0164:
            X.AnonymousClass1PW.A00(r7, r3)
            goto L_0x0146
        L_0x0168:
            X.1CJ r0 = r6.A06
            boolean r8 = r0.A0R(r1)
            goto L_0x0066
        L_0x0170:
            boolean r0 = X.C22971Dz.A0W(r3)
            r9 = 0
            if (r0 == 0) goto L_0x0196
            X.1CJ r1 = r6.A06
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A06(r0)
            if (r1 != r7) goto L_0x0185
            r0 = 4
            goto L_0x002d
        L_0x0185:
            r0 = 2
            if (r1 == r0) goto L_0x0190
            r0 = 6
            if (r1 == r0) goto L_0x0190
            if (r1 != 0) goto L_0x0031
            r0 = 2
            goto L_0x002d
        L_0x0190:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            goto L_0x0031
        L_0x0196:
            boolean r0 = X.C22971Dz.A0V(r3)
            if (r0 == 0) goto L_0x0031
            r0 = 5
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CQ.run():void");
    }

    public /* synthetic */ AnonymousClass3CQ(AnonymousClass2H8 r1, AnonymousClass1BI r2, C36331ni r3, int i, int i2, int i3, long j) {
        this.A06 = r3;
        this.A04 = r1;
        this.A00 = i;
        this.A03 = j;
        this.A05 = r2;
        this.A01 = i2;
        this.A02 = i3;
    }
}
