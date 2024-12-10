package X;

/* renamed from: X.1fM  reason: invalid class name and case insensitive filesystem */
public class C31311fM {
    public final AnonymousClass00H A00;

    public C31311fM(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final boolean A00(C88074Yf r1) {
        if (AnonymousClass4ZA.A00(r1.A05) || AnonymousClass4ZA.A01(r1.A02)) {
            return true;
        }
        return false;
    }

    public final C88074Yf A01() {
        AnonymousClass00H r6 = this.A00;
        return AnonymousClass4HR.A00(((C88214Yt) r6.get()).A01(), 443, ((C88214Yt) r6.get()).A01.A05("user_proxy_setting_pref").getInt("proxy_media_port", 587), ((C88214Yt) r6.get()).A01.A05("user_proxy_setting_pref").getBoolean("proxy_use_tls", true));
    }

    public final C88074Yf A02() {
        if (((C88214Yt) this.A00.get()).A06()) {
            C88074Yf A01 = A01();
            if (A00(A01)) {
                return A01;
            }
        }
        return null;
    }

    public final boolean A04() {
        AnonymousClass00H r1 = this.A00;
        if (((C88214Yt) r1.get()).A06()) {
            C18030ve r2 = ((C88214Yt) r1.get()).A00;
            if (!C18020vd.A05(C18040vf.A01, r2, 3641) || !C18020vd.A05(C18040vf.A02, r2, 4074)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A03(C88074Yf r6) {
        if (A00(r6)) {
            AnonymousClass00H r4 = this.A00;
            ((C88214Yt) r4.get()).A04(r6.A04);
            ((C88214Yt) r4.get()).A01.A05("user_proxy_setting_pref").edit().putInt("proxy_media_port", r6.A01).apply();
            ((C88214Yt) r4.get()).A01.A05("user_proxy_setting_pref").edit().putBoolean("proxy_use_tls", r6.A06).apply();
        }
    }
}
