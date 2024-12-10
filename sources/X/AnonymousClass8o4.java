package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8o4  reason: invalid class name */
public class AnonymousClass8o4 extends AnonymousClass8o6 {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public AnonymousClass8o4() {
        super(-1, "unknown", "unknown");
    }

    public boolean A04(String str) {
        try {
            super.A04(str);
            JSONObject A16 = C17880vN.A16(str);
            this.A01 = A16.optString("header_type");
            this.A02 = A16.optString("template_id_hash");
            JSONArray optJSONArray = A16.optJSONArray("button_id_hashes");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.A03 = AnonymousClass000.A13();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.A03.add(optJSONArray.get(i).toString());
                }
            }
            if (!A16.has("template_button_reply_selected_id_hash")) {
                return true;
            }
            this.A00 = A16.optString("template_button_reply_selected_id_hash");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchHSMEvent: fromJsonString threw: ", e);
            return false;
        }
    }
}
