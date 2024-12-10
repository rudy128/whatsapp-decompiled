package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.90a  reason: invalid class name and case insensitive filesystem */
public final class C1762390a extends AD9 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }
}
