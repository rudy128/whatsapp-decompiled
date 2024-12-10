package X;

import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.Aaf  reason: case insensitive filesystem */
public class C20863Aaf implements C22518BBb {
    public final int A00;
    public final Object A01;

    public static boolean A00(AnonymousClass11P r5, AnonymousClass8GH r6, Integer num, String str) {
        C20087A6p.A02(C20087A6p.A00(r5, (AnonymousClass1KN) null, (C19962A0v) null, str, false), r6.A09, num, "payment_home", (String) null, 1);
        return true;
    }

    public C20863Aaf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b6, code lost:
        X.C17880vN.A1F(r1, r0, r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d6, code lost:
        X.C17880vN.A1F(r1, r0, r2);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0104, code lost:
        X.C17880vN.A1F(r1, r0, r2);
        r3.A01.A0E(new X.A5C(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0112, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r3.A01.A0E(new X.A5C(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bp8() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00e9;
                case 2: goto L_0x00f7;
                case 3: goto L_0x001a;
                case 4: goto L_0x0036;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0049;
                case 8: goto L_0x0064;
                case 9: goto L_0x007f;
                case 10: goto L_0x009a;
                case 11: goto L_0x00bb;
                case 12: goto L_0x00c9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            r1 = 1
            r0 = 3
            r3.A0V(r1, r0)
        L_0x000e:
            r0 = 0
            X.A5C r1 = new X.A5C
            r1.<init>(r0)
            X.1DT r0 = r3.A01
            r0.A0E(r1)
            return
        L_0x001a:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.11P r1 = r3.A05
            java.lang.String r0 = "warm_welcome_banner"
            boolean r2 = A00(r1, r3, r2, r0)
            X.1QD r0 = r3.A07
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_upi_warm_welcme_banner_dismissed_state"
            goto L_0x00b6
        L_0x0036:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            r0 = 3
            r2 = 1
            r3.A0V(r2, r0)
            X.1QD r0 = r3.A07
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_account_recovery_banner_dismissed"
            goto L_0x00d6
        L_0x0049:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.11P r1 = r3.A05
            java.lang.String r0 = "scan_qr_code_banner"
            boolean r2 = A00(r1, r3, r2, r0)
            X.1QD r0 = r3.A07
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            goto L_0x00b6
        L_0x0064:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.11P r1 = r3.A05
            java.lang.String r0 = "recent_businesses"
            boolean r2 = A00(r1, r3, r2, r0)
            X.1QD r0 = r3.A07
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_explore_merchsnts_banner_dismissed"
            goto L_0x00b6
        L_0x007f:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.11P r1 = r3.A05
            java.lang.String r0 = "add_upi_number_banner"
            boolean r2 = A00(r1, r3, r2, r0)
            X.1QD r0 = r3.A07
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_add_upi_number_banner_dismissed"
            goto L_0x00b6
        L_0x009a:
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.A01
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r3 = (com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel) r3
            X.11P r1 = r3.A05
            java.lang.String r0 = "send_first_payment_banner"
            boolean r2 = A00(r1, r3, r2, r0)
            X.9bW r0 = r3.A08
            X.1QD r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "settingsQuickTipDismissedState"
        L_0x00b6:
            X.C17880vN.A1F(r1, r0, r2)
            goto L_0x000e
        L_0x00bb:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.1QD r0 = r3.A07
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_upi_video_banner_dismissed"
            goto L_0x00d6
        L_0x00c9:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.1QD r0 = r3.A07
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
        L_0x00d6:
            X.C17880vN.A1F(r1, r0, r2)
            goto L_0x000e
        L_0x00db:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.1QD r0 = r3.A07
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_brazil_nux_dismissed"
            goto L_0x0104
        L_0x00e9:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.1QD r0 = r3.A07
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_brazil_p2p_banner_deprecation_dismissed"
            goto L_0x0104
        L_0x00f7:
            java.lang.Object r3 = r4.A01
            X.8GH r3 = (X.AnonymousClass8GH) r3
            X.1QD r0 = r3.A07
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_brazil_nux_merchant_order_ed_dismissed"
        L_0x0104:
            X.C17880vN.A1F(r1, r0, r2)
            X.1DT r2 = r3.A01
            r1 = 0
            X.A5C r0 = new X.A5C
            r0.<init>(r1)
            r2.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20863Aaf.Bp8():void");
    }

    public void Bqc() {
        if (10 - this.A00 == 0) {
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A01;
            indiaPaymentSettingsViewModel.A08.A00 = true;
            indiaPaymentSettingsViewModel.A01.A0E(new A5C(0));
        }
    }
}
