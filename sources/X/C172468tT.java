package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tT  reason: invalid class name and case insensitive filesystem */
public final class C172468tT extends AnonymousClass7IA {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172468tT(X.AnonymousClass181 r14, X.C19830z4 r15, X.C18030ve r16, X.AnonymousClass00H r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r17
            X.C18070vi.A0s(r4, r14, r15, r6)
            r0 = 27
            X.7Rx r9 = new X.7Rx
            r9.<init>(r0)
            r0 = 28
            X.7Rx r10 = new X.7Rx
            r10.<init>(r0)
            r5 = 0
            r11 = 27520444570887679(0x61c5b2d2b565ff, double:7.908918170297092E-307)
            r1 = r13
            r7 = r5
            r8 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r18
            r13.A02 = r0
            r0 = r20
            r13.A00 = r0
            r0 = r19
            r13.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172468tT.<init>(X.181, X.0z4, X.0ve, X.00H, java.lang.String, java.lang.String, int):void");
    }

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        JSONArray A1A = AnonymousClass8BR.A1A();
        JSONObject A15 = C17880vN.A15();
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
        A15.put("version", this.A00);
        JSONArray put = A1A.put(A15);
        JSONObject A152 = C17880vN.A15();
        JSONObject A0x = C108965cb.A0x(AnonymousClass8BT.A12(AnonymousClass8BR.A1A(), "bytecodeVersion", A152).put(this.A01), "supportedCompressions", A152);
        A0x.put("model_request_metadatas", put);
        AnonymousClass8BT.A1N(A152, "client_capability_metadata", A0x, jSONObject);
    }
}
