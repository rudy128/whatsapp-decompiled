package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rA  reason: invalid class name and case insensitive filesystem */
public class C62292rA {
    public final long A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;
    public final byte[] A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62292rA)) {
            return false;
        }
        C62292rA r7 = (C62292rA) obj;
        return Arrays.equals(this.A04, r7.A04) && Arrays.equals(this.A03, r7.A03) && C42171xk.A00(this.A02, r7.A02) && C42171xk.A00(this.A01, r7.A01) && this.A00 == r7.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        C17890vO.A1P(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public static C62292rA A00(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(str);
            byte[] decode = Base64.decode(A16.getString("wrappedCompanionEphemeralPubBase64"), 2);
            byte[] decode2 = Base64.decode(A16.getString("companionServerAuthKeyPubBase64"), 2);
            String string = A16.getString("linkCodePairingRef");
            if (A16.opt("companionPlatformId") != null) {
                str2 = A16.getString("companionPlatformId");
            } else {
                str2 = null;
            }
            return new C62292rA(string, str2, decode, decode2, A16.getLong("expirationTsMs"));
        } catch (IllegalArgumentException | JSONException e) {
            Log.e("CompanionHelloInfoManager/fromJsonString error", e);
            return null;
        }
    }

    public C62292rA(String str, String str2, byte[] bArr, byte[] bArr2, long j) {
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
