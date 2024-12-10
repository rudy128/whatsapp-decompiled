package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.Bau  reason: case insensitive filesystem */
public final class C23079Bau extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final long A01;
    public final List A02;

    public C23079Bau(List list, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A07(parcel, 3, this.A01);
        C26293Cx2.A0C(parcel, this.A02, 4, false);
        C26293Cx2.A05(parcel, A002);
    }
}
