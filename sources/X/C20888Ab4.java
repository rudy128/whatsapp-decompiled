package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ab4  reason: case insensitive filesystem */
public final class C20888Ab4 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            C22941Dw r0 = UserJid.Companion;
            UserJid A03 = C22941Dw.A03(A16.getString("user_jid"));
            String string = A16.getString("ad_id");
            long j = A16.getLong("timestamp");
            C18070vi.A0b(string);
            return new C194329rY(A03, string, j);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaAdIdTransformer/fromData/JSONException", e);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C194329rY r4 = (C194329rY) obj;
        C18070vi.A0d(r4, 0);
        try {
            return C18070vi.A0H(AnonymousClass84U.A00(new C22180Ayw(r4)));
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaAdIdTransformer/toData/JSONException", e);
        }
    }
}
