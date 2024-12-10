package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.24b  reason: invalid class name and case insensitive filesystem */
public abstract class C446024b {
    public static final String A00(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C446124c r3 = (C446124c) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A02);
            jSONObject.put("description", r3.A01);
            jSONArray.put(jSONObject);
        }
        String obj = jSONArray.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static final ArrayList A01(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C18070vi.A0b(jSONObject);
                    C18070vi.A0d(jSONObject, 1);
                    String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    C18070vi.A0X(optString);
                    String optString2 = jSONObject.optString("description");
                    C18070vi.A0X(optString2);
                    arrayList.add(new C446124c((C20271AEe) null, optString, optString2));
                }
            } catch (JSONException e) {
                Log.e("BotCommand/createCommands", e);
            }
        }
        return arrayList;
    }
}
