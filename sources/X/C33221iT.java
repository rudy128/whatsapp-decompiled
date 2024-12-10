package X;

import android.content.SharedPreferences;
import com.whatsapp.bot.home.sync.discovery.DiscoveryBots;
import com.whatsapp.bot.home.sync.discovery.DiscoveryBotsSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1iT  reason: invalid class name and case insensitive filesystem */
public final class C33221iT {
    public final AnonymousClass00H A00;
    public volatile DiscoveryBots A01;

    public C33221iT(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final DiscoveryBots A00() {
        if (this.A01 != null) {
            return this.A01;
        }
        String string = ((SharedPreferences) ((C38771rr) this.A00.get()).A00.A00.get()).getString("bonsai_bots_response", "");
        C18070vi.A0X(string);
        if (string.length() == 0) {
            return null;
        }
        try {
            this.A01 = DiscoveryBotsSerializer.A00.BLi(new JSONObject(string));
            return this.A01;
        } catch (JSONException unused) {
            return null;
        }
    }
}
