package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bax  reason: case insensitive filesystem */
public final class C23082Bax extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public Bundle A01;
    public C23090Bb5 A02;
    public C23191Bcl[] A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A03(this.A01, parcel, 1);
        C26293Cx2.A0F(parcel, this.A03, 2, i);
        C26293Cx2.A06(parcel, 3, this.A00);
        C26293Cx2.A09(parcel, this.A02, 4, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
