package X;

import android.content.SharedPreferences;

/* renamed from: X.9uT  reason: invalid class name and case insensitive filesystem */
public final class C196109uT {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21913Aud(this));

    public C196109uT(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final long A02(String str, String str2) {
        C18070vi.A0d(str, 0);
        SharedPreferences A0C = C17880vN.A0C(this.A01);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("extensions_metadata_banned_");
        A10.append(str);
        return C17890vO.A05(A0C, C17890vO.A0Z(str2, A10, '_'));
    }

    public final String A03(String str) {
        C18070vi.A0d(str, 0);
        return C17880vN.A0r(C17880vN.A0C(this.A01), AnonymousClass001.A1H("flows_biz_public_key_pem_", str, AnonymousClass000.A10()));
    }

    public final void A04(long j, String str, String str2) {
        C18070vi.A0d(str, 0);
        SharedPreferences.Editor A0A = C17890vO.A0A(this.A01);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("extensions_metadata_banned_");
        A10.append(str);
        C17880vN.A1D(A0A, C17890vO.A0Z(str2, A10, '_'), j);
    }

    public final int A00() {
        return C17890vO.A00(C17880vN.A0C(this.A01), "flows_need_cleanup_after_target_date");
    }

    public final long A01() {
        return C17890vO.A05(C17880vN.A0C(this.A01), "flows_target_cleanup_date");
    }
}
