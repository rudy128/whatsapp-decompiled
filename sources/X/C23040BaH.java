package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BaH  reason: case insensitive filesystem */
public final class C23040BaH extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;

    public C23040BaH(String str, int i) {
        C18210vx.A00(str);
        this.A01 = str;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, 1);
        C26293Cx2.A0A(parcel, this.A01, 2, false);
        C26293Cx2.A06(parcel, 3, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
