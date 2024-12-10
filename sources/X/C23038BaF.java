package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaF  reason: case insensitive filesystem */
public class C23038BaF extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final boolean A00;
    public final byte[] A01;

    public C23038BaF(byte[] bArr, boolean z) {
        this.A01 = bArr;
        this.A00 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A01, 1, false);
        C26293Cx2.A08(parcel, 2, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
