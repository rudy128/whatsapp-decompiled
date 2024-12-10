package X;

/* renamed from: X.AkE  reason: case insensitive filesystem */
public class C21447AkE implements Runnable {
    public final int A00;
    public final Object A01;

    public C21447AkE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C21447AkE A00(Object obj, int i) {
        return new C21447AkE(obj, i);
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21447AkE(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.91R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: com.whatsapp.payments.ui.PaymentSettingsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: X.91R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: X.AW0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: com.whatsapp.payments.ui.IndiaUpiChangePinActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: X.91R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: X.91R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.AW0} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x032c, code lost:
        r3.startActivity(com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A03(r3, r3.A02, r3.A0b, r2));
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0337, code lost:
        r3.A4o();
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x033d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03e4, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0447, code lost:
        r2.A0J(new X.C21432Ajz(r3, r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x044f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        r1.A07 = java.lang.Integer.valueOf(r0);
        r1.A08 = r2;
        X.AZ6.A02(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        ((android.app.Activity) r0).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x026a, code lost:
        r0.CEx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x03e8;
                case 1: goto L_0x03da;
                case 2: goto L_0x03da;
                case 3: goto L_0x03bc;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x03ae;
                case 8: goto L_0x03a0;
                case 9: goto L_0x03a0;
                case 10: goto L_0x0392;
                case 11: goto L_0x037c;
                case 12: goto L_0x033e;
                case 13: goto L_0x031c;
                case 14: goto L_0x030c;
                case 15: goto L_0x02f9;
                case 16: goto L_0x02b8;
                case 17: goto L_0x02a6;
                case 18: goto L_0x0290;
                case 19: goto L_0x0281;
                case 20: goto L_0x0281;
                case 21: goto L_0x026e;
                case 22: goto L_0x0189;
                case 23: goto L_0x0264;
                case 24: goto L_0x025d;
                case 25: goto L_0x0256;
                case 26: goto L_0x0236;
                case 27: goto L_0x0050;
                case 28: goto L_0x0192;
                case 29: goto L_0x0189;
                case 30: goto L_0x0166;
                case 31: goto L_0x015a;
                case 32: goto L_0x0044;
                case 33: goto L_0x014c;
                case 34: goto L_0x040e;
                case 35: goto L_0x0135;
                case 36: goto L_0x011b;
                case 37: goto L_0x00fe;
                case 38: goto L_0x010a;
                case 39: goto L_0x00fe;
                case 40: goto L_0x00fe;
                case 41: goto L_0x002e;
                case 42: goto L_0x00b3;
                case 43: goto L_0x00b3;
                case 44: goto L_0x0013;
                case 45: goto L_0x00a7;
                case 46: goto L_0x008f;
                case 47: goto L_0x008f;
                case 48: goto L_0x0082;
                case 49: goto L_0x007f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.AXN r0 = (X.AXN) r0
            java.lang.Object r0 = r0.A01
            X.91L r0 = (X.AnonymousClass91L) r0
            r0.A50()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.1QR r2 = r3.A09
            r1 = 0
            java.lang.String r0 = r3.A0H
            X.AW0 r4 = X.AnonymousClass8BU.A0J(r2, r1, r0)
            if (r4 == 0) goto L_0x0012
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x0012
            X.1KB r2 = r3.A03
            r1 = 23
            goto L_0x0447
        L_0x002e:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r3 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r3
            X.1QS r0 = r3.A0a
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            X.AEs r4 = r0.A07()
            if (r4 == 0) goto L_0x0012
            X.1KB r2 = r3.A0B
            r1 = 22
            goto L_0x0447
        L_0x0044:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r0 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r0
            com.whatsapp.WaButtonWithLoader r0 = r0.A01
            if (r0 == 0) goto L_0x0012
            r0.A01()
            return
        L_0x0050:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r5 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r5
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0012
            X.1QE r1 = r5.A0h
            java.lang.String r0 = "IndiaUpiDeviceBindActivity: device binding canceled"
            r1.A06(r0)
            X.AZ6 r4 = r5.A0S
            r0 = 117(0x75, float:1.64E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "device_binding"
            r1 = 0
            r0 = 1
            r4.BiL(r3, r2, r1, r0)
            r5.A0W = r0
            X.A0S r0 = r5.A0C
            r0.A01 = r1
            X.AXS r1 = r5.A0N
            X.A7U r0 = r5.A0M
            X.AXS.A05(r0, r1, r5)
            r0 = 0
            r5.A0n = r0
            return
        L_0x007f:
            java.lang.Object r0 = r1.A01
            goto L_0x00ad
        L_0x0082:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r3
            java.lang.Integer r2 = X.C17880vN.A0h()
            X.8sO r1 = r3.A09
            r0 = 31
            goto L_0x009b
        L_0x008f:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r3
            java.lang.Integer r2 = X.C17880vN.A0h()
            X.8sO r1 = r3.A09
            r0 = 20
        L_0x009b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A07 = r0
            r1.A08 = r2
            X.AZ6.A02(r1, r3)
            return
        L_0x00a7:
            java.lang.Object r0 = r1.A01
            X.AXs r0 = (X.C20763AXs) r0
            java.lang.Object r0 = r0.A01
        L_0x00ad:
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x00b3:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.1QR r5 = r0.A0N
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r0 = 0
            android.database.Cursor r3 = X.AnonymousClass1QR.A01(r5, r0)
        L_0x00c2:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00eb
            X.AW0 r2 = X.AnonymousClass1QR.A09(r3, r5)     // Catch:{ 11T -> 0x00e2 }
            X.11P r0 = r5.A01     // Catch:{ 11T -> 0x00e2 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ 11T -> 0x00e2 }
            r2.A06 = r0     // Catch:{ 11T -> 0x00e2 }
            X.8pG r1 = r2.A0A     // Catch:{ 11T -> 0x00e2 }
            if (r1 == 0) goto L_0x00de
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ 11T -> 0x00e2 }
            r1.A03 = r0     // Catch:{ 11T -> 0x00e2 }
        L_0x00de:
            r4.add(r2)     // Catch:{ 11T -> 0x00e2 }
            goto L_0x00c2
        L_0x00e2:
            r2 = move-exception
            X.1QE r1 = r5.A04     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "setAllPendingRequestViewed/InvalidJidException - Skipped pending transaction with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x00f2 }
            goto L_0x00c2
        L_0x00eb:
            r3.close()
            r5.A0g(r4)
            return
        L_0x00f2:
            r1 = move-exception
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ all -> 0x00f9 }
            throw r1
        L_0x00f9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00fd:
            throw r1
        L_0x00fe:
            java.lang.Object r0 = r1.A01
            X.AbJ r0 = (X.C20903AbJ) r0
            java.lang.Object r0 = r0.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.1KB r0 = r0.A05
            goto L_0x03e4
        L_0x010a:
            java.lang.Object r0 = r1.A01
            X.AbJ r0 = (X.C20903AbJ) r0
            java.lang.Object r1 = r0.A01
            X.91R r1 = (X.AnonymousClass91R) r1
            X.1KB r0 = r1.A05
            r0.A04()
            r1.A5K()
            return
        L_0x011b:
            java.lang.Object r5 = r1.A01
            X.91R r5 = (X.AnonymousClass91R) r5
            r4 = 0
            boolean r3 = r5.A5c()
            X.AGf r0 = r5.A0A
            X.Af0 r2 = r0.A00
            X.Aek r1 = new X.Aek
            r1.<init>(r5, r3, r4)
            X.1KB r0 = r5.A05
            java.util.concurrent.Executor r0 = r0.A05
            r2.A0A(r1, r0)
            return
        L_0x0135:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            X.1BI r0 = r1.A0G
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 != 0) goto L_0x0148
            r1.A4o()
            r1.finish()
            return
        L_0x0148:
            r0 = 0
            r1.A0J = r0
            return
        L_0x014c:
            java.lang.Object r1 = r1.A01
            X.91R r1 = (X.AnonymousClass91R) r1
            r1.A5M()
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r1.CNA(r0)
            return
        L_0x015a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            X.8GL r1 = r0.A03
            X.AEs r0 = r0.A03
            r1.A0T(r0)
            return
        L_0x0166:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity) r5
            X.AZ6 r4 = r5.A0S
            java.lang.Integer r3 = X.C17880vN.A0h()
            java.lang.Integer r2 = X.C108955ca.A0f()
            java.lang.String r1 = "incentive_value_prop"
            r0 = 0
            X.8sO r1 = r4.A07(r3, r2, r1, r0)
            boolean r0 = X.AnonymousClass8BR.A1P(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.AZ6.A02(r1, r5)
            return
        L_0x0189:
            java.lang.Object r1 = r1.A01
            X.92u r1 = (X.AnonymousClass92u) r1
            r0 = 0
            r1.A5p(r0)
            return
        L_0x0192:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r1 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r1
            X.A0S r8 = r1.A0C
            java.lang.String r12 = r1.A0R
            java.lang.String r2 = r1.A0T
            java.lang.String r0 = r1.A0S
            X.A7U r1 = r1.A0M
            java.lang.String r13 = r1.A06(r12)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PAY: sendDeviceBindingIq called with psp: "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = " verificationData: "
            r3.append(r1)
            java.lang.String r1 = X.C20088A6q.A00(r2)
            X.C17890vO.A1A(r3, r1)
            X.AZ6 r9 = r8.A0E
            r3 = 0
            r1 = 20
            r10 = 0
            r9.A0A(r10, r1, r3)
            X.9ui r7 = r8.A0C
            java.lang.String r1 = "upi-bind-device"
            r7.A02(r1)
            X.1OZ r1 = r8.A09
            java.lang.String r17 = r1.A0B()
            X.1ek r3 = r8.A0I
            java.lang.String r18 = r3.A01()
            r3 = 3
            java.lang.Long r15 = java.lang.Long.valueOf(r3)
            java.lang.Long r16 = X.C17890vO.A0L()
            X.A0B r3 = r8.A0F
            java.lang.String r22 = r3.A01()
            X.AXS r3 = r8.A0A
            boolean r3 = r3.A0R()
            java.lang.String r23 = X.AnonymousClass8BS.A0b(r3)
            X.9F2 r14 = new X.9F2
            r19 = r2
            r20 = r12
            r21 = r0
            r14.<init>((java.lang.Long) r15, (java.lang.Long) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23)
            X.0ve r3 = r8.A08
            r2 = 2227(0x8b3, float:3.12E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r0, r3, r2)
            java.lang.String r11 = "in_upi_device_binding_tag"
            if (r3 == 0) goto L_0x0213
            X.90Z r2 = r8.A0G
            r0 = 185476608(0xb0e2600, float:2.7376793E-32)
            r2.A01(r0, r11)
        L_0x0213:
            java.lang.Object r0 = r14.A02
            X.1ca r0 = (X.C29621ca) r0
            X.118 r2 = r8.A06
            android.content.Context r4 = r2.A00
            X.1KB r5 = r8.A05
            X.1jG r6 = r8.A0B
            if (r3 == 0) goto L_0x0234
            X.90Z r10 = r8.A0G
        L_0x0223:
            X.8zV r3 = new X.8zV
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            r5 = 204(0xcc, float:2.86E-43)
            r2 = r3
            r3 = r0
            r4 = r17
            r1.A0I(r2, r3, r4, r5, r6)
            return
        L_0x0234:
            r11 = r10
            goto L_0x0223
        L_0x0236:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            java.lang.String r0 = "2"
            r2.A0Q = r0
            android.view.View r0 = r2.A04
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0d(r0, r2)
            android.view.View r0 = r2.A02
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0q(r0, r2)
            android.view.View r0 = r2.A03
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0c(r0, r2)
            com.whatsapp.WaImageView r1 = r2.A05
            r0 = 2131233641(0x7f080b69, float:1.8083425E38)
            X.AnonymousClass3MX.A1B(r2, r1, r0)
            return
        L_0x0256:
            java.lang.Object r0 = r1.A01
            X.9YQ r0 = (X.AnonymousClass9YQ) r0
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = r0.A00
            goto L_0x026a
        L_0x025d:
            java.lang.Object r0 = r1.A01
            X.Aaq r0 = (X.C20874Aaq) r0
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = r0.A00
            goto L_0x026a
        L_0x0264:
            java.lang.Object r0 = r1.A01
            X.Aar r0 = (X.C20875Aar) r0
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = r0.A01
        L_0x026a:
            r0.CEx()
            return
        L_0x026e:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r0
            X.8zD r1 = r0.A07
            com.whatsapp.jid.UserJid r3 = r0.A0F
            java.lang.String r4 = r0.A0C
            java.lang.String r6 = "APP_SIGNAL"
            r2 = 0
            java.lang.String r5 = "completed"
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0281:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131894191(0x7f121faf, float:1.942318E38)
            java.lang.String r0 = r1.getString(r0)
            r1.CRG(r0)
            return
        L_0x0290:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r0
            X.9jf r4 = r0.A04
            X.205 r3 = r0.A07
            X.Aa6 r0 = r0.A09
            X.8Gd r2 = r0.A06
            r1 = 0
            X.Aan r0 = new X.Aan
            r0.<init>(r1)
            r4.A00(r2, r0, r3)
            return
        L_0x02a6:
            java.lang.Object r3 = r1.A01
            X.91T r3 = (X.AnonymousClass91T) r3
            r0 = 12
            X.AnonymousClass4Yv.A00(r3, r0)
            X.1L9 r1 = r3.A01
            java.lang.String r0 = "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"
            X.AnonymousClass8BV.A13(r3, r1, r0)
            goto L_0x0337
        L_0x02b8:
            java.lang.Object r5 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity r5 = (com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity) r5
            r0 = 10
            X.AnonymousClass4Yv.A00(r5, r0)
            X.AXS r0 = r5.A0N
            java.lang.String r4 = r0.A0I()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x02e9
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = X.AXS.A01(r5)
            java.lang.String r0 = "upiSequenceNumber"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r3, r2, r1, r0)
            r5.A03 = r0
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity.A03(r5, r4)
            X.8FZ r1 = r5.A04
            X.77e r0 = r5.A03
            r1.A00 = r0
            return
        L_0x02e9:
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            java.lang.String r0 = r5.getString(r0)
            r5.A44(r0)
            X.8pN r0 = r5.A01
            r5.A59(r0)
            return
        L_0x02f9:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r2 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r2
            android.widget.TextView r0 = r2.A01
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A00
            r0.setVisibility(r1)
            r2.A53()
            return
        L_0x030c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r3 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r3
            android.widget.TextView r0 = r3.A01
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ProgressBar r0 = r3.A00
            r0.setVisibility(r2)
            goto L_0x032c
        L_0x031c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r3 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r3
            r2 = 1
            android.widget.TextView r0 = r3.A01
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r3.A00
            r0.setVisibility(r1)
        L_0x032c:
            X.8pN r1 = r3.A02
            java.lang.String r0 = r3.A0b
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A03(r3, r1, r0, r2)
            r3.startActivity(r0)
        L_0x0337:
            r3.A4o()
            r3.finish()
            return
        L_0x033e:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r2 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r2
            android.widget.TextView r0 = r2.A01
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A00
            r0.setVisibility(r1)
            X.AXS r0 = r2.A0N
            java.lang.String r4 = r0.A0I()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0374
            java.lang.String r6 = X.AXS.A01(r2)
            r2.A03 = r6
            X.8pN r0 = r2.A02
            java.lang.String r5 = r0.A0B
            X.8pb r3 = r0.A08
            X.8pS r3 = (X.AnonymousClass8pS) r3
            X.77e r0 = r0.A09
            java.lang.Object r7 = X.C20061A5k.A01(r0)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 2
            r2.A5C(r3, r4, r5, r6, r7, r8)
            return
        L_0x0374:
            X.8pN r0 = r2.A02
            X.8pb r0 = r0.A08
            r2.A5A(r0)
            return
        L_0x037c:
            java.lang.Object r3 = r1.A01
            X.91U r3 = (X.AnonymousClass91U) r3
            r0 = 2131894215(0x7f121fc7, float:1.9423228E38)
            r3.CNA(r0)
            X.1ex r2 = r3.A0N
            r1 = 3
            X.AXN r0 = new X.AXN
            r0.<init>(r3, r1)
            r2.A0A(r0)
            return
        L_0x0392:
            java.lang.Object r1 = r1.A01
            X.91S r1 = (X.AnonymousClass91S) r1
            r0 = 2131894215(0x7f121fc7, float:1.9423228E38)
            r1.CNA(r0)
            r1.A53()
            return
        L_0x03a0:
            java.lang.Object r1 = r1.A01
            X.91M r1 = (X.AnonymousClass91M) r1
            r0 = 2131894215(0x7f121fc7, float:1.9423228E38)
            r1.CNA(r0)
            r1.A5F()
            return
        L_0x03ae:
            java.lang.Object r0 = r1.A01
            X.8yc r0 = (X.C175378yc) r0
            java.lang.Object r1 = r0.A01
            X.933 r1 = (X.AnonymousClass933) r1
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r1.A0B
            r1.A5H(r0)
            return
        L_0x03bc:
            java.lang.Object r3 = r1.A01
            X.12E r3 = (X.AnonymousClass12E) r3
            X.2R1 r2 = X.AnonymousClass2R1.A03
            r0 = 0
            X.2sh r1 = new X.2sh
            r1.<init>(r2, r0)
            r0 = 1
            r1.A03 = r0
            r0 = 0
            r1.A02 = r0
            X.2qq r0 = X.C62132qq.A0M
            r1.A00 = r0
            X.2re r0 = r1.A02()
            r3.A03(r0)
            return
        L_0x03da:
            java.lang.Object r0 = r1.A01
            X.AbJ r0 = (X.C20903AbJ) r0
            java.lang.Object r0 = r0.A01
            X.91y r0 = (X.AnonymousClass91y) r0
            X.1KB r0 = r0.A00
        L_0x03e4:
            r0.A04()
            return
        L_0x03e8:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
            X.3Rj r1 = X.AnonymousClass4a6.A00(r2)
            r0 = 2131897622(0x7f122d16, float:1.9430139E38)
            r1.A0E(r0)
            r0 = 2131897629(0x7f122d1d, float:1.9430153E38)
            r1.A0D(r0)
            X.C73203Rj.A06(r1)
            r1.A0C()
            X.8Dm r1 = r2.A0E
            X.8pN r0 = r2.A00
            X.AEd r0 = com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity.A03(r0, r2)
            r1.setInternationalActivationView(r0)
            return
        L_0x040e:
            java.lang.Object r3 = r1.A01
            X.91R r3 = (X.AnonymousClass91R) r3
            java.lang.String r4 = r3.A0s
            X.C17960vV.A07(r4)
            X.1QE r2 = r3.A0i
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onPayRequestFromNonWa; request is paid; transaction id: "
            r1.append(r0)
            X.AnonymousClass8BV.A1E(r2, r4, r1)
            X.1QR r4 = r3.A07
            java.lang.String r5 = r3.A0s
            long r8 = X.AnonymousClass8BS.A01(r3)
            long r10 = X.AnonymousClass8BS.A01(r3)
            r7 = 401(0x191, float:5.62E-43)
            r6 = 1
            r4.A0a(r5, r6, r7, r8, r10)
            X.1QR r2 = r3.A07
            r1 = 0
            java.lang.String r0 = r3.A0s
            X.AW0 r4 = X.AnonymousClass8BU.A0J(r2, r1, r0)
            X.C17960vV.A07(r4)
            X.1KB r2 = r3.A05
            r1 = 20
        L_0x0447:
            X.Ajz r0 = new X.Ajz
            r0.<init>(r3, r4, r1)
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21447AkE.run():void");
    }
}
