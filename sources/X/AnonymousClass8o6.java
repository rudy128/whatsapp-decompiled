package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8o6  reason: invalid class name */
public abstract class AnonymousClass8o6 extends C189069iS {
    public int A00;
    public String A01;
    public String A02;

    public boolean A04(String str) {
        try {
            JSONObject A16 = C17880vN.A16(str);
            this.A00 = A16.optInt("seq_id", -1);
            this.A01 = A16.optString("event_type", "unknown");
            this.A02 = A16.optString("message_type", "unknown");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public AnonymousClass8o6(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArr = new byte[32];
            System.arraycopy(C108945cZ.A1I().digest(str.getBytes(StandardCharsets.UTF_8)), 0, bArr, 0, 32);
            return C17970vW.A06(bArr).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            Log.e("ConversationSketchEvent/generateIDHash unable to create id because sha256 instance could not created.", e);
            return null;
        }
    }
}
