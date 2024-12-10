package X;

import android.os.Parcel;

/* renamed from: X.CoK  reason: case insensitive filesystem */
public final class C25906CoK {
    public static final ClassLoader A00 = C25906CoK.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw BEB.A0K(dataAvail);
        }
    }
}
