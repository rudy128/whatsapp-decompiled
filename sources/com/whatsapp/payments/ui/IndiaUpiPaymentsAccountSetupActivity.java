package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1QE;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.C000200d;
import X.C137116uw;
import X.C17900vP;
import X.C195019sf;
import X.C20760AXp;
import X.C20763AXs;
import X.C22445B8d;
import X.C33651jA;
import X.C33671jC;
import X.C63662tU;
import X.C63932tv;
import android.content.Intent;
import android.os.Bundle;

public class IndiaUpiPaymentsAccountSetupActivity extends AnonymousClass91T {
    public C33671jC A00;
    public C33651jA A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final AnonymousClass1QE A04;
    public final C22445B8d A05;

    private boolean A0V(int i) {
        if (!(i == 2 || i == 3)) {
            if (i != 14) {
                switch (i) {
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                        break;
                    case 9:
                        break;
                    default:
                        return true;
                }
            }
            return !getIntent().getBooleanExtra("extra_show_bottom_sheet_props", false);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity r6) {
        /*
            X.0z4 r0 = r6.A0A
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C17880vN.A1F(r1, r0, r3)
            X.1QL r0 = r6.A0K
            X.1QM r4 = r0.A03()
            boolean r0 = r6.A0m
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r6.A0p
            if (r0 != 0) goto L_0x00cb
            X.1QD r0 = r6.A0Q
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x00cb
            X.0ve r2 = r6.A0E
            r1 = 2974(0xb9e, float:4.167E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x003c
            int r0 = r6.A02
            boolean r0 = r6.A0V(r0)
            if (r0 != 0) goto L_0x00cb
        L_0x003c:
            int r0 = r6.A02
            boolean r0 = r6.A0V(r0)
            if (r0 == 0) goto L_0x00c7
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity.class
        L_0x0046:
            android.content.Intent r5 = X.AnonymousClass8BR.A07(r6, r0)
            java.lang.String r1 = "extra_setup_mode"
            int r0 = r6.A03
            r5.putExtra(r1, r0)
            java.lang.String r2 = "referral_screen"
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x00a5
            java.lang.String r1 = X.C108955ca.A0r(r6, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a5
        L_0x0063:
            r5.putExtra(r2, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x0079
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "extra_deep_link_url"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r5.putExtra(r1, r0)
        L_0x0079:
            r6.A4v(r5)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r6.A0c
            r5.putExtra(r1, r0)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x00a1
            android.content.Intent r4 = r6.getIntent()
            r0 = -1
            java.lang.String r2 = "perf_start_time_ns"
            long r0 = r4.getLongExtra(r2, r0)
            r5.putExtra(r2, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "perf_origin"
            X.AnonymousClass8BS.A13(r1, r5, r0)
        L_0x00a1:
            r6.A3q(r5, r3)
        L_0x00a4:
            return
        L_0x00a5:
            int r0 = r6.A02
            switch(r0) {
                case 1: goto L_0x00ac;
                case 2: goto L_0x00af;
                case 3: goto L_0x00af;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00bb;
                case 9: goto L_0x00be;
                case 10: goto L_0x00c1;
                case 11: goto L_0x00c4;
                case 12: goto L_0x00b2;
                case 13: goto L_0x00b2;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            r1 = 0
            goto L_0x0063
        L_0x00ac:
            java.lang.String r1 = "in_app_banner"
            goto L_0x0063
        L_0x00af:
            java.lang.String r1 = "chat"
            goto L_0x0063
        L_0x00b2:
            java.lang.String r1 = "payment_home"
            goto L_0x0063
        L_0x00b5:
            java.lang.String r1 = "new_payment"
            goto L_0x0063
        L_0x00b8:
            java.lang.String r1 = "payment_bank_account_details"
            goto L_0x0063
        L_0x00bb:
            java.lang.String r1 = "qr_code_scan_prompt"
            goto L_0x0063
        L_0x00be:
            java.lang.String r1 = "deeplink"
            goto L_0x0063
        L_0x00c1:
            java.lang.String r1 = "payment_composer_icon"
            goto L_0x0063
        L_0x00c4:
            java.lang.String r1 = "order_details"
            goto L_0x0063
        L_0x00c7:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.class
            goto L_0x0046
        L_0x00cb:
            if (r4 != 0) goto L_0x00ef
            X.1QE r1 = r6.A04
            java.lang.String r0 = "showNextStep is already complete"
            r1.A06(r0)
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.9sf r0 = (X.C195019sf) r0
            r0.A00()
            X.1QD r0 = r6.A0Q
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            r6.A0Q(r3)
            return
        L_0x00ef:
            X.1QE r2 = r6.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "showNextStep: "
            X.AnonymousClass8BX.A1D(r2, r4, r0, r1)
            X.1QM r0 = X.AnonymousClass1QK.A05
            if (r4 != r0) goto L_0x0108
            java.lang.String r1 = "Unset step"
            r0 = 0
            r2.A0A(r1, r0)
            r6.finish()
            return
        L_0x0108:
            java.lang.String r0 = "tos_with_wallet"
            java.lang.String r1 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = "showAddCard not implemented"
            r2.A06(r0)
            return
        L_0x0128:
            java.lang.String r0 = "add_bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016b
            X.1QD r0 = r6.A0Q
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x01a6
            X.AXS r1 = r6.A0N
            java.lang.String r0 = r1.A0G()
            boolean r0 = r1.A0U(r0)
            if (r0 != 0) goto L_0x01a6
            X.0ve r2 = r6.A0E
            r1 = 1644(0x66c, float:2.304E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01a6
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x0168
            r0 = 3
            if (r1 == r0) goto L_0x0168
            r0 = 6
            if (r1 == r0) goto L_0x0168
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity.class
        L_0x0163:
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r6, r0)
            goto L_0x01ca
        L_0x0168:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity.class
            goto L_0x0163
        L_0x016b:
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a4
            X.1QD r0 = r6.A0Q
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.9sf r0 = (X.C195019sf) r0
            r0.A00()
            int r0 = r6.A03
            if (r0 != r3) goto L_0x01a2
            X.A6g r1 = r6.A0O
            X.8pN r0 = r6.A0A
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r1 = "nav_select_account"
            java.lang.String r0 = r6.A0c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01ad
        L_0x01a2:
            r6.A0Q(r2)
            return
        L_0x01a6:
            r6.A0l = r3
            android.content.Intent r2 = X.AnonymousClass1LU.A07(r6)
            goto L_0x01ca
        L_0x01ad:
            r6.A0l = r3
            X.8pN r1 = r6.A0A
            java.lang.String r0 = r6.A0b
            android.content.Intent r2 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A03(r6, r1, r0, r2)
            goto L_0x01ca
        L_0x01b8:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r6, r0)
            java.lang.String r0 = "stepName"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_setup_mode"
            int r0 = r6.A03
            r2.putExtra(r1, r0)
        L_0x01ca:
            r6.A4v(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r6.A0c
            r2.putExtra(r1, r0)
            r6.A3q(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.A03(com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity):void");
    }

    private void A0Q(boolean z) {
        this.A04.A06(C17900vP.A0D("showCompleteAndFinish ", AnonymousClass000.A10(), z));
        CEx();
        this.A00.A00(new C20760AXp(this, 1));
        Intent A07 = AnonymousClass8BR.A07(this, IndiaUpiBankAccountAddedLandingActivity.class);
        String str = this.A0f;
        if (str == null) {
            str = "nav_select_account";
        }
        A07.putExtra("referral_screen", str);
        A4v(A07);
        A07.putExtra("extra_previous_screen", this.A0c);
        A3q(A07, true);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            this.A01 = (C33651jA) r2.A8B.get();
            this.A02 = C000200d.A00(r2.Acm);
            this.A00 = (C33671jC) r2.Acl.get();
        }
    }

    public IndiaUpiPaymentsAccountSetupActivity(int i) {
        this.A03 = false;
        AGD.A00(this, 17);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131894075);
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1QE r2 = this.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onResume payment setup with mode: ");
        AnonymousClass8BV.A1F(r2, A10, this.A03);
        if (!isFinishing() && !((C195019sf) this.A02.get()).A02(this.A05)) {
            A03(this);
        }
    }

    public IndiaUpiPaymentsAccountSetupActivity() {
        this(0);
        this.A05 = new C20763AXs(this, 1);
        this.A04 = AnonymousClass1QE.A00("IndiaUpiPaymentsAccountSetupActivity", "payment-settings", "IN");
    }
}
