package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8o5  reason: invalid class name */
public class AnonymousClass8o5 extends AnonymousClass8o6 {
    public String A00;
    public String A01;
    public String A02 = "unknown";
    public String A03;
    public String A04;
    public List A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public AnonymousClass8o5() {
        super(-1, "unknown", "interactive");
    }

    public static boolean A00(String str) {
        if (str == null) {
            return false;
        }
        return AnonymousClass8BU.A0z(str, "https?://\\S+").find();
    }

    public boolean A04(String str) {
        try {
            super.A04(str);
            JSONObject A16 = C17880vN.A16(str);
            this.A02 = A16.optString("interactive_type", "unknown");
            boolean optBoolean = A16.optBoolean("has_header");
            this.A0B = optBoolean;
            if (optBoolean) {
                this.A01 = A16.optString("header_type", "unknown");
                this.A0C = A16.optBoolean("header_contains_url");
            }
            this.A09 = A16.optBoolean("has_body");
            this.A07 = A16.optBoolean("body_contains_url");
            this.A0A = A16.optBoolean("has_footer");
            this.A08 = A16.optBoolean("footer_contains_url");
            JSONArray optJSONArray = A16.optJSONArray("button_id_hashes");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.A05 = AnonymousClass000.A13();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.A05.add(optJSONArray.get(i).toString());
                }
            }
            JSONArray optJSONArray2 = A16.optJSONArray("row_id_hashes");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                this.A06 = AnonymousClass000.A13();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONArray jSONArray = (JSONArray) optJSONArray2.get(i2);
                    ArrayList A13 = AnonymousClass000.A13();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        C108955ca.A1U(jSONArray.get(i3), A13);
                    }
                    this.A06.add(A13);
                }
            }
            if (A16.has("list_reply_id_hash")) {
                this.A03 = A16.optString("list_reply_id_hash");
            }
            if (A16.has("button_reply_id_hash")) {
                this.A00 = A16.optString("button_reply_id_hash");
            }
            if (!A16.has("order_status")) {
                return true;
            }
            this.A04 = A16.getString("order_status");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchInteractiveEvent: fromJsonString threw: ", e);
            return false;
        }
    }
}
