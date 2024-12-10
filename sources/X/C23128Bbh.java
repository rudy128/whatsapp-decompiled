package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bbh  reason: case insensitive filesystem */
public final class C23128Bbh extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23128Bbh) {
                C23128Bbh bbh = (C23128Bbh) obj;
                if (!DJ0.A0H(bbh.A00, Integer.valueOf(this.A00)) || !C25332Cdd.A01(this.A01, bbh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        DJ0.A0G(parcel, this.A01, A002);
    }
}
