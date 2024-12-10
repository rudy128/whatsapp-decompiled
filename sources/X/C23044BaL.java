package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaL  reason: case insensitive filesystem */
public final class C23044BaL extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23081Baw A01;

    public C23044BaL(C23081Baw baw, int i) {
        this.A00 = i;
        this.A01 = baw;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A09(parcel, this.A01, 2, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
