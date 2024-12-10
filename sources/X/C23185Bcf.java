package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcf  reason: case insensitive filesystem */
public final class C23185Bcf extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C23134Bbn A00;
    public String A01;
    public C23171BcR A02;
    public C23166BcM A03;
    public final int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23185Bcf) {
                C23185Bcf bcf = (C23185Bcf) obj;
                if (C25332Cdd.A01(this.A01, bcf.A01) && C25332Cdd.A01(this.A00, bcf.A00)) {
                    if (!DJ0.A0H(bcf.A04, Integer.valueOf(this.A04)) || !C25332Cdd.A01(this.A02, bcf.A02) || !C25332Cdd.A01(this.A03, bcf.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        AnonymousClass3Ma.A1S(objArr, this.A04);
        objArr[3] = this.A02;
        return AnonymousClass000.A0P(this.A03, objArr, 4);
    }

    public C23185Bcf(C23171BcR bcR, C23134Bbn bbn, C23166BcM bcM, String str, int i) {
        this.A01 = str;
        this.A00 = bbn;
        this.A04 = i;
        this.A02 = bcR;
        this.A03 = bcM;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A01);
        C26293Cx2.A09(parcel, this.A00, 2, i, A0K);
        C26293Cx2.A06(parcel, 3, this.A04);
        C26293Cx2.A09(parcel, this.A02, 4, i, A0K);
        C26293Cx2.A09(parcel, this.A03, 5, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23185Bcf() {
        this.A04 = 0;
    }
}
