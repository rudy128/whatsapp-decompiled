package X;

import org.json.JSONObject;

/* renamed from: X.4ow  reason: invalid class name and case insensitive filesystem */
public final class C97114ow implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        return C83854Gx.A00(C17880vN.A16(str));
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C195409tI r5 = (C195409tI) obj;
        C18070vi.A0d(r5, 0);
        JSONObject A15 = C17880vN.A15();
        A15.put("survey_type", r5.A05);
        A15.put("session_id", r5.A04);
        A15.put("business_jid", r5.A02.getRawString());
        A15.put("business_session_id", r5.A03);
        A15.put("survey_start_timestamp", r5.A00);
        A15.put("conversion_info", r5.A01.A00());
        return C18070vi.A0H(A15);
    }
}
