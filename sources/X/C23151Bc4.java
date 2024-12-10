package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Bc4  reason: case insensitive filesystem */
public final class C23151Bc4 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23151Bc4) {
                C23151Bc4 bc4 = (C23151Bc4) obj;
                if (!(this.A00 == bc4.A00 && this.A01 == bc4.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1N(A1b, this.A00);
        BE8.A1O(A1b, this.A01);
        return String.format(locale, "UwbConnectivityCapability<S-STS: %s, P-STS: %s>", A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, z);
        C26293Cx2.A08(parcel, 2, this.A01);
        C26293Cx2.A05(parcel, A002);
    }

    public C23151Bc4(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1N(A1b, this.A00);
        BE8.A1O(A1b, this.A01);
        return Arrays.hashCode(A1b);
    }
}
