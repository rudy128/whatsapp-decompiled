package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abo  reason: case insensitive filesystem */
public final class C20934Abo implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20934Abo) {
                C20934Abo abo = (C20934Abo) obj;
                if (!C18070vi.A18(this.A02, abo.A02) || !C18070vi.A18(this.A03, abo.A03) || !C18070vi.A18(this.A01, abo.A01) || !C18070vi.A18(this.A00, abo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B07(this));
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17890vO.A02(this.A03, C17880vN.A03(this.A02))) + C17900vP.A00(this.A00);
    }

    public C20934Abo(String str, String str2, String str3, String str4) {
        C18070vi.A0o(str, str2, str3);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentPixKey(pixKey=");
        A10.append(this.A02);
        A10.append(", pixKeyType=");
        A10.append(this.A03);
        A10.append(", merchantName=");
        A10.append(this.A01);
        A10.append(", code=");
        return C17900vP.A0B(this.A00, A10);
    }
}
