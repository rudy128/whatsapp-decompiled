package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.20V  reason: invalid class name */
public final class AnonymousClass20V implements AnonymousClass20O {
    public static final AnonymousClass20V A00 = new Object();

    public /* bridge */ /* synthetic */ Object BLi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        UserJid A04 = UserJid.Companion.A04(jSONObject.optString("jid"));
        String optString = jSONObject.optString("persona_id");
        if (A04 != null) {
            return new AnonymousClass20Q(A04, optString);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object BLj(Object obj) {
        AnonymousClass9D8 r4 = (AnonymousClass9D8) obj;
        C18070vi.A0d(r4, 0);
        UserJid userJid = (UserJid) r4.A01;
        String str = r4.A04;
        if (userJid == null) {
            return null;
        }
        return new AnonymousClass20Q(userJid, str);
    }

    public /* bridge */ /* synthetic */ JSONObject CPN(Object obj) {
        AnonymousClass20Q r4 = (AnonymousClass20Q) obj;
        C18070vi.A0d(r4, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jid", r4.A00.getRawString());
        jSONObject.put("persona_id", r4.A01);
        return jSONObject;
    }
}
