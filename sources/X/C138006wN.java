package X;

import org.json.JSONObject;

/* renamed from: X.6wN  reason: invalid class name and case insensitive filesystem */
public final class C138006wN {
    public final AnonymousClass00H A00;
    public final AnonymousClass11P A01;

    public C138006wN(AnonymousClass11P r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static final String A00(C138006wN r4, C1418477e r5, String str, String str2, String str3) {
        JSONObject A0h = C108995ce.A0h();
        A0h.put("operation", str3);
        A0h.put("timestamp", AnonymousClass11P.A00(r4.A01));
        C108985cd.A1J(str, A0h);
        A0h.put("password", str2);
        if (r5 != null) {
            A0h.put("fbid", String.valueOf(C108985cd.A09(r5)));
        }
        return C18070vi.A0H(A0h);
    }
}
