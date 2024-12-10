package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bci  reason: case insensitive filesystem */
public final class C23188Bci extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C23143Bbw A00;
    public String A01;
    public C23171BcR A02;
    public C23166BcM A03;
    public boolean A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23188Bci) {
                C23188Bci bci = (C23188Bci) obj;
                if (C25332Cdd.A01(this.A01, bci.A01) && C25332Cdd.A01(this.A00, bci.A00) && DJ0.A0M(Boolean.valueOf(this.A04), bci.A04)) {
                    if (!DJ0.A0H(bci.A05, Integer.valueOf(this.A05)) || !C25332Cdd.A01(this.A02, bci.A02) || !C25332Cdd.A01(this.A03, bci.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        AnonymousClass8BU.A1Q(objArr, this.A04);
        C17890vO.A1G(objArr, this.A05);
        objArr[4] = this.A02;
        return AnonymousClass000.A0P(this.A03, objArr, 5);
    }

    public C23188Bci(C23143Bbw bbw, C23171BcR bcR, C23166BcM bcM, String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = bbw;
        this.A04 = z;
        this.A05 = i;
        this.A02 = bcR;
        this.A03 = bcM;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A01);
        C26293Cx2.A09(parcel, this.A00, 2, i, A0K);
        C26293Cx2.A08(parcel, 3, this.A04);
        C26293Cx2.A06(parcel, 4, this.A05);
        C26293Cx2.A09(parcel, this.A02, 5, i, A0K);
        C26293Cx2.A09(parcel, this.A03, 6, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23188Bci() {
        this.A05 = 0;
    }
}
