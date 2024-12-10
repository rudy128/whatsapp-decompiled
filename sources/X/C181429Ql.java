package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Ql  reason: invalid class name and case insensitive filesystem */
public abstract class C181429Ql {
    public static final List A00(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("processed_videos");
            if (optJSONArray == null) {
                return C18460wS.A00;
            }
            return AnonymousClass1b2.A06(AnonymousClass1b2.A0A(B38.A00, new C99434so(new C21719Aop((C30391dr) null, optJSONArray), 5)));
        } catch (JSONException e) {
            Log.e("failed to parse json to processed videos", e);
            return C18460wS.A00;
        }
    }
}
