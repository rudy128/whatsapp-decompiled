package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2tN  reason: invalid class name and case insensitive filesystem */
public class C63592tN {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    public C63592tN(int i) {
        this(i, 0, 1, 0, 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63592tN)) {
            return false;
        }
        C63592tN r7 = (C63592tN) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        C17890vO.A1N(objArr, this.A04);
        C17890vO.A1G(objArr, this.A03);
        return AnonymousClass000.A0P(Integer.valueOf(this.A02), objArr, 4);
    }

    public static C63592tN A00(JSONObject jSONObject) {
        int i;
        try {
            i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        } catch (JSONException unused) {
            i = 0;
        }
        try {
            return new C63592tN(jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.getInt("stage"), jSONObject.getInt("version"), jSONObject.getLong("t"), i);
        } catch (JSONException e) {
            Log.e("UserNoticeMetadata/fromJSON exception: ", e);
            return null;
        }
    }

    public static JSONObject A01(C63592tN r4) {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.A01);
            A15.put("stage", r4.A00);
            A15.put("t", r4.A04);
            A15.put("version", r4.A03);
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A02);
            return A15;
        } catch (JSONException e) {
            Log.e("UserNoticeMetadata/toJSON exception: ", e);
            return null;
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeMetadata{noticeId=");
        A10.append(this.A01);
        A10.append(", stage=");
        A10.append(this.A00);
        A10.append(", timestamp=");
        A10.append(this.A04);
        A10.append(", version=");
        A10.append(this.A03);
        A10.append(", type=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }

    public C63592tN(int i, int i2, int i3, long j, int i4) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = j;
        this.A03 = i3;
        if (i4 < 0 || i4 > 2) {
            this.A02 = -1;
        } else {
            this.A02 = i4;
        }
    }
}
