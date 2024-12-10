package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.8tZ  reason: invalid class name and case insensitive filesystem */
public final class C172528tZ extends AnonymousClass7IA {
    public final String A00;
    public final String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172528tZ(X.AnonymousClass181 r14, X.C19830z4 r15, X.C18030ve r16, X.C31611fq r17, X.AnonymousClass00H r18, java.lang.String r19, java.lang.String r20, long r21) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            X.C18070vi.A0s(r4, r14, r15, r6)
            r0 = 19
            X.AlQ r9 = X.C21517AlQ.A00(r0)
            r0 = 20
            X.AlQ r10 = X.C21517AlQ.A00(r0)
            r8 = 0
            java.lang.String r7 = "WA|471011608249857|4b543e9203c0b420cb5617b71ff0b80a"
            r1 = r13
            r5 = r17
            r11 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r19
            r13.A00 = r0
            r0 = r20
            r13.A01 = r0
            java.lang.String r0 = "extensions"
            r13.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172528tZ.<init>(X.181, X.0z4, X.0ve, X.1fq, X.00H, java.lang.String, java.lang.String, long):void");
    }

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        JSONObject A15 = C17880vN.A15();
        JSONObject A152 = C17880vN.A15();
        A152.put("biz_jid", this.A00);
        if (this.A01 != 7600287926745669L) {
            Object obj = this.A01;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            A152.put("flow_id", obj);
        }
        JSONObject A153 = C17880vN.A15();
        A153.put(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, A152);
        jSONObject.put("variables", AnonymousClass8BV.A0r(A153, "request", A15));
    }

    public String A05() {
        return "";
    }
}
