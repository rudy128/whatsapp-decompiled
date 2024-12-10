package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TM  reason: invalid class name */
public final class AnonymousClass5TM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TM(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r6 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r0 == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            com.whatsapp.newsletter.NewsletterInfoActivity r8 = r15.this$0
            X.3VG r1 = r8.A0j
            java.lang.String r4 = "newsletterInsightsViewModel"
            r7 = 0
            if (r1 == 0) goto L_0x0165
            java.lang.String r0 = "NETWORK_ERROR"
            boolean r14 = r1.A0W(r0)
            X.3VG r1 = r8.A0j
            if (r1 == 0) goto L_0x0165
            java.lang.String r0 = "UNAVAILABLE"
            boolean r12 = r1.A0W(r0)
            X.3VG r1 = r8.A0j
            if (r1 == 0) goto L_0x0165
            X.4Uu r0 = X.C821643h.A0B
            X.5W1 r3 = X.AnonymousClass5W1.A00
            java.lang.Integer r11 = r1.A0T(r0, r3)
            X.3VG r1 = r8.A0j
            if (r1 == 0) goto L_0x0165
            X.4Uu r0 = X.C821643h.A07
            java.lang.Integer r2 = r1.A0T(r0, r3)
            X.3VG r1 = r8.A0j
            if (r1 == 0) goto L_0x0165
            X.4Uu r0 = X.C821643h.A06
            java.lang.Integer r6 = r1.A0T(r0, r3)
            X.3VG r1 = r8.A0j
            if (r1 == 0) goto L_0x0165
            if (r11 == 0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            boolean r0 = r11.equals(r2)
            if (r0 != 0) goto L_0x006a
            boolean r0 = X.AnonymousClass3VG.A04(r1)
            if (r0 == 0) goto L_0x006a
            int r1 = r2.intValue()
            float r2 = (float) r1
            int r0 = r11.intValue()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r2 = r2 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            if (r0 == 0) goto L_0x006a
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0161
            X.4CY r7 = X.AnonymousClass4CY.UP
        L_0x006a:
            X.2Dk r0 = r8.A4l()
            if (r0 == 0) goto L_0x015d
            long r2 = r0.A0G
        L_0x0072:
            X.0ve r1 = r8.A0E
            r0 = 9447(0x24e7, float:1.3238E-41)
            X.0vf r9 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r9, r1, r0)
            long r0 = (long) r0
            r5 = 0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 0
            if (r10 < 0) goto L_0x0084
            r4 = 1
        L_0x0084:
            if (r11 == 0) goto L_0x0089
            r0 = 1
            if (r6 != 0) goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r12 != 0) goto L_0x008f
            r13 = 0
            if (r0 != 0) goto L_0x0090
        L_0x008f:
            r13 = 1
        L_0x0090:
            X.0vl r3 = r8.A1L
            android.view.View r1 = X.AnonymousClass3MW.A0A(r3)
            r0 = 2131435059(0x7f0b1e33, float:1.849195E38)
            android.view.View r1 = r1.findViewById(r0)
            X.C18070vi.A0b(r1)
            int r0 = X.C72453Mb.A0J(r4)
            r1.setVisibility(r0)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r3)
            r0 = 2131431662(0x7f0b10ee, float:1.848506E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r14 == 0) goto L_0x0108
            X.0vl r1 = r8.A1K
            X.1bI r0 = X.AnonymousClass3MX.A0v(r1)
            android.view.View r0 = r0.A00
            if (r0 != 0) goto L_0x00ce
            android.view.View r1 = X.C72463Mc.A0O(r1)
            r0 = 2131431696(0x7f0b1110, float:1.8485128E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 30
            X.C90054dS.A00(r1, r8, r0)
        L_0x00ce:
            r0 = 4
        L_0x00cf:
            r2.setVisibility(r0)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r3)
            r0 = 2131431659(0x7f0b10eb, float:1.8485053E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setEnabled(r4)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r3)
            r0 = 2131431661(0x7f0b10ed, float:1.8485058E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setEnabled(r4)
            android.view.View r1 = X.AnonymousClass3MW.A0A(r3)
            r0 = 2131431684(0x7f0b1104, float:1.8485104E38)
            android.view.View r1 = r1.findViewById(r0)
            X.C18070vi.A0b(r1)
            r0 = r4 ^ 1
            if (r0 != 0) goto L_0x0102
            r5 = 8
        L_0x0102:
            r1.setVisibility(r5)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0108:
            X.C18070vi.A0b(r2)
            r0 = 2131431659(0x7f0b10eb, float:1.8485053E38)
            android.view.View r12 = r2.findViewById(r0)
            com.whatsapp.insights.InsightsTileView r12 = (com.whatsapp.insights.InsightsTileView) r12
            r0 = 2131431661(0x7f0b10ed, float:1.8485058E38)
            android.view.View r10 = r2.findViewById(r0)
            com.whatsapp.insights.InsightsTileView r10 = (com.whatsapp.insights.InsightsTileView) r10
            if (r13 == 0) goto L_0x0131
            r1 = 0
            if (r12 == 0) goto L_0x0129
            r0 = 1
            r12.A00(r1, r0)
            r12.setArrow(r1)
        L_0x0129:
            if (r10 == 0) goto L_0x012f
            r0 = 1
            r10.A00(r1, r0)
        L_0x012f:
            r0 = 0
            goto L_0x00cf
        L_0x0131:
            if (r12 == 0) goto L_0x0144
            r0 = 1
            r12.A00(r11, r0)
            X.0ve r1 = r8.A0E
            r0 = 9792(0x2640, float:1.3722E-41)
            boolean r0 = X.C18020vd.A05(r9, r1, r0)
            if (r0 != 0) goto L_0x0144
            r12.setArrow(r7)
        L_0x0144:
            if (r10 == 0) goto L_0x0149
            r10.A00(r6, r5)
        L_0x0149:
            X.0vl r1 = r8.A1K
            X.1bI r0 = X.AnonymousClass3MX.A0v(r1)
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x012f
            android.view.View r1 = X.C72463Mc.A0O(r1)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x012f
        L_0x015d:
            r2 = 0
            goto L_0x0072
        L_0x0161:
            X.4CY r7 = X.AnonymousClass4CY.DOWN
            goto L_0x006a
        L_0x0165:
            X.C18070vi.A11(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TM.invoke(java.lang.Object):java.lang.Object");
    }
}
