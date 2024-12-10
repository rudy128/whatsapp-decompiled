package X;

import org.json.JSONException;

/* renamed from: X.6m0  reason: invalid class name and case insensitive filesystem */
public final class C131996m0 {
    public final AnonymousClass190 A00;
    public final C18030ve A01;

    public final int A00(String str, int i) {
        String A0v = C108955ca.A0v(this.A01, 3982);
        try {
            return C17880vN.A16(A0v).optInt(str, i);
        } catch (JSONException unused) {
            this.A00.A0G("WABISurveyFeatureConfigParse", A0v, false);
            return i;
        }
    }

    public C131996m0(AnonymousClass190 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
