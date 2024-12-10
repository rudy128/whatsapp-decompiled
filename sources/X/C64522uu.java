package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uu  reason: invalid class name and case insensitive filesystem */
public class C64522uu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D3B(5);
    public int A00;
    public int A01;
    public boolean A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
