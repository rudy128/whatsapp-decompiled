package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaI  reason: case insensitive filesystem */
public final class C23041BaI extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final byte[] A01;

    public C23041BaI(String str, byte[] bArr) {
        C18210vx.A00(str);
        this.A00 = str;
        C18210vx.A00(bArr);
        this.A01 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, 1);
        C26293Cx2.A0D(parcel, this.A01, 3, DJ0.A0L(parcel, this.A00));
        C26293Cx2.A05(parcel, A002);
    }
}
