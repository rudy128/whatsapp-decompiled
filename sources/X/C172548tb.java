package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tb  reason: invalid class name and case insensitive filesystem */
public final class C172548tb extends AnonymousClass7IA {
    public final A20 A00;
    public final String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172548tb(X.AnonymousClass181 r16, X.A20 r17, X.C19830z4 r18, X.C18030ve r19, X.C31611fq r20, X.AnonymousClass00H r21, java.lang.String r22) {
        /*
            r15 = this;
            r4 = r16
            r5 = r18
            r6 = r19
            r8 = r21
            X.C18070vi.A0s(r6, r4, r5, r8)
            r1 = r22
            r2 = r17
            X.C18070vi.A0l(r2, r1)
            r0 = 42
            X.AlQ r11 = X.C21517AlQ.A00(r0)
            r0 = 43
            X.AlQ r12 = X.C21517AlQ.A00(r0)
            r10 = 0
            java.lang.String r9 = "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243"
            r13 = 8106971506042362(0x1ccd3f64d265fa, double:4.0053761129494027E-308)
            r3 = r15
            r7 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.A00 = r2
            r15.A01 = r1
            java.lang.String r0 = "catalog"
            r15.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172548tb.<init>(X.181, X.A20, X.0z4, X.0ve, X.1fq, X.00H, java.lang.String):void");
    }

    public String A05() {
        return "";
    }

    public void A0A(JSONObject jSONObject) {
        JSONObject A0u = C108985cd.A0u(jSONObject);
        A20 a20 = this.A00;
        JSONArray A12 = AnonymousClass8BT.A12(a20.A01.getRawString(), "jid", A0u);
        for (Object next : a20.A04) {
            JSONObject A15 = C17880vN.A15();
            A15.put("retailer_id", next);
            A12.put(A15);
        }
        JSONObject A152 = C17880vN.A15();
        A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01);
        A0u.put("catalog", A152);
        A0u.put("products", A12);
        A0u.put("width", a20.A03);
        JSONObject A0x = C108965cb.A0x(a20.A02, "height", A0u);
        AnonymousClass8BT.A1N(A0x, "request", C108965cb.A0x(A0u, "product_list", A0x), jSONObject);
    }
}
