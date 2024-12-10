package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AE7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE7) {
                AE7 ae7 = (AE7) obj;
                if (!C18070vi.A18(this.A03, ae7.A03) || !C18070vi.A18(this.A00, ae7.A00) || !C18070vi.A18(this.A01, ae7.A01) || !C18070vi.A18(this.A02, ae7.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return (((((C17900vP.A00(this.A03) * 31) + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public AE7(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessGrievanceOfficerDetails(name=");
        A10.append(this.A03);
        A10.append(", email=");
        A10.append(this.A00);
        A10.append(", landlineNumber=");
        A10.append(this.A01);
        A10.append(", mobileNumber=");
        return C17900vP.A0B(this.A02, A10);
    }
}
