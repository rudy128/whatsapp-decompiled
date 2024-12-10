package X;

import android.content.DialogInterface;

/* renamed from: X.A9r  reason: case insensitive filesystem */
public class C20155A9r implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C20155A9r(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0X(new C20155A9r(obj, i), i2);
    }

    public static void A01(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new C20155A9r(obj, i), i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        X.AnonymousClass4Yv.A01(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        r0.CEc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r0.BIr();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        r0.CEc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        r1.CEc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        r1.By9((X.AnonymousClass34B) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        r4.BiL(r3, r0, r2, r1);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b8, code lost:
        r0 = "p2mLiteEventLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bd, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e0, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0209, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r15, int r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 2: goto L_0x0247;
                case 3: goto L_0x0005;
                case 4: goto L_0x023d;
                case 5: goto L_0x022d;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x021c;
                case 10: goto L_0x020d;
                case 11: goto L_0x0203;
                case 12: goto L_0x0203;
                case 13: goto L_0x01f9;
                case 14: goto L_0x01f2;
                case 15: goto L_0x01eb;
                case 16: goto L_0x01e4;
                case 17: goto L_0x01d4;
                case 18: goto L_0x01cb;
                case 19: goto L_0x01c2;
                case 20: goto L_0x018f;
                case 21: goto L_0x012c;
                case 22: goto L_0x0005;
                case 23: goto L_0x000d;
                case 24: goto L_0x0124;
                case 25: goto L_0x0005;
                case 26: goto L_0x011a;
                case 27: goto L_0x011a;
                case 28: goto L_0x011a;
                case 29: goto L_0x0100;
                case 30: goto L_0x00ec;
                case 31: goto L_0x0005;
                case 32: goto L_0x00dd;
                case 33: goto L_0x00d2;
                case 34: goto L_0x00ca;
                case 35: goto L_0x00c5;
                case 36: goto L_0x00b7;
                case 37: goto L_0x00af;
                case 38: goto L_0x00a7;
                case 39: goto L_0x00a2;
                case 40: goto L_0x009d;
                case 41: goto L_0x0060;
                case 42: goto L_0x005a;
                case 43: goto L_0x0052;
                case 44: goto L_0x004b;
                case 45: goto L_0x0044;
                case 46: goto L_0x003b;
                case 47: goto L_0x0027;
                case 48: goto L_0x0021;
                case 49: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0009:
            r0.finish()
            return
        L_0x000d:
            java.lang.Object r0 = r14.A01
            X.Aa6 r0 = (X.C20828Aa6) r0
            X.1FY r0 = r0.A01
            goto L_0x0009
        L_0x0014:
            java.lang.Object r1 = r14.A01
            com.whatsapp.registration.EULA r1 = (com.whatsapp.registration.EULA) r1
            r0 = 8
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 0
            r1.A00 = r0
            return
        L_0x0021:
            java.lang.Object r2 = r14.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 7
            goto L_0x0040
        L_0x0027:
            java.lang.Object r2 = r14.A01
            com.whatsapp.registration.EULA r2 = (com.whatsapp.registration.EULA) r2
            r0 = 6
            X.AnonymousClass4Yv.A00(r2, r0)
            boolean r0 = X.C17970vW.A0B()
            r1 = 8
            if (r0 != 0) goto L_0x0040
            r0 = 0
            r2.A00 = r0
            return
        L_0x003b:
            java.lang.Object r2 = r14.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 5
        L_0x0040:
            X.AnonymousClass4Yv.A01(r2, r1)
            return
        L_0x0044:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            goto L_0x0209
        L_0x004b:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            goto L_0x0209
        L_0x0052:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 9
            goto L_0x0209
        L_0x005a:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0060:
            java.lang.Object r1 = r14.A01
            X.9YU r1 = (X.AnonymousClass9YU) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r1 = r1.A00
            X.00H r0 = r1.A0d
            java.lang.Object r2 = r0.get()
            X.9ma r2 = (X.C191429ma) r2
            X.1FL r4 = r1.A1D()
            X.9YS r3 = new X.9YS
            r3.<init>(r1)
            boolean r0 = r4 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x008a
            r1 = r4
            X.1FU r1 = (X.AnonymousClass1FU) r1
            if (r1 == 0) goto L_0x008a
            r0 = 2131893912(0x7f121e98, float:1.9422614E38)
            r1.CNA(r0)
        L_0x008a:
            X.00H r0 = r2.A03
            java.lang.Object r2 = r0.get()
            X.9p4 r2 = (X.C192839p4) r2
            r1 = 8
            X.AXO r0 = new X.AXO
            r0.<init>(r4, r3, r1)
            r2.A00(r0)
            return
        L_0x009d:
            java.lang.Object r0 = r14.A01
            X.BDv r0 = (X.BDv) r0
            goto L_0x00be
        L_0x00a2:
            java.lang.Object r1 = r14.A01
            X.BDv r1 = (X.BDv) r1
            goto L_0x00e4
        L_0x00a7:
            java.lang.Object r0 = r14.A01
            X.BDv r0 = (X.BDv) r0
            r0.CF3()
            goto L_0x00c1
        L_0x00af:
            java.lang.Object r1 = r14.A01
            X.BDv r1 = (X.BDv) r1
            r1.CF3()
            goto L_0x00e7
        L_0x00b7:
            java.lang.Object r0 = r14.A01
            X.BDv r0 = (X.BDv) r0
            r0.CF3()
        L_0x00be:
            r0.CEc()
        L_0x00c1:
            r0.BIr()
            return
        L_0x00c5:
            java.lang.Object r0 = r14.A01
            X.BCE r0 = (X.BCE) r0
            goto L_0x00d9
        L_0x00ca:
            java.lang.Object r0 = r14.A01
            X.BCE r0 = (X.BCE) r0
            r0.CF3()
            return
        L_0x00d2:
            java.lang.Object r0 = r14.A01
            X.BCE r0 = (X.BCE) r0
            r0.CF3()
        L_0x00d9:
            r0.CEc()
            return
        L_0x00dd:
            java.lang.Object r1 = r14.A01
            X.BDv r1 = (X.BDv) r1
            r1.CF3()
        L_0x00e4:
            r1.CEc()
        L_0x00e7:
            r0 = 0
            r1.By9(r0)
            return
        L_0x00ec:
            java.lang.Object r5 = r14.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.AZ6 r4 = r5.A4b()
            java.lang.Integer r3 = X.C17880vN.A0j()
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r5)
            r1 = 1
            java.lang.String r0 = "alias_switch_confirm_dialog"
            goto L_0x0113
        L_0x0100:
            java.lang.Object r5 = r14.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.AZ6 r4 = r5.A4b()
            java.lang.Integer r3 = X.C17880vN.A0j()
            java.lang.String r2 = X.AnonymousClass8BX.A0Y(r5)
            r1 = 1
            java.lang.String r0 = "error"
        L_0x0113:
            r4.BiL(r3, r0, r2, r1)
            r5.finish()
            return
        L_0x011a:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            goto L_0x01e0
        L_0x0124:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A4b()
            return
        L_0x012c:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            X.00H r1 = r0.A09
            if (r1 == 0) goto L_0x01b8
            java.lang.Object r3 = r1.get()
            X.AZ4 r3 = (X.AZ4) r3
            java.lang.Integer r5 = X.C17880vN.A0k()
            X.A7u r4 = X.C20112A7u.A02()
            java.lang.String r2 = "p2m_type"
            java.lang.String r1 = "p2m_lite"
            r4.A07(r2, r1)
            r8 = 1
            java.lang.String r6 = "remove_payments_info_dialogue"
            java.lang.String r7 = "payment_home"
            r3.BiM(r4, r5, r6, r7, r8)
            X.1KB r3 = r0.A0B
            r2 = 0
            r1 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.A07(r2, r1)
            android.content.Context r4 = r0.A1n()
            X.1KB r5 = r0.A0B
            X.10I r13 = r0.A0n
            X.1ek r12 = r0.A08
            if (r12 == 0) goto L_0x018c
            X.1QS r11 = r0.A0a
            X.122 r6 = r0.A04
            if (r6 == 0) goto L_0x0189
            X.1QD r8 = r0.A0W
            X.1ex r9 = r0.A0X
            X.1jF r10 = r0.A05
            if (r10 == 0) goto L_0x01bb
            X.00H r1 = r0.A0s
            X.1jG r7 = X.AnonymousClass8BR.A0a(r1)
            X.9p4 r3 = new X.9p4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = 5
            X.AXN r1 = new X.AXN
            r1.<init>(r0, r2)
            r3.A00(r1)
            return
        L_0x0189:
            java.lang.String r0 = "coreMessageStore"
            goto L_0x01bd
        L_0x018c:
            java.lang.String r0 = "paymentDeviceId"
            goto L_0x01bd
        L_0x018f:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            X.00H r0 = r0.A09
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r2 = r0.get()
            X.AZ4 r2 = (X.AZ4) r2
            java.lang.Integer r4 = X.C17880vN.A0j()
            X.A7u r3 = X.C20112A7u.A02()
            java.lang.String r1 = "p2m_type"
            java.lang.String r0 = "p2m_lite"
            r3.A07(r1, r0)
            r7 = 1
            java.lang.String r5 = "remove_payments_info_dialogue"
            java.lang.String r6 = "payment_home"
            r2.BiM(r3, r4, r5, r6, r7)
            r15.cancel()
            return
        L_0x01b8:
            java.lang.String r0 = "p2mLiteEventLogger"
            goto L_0x01bd
        L_0x01bb:
            java.lang.String r0 = "paymentsLifecycleManager"
        L_0x01bd:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01c2:
            java.lang.Object r0 = r14.A01
            X.C18070vi.A0h(r0, r15)
            r15.dismiss()
            return
        L_0x01cb:
            java.lang.Object r1 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity r1 = (com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity) r1
            r0 = 1
            com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity.A0Q(r1, r0)
            return
        L_0x01d4:
            java.lang.Object r1 = r14.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 32
            X.AnonymousClass4Yv.A00(r1, r0)
            r1.A4o()
        L_0x01e0:
            r1.finish()
            return
        L_0x01e4:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 41
            goto L_0x0209
        L_0x01eb:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 40
            goto L_0x0209
        L_0x01f2:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 39
            goto L_0x0209
        L_0x01f9:
            java.lang.Object r1 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 0
            r1.A0I = r0
            r0 = 37
            goto L_0x0209
        L_0x0203:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 35
        L_0x0209:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x020d:
            java.lang.Object r1 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 29
            X.AnonymousClass4Yv.A00(r1, r0)
            X.BDw r0 = r1.A0M
            r0.C0F()
            return
        L_0x021c:
            java.lang.Object r2 = r14.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            r0 = 29
            X.AnonymousClass4Yv.A00(r2, r0)
            X.1L9 r1 = r2.A01
            java.lang.String r0 = "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"
            X.AnonymousClass8BV.A13(r2, r1, r0)
            return
        L_0x022d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.8GO r1 = r0.A06
            r0 = 1
            r1.A02 = r0
            X.1wy r1 = r1.A00
            r0 = 6
            X.C187449fp.A00(r1, r0)
            return
        L_0x023d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.8GO r0 = r0.A06
            X.AnonymousClass8GO.A04(r0)
            return
        L_0x0247:
            java.lang.Object r0 = r14.A01
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.8GO r0 = r0.A06
            X.AnonymousClass8GO.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20155A9r.onClick(android.content.DialogInterface, int):void");
    }
}
