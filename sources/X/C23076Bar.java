package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bar  reason: case insensitive filesystem */
public final class C23076Bar extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C23076Bar(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A08(parcel, 3, this.A01);
        C26293Cx2.A08(parcel, 4, this.A02);
        C26293Cx2.A05(parcel, A002);
    }
}
