package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9va  reason: invalid class name and case insensitive filesystem */
public abstract class C196749va {
    public static final AnonymousClass8nD A00(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C17960vV.A06(string);
        C18070vi.A0X(string);
        String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C17960vV.A06(string2);
        C18070vi.A0X(string2);
        String optString = jSONObject.optString("icon_url", "");
        String optString2 = jSONObject.optString("bg_color");
        String optString3 = jSONObject.optString("parent_name");
        boolean optBoolean = jSONObject.optBoolean("is_root", false);
        C18070vi.A0b(optString);
        return new AnonymousClass8nD(string, string2, optString, optString2, optString3, optBoolean);
    }

    public static void A01(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(A00(jSONArray.getJSONObject(i)));
    }
}
