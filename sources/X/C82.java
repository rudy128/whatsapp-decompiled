package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class C82 {
    public static byte[] A00(byte[] bArr) {
        if (Util.A00 >= 27) {
            return bArr;
        }
        try {
            Charset charset = CIB.A05;
            JSONObject A16 = C17880vN.A16(BE6.A0q(charset, bArr));
            StringBuilder A0u = BE6.A0u("{\"keys\":[");
            JSONArray jSONArray = A16.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    BE6.A1K(A0u);
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                A0u.append("{\"k\":\"");
                A0u.append(jSONObject.getString("k").replace('-', '+').replace('_', '/'));
                A0u.append("\",\"kid\":\"");
                A0u.append(jSONObject.getString("kid").replace('-', '+').replace('_', '/'));
                A0u.append("\",\"kty\":\"");
                A0u.append(jSONObject.getString("kty"));
                A0u.append("\"}");
            }
            return AnonymousClass000.A0y("]}", A0u).getBytes(charset);
        } catch (JSONException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to adjust response data: ");
            Log.e("ClearKeyUtil", AnonymousClass000.A0y(BE6.A0q(CIB.A05, bArr), A10), e);
            return bArr;
        }
    }
}
