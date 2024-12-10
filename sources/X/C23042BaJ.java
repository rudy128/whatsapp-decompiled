package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaJ  reason: case insensitive filesystem */
public final class C23042BaJ extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public boolean A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A08(parcel, 3, this.A01);
        C26293Cx2.A05(parcel, A002);
    }
}
