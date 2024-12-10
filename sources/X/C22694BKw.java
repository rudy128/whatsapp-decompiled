package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BKw  reason: case insensitive filesystem */
public class C22694BKw extends C27741Xj {
    public static final Parcelable.Creator CREATOR = new C26406Cz7(3);
    public Parcelable A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
    }
}
