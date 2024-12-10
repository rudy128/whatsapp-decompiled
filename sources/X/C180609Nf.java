package X;

/* renamed from: X.9Nf  reason: invalid class name and case insensitive filesystem */
public abstract class C180609Nf {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
        r3.A0A(r2, r0.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        r4 = new X.C21427Aju(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r5.CGF(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r6 = this;
            r4 = r6
            X.8yc r4 = (X.C175378yc) r4
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0057;
                case 2: goto L_0x006b;
                case 3: goto L_0x00a5;
                case 4: goto L_0x0023;
                case 5: goto L_0x008c;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00cf;
                case 8: goto L_0x00d8;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r4 = r4.A01
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r4 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r4
            r3 = 0
            X.10I r2 = r4.A04
            r1 = 27
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.CGN(r0)
            r1 = 5
            X.AkF r0 = new X.AkF
            r0.<init>(r4, r1)
            r2.CGN(r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r2 = r4.A01
            X.91R r2 = (X.AnonymousClass91R) r2
            X.9Ak r1 = r2.A0H
            if (r1 == 0) goto L_0x0032
            r0 = 1
            r1.A0B(r0)
            r0 = 0
            r2.A0H = r0
        L_0x0032:
            boolean r0 = X.AnonymousClass8BR.A1P(r2)
            if (r0 == 0) goto L_0x0022
            X.9Ak r1 = new X.9Ak
            r1.<init>(r2)
            r2.A0H = r1
            X.10I r0 = r2.A05
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0045:
            java.lang.Object r1 = r4.A01
            com.whatsapp.payments.ui.BrazilPaymentActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r1
            X.Af0 r0 = r1.A04
            r0.A0D()
            X.1QS r0 = r1.A0Q
            X.Af0 r0 = X.A5I.A00(r0)
            r1.A04 = r0
            return
        L_0x0057:
            java.lang.Object r1 = r4.A01
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r1 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r1
            X.Af0 r0 = r1.A00
            if (r0 == 0) goto L_0x0062
            r0.A0D()
        L_0x0062:
            X.1QS r0 = r1.A02
            X.Af0 r0 = X.A5I.A00(r0)
            r1.A00 = r0
            return
        L_0x006b:
            java.lang.Object r1 = r4.A01
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r1 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r1
            X.1QS r0 = r1.A08
            if (r0 == 0) goto L_0x0089
            X.Af0 r3 = X.A5I.A00(r0)
            r0 = 17
            X.Af1 r2 = new X.Af1
            r2.<init>(r1, r4, r0)
            X.1KB r0 = r1.A00
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "globalUI"
        L_0x0084:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0089:
            java.lang.String r0 = "paymentsManager"
            goto L_0x0084
        L_0x008c:
            java.lang.Object r1 = r4.A01
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r1 = (com.whatsapp.payments.ui.PaymentMethodsListPickerFragment) r1
            X.1QS r0 = r1.A02
            X.Af0 r3 = X.A5I.A00(r0)
            r0 = 16
            X.Aef r2 = new X.Aef
            r2.<init>(r4, r0)
            X.1KB r0 = r1.A00
        L_0x009f:
            java.util.concurrent.Executor r0 = r0.A05
            r3.A0A(r2, r0)
            return
        L_0x00a5:
            java.lang.Object r3 = r4.A01
            X.933 r3 = (X.AnonymousClass933) r3
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = r3.A0B
            java.lang.String r0 = "ConfirmPaymentFragment"
            r3.A5K(r1, r0)
            r0 = 7
            X.AkE r2 = X.C21447AkE.A00(r4, r0)
            r1 = 1
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNA(r0)
            X.10I r5 = r3.A05
            r0 = 8
            X.7Qx r4 = new X.7Qx
            r4.<init>(r3, r2, r0, r1)
            goto L_0x00e5
        L_0x00c6:
            java.lang.Object r1 = r4.A01
            X.AXQ r1 = (X.AXQ) r1
            r0 = 0
            r1.A01(r0)
            return
        L_0x00cf:
            java.lang.Object r1 = r4.A01
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r1 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r1
            X.10I r5 = r1.A09
            r0 = 36
            goto L_0x00e0
        L_0x00d8:
            java.lang.Object r1 = r4.A01
            com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel r1 = (com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel) r1
            X.10I r5 = r1.A06
            r0 = 37
        L_0x00e0:
            X.Aju r4 = new X.Aju
            r4.<init>(r1, r0)
        L_0x00e5:
            r5.CGF(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180609Nf.A00():void");
    }
}
