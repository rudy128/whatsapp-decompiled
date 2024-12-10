package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class B38 extends AnonymousClass11G implements C22821Di {
    public static final B38 A00 = new B38();

    public B38() {
        super(1);
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.9gX, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C18070vi.A0d(jSONObject, 0);
        try {
            String optString = jSONObject.optString("direct_path");
            long optLong = jSONObject.optLong("height");
            long optLong2 = jSONObject.optLong("width");
            long optLong3 = jSONObject.optLong("file_length");
            if (optString == null || optString.length() == 0 || optLong <= 0 || optLong2 <= 0 || optLong3 <= 0) {
                Log.e("processedVideo/invalid processed video json object");
                return null;
            }
            long optLong4 = jSONObject.optLong("bitrate");
            Integer A002 = C181059Oz.A00(Integer.valueOf(jSONObject.optInt("quality", 0)));
            JSONArray optJSONArray = jSONObject.optJSONArray("capabilities");
            ArrayList A13 = AnonymousClass000.A13();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i = AnonymousClass8BW.A04(A13, optJSONArray, i)) {
                }
            }
            C18070vi.A0l(A002, A13);
            ? obj2 = new Object();
            obj2.A05 = optString;
            obj2.A02 = optLong;
            obj2.A03 = optLong2;
            obj2.A01 = optLong3;
            obj2.A00 = optLong4;
            obj2.A04 = A002;
            obj2.A06 = A13;
            return obj2;
        } catch (JSONException e) {
            Log.e("failed to parse json to processed video", e);
            return null;
        }
    }
}
