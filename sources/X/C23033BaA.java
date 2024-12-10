package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaA  reason: case insensitive filesystem */
public final class C23033BaA extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;

    public C23033BaA(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
