package X;

/* renamed from: X.6L9  reason: invalid class name */
public class AnonymousClass6L9 extends C38471rL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass6L9(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r0 = "metaAiVoiceJourneyLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r4.A3U(r5.A01, r5.A02, 2);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        X.AnonymousClass4aU.A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r4.A3U(r5.A01, r5.A02, 3);
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r0 = "funnelLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0073;
                case 2: goto L_0x0045;
                case 3: goto L_0x0017;
                case 4: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r5.A03
            com.whatsapp.RequestPermissionActivity r3 = (com.whatsapp.RequestPermissionActivity) r3
            int r2 = r5.A01
            int r1 = r5.A02
            r0 = 2
            r3.A3U(r2, r1, r0)
            java.lang.String r0 = "com.whatsapp.w4b"
            X.AnonymousClass4aU.A07(r3, r0)
            return
        L_0x0017:
            java.lang.Object r4 = r5.A03
            com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity r4 = (com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity) r4
            X.4XB r3 = r4.A00
            if (r3 == 0) goto L_0x0070
            java.lang.Integer r2 = r4.A01
            r1 = 85
            X.2Hl r0 = new X.2Hl
            r0.<init>()
            X.AnonymousClass3MZ.A1T(r0, r2)
            X.AnonymousClass4XB.A00(r0, r3, r1)
            goto L_0x0077
        L_0x002f:
            java.lang.Object r4 = r5.A03
            com.whatsapp.RequestPermissionActivity r4 = (com.whatsapp.RequestPermissionActivity) r4
            int r2 = r5.A01
            int r1 = r5.A02
            r0 = 2
            r4.A3U(r2, r1, r0)
            boolean r0 = X.AnonymousClass112.A03()
            if (r0 == 0) goto L_0x007f
            X.AnonymousClass4aU.A06(r4)
            return
        L_0x0045:
            java.lang.Object r4 = r5.A03
            com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity r4 = (com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity) r4
            java.lang.String r2 = r4.A08
            if (r2 == 0) goto L_0x005c
            X.00H r0 = r4.A07
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r0.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "not_now"
            r1.A0I(r2, r0)
        L_0x005c:
            X.4XB r3 = r4.A00
            if (r3 == 0) goto L_0x0070
            java.lang.Integer r2 = r4.A01
            r1 = 77
            X.2Hl r0 = new X.2Hl
            r0.<init>()
            X.AnonymousClass3MZ.A1T(r0, r2)
            X.AnonymousClass4XB.A00(r0, r3, r1)
            goto L_0x009a
        L_0x0070:
            java.lang.String r0 = "metaAiVoiceJourneyLogger"
            goto L_0x00a8
        L_0x0073:
            java.lang.Object r4 = r5.A03
            com.whatsapp.RequestPermissionActivity r4 = (com.whatsapp.RequestPermissionActivity) r4
        L_0x0077:
            int r2 = r5.A01
            int r1 = r5.A02
            r0 = 2
            r4.A3U(r2, r1, r0)
        L_0x007f:
            X.AnonymousClass4aU.A05(r4)
            return
        L_0x0083:
            java.lang.Object r4 = r5.A03
            com.whatsapp.RequestPermissionActivity r4 = (com.whatsapp.RequestPermissionActivity) r4
            java.lang.String r2 = r4.A08
            if (r2 == 0) goto L_0x009a
            X.00H r0 = r4.A07
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r0.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "not_now"
            r1.A0I(r2, r0)
        L_0x009a:
            int r2 = r5.A01
            int r1 = r5.A02
            r0 = 3
            r4.A3U(r2, r1, r0)
            r4.finish()
            return
        L_0x00a6:
            java.lang.String r0 = "funnelLogger"
        L_0x00a8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L9.A04(android.view.View):void");
    }
}
