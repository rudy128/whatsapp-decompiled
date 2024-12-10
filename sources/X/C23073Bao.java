package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bao  reason: case insensitive filesystem */
public class C23073Bao extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public C23073Bao(String str, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0D(parcel, this.A02, 3, DJ0.A0L(parcel, this.A01));
        C26293Cx2.A06(parcel, 4, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
