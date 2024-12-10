package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76m  reason: invalid class name and case insensitive filesystem */
public class C1416676m implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1416376j(0);
    public int A00;
    public String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
