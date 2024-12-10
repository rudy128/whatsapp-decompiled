package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6wO  reason: invalid class name and case insensitive filesystem */
public final class C138016wO {
    public final AnonymousClass11P A00;
    public final AnonymousClass18K A01;

    public static final void A00(AnonymousClass63B r2, JSONObject jSONObject) {
        try {
            r2.A03 = jSONObject.getJSONObject("payload").getString("message_id");
        } catch (JSONException e) {
            Log.e("WearableNotificationLogger: error when parsing message", e);
        }
    }

    public C138016wO(AnonymousClass11P r1, AnonymousClass18K r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
