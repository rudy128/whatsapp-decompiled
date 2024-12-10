package X;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import com.whatsapp.util.Log;

/* renamed from: X.9uG  reason: invalid class name and case insensitive filesystem */
public abstract class C195979uG {
    public final C18030ve A00;
    public final AnonymousClass1QL A01;
    public final AnonymousClass1QO A02;

    public void A01() {
        if (this instanceof C175518yq) {
            C17880vN.A1F(C19830z4.A00(((C175518yq) this).A00), "payments_onboarding_chat_banner_dismmissed", true);
        } else {
            C17880vN.A1F(C19830z4.A00(((C175508yp) this).A01), "payments_incentive_banner_dismissed", true);
        }
    }

    public void A02(Context context) {
        String str;
        if (this instanceof C175518yq) {
            C175518yq r3 = (C175518yq) this;
            Intent BWz = r3.A03.A06().BWz(context, "p2p_context", "in_app_banner");
            if (BWz == null) {
                str = "Pay : PaymentsOnboardingBannerManager/showPaymentsOnboardingScreen intent is null";
            } else {
                context.startActivity(BWz);
                r3.A01();
                return;
            }
        } else {
            C175508yp r5 = (C175508yp) this;
            AnonymousClass1QS r1 = r5.A02;
            Intent BSq = r1.A06().BSq(context);
            if (BSq == null) {
                str = "Pay : PaymentsIncentiveBannerManager/getIncentivesOnboardingIntent intent is null";
            } else {
                context.startActivity(BSq);
                C196079uQ A0O = AnonymousClass8BU.A0O(r1);
                if (A0O != null) {
                    C18030ve r12 = A0O.A07;
                    C18040vf r4 = C18040vf.A02;
                    if (!C18020vd.A05(r4, r12, 979)) {
                        C19830z4 r32 = r5.A01;
                        int A002 = C17890vO.A00(C17890vO.A0B(r32), "payments_incentive_banner_clicked_count") + 1;
                        C17900vP.A0M(r32, "payments_incentive_banner_clicked_count", A002);
                        int A003 = C18020vd.A00(r4, r5.A00, 2217);
                        if (A003 != 0 && A002 >= A003) {
                            r5.A01();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.e(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A00, 12152) != false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x020e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r17 = this;
            r7 = r17
            boolean r0 = r7 instanceof X.C175518yq
            if (r0 == 0) goto L_0x001e
            X.8yq r7 = (X.C175518yq) r7
            X.1ej r0 = r7.A02
            X.1ei r0 = r0.A00()
            r5 = 0
            if (r0 == 0) goto L_0x017b
            X.0ve r2 = r0.A00
            r1 = 12152(0x2f78, float:1.7029E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x017b
        L_0x001d:
            return r5
        L_0x001e:
            X.8yp r7 = (X.C175508yp) r7
            X.1QS r8 = r7.A02
            X.9uQ r0 = X.AnonymousClass8BU.A0O(r8)
            if (r0 == 0) goto L_0x0076
            X.0ve r0 = r0.A07
            boolean r0 = X.AnonymousClass8BS.A1M(r0)
            if (r0 == 0) goto L_0x0076
            X.1ig r0 = r7.A03
            X.9ys r0 = r0.A02()
            if (r0 == 0) goto L_0x0076
            X.2r1 r0 = r0.A08
            long r2 = r0.A01
            X.0z4 r6 = r7.A01
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r6)
            java.lang.String r5 = "payments_incentive_banner_offer_id"
            long r9 = X.C17890vO.A04(r0, r5)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            java.lang.String r4 = "payments_incentive_banner_start_timestamp"
            r0 = -1
            r6.A1q(r4, r0)
            r4 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r6)
            java.lang.String r0 = "payments_incentive_banner_total_days"
            X.C17880vN.A1C(r1, r0, r4)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r6)
            java.lang.String r0 = "payments_incentive_banner_clicked_count"
            X.C17880vN.A1C(r1, r0, r4)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r6)
            java.lang.String r0 = "payments_incentive_banner_dismissed"
            X.C17880vN.A1F(r1, r0, r4)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r6)
            X.C17880vN.A1D(r0, r5, r2)
        L_0x0076:
            X.0ve r4 = r7.A00
            r0 = 884(0x374, float:1.239E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            r5 = 0
            if (r0 == 0) goto L_0x001d
            X.1QO r0 = r7.A02
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x001d
            X.0z4 r2 = r7.A01
            X.00H r6 = r2.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)
            java.lang.String r0 = "payments_incentive_banner_dismissed"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x001d
            r0 = 905(0x389, float:1.268E-42)
            long r15 = X.AnonymousClass8BW.A07(r4, r0)
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "payments_incentive_banner_start_cool_off_timestamp"
            long r11 = r2.A0W(r0)
            r9 = -1
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            long r11 = r11 + r15
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
        L_0x00b6:
            X.9uQ r1 = X.AnonymousClass8BU.A0O(r8)
            if (r1 == 0) goto L_0x001d
            X.0ve r0 = r1.A07
            boolean r0 = X.AnonymousClass8BS.A1M(r0)
            if (r0 == 0) goto L_0x001d
            X.1ig r0 = r7.A03
            X.A0v r10 = r0.A01()
            X.9ys r0 = r10.A01
            X.A03 r8 = r10.A02
            boolean r11 = r1.A03(r0, r8)
            if (r0 == 0) goto L_0x00d6
            if (r11 == 0) goto L_0x00e2
        L_0x00d6:
            X.10I r9 = r7.A04
            r1 = 21
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r7, (boolean) r11)
            r9.CGF(r0)
        L_0x00e2:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11P r0 = r7.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            long r0 = r9.toSeconds(r0)
            int r0 = r10.A00(r0)
            r1 = 1
            if (r0 != r1) goto L_0x001d
            if (r8 == 0) goto L_0x0103
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x001d
            int r0 = r8.A01
            if (r0 >= r1) goto L_0x001d
            int r0 = r8.A00
            if (r0 >= r1) goto L_0x001d
        L_0x0103:
            java.lang.String r12 = "payments_incentive_banner_start_timestamp"
            long r10 = r2.A0W(r12)
            r8 = -1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x013a
            long r0 = java.lang.System.currentTimeMillis()
            r2.A1q(r12, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "payments_incentive_banner_last_seen_timestamp"
            r2.A1q(r7, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r2)
            java.lang.String r0 = "payments_incentive_banner_total_days"
            X.C17880vN.A1C(r1, r0, r5)
        L_0x0128:
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)
            java.lang.String r0 = "payments_incentive_banner_total_days"
            int r1 = r1.getInt(r0, r5)
            r0 = 885(0x375, float:1.24E-42)
            int r0 = X.C18020vd.A00(r3, r4, r0)
            goto L_0x020c
        L_0x013a:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r8 = "payments_incentive_banner_last_seen_timestamp"
            boolean r0 = r2.A2b(r8, r0)
            if (r0 == 0) goto L_0x0128
            r0 = 885(0x375, float:1.24E-42)
            int r1 = X.C18020vd.A00(r3, r4, r0)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r6)
            java.lang.String r9 = "payments_incentive_banner_total_days"
            int r0 = r0.getInt(r9, r5)
            if (r0 < r1) goto L_0x0169
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r2)
            X.C17880vN.A1C(r0, r9, r1)
            r7.A01()
        L_0x0161:
            long r0 = java.lang.System.currentTimeMillis()
            r2.A1q(r8, r0)
            goto L_0x0128
        L_0x0169:
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r6)
            int r0 = r0.getInt(r9, r5)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r2)
            X.C17880vN.A1C(r0, r9, r1)
            goto L_0x0161
        L_0x017b:
            X.0ve r2 = r7.A00
            r0 = 486(0x1e6, float:6.81E-43)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r2, r0)
            X.C175518yq.A05 = r0
            r0 = 484(0x1e4, float:6.78E-43)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x001d
            X.0z4 r6 = r7.A00
            X.00H r4 = r6.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r4)
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x001d
            X.1QO r0 = r7.A02
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x001d
            X.1QL r1 = r7.A01
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.A0G(r0)
            if (r0 != 0) goto L_0x001d
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "payments_onboarding_banner_start_cool_off_timestamp"
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            long r8 = r6.A0W(r0)
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01cf
            long r8 = r8 + r10
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
        L_0x01cf:
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r4)
            java.lang.String r0 = "payments_onboarding_chat_banner_dismmissed"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x001d
            java.lang.String r3 = "payments_onboarding_banner_start_timestamp"
            long r8 = r6.A0W(r3)
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0210
            long r0 = java.lang.System.currentTimeMillis()
            r6.A1q(r3, r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "payments_onboarding_banner_last_seen_timestamp"
            r6.A1q(r0, r1)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r6)
            java.lang.String r0 = "payments_onboarding_banner_total_days"
            X.C17880vN.A1C(r1, r0, r5)
        L_0x0200:
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r4)
            java.lang.String r0 = "payments_onboarding_banner_total_days"
            int r1 = r1.getInt(r0, r5)
            int r0 = X.C175518yq.A05
        L_0x020c:
            if (r1 >= r0) goto L_0x001d
            r5 = 1
            return r5
        L_0x0210:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r3 = "payments_onboarding_banner_last_seen_timestamp"
            boolean r0 = r6.A2b(r3, r0)
            if (r0 == 0) goto L_0x0200
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r4)
            java.lang.String r2 = "payments_onboarding_banner_total_days"
            int r1 = r0.getInt(r2, r5)
            int r0 = X.C175518yq.A05
            if (r1 < r0) goto L_0x0237
            X.C17900vP.A0M(r6, r2, r0)
            r7.A01()
        L_0x022f:
            long r0 = java.lang.System.currentTimeMillis()
            r6.A1q(r3, r0)
            goto L_0x0200
        L_0x0237:
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r4)
            int r0 = r0.getInt(r2, r5)
            int r0 = r0 + 1
            X.C17900vP.A0M(r6, r2, r0)
            goto L_0x022f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195979uG.A03():boolean");
    }

    public C195979uG(C18030ve r1, AnonymousClass1QL r2, AnonymousClass1QO r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public CharSequence A00(Context context) {
        return Html.fromHtml(context.getString(2131893934));
    }
}
