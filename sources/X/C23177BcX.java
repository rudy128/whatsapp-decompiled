package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcX  reason: case insensitive filesystem */
public final class C23177BcX extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final String A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A0A(parcel, this.A02, 2, false);
        C26293Cx2.A06(parcel, 3, this.A01);
        C26293Cx2.A05(parcel, A012);
    }

    public C23177BcX(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public C23177BcX(String str, int i) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = i;
    }
}
