package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Baj  reason: case insensitive filesystem */
public final class C23068Baj extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23106BbL A01;

    public C23068Baj(C23106BbL bbL, int i) {
        this.A00 = i;
        this.A01 = bbL;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        DJ0.A0F(parcel, this.A01, i, A002);
    }
}
