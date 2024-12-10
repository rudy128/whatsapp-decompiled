package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcZ  reason: case insensitive filesystem */
public final class C23179BcZ extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23196Bcq A01;
    public final String A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A09(parcel, this.A01, 3, i, DJ0.A0L(parcel, this.A02));
        C26293Cx2.A05(parcel, A012);
    }

    public C23179BcZ(C23196Bcq bcq, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = bcq;
    }

    public C23179BcZ(C23196Bcq bcq, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = bcq;
    }
}
