package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Gw  reason: invalid class name */
public class AnonymousClass8Gw extends AnonymousClass8D1 {
    public static final Parcelable.Creator CREATOR = new AD6(5);
    public int A00;
    public int A01;
    public int A02;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
