package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bb5  reason: case insensitive filesystem */
public class C23090Bb5 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23087Bb2 A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public C23090Bb5(C23087Bb2 bb2, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = bb2;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A01, 1, i, false);
        C26293Cx2.A08(parcel, 2, this.A02);
        C26293Cx2.A08(parcel, 3, this.A03);
        C26293Cx2.A0E(parcel, this.A04, 4);
        C26293Cx2.A06(parcel, 5, this.A00);
        C26293Cx2.A0E(parcel, this.A05, 6);
        C26293Cx2.A05(parcel, A002);
    }
}
