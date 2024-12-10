package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8il  reason: invalid class name and case insensitive filesystem */
public final class C168378il extends C172428tP {
    public final C26911Ty A00;
    public final C195469tO A01;
    public final AnonymousClass00H A02;
    public final String A03;

    public C168378il(AnonymousClass181 r15, C26911Ty r16, C19830z4 r17, C195469tO r18, C18030ve r19, C31611fq r20, AnonymousClass00H r21, AnonymousClass00H r22, String str, String str2, C18140vp r25, C18140vp r26, long j) {
        super(r15, r17, r19, r20, r21, str, r25, r26, j);
        this.A03 = str2;
        this.A01 = r18;
        this.A00 = r16;
        this.A02 = r22;
        if (9426523704041647L == j) {
            A09("");
        }
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
        C195469tO r4 = this.A01;
        UserJid userJid = r4.A01;
        A0u.put("jid", AnonymousClass8BW.A0d(A76.A01(a76, this.A03, userJid, this.A02)));
        A0u.put("product_id", r4.A04);
        A0u.put("width", String.valueOf(r4.A03));
        A0u.put("height", String.valueOf(r4.A02));
        A0u.put("catalog_session_id", r4.A05);
        if (r4.A06) {
            A0u.put("fetch_compliance_info", "true");
        }
        C194359rb r0 = r4.A00;
        if (r0 != null) {
            C196489v9.A00(r0, A0u);
        }
        C196489v9.A01("product", this.A00.A0A(userJid), jSONObject, A0u, true);
    }
}
