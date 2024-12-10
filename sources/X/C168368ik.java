package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8ik  reason: invalid class name and case insensitive filesystem */
public final class C168368ik extends C172428tP {
    public final C26911Ty A00;
    public final C188519hY A01;
    public final AnonymousClass00H A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168368ik(X.AnonymousClass181 r13, X.C26911Ty r14, X.C19830z4 r15, X.C188519hY r16, X.C18030ve r17, X.C31611fq r18, X.AnonymousClass00H r19, X.AnonymousClass00H r20, java.lang.String r21, java.lang.String r22, X.C18140vp r23, X.C18140vp r24, boolean r25) {
        /*
            r12 = this;
            if (r25 == 0) goto L_0x002f
            r10 = 9044289622249992(0x2021bbc62e1208, double:4.486797869770049E-308)
        L_0x0007:
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r21
            r8 = r23
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r22
            r12.A03 = r0
            r0 = r16
            r12.A01 = r0
            r12.A00 = r14
            r0 = r20
            r12.A02 = r0
            if (r25 == 0) goto L_0x002e
            java.lang.String r0 = ""
            r12.A09(r0)
        L_0x002e:
            return
        L_0x002f:
            r10 = 9415889135094734(0x2173b387244bce, double:4.853986976385909E-308)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168368ik.<init>(X.181, X.1Ty, X.0z4, X.9hY, X.0ve, X.1fq, X.00H, X.00H, java.lang.String, java.lang.String, X.0vp, X.0vp, boolean):void");
    }

    public String A04() {
        String str = this.A03;
        if (str == null) {
            return null;
        }
        return str;
    }

    public void A0A(JSONObject jSONObject) {
        JSONObject A0u = C108985cd.A0u(jSONObject);
        A76 a76 = C20114A7x.A08;
        C188519hY r7 = this.A01;
        UserJid userJid = r7.A08;
        A0u.put("jid", AnonymousClass8BW.A0d(A76.A01(a76, this.A03, userJid, this.A02)));
        A0u.put("limit", String.valueOf(r7.A05));
        A0u.put("width", String.valueOf(r7.A07));
        A0u.put("height", String.valueOf(r7.A06));
        String str = r7.A09;
        if (str != null) {
            A0u.put("after", str);
        }
        String str2 = r7.A0A;
        if (str2 != null) {
            A0u.put("catalog_session_id", str2);
        }
        if (C18070vi.A19(r7.A02, true)) {
            A0u.put("allow_shop_source", true);
        }
        if (r7.A03) {
            A0u.put("consumer_visible_only", true);
        }
        AnonymousClass9NJ r5 = r7.A00;
        if (r5 != null) {
            JSONObject A15 = C17880vN.A15();
            A15.put("value", r5.A00);
            A15.put("version", r5.A01);
            A0u.put("query", A15);
        }
        if (r7.A04) {
            A0u.put("skip_direct_connection_encrypted_info_check", true);
        }
        C194359rb r0 = r7.A01;
        if (r0 != null) {
            C196489v9.A00(r0, A0u);
        }
        C196489v9.A01("product_catalog", this.A00.A0A(userJid), jSONObject, A0u, true);
    }
}
