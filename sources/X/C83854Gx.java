package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.4Gx  reason: invalid class name and case insensitive filesystem */
public abstract class C83854Gx {
    public static final C195409tI A00(JSONObject jSONObject) {
        String optString = jSONObject.optString("survey_type", "ctwa_ace");
        String string = jSONObject.getString("session_id");
        String string2 = jSONObject.getString("business_jid");
        String string3 = jSONObject.getString("business_session_id");
        long j = jSONObject.getLong("survey_start_timestamp");
        JSONObject jSONObject2 = jSONObject.getJSONObject("conversion_info");
        C18070vi.A0X(jSONObject2);
        C196009uJ A00 = C181399Qi.A00(jSONObject2);
        C18070vi.A0b(optString);
        C18070vi.A0b(string);
        C22941Dw r0 = UserJid.Companion;
        UserJid A03 = C22941Dw.A03(string2);
        C18070vi.A0b(string3);
        return new C195409tI(A00, A03, optString, string, string3, j);
    }
}
