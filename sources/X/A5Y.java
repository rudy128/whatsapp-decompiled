package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class A5Y {
    public final C18030ve A00;
    public final AnonymousClass1QD A01;
    public final AnonymousClass1QS A02;
    public final C195929uA A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass1QO A05;

    public static String A00(A5Y a5y) {
        AnonymousClass1QM A032;
        if (a5y.A05.A01() && (A032 = a5y.A02.A02("merchant_account_linking_context").A03()) != null) {
            String str = A032.A03;
            if (str.equals("tos_merchant")) {
                return "brpay_m_tos";
            }
            if (str.equals("add_business")) {
                return "brpay_m_enter_taxid";
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.A5Y r6, java.lang.String r7, boolean r8) {
        /*
            X.1QD r3 = r6.A01
            android.content.SharedPreferences r0 = r3.A03()
            java.lang.String r2 = "pref_br_onboarding_add_kyc_step_migration"
            boolean r0 = X.C17880vN.A1W(r0, r2)
            if (r0 != 0) goto L_0x0056
            X.0ve r4 = r6.A00
            r1 = 2000(0x7d0, float:2.803E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            java.lang.String r4 = "p2p_context"
            if (r0 == 0) goto L_0x0028
            android.content.SharedPreferences r1 = r3.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x003e
        L_0x0028:
            boolean r0 = r6.A07(r4)
            if (r0 == 0) goto L_0x004e
            X.9uA r0 = r6.A03
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "generic_context"
            boolean r0 = r6.A06(r0)
            if (r0 == 0) goto L_0x004e
        L_0x003e:
            X.1QS r0 = r6.A02
            X.1QK r1 = r0.A02(r4)
            java.lang.String r0 = "kyc"
            r1.A0B(r0)
            java.lang.String r0 = "pending"
            r3.A0N(r0)
        L_0x004e:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BU.A07(r3)
            X.C17880vN.A1F(r0, r2, r1)
        L_0x0056:
            java.lang.String r4 = "p2m_context"
            boolean r5 = r4.equals(r7)
            if (r5 == 0) goto L_0x00ab
            X.0ve r2 = r6.A00
            r1 = 2928(0xb70, float:4.103E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r3 = "p2p_context"
            boolean r0 = r6.A07(r3)
            if (r0 == 0) goto L_0x0083
            boolean r0 = r6.A07(r4)
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = "tos_no_wallet"
            X.1QS r0 = r6.A02
            X.1QK r0 = r0.A02(r4)
            r0.A0B(r1)
        L_0x0083:
            X.1QS r2 = r6.A02
            X.1QK r0 = r2.A02(r3)
            java.lang.String r1 = "kyc"
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x0098
            X.1QK r0 = r2.A02(r4)
            r0.A0B(r1)
        L_0x0098:
            X.1QK r0 = r2.A02(r3)
            java.lang.String r1 = "add_card"
            boolean r0 = r0.A0G(r1)
            if (r0 == 0) goto L_0x00ab
            X.1QK r0 = r2.A02(r4)
            r0.A0B(r1)
        L_0x00ab:
            java.lang.String r2 = "generic_context"
            boolean r0 = r2.equals(r7)
            r3 = 0
            if (r0 == 0) goto L_0x00d1
            java.lang.String r1 = "p2p_context"
            boolean r0 = r6.A07(r1)
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r6.A07(r4)
            if (r0 == 0) goto L_0x00d8
        L_0x00c2:
            X.9uA r0 = r6.A03
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r6.A06(r2)
            if (r0 == 0) goto L_0x00d8
        L_0x00d0:
            return r3
        L_0x00d1:
            X.1QS r0 = r6.A02
            X.1QK r0 = r0.A02(r7)
            goto L_0x00de
        L_0x00d8:
            X.1QS r0 = r6.A02
            X.1QK r0 = r0.A02(r1)
        L_0x00de:
            X.1QM r1 = r0.A03()
            if (r1 == 0) goto L_0x00d0
            java.lang.String r0 = "tos_no_wallet"
            java.lang.String r1 = r1.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            return r0
        L_0x00f7:
            X.9uA r0 = r6.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "brpay_p_pin_nux_create"
            return r0
        L_0x0102:
            java.lang.String r0 = "kyc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0115
            if (r5 == 0) goto L_0x0112
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L_0x00d0
        L_0x0112:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            return r0
        L_0x0115:
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d0
            if (r8 != 0) goto L_0x00d0
            java.lang.String r0 = "brpay_p_add_card"
            return r0
        L_0x0122:
            boolean r0 = r6.A08(r7)
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "brpay_p_consent_flow"
            return r0
        L_0x012b:
            java.lang.String r0 = "brpay_p_tos"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5Y.A01(X.A5Y, java.lang.String, boolean):java.lang.String");
    }

    public boolean A05() {
        AnonymousClass1QD r7 = this.A01;
        if (C17880vN.A1W(r7.A03(), "payment_account_recoverable")) {
            C18030ve r4 = this.A00;
            C18040vf r3 = C18040vf.A02;
            if (AnonymousClass11P.A01(r7.A01) - C17890vO.A05(r7.A03(), "payment_account_recoverable_time_ms") > TimeUnit.DAYS.toMillis((long) C18020vd.A00(r3, r4, 2267)) || C17880vN.A1W(r7.A03(), "payment_account_recovered") || !C18020vd.A05(r3, r4, 2000)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A06(String str) {
        if (!"generic_context".equals(str)) {
            return this.A02.A02(str).A0G("add_card");
        }
        AnonymousClass1QS r1 = this.A02;
        if (r1.A02("p2p_context").A0G("add_card") || r1.A02("p2m_context").A0G("add_card")) {
            return true;
        }
        return false;
    }

    public boolean A07(String str) {
        return this.A02.A02(str).A0G("tos_no_wallet");
    }

    public boolean A08(String str) {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 2928) || !str.equals("p2p_context") || !A06("p2m_context") || A07("p2p_context")) {
            return false;
        }
        return true;
    }

    public A5Y(AnonymousClass118 r1, C18030ve r2, AnonymousClass1QD r3, AnonymousClass1QO r4, AnonymousClass1QS r5, C195929uA r6) {
        this.A00 = r2;
        this.A04 = r1;
        this.A02 = r5;
        this.A01 = r3;
        this.A05 = r4;
        this.A03 = r6;
    }

    public Intent A02(Context context, AnonymousClass8pK r5) {
        Intent A032 = AnonymousClass8BS.A03(context);
        A032.putExtra("screen_params", A04(r5, (C21347Aib) null, (String) null, -1));
        A032.putExtra("screen_name", "brpay_p_card_verified");
        return A032;
    }

    public Intent A03(Context context, AnonymousClass8pK r5, C21347Aib aib, String str, int i) {
        Intent A032 = AnonymousClass8BS.A03(context);
        A032.putExtra("screen_params", A04(r5, aib, str, i));
        A032.putExtra("screen_name", "brpay_p_card_verify_options");
        A032.putExtra("payment_method_credential_id", r5.A0A);
        return A032;
    }

    public HashMap A04(AnonymousClass8pK r5, C21347Aib aib, String str, int i) {
        HashMap A11 = C17880vN.A11();
        A11.put("credential_id", r5.A0A);
        if (str != null) {
            A11.put("verify_methods", str);
            if (!(!C18020vd.A05(C18040vf.A02, this.A00, 2443) || i == -1 || aib == null)) {
                A11.put("default_selected_position", String.valueOf(i));
                BrazilPayBloksActivity.A0y(aib, A11);
            }
        }
        A11.put("source", "pay_flow");
        A11.put("network_name", C20085A6m.A03(r5.A01));
        AnonymousClass8pY r3 = (AnonymousClass8pY) r5.A08;
        if (r3 != null && !TextUtils.isEmpty(r3.A0E)) {
            A11.put("card_image_url", r3.A0E);
        }
        A11.put("readable_name", A8e.A02(this.A04.A00, r5));
        A11.put("verified_state", AnonymousClass8BS.A0b(((AnonymousClass8pY) r5.A08).A0a ? 1 : 0));
        return A11;
    }
}
