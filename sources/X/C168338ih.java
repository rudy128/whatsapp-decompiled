package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8ih  reason: invalid class name and case insensitive filesystem */
public final class C168338ih extends C172428tP {
    public final C195149ss A00;
    public final C26911Ty A01;

    public void A0A(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        C195149ss r10 = this.A00;
        UserJid userJid = r10.A02;
        JSONObject A15 = C17880vN.A15();
        A15.put("width", r10.A01);
        A15.put("height", r10.A00);
        JSONObject A152 = C17880vN.A15();
        A152.put("biz_jid", AnonymousClass8BW.A0d(userJid));
        A152.put("image_dimensions", A15);
        Set set = r10.A04;
        if (C108945cZ.A1U(set)) {
            ArrayList A10 = C17880vN.A10(set);
            JSONArray A1A = AnonymousClass8BR.A1A();
            int size = A10.size();
            for (int i = 0; i < size; i++) {
                JSONObject A153 = C17880vN.A15();
                A153.put("category_id", A10.get(i));
                A1A.put(A153);
            }
            A152.put("category_ids", A1A);
        }
        A152.put("catalog_session_id", r10.A03);
        C196489v9.A01("categories", this.A01.A0A(userJid), jSONObject, A152, true);
    }

    public C168338ih(AnonymousClass181 r12, C26911Ty r13, C195149ss r14, C19830z4 r15, C18030ve r16, C31611fq r17, AnonymousClass00H r18, C18140vp r19, C18140vp r20) {
        super(r12, r15, r16, r17, r18, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r19, r20, 4761338647311214L);
        this.A01 = r13;
        this.A00 = r14;
    }
}
