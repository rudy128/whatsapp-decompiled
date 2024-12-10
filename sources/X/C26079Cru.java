package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Cru  reason: case insensitive filesystem */
public final class C26079Cru {
    public static final ClassLoader A00 = C26079Cru.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw BEB.A0K(dataAvail);
        }
    }
}
