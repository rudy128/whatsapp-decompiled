package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76n  reason: invalid class name and case insensitive filesystem */
public final class C1416776n implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public boolean A00;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1416776n) && this.A00 == ((C1416776n) obj).A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyDisclosureNavBar(dimissButton=");
        return C17900vP.A0F(A10, this.A00);
    }
}
