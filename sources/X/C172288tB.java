package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8tB  reason: invalid class name and case insensitive filesystem */
public final class C172288tB extends AnonymousClass161 {
    public void A02(JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = jSONObject;
        C18070vi.A0d(jSONObject2, 0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("xwa_popular_businesses");
        ArrayList A13 = AnonymousClass000.A13();
        JSONArray jSONArray = jSONObject3.getJSONArray("popular_businesses");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            String string = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String string2 = jSONObject4.getString("jid");
            String string3 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            C18070vi.A0b(string);
            C18070vi.A0b(string2);
            C18070vi.A0b(string3);
            A13.add(new C195819tx((Double) null, (Double) null, (Integer) null, (Integer) null, (Integer) null, string, string2, string3, (String) null, (String) null, (String) null, C18460wS.A00, false));
        }
        this.A00 = new C193649qR(A13, false);
    }
}
