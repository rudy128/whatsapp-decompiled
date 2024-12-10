package X;

import com.whatsapp.util.Log;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class A6M {
    public static final A6M A00 = new Object();

    public static final String A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C17880vN.A16(str).getJSONObject("error").getJSONArray("details").getJSONObject(0).optString("reason");
        } catch (JSONException e) {
            C17900vP.A0h("gdrive-utils/parseResponseReason/unexpected response ", str, AnonymousClass000.A10(), e);
            return null;
        }
    }

    public static final String A01(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C17880vN.A16(str).getJSONObject("error").getString("status");
        } catch (JSONException e) {
            C17900vP.A0h("gdrive-utils/parseResponseStatus/unexpected response ", str, AnonymousClass000.A10(), e);
            return null;
        }
    }

    public final void A02(C172708tt r5, String str, boolean z) {
        try {
            String A0y = AnonymousClass3MW.A0y(r5.A03);
            if (A0y != null) {
                JSONObject jSONObject = C17880vN.A16(A0y).getJSONObject("error").getJSONArray("details").getJSONObject(0);
                C18070vi.A0b(jSONObject);
                if ("ACCOUNT_OUT_OF_STORAGE_QUOTA".equals(C20064A5n.A01("reason", (String) null, jSONObject))) {
                    throw new C167608gf();
                }
            }
        } catch (JSONException e) {
            C17900vP.A0X(e, "gdrive-utils/handleResourceExhaustedError/parsing error response failed: ", AnonymousClass000.A10());
        }
        A03(r5, str, z);
        throw null;
    }

    public final void A03(C172708tt r5, String str, boolean z) {
        String str2;
        int i = -1;
        if (!z) {
            List A0t = AnonymousClass8BS.A0t("Retry-After", r5.A01.getHeaderFields());
            if (A0t == null || A0t.isEmpty()) {
                str2 = "gdrive-utils//getRetryAfter/no retry after header";
            } else {
                if (A0t.size() != 1) {
                    C17900vP.A0X(A0t, "gdrive-utils//getRetryAfter/too many retry after headers: ", AnonymousClass000.A10());
                }
                String str3 = (String) C108955ca.A0p(A0t);
                i = C20099A7c.A01(str3, -1);
                if (i < 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("gdrive-utils//getRetryAfter/invalid retry after (");
                    str2 = C17900vP.A0B(str3, A10);
                }
            }
            Log.e(str2);
        }
        String A0y = AnonymousClass3MW.A0y(r5.A03);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("gdrive-utils/");
        A102.append(str);
        A102.append("/too-many-requests (");
        A102.append(A0y);
        C17900vP.A0k(") retry-after=", A102, i);
        throw new C167718gq(A0y, i);
    }

    public final void A04(String str, HttpsURLConnection httpsURLConnection, boolean z) {
        A03(new C172708tt((C195939uB) null, (Integer) null, httpsURLConnection), str, z);
        throw null;
    }
}
