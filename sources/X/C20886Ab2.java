package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.Ab2  reason: case insensitive filesystem */
public final class C20886Ab2 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        JSONObject A16 = C17880vN.A16(str);
        UserJid A04 = UserJid.Companion.A04(A16.getString("user_jid_raw"));
        if (A04 != null) {
            return new C193589qL(A04, A16.getLong("last_mex_sync_ts"));
        }
        throw new AnonymousClass2RU("Invalid BizIntegritySignalsRateLimitParams JSON");
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C193589qL r5 = (C193589qL) obj;
        JSONObject A0u = C108985cd.A0u(r5);
        A0u.put("user_jid_raw", r5.A01.getRawString());
        A0u.put("last_mex_sync_ts", r5.A00);
        return C18070vi.A0H(A0u);
    }
}
