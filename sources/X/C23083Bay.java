package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Bay  reason: case insensitive filesystem */
public final class C23083Bay extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C23071Bam A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public C23083Bay(C23071Bam bam, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = bam;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0C(parcel, Collections.unmodifiableList(this.A01), 1, false);
        C26293Cx2.A08(parcel, 2, this.A02);
        C26293Cx2.A08(parcel, 3, this.A03);
        C26293Cx2.A09(parcel, this.A00, 5, i, false);
        C26293Cx2.A05(parcel, A002);
    }
}
