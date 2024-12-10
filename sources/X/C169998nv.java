package X;

import org.json.JSONException;

/* renamed from: X.8nv  reason: invalid class name and case insensitive filesystem */
public final class C169998nv extends C196289ul {
    public final C18100vl A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public static final String A00(C169998nv r6, String str) {
        String str2;
        if (str != null) {
            try {
                str2 = C17880vN.A16(str).getString("business_phone_number");
            } catch (JSONException e) {
                ((AnonymousClass190) r6.A01.getValue()).A0E("ViewCatalogAction/extractBizPhone", "action param is invalid json", e);
                return null;
            }
        } else {
            str2 = null;
        }
        if (str2 == null || AnonymousClass1YF.A0T(str2)) {
            ((AnonymousClass190) r6.A01.getValue()).A0G("ViewCatalogAction/extractBizPhone", "business_phone_number in params json is either null or incorrect phone number", false);
        }
        return str2;
    }

    public C169998nv(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A02 = AnonymousClass8BU.A10(r2, 33);
        this.A01 = AnonymousClass8BU.A10(r3, 32);
        this.A00 = AnonymousClass8BU.A10(r4, 31);
        this.A03 = AnonymousClass8BU.A10(r5, 34);
    }
}
