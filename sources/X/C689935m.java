package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.35m  reason: invalid class name and case insensitive filesystem */
public final class C689935m implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            UserJid A04 = UserJid.Companion.A04(A16.getString("user_id"));
            if (A04 == null) {
                throw new AnonymousClass2RU("CTWAAdIdParamsDataTransformer fromData/null");
            }
            long j = A16.getLong("creation_ts");
            String string = A16.getString("ad_id");
            C18070vi.A0b(string);
            return new C62442rP(A04, string, j);
        } catch (Exception e) {
            throw new AnonymousClass2RU("CTWAAdIdParamsDataTransformer fromData/JSONException", e);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C62442rP r5 = (C62442rP) obj;
        C18070vi.A0d(r5, 0);
        JSONObject A15 = C17880vN.A15();
        A15.put("user_id", r5.A01.getRawString());
        A15.put("creation_ts", r5.A00);
        A15.put("ad_id", r5.A02);
        return C18070vi.A0H(A15);
    }
}
