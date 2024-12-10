package X;

import org.json.JSONObject;

/* renamed from: X.8tS  reason: invalid class name and case insensitive filesystem */
public class C172458tS extends AnonymousClass7IA {
    public String A00;
    public String A01;

    public C172458tS(AnonymousClass181 r12, C19830z4 r13, C18030ve r14, C31611fq r15, AnonymousClass00H r16) {
        super(r12, r13, r14, r15, r16, (String) null, C21517AlQ.A00(38), C21517AlQ.A00(39), 4181979348560216L);
    }

    public void A0A(JSONObject jSONObject) {
        JSONObject A15 = C17880vN.A15();
        String str = this.A01;
        if (str != null) {
            A15.put("fbid", str);
            A15.put("stitch_images", AnonymousClass000.A0i().toString());
            String str2 = this.A00;
            if (str2 != null) {
                A15.put("ent_type", str2);
            }
            jSONObject.put("variables", A15);
            return;
        }
        throw AnonymousClass000.A0n("GraphqlRequest: fbId is required");
    }
}
