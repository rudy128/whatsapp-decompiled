package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ADz  reason: case insensitive filesystem */
public final class C20267ADz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final String A01;
    public final String A02;

    public C20267ADz(String str, String str2, String str3) {
        C18070vi.A0d(str2, 2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20267ADz) {
                C20267ADz aDz = (C20267ADz) obj;
                if (!C18070vi.A18(this.A02, aDz.A02) || !C18070vi.A18(this.A01, aDz.A01) || !C18070vi.A18(this.A00, aDz.A00)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17900vP.A00(this.A02) * 31) + C108955ca.A06(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExternalPaymentConfiguration(uri=");
        A10.append(this.A02);
        A10.append(", type=");
        A10.append(this.A01);
        A10.append(", paymentInstruction=");
        return C17900vP.A0B(this.A00, A10);
    }
}
