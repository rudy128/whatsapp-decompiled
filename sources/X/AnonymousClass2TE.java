package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2TE  reason: invalid class name */
public abstract class AnonymousClass2TE {
    public static final AnonymousClass2DX A00(JSONObject jSONObject) {
        String string = jSONObject.getString("uj");
        String string2 = jSONObject.getString("s");
        long j = jSONObject.getLong("ct");
        String A01 = C20064A5n.A01("a", (String) null, jSONObject);
        long optLong = jSONObject.optLong("fmts", -1);
        boolean optBoolean = jSONObject.optBoolean("wdtb", false);
        C22941Dw r0 = UserJid.Companion;
        UserJid A03 = C22941Dw.A03(string);
        C18070vi.A0b(string2);
        return new AnonymousClass2DX(A03, string2, A01, j, optLong, optBoolean);
    }
}
