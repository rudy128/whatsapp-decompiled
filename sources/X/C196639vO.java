package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9vO  reason: invalid class name and case insensitive filesystem */
public class C196639vO {
    public static C191309mN A00(JSONArray jSONArray) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (jSONArray.length() < 2) {
            return null;
        }
        try {
            int i = jSONArray.getInt(0);
            String string = jSONArray.getString(1);
            if (i == 0 || i == 2) {
                str = jSONArray.getString(2);
            } else {
                str = null;
            }
            if (i == 2) {
                str3 = jSONArray.getString(3);
                str2 = jSONArray.getString(4);
            } else {
                str3 = null;
                str2 = null;
            }
            byte[] decode = Base64.decode(string, 3);
            if (str != null) {
                bArr = Base64.decode(str, 3);
            } else {
                bArr = null;
            }
            if (str3 != null) {
                bArr2 = Base64.decode(str3, 3);
            } else {
                bArr2 = null;
            }
            if (decode == null || decode.length <= 0) {
                Log.e("KeyData/failed to parse json/wrong data");
                return null;
            }
            C191309mN r6 = new C191309mN(str2, decode, bArr, bArr2, i);
            int i2 = r6.A00;
            if (i2 == 0) {
                byte[] bArr4 = r6.A03;
                if (bArr4 != null && bArr4.length > 0) {
                    return r6;
                }
            } else if (i2 != 2) {
                return r6;
            } else {
                byte[] bArr5 = r6.A03;
                if (bArr5 != null && bArr5.length > 0 && (bArr3 = r6.A04) != null && bArr3.length > 0 && !TextUtils.isEmpty(r6.A01)) {
                    return r6;
                }
            }
            Log.e("KeyData/failed to parse json/key data not valid");
            return null;
        } catch (IllegalArgumentException | JSONException e) {
            Log.e("KeyData/failed to parse json", e);
            return null;
        }
    }
}
