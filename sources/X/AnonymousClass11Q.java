package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.11Q  reason: invalid class name */
public class AnonymousClass11Q {
    public SharedPreferences A00;
    public AnonymousClass11P A01;
    public final C18010vc A02;

    public static synchronized SharedPreferences A01(AnonymousClass11Q r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A05("companion_mode_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public AnonymousClass11Q(AnonymousClass11P r1, C18010vc r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static SharedPreferences.Editor A00(AnonymousClass11Q r0) {
        return A01(r0).edit();
    }

    public JSONObject A02() {
        String string = A01(this).getString("history_sync_companion_state", (String) null);
        try {
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("syncd-shared-preferencecs/ Invalid JSON value:");
            sb.append(string);
            Log.e(sb.toString());
        }
        return null;
    }

    public byte[] A03() {
        String string = A01(this).getString("adv_signed_identity", (String) null);
        if (!TextUtils.isEmpty(string)) {
            return Base64.decode(string, 3);
        }
        return null;
    }
}
