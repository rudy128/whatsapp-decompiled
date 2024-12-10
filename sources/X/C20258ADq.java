package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADq  reason: case insensitive filesystem */
public final class C20258ADq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20258ADq) {
                C20258ADq aDq = (C20258ADq) obj;
                if (!C18070vi.A18(this.A00, aDq.A00) || !C18070vi.A18(this.A01, aDq.A01) || !C18070vi.A18(this.A02, aDq.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return (((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public C20258ADq(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessCustomerCareDetails(email=");
        A10.append(this.A00);
        A10.append(", landlineNumber=");
        A10.append(this.A01);
        A10.append(", mobileNumber=");
        return C17900vP.A0B(this.A02, A10);
    }
}
