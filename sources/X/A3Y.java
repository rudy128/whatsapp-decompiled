package X;

import android.os.Parcel;

public abstract class A3Y {
    public static boolean A02(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return A00(parcel).booleanValue();
    }

    public static Boolean A00(Parcel parcel) {
        return Boolean.valueOf(AnonymousClass000.A1O(parcel.readByte()));
    }

    public static boolean A01(Parcel parcel) {
        return A00(parcel).booleanValue();
    }
}
