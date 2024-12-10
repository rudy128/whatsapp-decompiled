package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Ba3  reason: case insensitive filesystem */
public final class C23027Ba3 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    public final boolean equals(Object obj) {
        return BE8.A1S(obj instanceof C23027Ba3 ? 1 : 0);
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(false, AnonymousClass3MW.A1a(), 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A00 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, false);
        C26293Cx2.A05(parcel, A00);
    }
}
