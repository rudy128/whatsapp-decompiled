package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abp  reason: case insensitive filesystem */
public final class C20935Abp implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20935Abp) {
                C20935Abp abp = (C20935Abp) obj;
                if (!C18070vi.A18(this.A01, abp.A01) || !C18070vi.A18(this.A02, abp.A02) || !C18070vi.A18(this.A00, abp.A00) || !C18070vi.A18(this.A03, abp.A03) || !C18070vi.A18(this.A04, abp.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B02(this));
    }

    public int hashCode() {
        return C108945cZ.A09(this.A04, C17890vO.A02(this.A03, C17890vO.A02(this.A00, C17890vO.A02(this.A02, C17880vN.A03(this.A01)))));
    }

    public C20935Abp(String str, String str2, String str3, String str4, String str5) {
        C18070vi.A0w(str, str2, str3, str4, str5);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DynamicVpaMerchantDetails(merchantVpa=");
        A10.append(this.A01);
        A10.append(", payeeName=");
        A10.append(this.A02);
        A10.append(", mcc=");
        A10.append(this.A00);
        A10.append(", purposeCode=");
        A10.append(this.A03);
        A10.append(", referenceId=");
        return C17900vP.A0B(this.A04, A10);
    }
}
