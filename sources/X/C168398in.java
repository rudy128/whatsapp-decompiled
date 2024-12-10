package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8in  reason: invalid class name and case insensitive filesystem */
public final class C168398in extends C172428tP {
    public final C26911Ty A00;
    public final A20 A01;
    public final AnonymousClass00H A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168398in(X.AnonymousClass181 r14, X.C26911Ty r15, X.A20 r16, X.C19830z4 r17, X.C18030ve r18, X.C31611fq r19, X.AnonymousClass00H r20, X.AnonymousClass00H r21, java.lang.String r22, java.lang.String r23, X.C18140vp r24, X.C18140vp r25, boolean r26) {
        /*
            r13 = this;
            r0 = r26
            if (r26 == 0) goto L_0x0034
            r11 = 8521854914602861(0x1e4694f703276d, double:4.2103557521486634E-308)
        L_0x0009:
            r2 = r13
            r3 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r22
            r9 = r24
            r10 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A04 = r0
            r1 = r16
            r13.A01 = r1
            r13.A00 = r15
            r1 = r21
            r13.A02 = r1
            r1 = r23
            r13.A03 = r1
            if (r26 == 0) goto L_0x0033
            java.lang.String r0 = ""
            r13.A09(r0)
        L_0x0033:
            return
        L_0x0034:
            r11 = 9413419895354443(0x2171749cfbf44b, double:4.851547043331862E-308)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168398in.<init>(X.181, X.1Ty, X.A20, X.0z4, X.0ve, X.1fq, X.00H, X.00H, java.lang.String, java.lang.String, X.0vp, X.0vp, boolean):void");
    }

    public String A04() {
        if (this.A04) {
            return "facebook.com";
        }
        return null;
    }

    public void A0A(JSONObject jSONObject) {
        JSONObject A0u = C108985cd.A0u(jSONObject);
        A76 a76 = C20114A7x.A08;
        A20 a20 = this.A01;
        UserJid userJid = a20.A01;
        JSONArray A12 = AnonymousClass8BT.A12(AnonymousClass8BW.A0d(A76.A01(a76, this.A03, userJid, this.A02)), "jid", A0u);
        for (Object next : a20.A04) {
            JSONObject A15 = C17880vN.A15();
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, next);
            A12.put(A15);
        }
        A0u.put("products", A12);
        A0u.put("width", a20.A03);
        A0u.put("height", a20.A02);
        String str = this.A03;
        if (str != null) {
            A0u.put("catalog_session_id", str);
        }
        C194359rb r0 = a20.A00;
        if (r0 != null) {
            C196489v9.A00(r0, A0u);
        }
        C196489v9.A01("product_list", this.A00.A0A(userJid), jSONObject, A0u, true);
    }
}
