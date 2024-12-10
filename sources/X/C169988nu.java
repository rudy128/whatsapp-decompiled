package X;

import org.json.JSONException;

/* renamed from: X.8nu  reason: invalid class name and case insensitive filesystem */
public final class C169988nu extends C196289ul {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;

    public static final String A00(C169988nu r6, String str) {
        String str2;
        if (str != null) {
            try {
                str2 = C17880vN.A16(str).getString("number");
            } catch (JSONException e) {
                r6.A01.A0E("LandLineCallAction/extractPhoneNumber", "action param is invalid json", e);
                return null;
            }
        } else {
            str2 = null;
        }
        if (str2 == null || AnonymousClass1YF.A0T(str2)) {
            r6.A01.A0G("LandLineCallAction/extractPhoneNumber", "number in params json is either null or incorrect phone number", false);
        }
        return str2;
    }

    public C169988nu(AnonymousClass1L9 r1, AnonymousClass190 r2, AnonymousClass18K r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
