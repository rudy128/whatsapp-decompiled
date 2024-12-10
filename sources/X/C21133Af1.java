package X;

/* renamed from: X.Af1  reason: case insensitive filesystem */
public class C21133Af1 implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r3.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01df, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            r8 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0288;
                case 1: goto L_0x0278;
                case 2: goto L_0x025f;
                case 3: goto L_0x024c;
                case 4: goto L_0x0233;
                case 5: goto L_0x0018;
                case 6: goto L_0x021a;
                case 7: goto L_0x0204;
                case 8: goto L_0x01ef;
                case 9: goto L_0x01cd;
                case 10: goto L_0x01bd;
                case 11: goto L_0x01ab;
                case 12: goto L_0x0186;
                case 13: goto L_0x0165;
                case 14: goto L_0x0130;
                case 15: goto L_0x00ea;
                case 16: goto L_0x00c4;
                case 17: goto L_0x008c;
                case 18: goto L_0x005a;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r14.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r14.A02
            java.lang.String r8 = (java.lang.String) r8
            r1 = 5
            X.7Qz r0 = new X.7Qz
            r0.<init>(r3, r2, r8, r1)
            r3.runOnUiThread(r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r4 = r14.A01
            X.1hB r4 = (X.C32431hB) r4
            java.lang.Object r5 = r14.A02
            X.21V r5 = (X.AnonymousClass21V) r5
            X.205 r3 = r5.A0v
            X.1h1 r2 = r4.A09
            r1 = 11
            r0 = 0
            r2.A01(r0, r3, r1)
            X.11S r2 = r4.A04
            boolean r0 = r2.A0N()
            X.1Mn r1 = r4.A0D
            if (r0 == 0) goto L_0x029e
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A01(r2)
            X.1BI r0 = r3.A00
            boolean r0 = X.C22971Dz.A0R(r0)
            if (r0 != 0) goto L_0x0017
            X.2rc r0 = r5.A02
            if (r0 == 0) goto L_0x0017
            byte[] r3 = r0.A0a
            if (r3 == 0) goto L_0x0017
            X.1Mm r2 = r1.A00
            X.C17960vV.A07(r0)
            X.C17960vV.A07(r3)
            r1 = 0
            com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob r0 = new com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob
            r0.<init>(r4, r5, r1, r3)
            r2.A01(r0)
            return
        L_0x005a:
            java.lang.Object r1 = r14.A01
            X.Aah r1 = (X.C20865Aah) r1
            java.lang.Object r4 = r14.A02
            X.1KN r4 = (X.AnonymousClass1KN) r4
            X.2f6 r8 = (X.C55032f6) r8
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r3 = r1.A00
            X.A7l r2 = r3.A0V
            X.1BI r6 = r3.A0G
            X.C17960vV.A07(r6)
            com.whatsapp.jid.UserJid r7 = r3.A0J
            long r12 = r3.A02
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0J
            java.lang.String r10 = r0.getPaymentNote()
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0J
            java.util.List r11 = r0.getMentionedJids()
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0J
            X.AEX r5 = r0.getPaymentBackground()
            X.AaV r9 = new X.AaV
            r9.<init>(r1)
            r2.A05(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x008c:
            java.lang.Object r3 = r14.A02
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r3 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r3
            java.util.List r8 = (java.util.List) r8
            r0 = 2
            X.C18070vi.A0d(r8, r0)
            r3.A0K = r8
            X.AEs r0 = r3.A04
            if (r0 != 0) goto L_0x00aa
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = X.C108955ca.A0p(r8)
            X.AEs r0 = (X.C20284AEs) r0
            r3.A04 = r0
        L_0x00aa:
            X.8Hq r2 = r3.A09
            java.lang.String r1 = "methodListAdapter"
            if (r2 == 0) goto L_0x00bf
            java.util.List r0 = com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A00(r3)
            r2.A0U(r0)
            X.8Hq r0 = r3.A09
            if (r0 == 0) goto L_0x00bf
            r0.notifyDataSetChanged()
            return
        L_0x00bf:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x00c4:
            java.lang.Object r4 = r14.A01
            com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2 r4 = (com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2) r4
            java.lang.Object r3 = r14.A02
            X.9sW r3 = (X.C194929sW) r3
            java.lang.String r8 = (java.lang.String) r8
            X.C18070vi.A0j(r3, r8)
            java.lang.String r2 = r4.A0B
            com.whatsapp.jid.UserJid r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.ChatJid"
            X.C18070vi.A0z(r1, r0)
            java.lang.String r0 = "add_non_native_p2m_payment_method"
            com.whatsapp.payments.ui.BrazilPixSendKeyBottomSheet r2 = X.AnonymousClass9RH.A00(r3, r1, r2, r0, r8)
            X.1GP r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "BrazilPixSendKeyBottomSheet"
            X.C20098A7b.A03(r2, r1, r0)
            return
        L_0x00ea:
            java.lang.Object r4 = r14.A01
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            java.lang.Object r3 = r14.A02
            X.1KN r3 = (X.AnonymousClass1KN) r3
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r2 = r8.iterator()
        L_0x00f8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0115
            X.AEs r1 = X.AnonymousClass8BR.A0P(r2)
            boolean r0 = X.A8e.A08(r1)
            if (r0 == 0) goto L_0x00f8
            X.8pb r0 = r1.A08
            if (r0 == 0) goto L_0x00f8
            int r1 = r1.A00
            r0 = 2
            if (r1 != r0) goto L_0x00f8
            r4.A4q(r3)
            return
        L_0x0115:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x012c
            int r0 = X.A8e.A01(r8)
            java.lang.Object r1 = r8.get(r0)
            X.1KB r3 = r4.A05
            r0 = 6
            X.Ajz r2 = new X.Ajz
            r2.<init>(r4, r1, r0)
            goto L_0x01a7
        L_0x012c:
            java.lang.String r0 = "PAY: BrazilPaymentActivity/onRequestPayment: Can't launch ConfirmReceiveFragment"
            goto L_0x01df
        L_0x0130:
            java.lang.Object r4 = r14.A01
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            java.lang.Object r1 = r14.A02
            android.content.Intent r1 = (android.content.Intent) r1
            java.util.List r8 = (java.util.List) r8
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A0T
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = "payment_method_credential_id"
            java.lang.String r3 = r1.getStringExtra(r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x0148:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015f
            X.AEs r1 = X.AnonymousClass8BR.A0P(r2)
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0148
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A0T
            r0.C0I(r1)
        L_0x015f:
            X.Af0 r0 = r4.A04
            r0.A0D()
            return
        L_0x0165:
            java.lang.Object r4 = r14.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.Object r3 = r14.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            java.util.List r8 = (java.util.List) r8
            X.C17960vV.A07(r8)
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r2 = com.whatsapp.payments.ui.PaymentMethodsListPickerFragment.A00(r8)
            r0 = 0
            r2.A1V(r4, r0)
            r1 = 0
            X.Aa7 r0 = new X.Aa7
            r0.<init>(r4, r1)
            r2.A05 = r0
            r3.A2L(r2)
            return
        L_0x0186:
            java.lang.Object r2 = r14.A01
            X.8zn r2 = (X.C176108zn) r2
            java.lang.Object r4 = r14.A02
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r0 != 0) goto L_0x0197
            java.lang.String r0 = "PAY: BrazilPaymentService/onAcceptPayment: Can't launch the 'ConfirmReceiveFragment'."
            goto L_0x01df
        L_0x0197:
            int r0 = X.A8e.A01(r8)
            java.lang.Object r1 = r8.get(r0)
            X.1KB r3 = r2.A02
            r0 = 3
            X.Ajz r2 = new X.Ajz
            r2.<init>(r1, r4, r0)
        L_0x01a7:
            r3.A0J(r2)
            return
        L_0x01ab:
            java.lang.Object r4 = r14.A01
            X.1if r4 = (X.C33341if) r4
            java.lang.Object r3 = r14.A02
            X.1ex r2 = r4.A08
            r1 = 0
            X.AXO r0 = new X.AXO
            r0.<init>(r4, r3, r1)
            r2.A0A(r0)
            return
        L_0x01bd:
            java.lang.Object r1 = r14.A01
            X.8ze r1 = (X.C176018ze) r1
            java.lang.Object r0 = r14.A02
            X.1jB r0 = (X.C33661jB) r0
            java.util.List r8 = (java.util.List) r8
            r1.A00 = r8
            r0.C3Y(r1)
            return
        L_0x01cd:
            java.lang.Object r2 = r14.A01
            X.A5D r2 = (X.A5D) r2
            boolean r0 = X.AnonymousClass000.A1Y(r15)
            java.lang.String r1 = "BrazilPaymentMerchantHelper"
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "triggerMerchantOnboarding -> merchant onboarding failed. Something went wrong"
            java.lang.String r0 = X.AnonymousClass1QE.A01(r1, r0)
        L_0x01df:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01e3:
            X.0zA r0 = r2.A00
            r0.A03()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01ef:
            java.lang.Object r4 = r14.A01
            X.7It r4 = (X.C144807It) r4
            java.lang.Object r3 = r14.A02
            X.BC9 r3 = (X.BC9) r3
            long r1 = X.AnonymousClass8BX.A08(r15, r4)
            X.AwK r0 = new X.AwK
            r0.<init>(r3, r1)
            X.C144807It.A00(r4, r0)
            return
        L_0x0204:
            java.lang.Object r2 = r14.A01
            X.7It r2 = (X.C144807It) r2
            java.lang.Object r1 = r14.A02
            X.BC9 r1 = (X.BC9) r1
            android.util.Pair r8 = (android.util.Pair) r8
            X.C18070vi.A0i(r2, r8)
            X.AwJ r0 = new X.AwJ
            r0.<init>(r8, r1)
            X.C144807It.A00(r2, r0)
            return
        L_0x021a:
            java.lang.Object r3 = r14.A01
            X.7It r3 = (X.C144807It) r3
            java.lang.Object r2 = r14.A02
            X.BC9 r2 = (X.BC9) r2
            boolean r1 = X.AnonymousClass000.A1Y(r15)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.AwI r0 = new X.AwI
            r0.<init>(r2, r1)
            X.C144807It.A00(r3, r0)
            return
        L_0x0233:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r0 = r14.A01
            X.Af0 r0 = (X.C21132Af0) r0
            r0.A0D()
            java.lang.Object r1 = r14.A02
            X.1dr r1 = (X.C30391dr) r1
            X.1IU r0 = X.C108945cZ.A1J(r8)
            r1.resumeWith(r0)
            return
        L_0x024c:
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            java.lang.Object r0 = r14.A01
            X.Af0 r0 = (X.C21132Af0) r0
            r0.A0D()
            java.lang.Object r0 = r14.A02
            X.1dr r0 = (X.C30391dr) r0
            r0.resumeWith(r15)
            return
        L_0x025f:
            java.lang.Object r5 = r14.A01
            X.A99 r5 = (X.A99) r5
            java.lang.Object r4 = r14.A02
            X.0zA r8 = (X.C19880zA) r8
            java.lang.Object r3 = r8.A04()
            X.1KB r2 = r5.A22
            r1 = 28
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r5, r3, r4, r1)
            r2.CGP(r0)
            return
        L_0x0278:
            java.lang.Object r3 = r14.A01
            X.24f r3 = (X.C446424f) r3
            java.lang.Object r2 = r14.A02
            r1 = 1
            X.C18070vi.A0e(r2, r1, r15)
            X.10I r0 = r3.A05
            X.C21434Ak1.A00(r0, r3, r15, r2, r1)
            return
        L_0x0288:
            java.lang.Object r3 = r14.A01
            X.1DS r3 = (X.AnonymousClass1DS) r3
            java.lang.Object r2 = r14.A02
            X.1z1 r2 = (X.C42961z1) r2
            r1 = 0
            X.1E7 r0 = r2.A08
            if (r0 != 0) goto L_0x0298
            X.C42961z1.A00(r2, r1)
        L_0x0298:
            X.1E7 r0 = r2.A08
            r3.A0E(r0)
            return
        L_0x029e:
            r1.A01(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21133Af1.accept(java.lang.Object):void");
    }

    public C21133Af1(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(C21132Af0 af0, Object obj, Object obj2, int i) {
        af0.A09(new C21133Af1(obj, obj2, i));
    }
}
