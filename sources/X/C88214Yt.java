package X;

import android.content.SharedPreferences;

/* renamed from: X.4Yt  reason: invalid class name and case insensitive filesystem */
public final class C88214Yt {
    public final C18030ve A00;
    public final C18010vc A01;

    public final String A01() {
        return C17880vN.A0r(this.A01.A05("user_proxy_setting_pref"), "proxy_ip_address");
    }

    public final void A02(int i) {
        C17880vN.A1C(this.A01.A05("user_proxy_setting_pref").edit(), "proxy_media_connection_status", i);
    }

    public final void A03(int i) {
        C17880vN.A1C(this.A01.A05("user_proxy_setting_pref").edit(), "proxy_connection_status", i);
    }

    public final void A04(String str) {
        C17880vN.A1E(this.A01.A05("user_proxy_setting_pref").edit(), "proxy_ip_address", str);
    }

    public final void A05(boolean z) {
        C17880vN.A1F(this.A01.A05("user_proxy_setting_pref").edit(), "proxy_enabled", z);
    }

    public final boolean A06() {
        if (!this.A01.A05("user_proxy_setting_pref").getBoolean("proxy_enabled", false)) {
            return false;
        }
        C18030ve r2 = this.A00;
        if (C18020vd.A05(C18040vf.A02, r2, 2784) || C18020vd.A05(C18040vf.A01, r2, 3641)) {
            return true;
        }
        return false;
    }

    public C88214Yt(C18030ve r1, C18010vc r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static SharedPreferences A00(AnonymousClass00H r1) {
        return ((C88214Yt) r1.get()).A01.A05("user_proxy_setting_pref");
    }

    public final boolean A07() {
        if (!A06() || !AnonymousClass4ZA.A01(A01())) {
            return false;
        }
        return true;
    }
}
