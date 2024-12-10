package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8ij  reason: invalid class name and case insensitive filesystem */
public final class C168358ij extends C172428tP {
    public final C26911Ty A00;
    public final C195539tV A01;
    public final AnonymousClass00H A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168358ij(X.AnonymousClass181 r14, X.C26911Ty r15, X.C195539tV r16, X.C19830z4 r17, X.C18030ve r18, X.C31611fq r19, X.AnonymousClass00H r20, X.AnonymousClass00H r21, java.lang.String r22, X.C18140vp r23, X.C18140vp r24, boolean r25) {
        /*
            r13 = this;
            r0 = r25
            if (r25 == 0) goto L_0x0030
            r11 = 8364482943632913(0x1db773f295c611, double:4.132603667674086E-308)
        L_0x0009:
            r2 = r13
            r3 = r14
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r22
            r9 = r23
            r10 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r16
            r13.A01 = r1
            r13.A03 = r0
            r1 = r21
            r13.A02 = r1
            r13.A00 = r15
            if (r25 == 0) goto L_0x002f
            java.lang.String r0 = ""
            r13.A09(r0)
        L_0x002f:
            return
        L_0x0030:
            r11 = 8463103317112300(0x1e1125cae9f5ec, double:4.1813286061902845E-308)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168358ij.<init>(X.181, X.1Ty, X.9tV, X.0z4, X.0ve, X.1fq, X.00H, X.00H, java.lang.String, X.0vp, X.0vp, boolean):void");
    }

    public String A04() {
        if (this.A03) {
            return "facebook.com";
        }
        return null;
    }

    public void A0A(JSONObject jSONObject) {
        JSONObject A0u = C108985cd.A0u(jSONObject);
        A76 a76 = C20114A7x.A08;
        C195539tV r2 = this.A01;
        UserJid userJid = r2.A05;
        A0u.put("biz_jid", AnonymousClass8BW.A0d(A76.A01(a76, this.A03, userJid, this.A02)));
        A0u.put("collection_limit", r2.A01);
        A0u.put("item_limit", 3);
        A0u.put("width", r2.A03);
        A0u.put("height", r2.A02);
        String str = r2.A07;
        if (str != null) {
            A0u.put("catalog_session_id", str);
        }
        String str2 = r2.A06;
        if (str2 != null) {
            A0u.put("after", str2);
        }
        C194359rb r0 = r2.A00;
        if (r0 != null) {
            C196489v9.A00(r0, A0u);
        }
        C196489v9.A01("collections", this.A00.A0A(userJid), jSONObject, A0u, true);
    }
}
