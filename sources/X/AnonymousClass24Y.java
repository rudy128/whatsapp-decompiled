package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.24Y  reason: invalid class name */
public abstract class AnonymousClass24Y {
    public static final String A00(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass24Z r3 = (AnonymousClass24Z) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", r3.A01);
            jSONObject.put("emoji", r3.A00);
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
                    String optString = jSONObject.optString("text");
                    C18070vi.A0X(optString);
                    String optString2 = jSONObject.optString("emoji");
                    C18070vi.A0X(optString2);
                    arrayList.add(new AnonymousClass24Z(optString, optString2));
                }
            } catch (JSONException e) {
                Log.e("BotProfile/createPrompts", e);
            }
        }
        return arrayList;
    }
}
