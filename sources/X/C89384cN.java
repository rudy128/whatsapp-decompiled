package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cN  reason: invalid class name and case insensitive filesystem */
public final class C89384cN implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89384cN) {
                C89384cN r5 = (C89384cN) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public int hashCode() {
        return C17890vO.A02(this.A02, C17880vN.A03(this.A00)) + this.A01.hashCode();
    }

    public C89384cN(String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeviceSimInfo{countryCode='");
        A10.append(this.A00);
        A10.append("', phoneNumber='");
        A10.append(this.A02);
        A10.append("', networkOperatorName='");
        A10.append(this.A01);
        return AnonymousClass000.A0y("'}", A10);
    }
}
