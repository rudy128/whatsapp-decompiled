package X;

import com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet;

/* renamed from: X.Azi  reason: case insensitive filesystem */
public final class C22228Azi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BrazilHostedPaymentPageBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22228Azi(BrazilHostedPaymentPageBottomSheet brazilHostedPaymentPageBottomSheet) {
        super(1);
        this.this$0 = brazilHostedPaymentPageBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r5.equals("PENDING") != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r1 = r4.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if ((r1.A1B() instanceof X.C22463B8v) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        X.C21426Ajt.A00(r1.A2K(), r4.this$0, 9);
        r4.this$0.A28();
        r2 = r4.this$0.A1B();
        X.C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet.Callback");
        r2 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) ((X.C22463B8v) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        switch(r3) {
            case -1753873386: goto L_0x0068;
            case 35394935: goto L_0x006b;
            case 696544716: goto L_0x006e;
            default: goto L_0x0061;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r1 = X.AnonymousClass000.A10();
        r0 = "Unsupported handling payment compliance status: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r1 = "NEEDS_MORE_INFO";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r1 = "PENDING";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r1 = "BLOCKED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r5.equals(r1) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        r2.A0D.A01.A0E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r5.equals(r0) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            int r3 = r5.hashCode()
            r0 = -1753873386(0xffffffff97760416, float:-7.9492044E-25)
            if (r3 == r0) goto L_0x007e
            r0 = 35394935(0x21c1577, float:1.146723E-37)
            if (r3 == r0) goto L_0x002d
            r0 = 696544716(0x29846dcc, float:5.881024E-14)
            if (r3 != r0) goto L_0x0021
            java.lang.String r0 = "BLOCKED"
        L_0x001b:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0035
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported eligibility compliance status: "
        L_0x0027:
            X.C17900vP.A0e(r0, r5, r1)
        L_0x002a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002d:
            java.lang.String r0 = "PENDING"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
        L_0x0035:
            com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet r1 = r4.this$0
            X.1FL r0 = r1.A1B()
            boolean r0 = r0 instanceof X.C22463B8v
            if (r0 == 0) goto L_0x002a
            X.1KB r2 = r1.A2K()
            com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet r1 = r4.this$0
            r0 = 9
            X.C21426Ajt.A00(r2, r1, r0)
            com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet r0 = r4.this$0
            r0.A28()
            com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet r0 = r4.this$0
            X.1FL r2 = r0.A1B()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet.Callback"
            X.C18070vi.A0z(r2, r0)
            X.B8v r2 = (X.C22463B8v) r2
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r2 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r2
            switch(r3) {
                case -1753873386: goto L_0x0068;
                case 35394935: goto L_0x006b;
                case 696544716: goto L_0x006e;
                default: goto L_0x0061;
            }
        L_0x0061:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported handling payment compliance status: "
            goto L_0x0027
        L_0x0068:
            java.lang.String r1 = "NEEDS_MORE_INFO"
            goto L_0x0070
        L_0x006b:
            java.lang.String r1 = "PENDING"
            goto L_0x0070
        L_0x006e:
            java.lang.String r1 = "BLOCKED"
        L_0x0070:
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel r0 = r2.A0D
            X.1DT r0 = r0.A01
            r0.A0E(r1)
            goto L_0x002a
        L_0x007e:
            java.lang.String r0 = "NEEDS_MORE_INFO"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22228Azi.invoke(java.lang.Object):java.lang.Object");
    }
}
