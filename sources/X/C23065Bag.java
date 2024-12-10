package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bag  reason: case insensitive filesystem */
public final class C23065Bag extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23163BcJ A01;

    public C23065Bag(C23163BcJ bcJ, int i) {
        this.A00 = i;
        this.A01 = bcJ;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        DJ0.A0F(parcel, this.A01, i, A002);
    }
}
