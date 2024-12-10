package X;

import android.os.Parcel;

/* renamed from: X.CoN  reason: case insensitive filesystem */
public final class C25909CoN {
    public static final ClassLoader A00 = C25909CoN.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw BEB.A0K(dataAvail);
        }
    }
}
