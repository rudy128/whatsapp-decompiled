package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

public final class Bc7 extends DJ0 {
    public static final Bc7 A02 = new Bc7(1, 3);
    public static final Bc7 A03 = new Bc7(1, 1);
    public static final Bc7 A04 = new Bc7(1, 2);
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bc7) {
                Bc7 bc7 = (Bc7) obj;
                if (!(this.A00 == bc7.A00 && this.A01 == bc7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass8BR.A1a();
        if (A02.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (A04.equals(this)) {
            str = "P2P_STAR";
        } else if (A03.equals(this)) {
            str = "P2P_POINT_TO_POINT";
        } else {
            str = "UNKNOWN";
        }
        A1a[0] = str;
        AnonymousClass000.A1M(A1a, this.A00);
        AnonymousClass3Ma.A1S(A1a, this.A01);
        return String.format(locale, "Strategy(%s){connectionType=%d, topology=%d}", A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 3, i2);
        C26293Cx2.A06(parcel, 4, this.A01);
        C26293Cx2.A05(parcel, A002);
    }

    public Bc7(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        AnonymousClass000.A1M(A1b, this.A01);
        return Arrays.hashCode(A1b);
    }
}
