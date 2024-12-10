package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.AUk  reason: case insensitive filesystem */
public final class C20678AUk implements BC4 {
    public final JSONObject A00;
    public final JSONObject A01;

    public final boolean A00() {
        String str;
        JSONObject jSONObject = this.A00;
        if (jSONObject != null) {
            str = jSONObject.optString("severity");
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("critical");
    }

    public int BOq() {
        JSONObject jSONObject = this.A00;
        if (jSONObject != null) {
            return jSONObject.optInt("error_code");
        }
        return this.A01.optInt("code", 417);
    }

    public String BQa() {
        String optString = this.A01.optString("message");
        if (optString == null) {
            return "";
        }
        return optString;
    }

    public C20678AUk(JSONObject jSONObject) {
        this.A01 = jSONObject;
        this.A00 = jSONObject.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public String BOP() {
        return "EXTENSION";
    }
}
