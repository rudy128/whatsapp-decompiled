package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8pq  reason: invalid class name and case insensitive filesystem */
public final class C170428pq extends ADB {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public C170428pq(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }
}
