package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bai  reason: case insensitive filesystem */
public final class C23067Bai extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;

    public C23067Bai(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A0A(parcel, this.A01, 3, false);
        C26293Cx2.A05(parcel, A002);
    }
}
