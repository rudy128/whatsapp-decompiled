package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.77T  reason: invalid class name */
public final class AnonymousClass77T implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass77T) {
                AnonymousClass77T r8 = (AnonymousClass77T) obj;
                if (this.A06 != r8.A06 || this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A04, C17890vO.A02(this.A05, C17890vO.A02(this.A03, C17890vO.A02(this.A02, C17890vO.A02(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass3MX.A03(this.A06)))))));
    }

    public AnonymousClass77T(String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        this.A06 = z;
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A04 = str5;
    }

    public final JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("secure", this.A06);
        A15.put("expiry", this.A00);
        A15.put("domain", this.A01);
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A02);
        A15.put("path", this.A03);
        A15.put("value", this.A05);
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FBAccountCookie(secure=");
        A10.append(this.A06);
        A10.append(", expiry=");
        A10.append(this.A00);
        A10.append(", domain=");
        A10.append(this.A01);
        A10.append(", name=");
        A10.append(this.A02);
        A10.append(", path=");
        A10.append(this.A03);
        A10.append(", value=");
        A10.append(this.A05);
        A10.append(", url=");
        return C17900vP.A0B(this.A04, A10);
    }
}
