package X;

import org.json.JSONObject;

/* renamed from: X.8tX  reason: invalid class name and case insensitive filesystem */
public final class C172508tX extends AnonymousClass7IA {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172508tX(X.AnonymousClass181 r14, X.C19830z4 r15, X.C18030ve r16, X.C31611fq r17, X.AnonymousClass00H r18, java.lang.String r19, X.C18140vp r20) {
        /*
            r13 = this;
            r7 = 0
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            X.C18070vi.A0w(r4, r14, r15, r6, r5)
            r0 = 6
            r9 = r20
            X.C18070vi.A0d(r9, r0)
            r0 = 12
            X.AlQ r10 = X.C21517AlQ.A00(r0)
            r11 = 7942225995860428(0x1c3769973589cc, double:3.92398101606192E-308)
            r1 = r13
            r8 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r19
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172508tX.<init>(X.181, X.0z4, X.0ve, X.1fq, X.00H, java.lang.String, X.0vp):void");
    }

    public String A04() {
        String A0h = this.A02.A0h();
        C18070vi.A0X(A0h);
        return A0h;
    }

    public void A0A(JSONObject jSONObject) {
        JSONObject A0u = C108985cd.A0u(jSONObject);
        JSONObject A15 = C17880vN.A15();
        JSONObject A152 = C17880vN.A15();
        A152.put("path", this.A00);
        A15.put("custom_url", A152);
        AnonymousClass8BT.A1N(A15, "data", A0u, jSONObject);
    }
}
