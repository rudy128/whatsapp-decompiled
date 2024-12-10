package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bat  reason: case insensitive filesystem */
public final class C23078Bat extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C23078Bat(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A0D(parcel, this.A02, 3, false);
        C26293Cx2.A05(parcel, A002);
    }
}
