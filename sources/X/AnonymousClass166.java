package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.166  reason: invalid class name */
public class AnonymousClass166 {
    public String A01(C20268AEb aEb) {
        JSONObject jSONObject;
        int i;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("description", aEb.A05);
            jSONObject2.put("footer_text", aEb.A04);
            jSONObject2.put("response_message_type", aEb.A03);
            AE2 ae2 = aEb.A01;
            if (ae2 == null) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("native_flow_response_name", ae2.A01);
                jSONObject.put("native_flow_response_params_json", ae2.A02);
                jSONObject.put("native_flow_response_version", ae2.A00);
            }
            jSONObject2.put("native_flow_response_content", jSONObject);
            AnonymousClass9Je r0 = aEb.A00;
            if (r0 != null) {
                i = r0.value;
            } else {
                i = 0;
            }
            jSONObject2.put("native_flow_response_body_format", i);
        } catch (JSONException e) {
            Log.w("InteractiveResponseMessageConverter/toJSONObject/serialization error", e);
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            return jSONObject2.toString();
        }
        return null;
    }

    public C20268AEb A00(String str) {
        AE2 ae2;
        AnonymousClass9Je r1;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (2 == jSONObject.optInt("response_message_type")) {
                    String optString = jSONObject.optString("description", "");
                    JSONObject optJSONObject = jSONObject.optJSONObject("native_flow_response_content");
                    if (optJSONObject == null) {
                        ae2 = null;
                    } else {
                        ae2 = new AE2(Integer.valueOf(optJSONObject.optInt("native_flow_response_version")), optJSONObject.optString("native_flow_response_name", ""), optJSONObject.optString("native_flow_response_params_json", ""));
                    }
                    int optInt = jSONObject.optInt("native_flow_response_body_format", 0);
                    if (optInt == 0) {
                        r1 = AnonymousClass9Je.DEFAULT;
                    } else if (optInt != 1) {
                        r1 = null;
                    } else {
                        r1 = AnonymousClass9Je.EXTENSIONS_1;
                    }
                    return new C20268AEb(r1, ae2, optString);
                }
            } catch (JSONException e) {
                Log.w("InteractiveResponseMessageConverter/parseJSON/deserialization error", e);
            }
        }
        return null;
    }
}
