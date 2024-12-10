package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bap  reason: case insensitive filesystem */
public final class C23074Bap extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23203Bcx A01;
    public final C23136Bbp A02;

    public C23074Bap(C23203Bcx bcx, C23136Bbp bbp, int i) {
        this.A00 = i;
        this.A01 = bcx;
        this.A02 = bbp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A09(parcel, this.A02, 3, i, DJ0.A0J(parcel, this.A01, i));
        C26293Cx2.A05(parcel, A002);
    }
}
