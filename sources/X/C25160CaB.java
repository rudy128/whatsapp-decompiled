package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CaB  reason: case insensitive filesystem */
public class C25160CaB {
    public final SharedPreferences A00;
    public final String A01;

    public void A01(String str) {
        this.A00.edit().remove(C17880vN.A0t(AnonymousClass000.A11(this.A01), str.hashCode())).apply();
    }

    public void A02(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
        }
        C17880vN.A1E(this.A00.edit(), C17880vN.A0t(AnonymousClass000.A11(this.A01), str.hashCode()), jSONObject.toString());
    }

    public C25160CaB(SharedPreferences sharedPreferences, String str) {
        this.A01 = AnonymousClass000.A0y("/", AnonymousClass000.A11(str));
        this.A00 = sharedPreferences;
    }

    public HashMap A00() {
        JSONObject jSONObject;
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(this.A00.getAll());
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (C17880vN.A0x(A16).startsWith(this.A01)) {
                try {
                    jSONObject = C17880vN.A16((String) A16.getValue());
                } catch (JSONException unused) {
                    jSONObject = C17880vN.A15();
                }
                if (jSONObject.length() > 0) {
                    String optString = jSONObject.optString("path", "");
                    if (!optString.isEmpty()) {
                        A11.put(optString, jSONObject);
                    }
                }
            }
        }
        return A11;
    }
}
