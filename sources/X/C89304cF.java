package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4cF  reason: invalid class name and case insensitive filesystem */
public final class C89304cF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C89304cF(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C89304cF) && C18070vi.A18(this.A00, ((C89304cF) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public String toString() {
        return "";
    }
}
