package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BKx  reason: case insensitive filesystem */
public class C22695BKx extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(8);
    public boolean A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
