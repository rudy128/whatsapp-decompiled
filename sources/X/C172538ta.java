package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.8ta  reason: invalid class name and case insensitive filesystem */
public final class C172538ta extends AnonymousClass7IA {
    public final C34991lS A00;
    public final C193959qw A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172538ta(X.AnonymousClass181 r15, X.C19830z4 r16, X.C34991lS r17, X.C18030ve r18, X.C193959qw r19, X.C31611fq r20, X.AnonymousClass00H r21, java.lang.String r22) {
        /*
            r14 = this;
            r3 = r15
            r4 = r16
            r5 = r18
            r7 = r21
            r1 = r17
            X.C18070vi.A0w(r5, r15, r4, r7, r1)
            r0 = 6
            r6 = r20
            X.C18070vi.A0d(r6, r0)
            r0 = 32
            X.AlQ r10 = X.C21517AlQ.A00(r0)
            r0 = 33
            X.AlQ r11 = X.C21517AlQ.A00(r0)
            r9 = 0
            r12 = 27915898928009469(0x632d5cb73090fd, double:8.534135489823851E-307)
            r2 = r14
            r8 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.A00 = r1
            r0 = r19
            r14.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172538ta.<init>(X.181, X.0z4, X.1lS, X.0ve, X.9qw, X.1fq, X.00H, java.lang.String):void");
    }

    public void A0A(JSONObject jSONObject) {
        Object obj;
        C18070vi.A0d(jSONObject, 0);
        AnonymousClass732 A002 = this.A00.A00(C35021lW.A06);
        if (A002 != null) {
            obj = A002.A04.A00;
        } else {
            obj = null;
        }
        C193959qw r3 = this.A01;
        JSONObject A15 = C17880vN.A15();
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, obj);
        A15.put("account_type", r3.A00);
        AnonymousClass8BT.A1N(r3.A01, "provider_type", A15, jSONObject);
    }

    public String A04() {
        String A0h = this.A02.A0h();
        C18070vi.A0X(A0h);
        return A0h;
    }
}
