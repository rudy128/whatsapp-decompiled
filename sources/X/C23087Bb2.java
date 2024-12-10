package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb2  reason: case insensitive filesystem */
public class C23087Bb2 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public C23087Bb2(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A08(parcel, 2, this.A03);
        C26293Cx2.A08(parcel, 3, this.A04);
        C26293Cx2.A06(parcel, 4, this.A01);
        C26293Cx2.A06(parcel, 5, this.A02);
        C26293Cx2.A05(parcel, A002);
    }
}
