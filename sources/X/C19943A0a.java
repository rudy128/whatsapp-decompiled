package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.A0a  reason: case insensitive filesystem */
public class C19943A0a {
    public final AnonymousClass00H A00;

    public static String A00(Integer num) {
        if (num == null) {
            return null;
        }
        try {
            return AnonymousClass8BS.A0k(num, "FDS_INSTANCE_KEY", C17880vN.A15());
        } catch (JSONException e) {
            Log.e("PAY: createQplPramsStringFromInstanceKey threw exception ", e);
            return null;
        }
    }

    public void A01(String str) {
        if (str != null) {
            try {
                String string = C17880vN.A16(str).getString("FDS_INSTANCE_KEY");
                if (string != null) {
                    A02(string, "OPEN_SCREEN", (Map) null);
                }
            } catch (JSONException unused) {
                Log.e("qpl params parsing failure");
            }
        }
    }

    public void A02(String str, String str2, Map map) {
        if (map == null) {
            map = C17880vN.A11();
        }
        ((A2V) this.A00.get()).A00().A02(new C21108Aec(str, str2, map));
    }

    public C19943A0a(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
