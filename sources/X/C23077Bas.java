package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bas  reason: case insensitive filesystem */
public final class C23077Bas extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final String A01;
    public final String A02;

    public C23077Bas(long j, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0A(parcel, this.A02, 3, DJ0.A0L(parcel, this.A01));
        C26293Cx2.A07(parcel, 4, this.A00);
        C26293Cx2.A05(parcel, A002);
    }
}
