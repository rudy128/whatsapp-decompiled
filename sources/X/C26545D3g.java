package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3g  reason: case insensitive filesystem */
public final class C26545D3g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26545D3g) {
                C26545D3g d3g = (C26545D3g) obj;
                if (!C18070vi.A18(this.A01, d3g.A01) || !C18070vi.A18(this.A00, d3g.A00) || !C18070vi.A18(this.A02, d3g.A02)) {
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
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, C17890vO.A02(this.A00, C17880vN.A03(this.A01)));
    }

    public C26545D3g(String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CategoryInfo(name=");
        A10.append(this.A01);
        A10.append(", iconUrl=");
        A10.append(this.A00);
        A10.append(", rootCategoryId=");
        return C17900vP.A0B(this.A02, A10);
    }
}
