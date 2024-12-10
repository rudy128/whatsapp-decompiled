package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76p  reason: invalid class name and case insensitive filesystem */
public final class C1416976p implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public C1416976p(String str) {
        this.A00 = str;
    }
}
