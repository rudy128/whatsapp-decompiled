package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.2qY  reason: invalid class name and case insensitive filesystem */
public final class C61952qY {
    public final C19830z4 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass18K A02;

    public static void A00(C61952qY r2, int i) {
        C170888qp r1 = new C170888qp();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = 13;
        r2.A02.CC7(r1);
    }

    public boolean A01(Context context, AnonymousClass18O r12) {
        int i;
        SharedPreferences A0B;
        SharedPreferences.Editor putInt;
        if (r12.A09(AnonymousClass18O.A0d) && ((C132126mF) this.A01.get()).A00(context, "com.whatsapp.w4b") == null) {
            C19830z4 r6 = this.A00;
            long A0W = r6.A0W("biz_app_cross_sell_banner_notif_time");
            AnonymousClass00H r2 = r6.A00;
            int i2 = C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_expiry_days", 0);
            if (A87.A00(Integer.valueOf(i2), System.currentTimeMillis(), A0W * 1000) < i2 && C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_dismiss_count", 0) < 1 && C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_click_count", 0) < 1) {
                if (r6.A2b("biz_app_upsell_banner_timestamp", 86400000)) {
                    String str = "biz_app_cross_sell_banner_consecutive_days";
                    if (C17880vN.A0B(r2).getInt(str, 0) >= 2) {
                        C17900vP.A0M(r6, str, 0);
                    } else if (C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_cool_off_days", 0) >= 5) {
                        putInt = C19830z4.A00(r6).putInt("biz_app_cross_sell_banner_cool_off_days", 0);
                        putInt.apply();
                        r6.A1i("biz_app_upsell_banner_timestamp");
                    } else {
                        int i3 = C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_cool_off_days", 0);
                        if (i3 <= 0 || i3 > 5) {
                            C17900vP.A0M(r6, "biz_app_cross_sell_banner_total_days", C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_total_days", 0) + 1);
                            A0B = C17880vN.A0B(r2);
                            putInt = C19830z4.A00(r6).putInt(str, A0B.getInt(str, 0) + 1);
                            putInt.apply();
                            r6.A1i("biz_app_upsell_banner_timestamp");
                        }
                    }
                    A0B = C17880vN.A0B(r2);
                    str = "biz_app_cross_sell_banner_cool_off_days";
                    putInt = C19830z4.A00(r6).putInt(str, A0B.getInt(str, 0) + 1);
                    putInt.apply();
                    r6.A1i("biz_app_upsell_banner_timestamp");
                }
                if (C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_total_days", 0) >= 4 || ((i = C17880vN.A0B(r2).getInt("biz_app_cross_sell_banner_cool_off_days", 0)) > 0 && i <= 5)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C61952qY(C19830z4 r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }
}
