package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76q  reason: invalid class name and case insensitive filesystem */
public final class C1417076q implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }

    public C1417076q(long j, String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }
}
