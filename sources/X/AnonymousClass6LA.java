package X;

/* renamed from: X.6LA  reason: invalid class name */
public class AnonymousClass6LA extends C38471rL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass6LA(Object obj, int i, Object obj2, int i2, int i3) {
        this.A00 = i3;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r3.A3U(r6.A01, r6.A02, 2);
        r2 = (java.lang.String[]) r6.A03;
        r3.A09 = true;
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r1 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        X.AnonymousClass74O.A0H(r1, r2);
        X.C110885hR.A0B(r3, r2, 0);
        X.C72463Mc.A19(r3, 2131433771);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r0 = "waSharedPreferences";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r0 = "funnelLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x006b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r6.A04
            com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity r3 = (com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity) r3
            java.lang.String r2 = r3.A08
            if (r2 == 0) goto L_0x001c
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r0.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "continue"
            r1.A0I(r2, r0)
        L_0x001c:
            X.4XB r4 = r3.A00
            if (r4 == 0) goto L_0x00a4
            java.lang.Integer r2 = r3.A01
            r1 = 85
            X.2Hl r0 = new X.2Hl
            r0.<init>()
            X.AnonymousClass3MZ.A1T(r0, r2)
            X.AnonymousClass4XB.A00(r0, r4, r1)
        L_0x002f:
            int r2 = r6.A01
            int r1 = r6.A02
            r0 = 2
            r3.A3U(r2, r1, r0)
            java.lang.Object r2 = r6.A03
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0 = 1
            r3.A09 = r0
            X.0z4 r1 = r3.A04
            if (r1 == 0) goto L_0x0068
            r0 = 0
            X.AnonymousClass74O.A0H(r1, r2)
            X.C110885hR.A0B(r3, r2, r0)
            r0 = 2131433771(0x7f0b192b, float:1.8489337E38)
            X.C72463Mc.A19(r3, r0)
            return
        L_0x0050:
            java.lang.Object r3 = r6.A04
            com.whatsapp.RequestPermissionActivity r3 = (com.whatsapp.RequestPermissionActivity) r3
            java.lang.String r2 = r3.A08
            if (r2 == 0) goto L_0x002f
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r0.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "continue"
            r1.A0I(r2, r0)
            goto L_0x002f
        L_0x0068:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x00a6
        L_0x006b:
            java.lang.Object r5 = r6.A04
            X.61I r5 = (X.AnonymousClass61I) r5
            java.lang.Object r4 = r6.A03
            X.77d r4 = (X.C1418377d) r4
            java.util.List r0 = X.C42011xT.A0I
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = r4.A0B
            if (r0 != 0) goto L_0x0092
            X.1Ns r2 = r5.A07
            java.lang.String r1 = r4.A0F
            if (r1 != 0) goto L_0x0085
            java.lang.String r1 = ""
        L_0x0085:
            java.lang.String r0 = r4.A0E
            java.io.File r0 = r2.A04(r1, r0)
            X.77d r4 = r4.A00()
            X.C108945cZ.A1O(r4, r0)
        L_0x0092:
            int r0 = r6.A02
            int r3 = r6.A01
            X.88B r2 = r5.A0A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.C6w(r0, r4, r1, r3)
            return
        L_0x00a1:
            java.lang.String r0 = "funnelLogger"
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r0 = "metaAiVoiceJourneyLogger"
        L_0x00a6:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LA.A04(android.view.View):void");
    }
}
