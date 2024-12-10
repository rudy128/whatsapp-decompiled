package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8ig  reason: invalid class name and case insensitive filesystem */
public final class C168328ig extends C172428tP {
    public final C26911Ty A00;
    public final C193509qD A01;

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        JSONObject A15 = C17880vN.A15();
        C193509qD r6 = this.A01;
        UserJid userJid = r6.A00;
        C18070vi.A0d(userJid, 0);
        JSONObject A0x = C108965cb.A0x(userJid.getRawString(), "biz_jid", A15);
        A0x.put("width", 100);
        A0x.put("height", 100);
        A15.put("image_dimensions", A0x);
        String str = r6.A01;
        if (str != null) {
            A15.put("catalog_session_id", str);
        }
        C196489v9.A01("promotions", this.A00.A0A(userJid), jSONObject, A15, false);
    }

    public C168328ig(AnonymousClass181 r12, C26911Ty r13, C193509qD r14, C19830z4 r15, C18030ve r16, C31611fq r17, AnonymousClass00H r18, C18140vp r19, C18140vp r20) {
        super(r12, r15, r16, r17, r18, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r19, r20, 5773368456121168L);
        this.A01 = r14;
        this.A00 = r13;
    }
}
