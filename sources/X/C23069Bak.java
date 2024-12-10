package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bak  reason: case insensitive filesystem */
public final class C23069Bak extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;

    public C23069Bak(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A06(parcel, 3, this.A01);
        C26293Cx2.A05(parcel, A002);
    }
}
