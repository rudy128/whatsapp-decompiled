package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class A0t {
    public SharedPreferences A00;
    public final AnonymousClass1QE A01 = AnonymousClass1QE.A00("PaymentProviderKeySharedPrefs", "infra", "COMMON");
    public final C18010vc A02;

    public static synchronized SharedPreferences A00(A0t a0t) {
        SharedPreferences sharedPreferences;
        synchronized (a0t) {
            sharedPreferences = a0t.A00;
            if (sharedPreferences == null) {
                sharedPreferences = a0t.A02.A05("com.whatsapp_payment_provider_key_preferences");
                a0t.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public A0t(C18010vc r4) {
        this.A02 = r4;
    }

    public AZ2 A01(String str, String str2) {
        Long l;
        String str3 = str;
        String str4 = str2;
        String string = A00(this).getString(AnonymousClass001.A1H("::", str2, AnonymousClass000.A11(str)), (String) null);
        if (TextUtils.isEmpty(string)) {
            this.A01.A04(AnonymousClass000.A0y(" is null", AnonymousClass8BW.A0o("getProviderKey/provider=", str)));
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(string);
            String optString = A16.optString("key_type");
            String optString2 = A16.optString("key_version");
            String optString3 = A16.optString("key_data");
            if (!TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(optString2) && ("none".equals(optString) || !TextUtils.isEmpty(optString3))) {
                    String optString4 = A16.optString("key_expiry");
                    byte[] A1a = AnonymousClass8BT.A1a(optString3);
                    if (TextUtils.isEmpty(optString4)) {
                        l = null;
                    } else {
                        l = Long.valueOf(C20099A7c.A03(optString4));
                    }
                    return new AZ2(l, str3, str4, optString, optString2, A1a);
                }
            }
            StringBuilder sb = new StringBuilder(AnonymousClass1QE.A01("PaymentProviderKeySharedPrefs", AnonymousClass000.A0y(" providerKey is null", AnonymousClass8BW.A0o("getProviderKey/provider=", str))));
            if (TextUtils.isEmpty(optString)) {
                sb.append(" keyType is null");
            }
            if (TextUtils.isEmpty(optString2)) {
                sb.append(" keyVersion is null");
            }
            if (!"none".equals(optString) && TextUtils.isEmpty(optString3)) {
                sb.append(" keyData is null");
            }
            C17890vO.A0w(sb);
            return null;
        } catch (JSONException e) {
            this.A01.A0A(AnonymousClass000.A0y(" threw: ", AnonymousClass8BW.A0o("getProviderKey/provider=", str)), e);
            return null;
        }
    }

    public void A02(String str, String str2) {
        C17880vN.A1B(A00(this).edit(), AnonymousClass001.A1H("::", str2, AnonymousClass000.A11(str)));
    }
}
