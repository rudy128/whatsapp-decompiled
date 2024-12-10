package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8lE  reason: invalid class name */
public final class AnonymousClass8lE extends C172518tY {
    public final C195549tW A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8lE(X.AnonymousClass181 r12, X.C195549tW r13, X.C19830z4 r14, X.C18030ve r15, X.C31611fq r16, X.AnonymousClass11W r17, X.AnonymousClass00H r18) {
        /*
            r11 = this;
            r1 = r12
            r3 = r15
            r5 = r17
            X.C18070vi.A0p(r15, r12, r5)
            r2 = r14
            r6 = r18
            X.C72473Md.A1J(r14, r6)
            r0 = 13
            X.AlQ r7 = X.C21517AlQ.A00(r0)
            r0 = 14
            X.AlQ r8 = X.C21517AlQ.A00(r0)
            r9 = 7849299341766766(0x1be2e56b00706e, double:3.8780691486912686E-308)
            r0 = r11
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8lE.<init>(X.181, X.9tW, X.0z4, X.0ve, X.1fq, X.11W, X.00H):void");
    }

    public void A0A(JSONObject jSONObject) {
        Double d;
        Double d2;
        JSONObject A0u = C108985cd.A0u(jSONObject);
        C195549tW r3 = this.A00;
        String str = r3.A06;
        A0u.put("query_type", str);
        A0u.put("country_code", r3.A01);
        A0u.put("search_query", r3.A04);
        C18030ve r4 = this.A03;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A05(r5, r4, 5257)) {
            A0u.put("version", "2.0");
        }
        A0u.put("experiment_flag", r4.A0I(5857));
        C20079A6f a6f = r3.A00;
        if (!a6f.A05() && C18070vi.A18(str, "business_search")) {
            JSONObject A15 = C17880vN.A15();
            boolean A06 = a6f.A06();
            if (A06) {
                d = a6f.A03;
            } else {
                d = a6f.A01;
            }
            A15.put("latitude", d);
            if (A06) {
                d2 = a6f.A04;
            } else {
                d2 = a6f.A02;
            }
            A15.put("longitude", d2);
            A15.put("has_accurate_location", a6f.A07());
            A15.put("radius", a6f.A05);
            A15.put("location_type", a6f.A08);
            A0u.put("location", A15);
        }
        JSONArray A1A = AnonymousClass8BR.A1A();
        A1A.put(r4.A0I(7384));
        A1A.put(r4.A0I(7385));
        A1A.put(r4.A0I(7386));
        A0u.put("experiment_flags", A1A);
        if (C18020vd.A05(r5, r4, 6743)) {
            A0u.put("token", r4.A0I(6744));
        }
        A0u.put("is_test", r3.A07);
        A0u.put("query_id", r3.A02);
        A0u.put("search_id", r3.A03);
        AnonymousClass8BT.A1N(A0u, "args", C108965cb.A0x(r3.A05, "search_session_id", A0u), jSONObject);
    }
}
