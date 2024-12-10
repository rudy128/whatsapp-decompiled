package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.6zs  reason: invalid class name and case insensitive filesystem */
public class C140056zs {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C140056zs r7 = (C140056zs) obj;
            if (this.A01 != r7.A01 || this.A00 != r7.A00 || !this.A05.equals(r7.A05) || !this.A07.equals(r7.A07) || !this.A04.equals(r7.A04) || !this.A02.equals(r7.A02) || !this.A03.equals(r7.A03) || !this.A06.equals(r7.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A05;
        objArr[1] = this.A07;
        objArr[2] = this.A04;
        objArr[3] = this.A02;
        objArr[4] = this.A03;
        objArr[5] = this.A06;
        objArr[6] = Long.valueOf(this.A01);
        C17890vO.A1I(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C140056zs(JSONObject jSONObject) {
        this.A05 = jSONObject.optString("source", (String) null);
        this.A07 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        this.A04 = jSONObject.optString("severity", (String) null);
        this.A02 = jSONObject.optString("notificationType", (String) null);
        this.A03 = jSONObject.optString("policyUrl", (String) null);
        this.A06 = jSONObject.optString("status", (String) null);
        this.A01 = jSONObject.optLong("bannerNotificationTimeStamp", 0);
        this.A00 = jSONObject.optInt("priority", -1);
    }

    public JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("source", this.A05);
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A07);
        A15.put("severity", this.A04);
        A15.put("notificationType", this.A02);
        A15.put("policyUrl", this.A03);
        A15.put("status", this.A06);
        A15.put("bannerNotificationTimeStamp", this.A01);
        A15.put("priority", this.A00);
        return A15;
    }

    public C140056zs(Long l, String str, String str2, String str3, String str4, String str5, int i) {
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A02 = "warning";
        this.A03 = str4;
        this.A06 = str5;
        this.A01 = l.longValue();
        this.A00 = i;
    }
}
