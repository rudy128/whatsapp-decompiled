package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEA implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AEA(String str, String str2, String str3, String str4) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AEA)) {
            return false;
        }
        AEA aea = (AEA) obj;
        if (!C42171xk.A00(this.A00, aea.A00) || !C42171xk.A00(this.A02, aea.A02) || !C42171xk.A00(this.A01, aea.A01) || !C42171xk.A00(this.A03, aea.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A032 = (((C17880vN.A03(this.A00) + AnonymousClass8BW.A02(this.A02)) * 31) + AnonymousClass8BW.A02(this.A01)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A032 + i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CoverPhoto:{'id'='");
        A10.append(this.A00);
        A10.append("', 'ts'='");
        A10.append(this.A02);
        A10.append("', 'token'='");
        A10.append(this.A01);
        A10.append("', 'url'='");
        A10.append(this.A03);
        return AnonymousClass000.A0y("'}", A10);
    }
}
