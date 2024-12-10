package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6x1  reason: invalid class name and case insensitive filesystem */
public final class C138406x1 {
    public final AnonymousClass00H A00 = C217517g.A00(32836);
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass11P A04;

    public C138406x1(AnonymousClass190 r2, AnonymousClass11P r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r3, r2, r4, r5);
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = r4;
        this.A02 = r5;
    }

    public static final String A00(C138406x1 r4, C1418477e r5, String str, String str2, String str3) {
        try {
            JSONObject A0h = C108995ce.A0h();
            A0h.put("operation", str3);
            A0h.put("timestamp", AnonymousClass11P.A00(r4.A04));
            C108985cd.A1J(str, A0h);
            A0h.put("password", str2);
            if (r5 != null) {
                A0h.put("fbid", String.valueOf(C108985cd.A09(r5)));
            }
            return C18070vi.A0H(A0h);
        } catch (JSONException e) {
            r4.A03.A0E("CommonUserProtocolUtils/getBasePayload/JSONException failed to generate base payload", e.getMessage(), e);
            return "";
        }
    }
}
