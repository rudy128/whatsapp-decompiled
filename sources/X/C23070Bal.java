package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bal  reason: case insensitive filesystem */
public class C23070Bal extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public Bundle A01;
    public final int A02;

    public C23070Bal(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A02);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A03(this.A01, parcel, 3);
        C26293Cx2.A05(parcel, A002);
    }
}
