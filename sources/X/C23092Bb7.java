package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb7  reason: case insensitive filesystem */
public final class C23092Bb7 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C23092Bb7(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, this.A00);
        C26293Cx2.A08(parcel, 2, this.A01);
        C26293Cx2.A08(parcel, 3, this.A02);
        C26293Cx2.A08(parcel, 4, this.A03);
        C26293Cx2.A08(parcel, 5, this.A04);
        C26293Cx2.A08(parcel, 6, this.A05);
        C26293Cx2.A05(parcel, A002);
    }
}
