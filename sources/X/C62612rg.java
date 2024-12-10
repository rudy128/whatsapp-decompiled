package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2rg  reason: invalid class name and case insensitive filesystem */
public class C62612rg {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C62612rg)) {
            return false;
        }
        C62612rg r4 = (C62612rg) obj;
        return C42171xk.A00(this.A01, r4.A01) && C42171xk.A00(this.A00, r4.A00) && C42171xk.A00(this.A02, r4.A02) && C42171xk.A00(this.A03, r4.A03);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        return AnonymousClass000.A0P(this.A03, objArr, 3);
    }

    public String A01() {
        Object obj = this.A03.get(Integer.toString(-1));
        C17960vV.A07(obj);
        return (String) obj;
    }

    public String A03(int i) {
        String A0s = C17880vN.A0s(Integer.toString(i), this.A03);
        if (A0s == null) {
            return "";
        }
        return A0s;
    }

    public C62612rg(String str, String str2, String str3, String str4, Map map) {
        this.A01 = str;
        this.A00 = str3;
        this.A02 = str4;
        map = map == null ? C17880vN.A11() : map;
        this.A03 = map;
        map.put(Integer.toString(-1), str2);
    }

    public static C62612rg A00(String str) {
        HashMap A11;
        String str2;
        JSONObject A16 = C17880vN.A16(str);
        JSONObject optJSONObject = A16.optJSONObject("bundles");
        if (optJSONObject == null) {
            A11 = null;
            str2 = "";
        } else {
            A11 = C17880vN.A11();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A0v = C17880vN.A0v(keys);
                A11.put(A0v, optJSONObject.getString(A0v));
            }
            str2 = (String) A11.get(Integer.toString(-1));
        }
        if (str2 == null) {
            return null;
        }
        return new C62612rg(A16.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), str2, A16.optString("locale_lang", (String) null), A16.optString("url", (String) null), A11);
    }

    public String A02() {
        JSONObject A15 = C17880vN.A15();
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
        A15.put("locale_lang", this.A00);
        A15.put("url", this.A02);
        A15.put("bundles", new JSONObject(this.A03));
        return A15.toString();
    }
}
