package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cK  reason: invalid class name and case insensitive filesystem */
public final class C89354cK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public C89354cK(String str, String str2) {
        C18070vi.A0d(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89354cK) {
                C89354cK r5 = (C89354cK) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PhoneNumberSelectionInfo{phoneNumberLabel='");
        A10.append(this.A01);
        A10.append("', phoneNumber='");
        A10.append(this.A00);
        return AnonymousClass000.A0y("'}", A10);
    }
}
