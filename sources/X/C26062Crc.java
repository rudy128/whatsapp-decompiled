package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Crc  reason: case insensitive filesystem */
public final class C26062Crc {
    static {
        C26062Crc.class.getClassLoader();
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        return BEA.A0M(parcel, creator);
    }

    public static void A01(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw BEB.A0K(dataAvail);
        }
    }
}
