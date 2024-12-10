package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaN  reason: case insensitive filesystem */
public class C23046BaN extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public double A00;
    public double A01;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        double d = this.A00;
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        double d2 = this.A01;
        parcel.writeInt(524291);
        parcel.writeDouble(d2);
        C26293Cx2.A05(parcel, A002);
    }
}
