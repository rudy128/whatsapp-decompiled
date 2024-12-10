package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BKz  reason: case insensitive filesystem */
public class C22697BKz extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(11);
    public Bundle A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }
}
