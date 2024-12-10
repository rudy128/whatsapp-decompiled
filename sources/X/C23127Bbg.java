package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bbg  reason: case insensitive filesystem */
public final class C23127Bbg extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final DSS A00;
    public final DSS A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C23127Bbg) {
            C23127Bbg bbg = (C23127Bbg) obj;
            if (!C25332Cdd.A01(this.A00, bbg.A00) || !C25332Cdd.A01(this.A01, bbg.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass000.A0P(this.A01, C17890vO.A1a(this.A00), 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] A04;
        DSS dss = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        byte[] bArr = null;
        if (dss == null) {
            A04 = null;
        } else {
            A04 = dss.A04();
        }
        C26293Cx2.A0D(parcel, A04, 1, false);
        DSS dss2 = this.A01;
        if (dss2 != null) {
            bArr = dss2.A04();
        }
        C26293Cx2.A0D(parcel, bArr, 2, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23127Bbg(DSS dss, DSS dss2) {
        this.A00 = dss;
        this.A01 = dss2;
    }
}
