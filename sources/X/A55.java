package X;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class A55 {
    public final long A00;
    public final long A01;
    public final AnonymousClass1NT A02;
    public final String A03;
    public final String A04;

    public static A55 A00(AnonymousClass1NT r12, String str) {
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                String optString = A16.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String optString2 = A16.optString("md5Hash");
                long optLong = A16.optLong("sizeBytes");
                String optString3 = A16.optString("updateTime");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                    return new A55(r12, optString, optString2, optLong, AnonymousClass8BX.A09(optString3));
                }
            } catch (TimeFormatException | JSONException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("gdrive/file-metadata/failed to parse metadata \"");
                A10.append(str);
                C108985cd.A1M("\"", A10, e);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            A55 a55 = (A55) obj;
            if (this.A00 != a55.A00 || this.A01 != a55.A01 || !this.A04.equals(a55.A04) || !this.A03.equals(a55.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        C17890vO.A1N(objArr, this.A00);
        C17890vO.A1O(objArr, this.A01);
        return Arrays.hashCode(objArr);
    }

    public static String A01(A55 a55) {
        Time time = new Time();
        time.set(a55.A01);
        return new JSONObject().put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, a55.A04).put("md5Hash", a55.A03).put("sizeBytes", a55.A00).put("updateTime", time.format3339(false)).toString();
    }

    public A55(AnonymousClass1NT r1, String str, String str2, long j, long j2) {
        this.A02 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FileMetadata{name='");
        A10.append(this.A04);
        A10.append('\'');
        A10.append(", md5Hash='");
        A10.append(this.A03);
        A10.append('\'');
        A10.append(", sizeBytes=");
        A10.append(this.A00);
        A10.append(", updateTime=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }
}
