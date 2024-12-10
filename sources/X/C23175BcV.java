package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.BcV  reason: case insensitive filesystem */
public final class C23175BcV extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final C23212BdN A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A09(parcel, this.A01, 2, i, false);
        C26293Cx2.A05(parcel, A012);
    }

    public C23175BcV(C23212BdN bdN, int i) {
        this.A00 = i;
        this.A01 = bdN;
    }

    public C23175BcV(C23212BdN bdN) {
        this.A00 = 1;
        this.A01 = bdN;
    }
}
