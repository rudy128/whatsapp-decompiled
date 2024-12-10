package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2ut  reason: invalid class name and case insensitive filesystem */
public class C64512ut implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(11);
    public int A00;
    public C22638BGy A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }
}
