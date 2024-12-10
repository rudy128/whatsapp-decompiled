package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcW  reason: case insensitive filesystem */
public final class C23176BcW extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final int A01;

    public C23176BcW(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A01);
        DJ0.A0G(parcel, this.A00, A002);
    }

    public C23176BcW() {
        this.A01 = 1;
    }
}
