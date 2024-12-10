package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bav  reason: case insensitive filesystem */
public class C23080Bav extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    public C23080Bav(int i, long j, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = j;
        this.A03 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A08(parcel, 2, this.A02);
        C26293Cx2.A07(parcel, 3, this.A01);
        C26293Cx2.A08(parcel, 4, this.A03);
        C26293Cx2.A05(parcel, A002);
    }
}
