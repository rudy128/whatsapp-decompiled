package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bbd  reason: case insensitive filesystem */
public final class C23124Bbd extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23124Bbd)) {
            return false;
        }
        return DJ0.A0H(((C23124Bbd) obj).A00, Integer.valueOf(this.A00));
    }

    public final int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
