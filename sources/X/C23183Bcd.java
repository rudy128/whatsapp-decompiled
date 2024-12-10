package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcd  reason: case insensitive filesystem */
public final class C23183Bcd extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public C23171BcR A01;
    public C23166BcM A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23183Bcd) {
                C23183Bcd bcd = (C23183Bcd) obj;
                if (C25332Cdd.A01(this.A00, bcd.A00)) {
                    if (!DJ0.A0H(bcd.A03, Integer.valueOf(this.A03)) || !C25332Cdd.A01(this.A01, bcd.A01) || !C25332Cdd.A01(this.A02, bcd.A02)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C23183Bcd(C23171BcR bcR, C23166BcM bcM, String str, int i) {
        this.A00 = str;
        this.A03 = i;
        this.A01 = bcR;
        this.A02 = bcM;
    }

    public final int hashCode() {
        Object[] A1a = BE6.A1a();
        A1a[0] = this.A00;
        AnonymousClass000.A1M(A1a, this.A03);
        A1a[2] = this.A01;
        return AnonymousClass000.A0P(this.A02, A1a, 3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A00);
        C26293Cx2.A06(parcel, 2, this.A03);
        C26293Cx2.A09(parcel, this.A01, 3, i, A0K);
        C26293Cx2.A09(parcel, this.A02, 4, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23183Bcd() {
        this.A03 = 0;
    }
}
