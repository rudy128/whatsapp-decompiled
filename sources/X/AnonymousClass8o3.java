package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.8o3  reason: invalid class name */
public class AnonymousClass8o3 extends AnonymousClass8o6 {
    public boolean A00 = false;

    public boolean A04(String str) {
        try {
            super.A04(str);
            this.A00 = C17880vN.A16(str).optBoolean("contains_url", false);
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchTextEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public AnonymousClass8o3() {
        super(-1, "unknown", "text");
    }
}
