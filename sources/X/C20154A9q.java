package X;

import android.content.DialogInterface;

/* renamed from: X.A9q  reason: case insensitive filesystem */
public class C20154A9q implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C20154A9q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new C20154A9q(obj, i), i2);
    }

    public static void A01(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0X(new C20154A9q(obj, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.933} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.91R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.933} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.933} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: X.91S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03be, code lost:
        r2.A0n = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0413, code lost:
        r0 = 101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0415, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0418, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x041f, code lost:
        X.AnonymousClass4Yv.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0422, code lost:
        X.AnonymousClass8BV.A13(r2, r2.A01, "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0429, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013e, code lost:
        X.AnonymousClass4Yv.A00(r3, r0);
        r3.startActivity(com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A03(r3, (X.AnonymousClass8pN) r3.A0B, r3.A0b, true));
        r3.A4o();
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0228, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
        r1.A4o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x022e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0241, code lost:
        r3 = r4.A0N.A0D();
        r2 = r4.A0N.A0J();
        r1.A00.A0F(new X.A28((X.A7B) null, (X.A7B) null, false, X.C18070vi.A17(r8, r5), false, false));
        r9 = new X.C189679jd(r1);
        r4 = X.AnonymousClass8BU.A0w("PAY: deregisterAlias called");
        X.C17890vO.A11("alias_id", r5.A01, r4);
        X.C17890vO.A11("alias_value", (java.lang.String) r5.A00.A00, r4);
        X.C17890vO.A11("alias_type", r5.A03, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0288, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x028a, code lost:
        X.C17890vO.A11("vpa_id", r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x028f, code lost:
        X.C17890vO.A11("vpa", (java.lang.String) r3.A00, r4);
        r3 = X.AnonymousClass000.A13();
        X.C17890vO.A11("action", "deregister-alias", r3);
        X.C17890vO.A11("device_id", r8.A05.A01(), r3);
        r7 = X.C197889xR.A04(r8, "deregister-alias");
        r8.A01.A0I(new X.C175968zZ(r8.A00, r8.A01, r5, r8.A02, r7, r8, r9), new X.C29621ca(X.AnonymousClass8BR.A0k("alias", X.AnonymousClass8BT.A1b(r4, 0)), "account", X.AnonymousClass8BT.A1b(r3, 0)), "set", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02f6, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02f9, code lost:
        r1.A4o();
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0324, code lost:
        r2.A00(new X.AXN(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x032c, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0419;
                case 1: goto L_0x040f;
                case 2: goto L_0x0408;
                case 3: goto L_0x0401;
                case 4: goto L_0x03e5;
                case 5: goto L_0x03de;
                case 6: goto L_0x03d7;
                case 7: goto L_0x03d0;
                case 8: goto L_0x03c2;
                case 9: goto L_0x0396;
                case 10: goto L_0x0333;
                case 11: goto L_0x032d;
                case 12: goto L_0x0300;
                case 13: goto L_0x0007;
                case 14: goto L_0x02f0;
                case 15: goto L_0x02dd;
                case 16: goto L_0x0007;
                case 17: goto L_0x022f;
                case 18: goto L_0x0222;
                case 19: goto L_0x0201;
                case 20: goto L_0x01f4;
                case 21: goto L_0x01e7;
                case 22: goto L_0x01df;
                case 23: goto L_0x0017;
                case 24: goto L_0x01d7;
                case 25: goto L_0x01d0;
                case 26: goto L_0x01c8;
                case 27: goto L_0x0156;
                case 28: goto L_0x0138;
                case 29: goto L_0x0130;
                case 30: goto L_0x0129;
                case 31: goto L_0x0121;
                case 32: goto L_0x00fb;
                case 33: goto L_0x00e3;
                case 34: goto L_0x0007;
                case 35: goto L_0x00db;
                case 36: goto L_0x0017;
                case 37: goto L_0x00d4;
                case 38: goto L_0x00cc;
                case 39: goto L_0x00c4;
                case 40: goto L_0x00b9;
                case 41: goto L_0x00af;
                case 42: goto L_0x00a4;
                case 43: goto L_0x000f;
                case 44: goto L_0x009c;
                case 45: goto L_0x0094;
                case 46: goto L_0x0086;
                case 47: goto L_0x007e;
                case 48: goto L_0x003d;
                case 49: goto L_0x0022;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x000b:
            r0.finish()
            return
        L_0x000f:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r17.dismiss()
            goto L_0x000b
        L_0x0017:
            java.lang.Object r0 = r1.A01
            X.91T r0 = (X.AnonymousClass91T) r0
            r17.dismiss()
            r0.A4o()
            goto L_0x000b
        L_0x0022:
            java.lang.Object r6 = r1.A01
            X.91T r6 = (X.AnonymousClass91T) r6
            r5 = 38
            X.AZ6 r4 = r6.A0S
            java.lang.Integer r3 = X.C17880vN.A0j()
            java.lang.String r2 = "alias_remove_confirm_dialog"
            java.lang.String r1 = "payments_profile"
            r0 = 1
            r4.BiL(r3, r2, r1, r0)
            X.AnonymousClass4Yv.A00(r6, r5)
            r6.A4o()
            return
        L_0x003d:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r4 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r4
            r6 = 38
            X.AZ6 r5 = r4.A0S
            java.lang.Integer r3 = X.C17880vN.A0l()
            java.lang.String r2 = "alias_remove_confirm_dialog"
            java.lang.String r1 = "payments_profile"
            r0 = 1
            r5.BiL(r3, r2, r1, r0)
            X.AnonymousClass4Yv.A00(r4, r6)
            r4.A4o()
            X.A2y r0 = r4.A05
            java.util.ArrayList r0 = r0.A02()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0079
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r1 = r4.A06
            X.8z4 r8 = r4.A04
            X.A2y r0 = r4.A05
            java.util.ArrayList r0 = r0.A02()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r5 = r0.next()
            X.AEC r5 = (X.AEC) r5
            goto L_0x0241
        L_0x0079:
            r0 = 0
            r4.A50(r0)
            return
        L_0x007e:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 28
            goto L_0x0228
        L_0x0086:
            java.lang.Object r1 = r1.A01
            X.91S r1 = (X.AnonymousClass91S) r1
            r0 = 19
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 0
            r1.A0G = r0
            goto L_0x02f9
        L_0x0094:
            java.lang.Object r0 = r1.A01
            X.91S r0 = (X.AnonymousClass91S) r0
            r0.A55()
            return
        L_0x009c:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 28
            goto L_0x02f6
        L_0x00a4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.96K r1 = r0.A08
            r0 = 0
            r1.A0r(r0)
            return
        L_0x00af:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r1 = r0.A1D()
            goto L_0x0413
        L_0x00b9:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.AXQ r1 = r0.A0f
            r0 = 1
            r1.A01(r0)
            return
        L_0x00c4:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 29
            goto L_0x0415
        L_0x00cc:
            java.lang.Object r2 = r1.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            r0 = 29
            goto L_0x041f
        L_0x00d4:
            java.lang.Object r3 = r1.A01
            X.91R r3 = (X.AnonymousClass91R) r3
            r0 = 10
            goto L_0x013e
        L_0x00db:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 33
            goto L_0x02f6
        L_0x00e3:
            java.lang.Object r2 = r1.A01
            X.91R r2 = (X.AnonymousClass91R) r2
            r17.dismiss()
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.CNA(r0)
            X.AXS r0 = r2.A0N
            java.lang.String r1 = r0.A0I()
            r0 = 0
            r2.Bwk(r0, r1)
            return
        L_0x00fb:
            java.lang.Object r3 = r1.A01
            X.91R r3 = (X.AnonymousClass91R) r3
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNA(r0)
            X.1KB r4 = r3.A05
            X.10I r12 = r3.A05
            X.1ek r11 = r3.A0A
            X.1QS r10 = r3.A0Q
            X.122 r5 = r3.A07
            X.1QD r7 = r3.A0Q
            X.1ex r8 = r3.A0N
            X.1jF r9 = r3.A0C
            X.1jG r6 = X.AnonymousClass8BT.A0S(r3)
            X.9p4 r2 = new X.9p4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 4
            goto L_0x0324
        L_0x0121:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 12
            goto L_0x02f6
        L_0x0129:
            java.lang.Object r3 = r1.A01
            X.91R r3 = (X.AnonymousClass91R) r3
            r0 = 12
            goto L_0x013e
        L_0x0130:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 11
            goto L_0x02f6
        L_0x0138:
            java.lang.Object r3 = r1.A01
            X.91R r3 = (X.AnonymousClass91R) r3
            r0 = 11
        L_0x013e:
            X.AnonymousClass4Yv.A00(r3, r0)
            X.AEs r2 = r3.A0B
            X.8pN r2 = (X.AnonymousClass8pN) r2
            r1 = 1
            java.lang.String r0 = r3.A0b
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A03(r3, r2, r0, r1)
            r3.startActivity(r0)
            r3.A4o()
            r3.finish()
            return
        L_0x0156:
            java.lang.Object r3 = r1.A01
            X.91R r3 = (X.AnonymousClass91R) r3
            r0 = 10
            X.AnonymousClass4Yv.A00(r3, r0)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNA(r0)
            X.AXS r0 = r3.A0N
            java.lang.String r6 = r0.A0I()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            X.8pf r1 = r3.A0P
            boolean r0 = X.AnonymousClass000.A1X(r1)
            if (r2 != 0) goto L_0x01c2
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = X.AnonymousClass91R.A12(r3)
            r1.A0V = r0
            X.AEs r0 = r3.A0B
            X.8pb r2 = r0.A08
            X.8pS r2 = (X.AnonymousClass8pS) r2
            X.9ui r1 = r3.A04
            java.lang.String r0 = "upi-get-credential"
            r1.A01(r0)
            X.AEs r0 = r3.A0B
            java.lang.String r7 = r0.A0B
            X.77e r5 = r2.A07
            X.8pf r1 = r3.A0P
            X.1KN r4 = r3.A09
            java.lang.Object r11 = X.C20284AEs.A02(r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = X.AnonymousClass91R.A11(r3)
            X.1E7 r0 = r3.A08
            if (r0 != 0) goto L_0x01b9
            r13 = 0
        L_0x01a5:
            java.lang.String r0 = r3.A0Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r14 = 6
            if (r0 != 0) goto L_0x01af
            r14 = 5
        L_0x01af:
            java.lang.String r8 = r1.A0T
            java.lang.String r9 = r1.A0R
            java.lang.String r10 = r1.A0V
            r3.A58(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x01b9:
            java.lang.String r13 = X.AnonymousClass17K.A02(r0)
            goto L_0x01a5
        L_0x01be:
            r3.A56()
            return
        L_0x01c2:
            X.AEs r0 = r3.A0B
            r3.A59(r0)
            return
        L_0x01c8:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 10
            goto L_0x02f6
        L_0x01d0:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 34
            goto L_0x0228
        L_0x01d7:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 22
            goto L_0x02f6
        L_0x01df:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 13
            goto L_0x02f6
        L_0x01e7:
            java.lang.Object r1 = r1.A01
            X.91S r1 = (X.AnonymousClass91S) r1
            r0 = 13
            X.AnonymousClass4Yv.A00(r1, r0)
            r1.A53()
            return
        L_0x01f4:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            X.AnonymousClass4Yv.A00(r1, r0)
            r1.finish()
            return
        L_0x0201:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r3 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r3
            r0 = 1
            r3.A0L = r0
            X.8Hq r2 = r3.A09
            java.lang.String r1 = "methodListAdapter"
            if (r2 == 0) goto L_0x021d
            java.util.List r0 = com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A00(r3)
            r2.A0U(r0)
            X.8Hq r0 = r3.A09
            if (r0 == 0) goto L_0x021d
            r0.notifyDataSetChanged()
            return
        L_0x021d:
            X.C18070vi.A11(r1)
            r0 = 0
            throw r0
        L_0x0222:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 38
        L_0x0228:
            X.AnonymousClass4Yv.A00(r1, r0)
            r1.A4o()
            return
        L_0x022f:
            java.lang.Object r4 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r4 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r4
            r0 = 38
            X.AnonymousClass4Yv.A00(r4, r0)
            r4.A4o()
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r1 = r4.A0F
            X.8z4 r8 = r4.A0C
            X.AEC r5 = r4.A0B
        L_0x0241:
            X.AXS r0 = r4.A0N
            X.77e r3 = r0.A0D()
            X.AXS r0 = r4.A0N
            java.lang.String r2 = r0.A0J()
            r12 = 0
            boolean r13 = X.C18070vi.A17(r8, r5)
            X.1DT r0 = r1.A00
            r10 = 0
            r15 = r12
            X.A28 r9 = new X.A28
            r11 = r10
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A0F(r9)
            X.9jd r9 = new X.9jd
            r9.<init>(r1)
            java.lang.String r0 = "PAY: deregisterAlias called"
            java.util.ArrayList r4 = X.AnonymousClass8BU.A0w(r0)
            java.lang.String r1 = "alias_id"
            java.lang.String r0 = r5.A01
            X.C17890vO.A11(r1, r0, r4)
            X.77e r0 = r5.A00
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "alias_value"
            X.C17890vO.A11(r0, r1, r4)
            java.lang.String r1 = "alias_type"
            java.lang.String r0 = r5.A03
            X.C17890vO.A11(r1, r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x028f
            java.lang.String r0 = "vpa_id"
            X.C17890vO.A11(r0, r2, r4)
        L_0x028f:
            java.lang.Object r1 = r3.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "vpa"
            X.C17890vO.A11(r0, r1, r4)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r0 = "action"
            java.lang.String r2 = "deregister-alias"
            X.C17890vO.A11(r0, r2, r3)
            X.1ek r0 = r8.A05
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device_id"
            X.C17890vO.A11(r0, r1, r3)
            X.9ui r7 = X.C197889xR.A04(r8, r2)
            X.1ex r10 = r8.A01
            X.1MD[] r2 = X.AnonymousClass8BT.A1b(r3, r12)
            X.1MD[] r1 = X.AnonymousClass8BT.A1b(r4, r12)
            java.lang.String r0 = "alias"
            X.1ca r1 = X.AnonymousClass8BR.A0k(r0, r1)
            java.lang.String r0 = "account"
            X.1ca r12 = new X.1ca
            r12.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r2)
            android.content.Context r3 = r8.A00
            X.1KB r4 = r8.A01
            X.1jG r6 = r8.A02
            X.8zZ r2 = new X.8zZ
            r2.<init>((android.content.Context) r3, (X.AnonymousClass1KB) r4, (X.AEC) r5, (X.C33711jG) r6, (X.C196259ui) r7, (X.C175658z4) r8, (X.C189679jd) r9)
            r14 = 0
            java.lang.String r13 = "set"
            r11 = r2
            r10.A0I(r11, r12, r13, r14)
            return
        L_0x02dd:
            java.lang.Object r1 = r1.A01
            X.933 r1 = (X.AnonymousClass933) r1
            r17.dismiss()
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r1.CNA(r0)
            X.AEs r0 = r1.A03
            r1.A59(r0)
            return
        L_0x02f0:
            java.lang.Object r1 = r1.A01
            X.91T r1 = (X.AnonymousClass91T) r1
            r0 = 27
        L_0x02f6:
            X.AnonymousClass4Yv.A00(r1, r0)
        L_0x02f9:
            r1.A4o()
            r1.finish()
            return
        L_0x0300:
            java.lang.Object r3 = r1.A01
            X.933 r3 = (X.AnonymousClass933) r3
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNA(r0)
            X.1KB r4 = r3.A05
            X.10I r12 = r3.A05
            X.1ek r11 = r3.A0A
            X.1QS r10 = r3.A0Q
            X.122 r5 = r3.A07
            X.1QD r7 = r3.A0Q
            X.1ex r8 = r3.A0N
            X.1jF r9 = r3.A0A
            X.1jG r6 = X.AnonymousClass8BT.A0S(r3)
            X.9p4 r2 = new X.9p4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 2
        L_0x0324:
            X.AXN r0 = new X.AXN
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x032d:
            java.lang.Object r2 = r1.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            goto L_0x0422
        L_0x0333:
            java.lang.Object r2 = r1.A01
            X.91T r2 = (X.AnonymousClass91T) r2
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x035e
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            java.lang.Integer r1 = X.C17880vN.A0h()
            java.lang.Integer r0 = X.C17880vN.A0j()
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A10(r2, r1, r0)
            X.94h r0 = r2.A0G
            r1 = 4
            X.19a r0 = r0.A00
            r0.A0C(r1)
            X.94g r0 = r2.A0F
            X.19a r0 = r0.A00
            r0.A0C(r1)
            r0 = 0
            r2.A0n = r0
        L_0x035a:
            r2.finish()
            return
        L_0x035e:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity
            if (r0 == 0) goto L_0x0377
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r2
            r0 = 0
            r2.A0n = r0
            java.lang.Integer r0 = X.C17880vN.A0j()
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.A0c(r2, r0)
            X.94h r0 = r2.A0A
            r1 = 4
            X.19a r0 = r0.A00
            r0.A0C(r1)
            goto L_0x035a
        L_0x0377:
            boolean r0 = r2 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x03be
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r2 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r2
            r0 = 0
            r2.A0n = r0
            r2.A4o()
            r2.finish()
            java.lang.Integer r0 = X.C17880vN.A0j()
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity.A0d(r2, r0)
            X.94h r0 = r2.A0E
            r1 = 4
            X.19a r0 = r0.A00
            r0.A0C(r1)
            return
        L_0x0396:
            java.lang.Object r2 = r1.A01
            X.91T r2 = (X.AnonymousClass91T) r2
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x03a7
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            r0 = 0
            r2.A0n = r0
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0v(r2)
            return
        L_0x03a7:
            boolean r0 = r2 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x03be
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r2 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r2
            r0 = 0
            r2.A0n = r0
            X.A7B r1 = r2.A08
            if (r1 == 0) goto L_0x03ba
            boolean r0 = r2.A0K
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity.A0Q(r1, r2, r0)
            return
        L_0x03ba:
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity.A0c(r2)
            return
        L_0x03be:
            r0 = 0
            r2.A0n = r0
            return
        L_0x03c2:
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r1
            r0 = 200(0xc8, float:2.8E-43)
            X.AnonymousClass4Yv.A00(r1, r0)
            r0 = 1
            r1.A4f(r0)
            return
        L_0x03d0:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 100
            goto L_0x0415
        L_0x03d7:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0415
        L_0x03de:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0415
        L_0x03e5:
            java.lang.Object r3 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass4Yv.A00(r3, r0)
            java.lang.Class<com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity> r0 = com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r3, r0)
            java.lang.String r1 = "extra_bank_account"
            X.8pN r0 = r3.A00
            r2.putExtra(r1, r0)
            r0 = 1020(0x3fc, float:1.43E-42)
            r3.CNh(r2, r0)
            return
        L_0x0401:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0415
        L_0x0408:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0415
        L_0x040f:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x0413:
            r0 = 101(0x65, float:1.42E-43)
        L_0x0415:
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0419:
            java.lang.Object r2 = r1.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            r0 = 101(0x65, float:1.42E-43)
        L_0x041f:
            X.AnonymousClass4Yv.A00(r2, r0)
        L_0x0422:
            X.1L9 r1 = r2.A01
            java.lang.String r0 = "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"
            X.AnonymousClass8BV.A13(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20154A9q.onClick(android.content.DialogInterface, int):void");
    }
}
