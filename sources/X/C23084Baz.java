package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Baz  reason: case insensitive filesystem */
public final class C23084Baz extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final C23073Bao[] A03;

    public C23084Baz(C23073Bao[] baoArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A03 = baoArr;
        this.A02 = z;
        if (z) {
            this.A00 = i;
        } else {
            this.A00 = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A07(parcel, 2, this.A01);
        C26293Cx2.A0F(parcel, this.A03, 3, i);
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A08(parcel, 5, this.A02);
        C26293Cx2.A05(parcel, A002);
    }
}
