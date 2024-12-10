package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bce  reason: case insensitive filesystem */
public final class C23184Bce extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public C23161BcH A01;
    public C23166BcM A02;
    public String A03;
    public final int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23184Bce) {
                C23184Bce bce = (C23184Bce) obj;
                if (C25332Cdd.A01(this.A03, bce.A03)) {
                    if (DJ0.A0H(bce.A00, Integer.valueOf(this.A00)) && C25332Cdd.A01(this.A01, bce.A01)) {
                        if (!DJ0.A0H(bce.A04, Integer.valueOf(this.A04)) || !C25332Cdd.A01(this.A02, bce.A02)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A03;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A01;
        C17890vO.A1G(objArr, this.A04);
        return AnonymousClass000.A0P(this.A02, objArr, 4);
    }

    public C23184Bce(C23161BcH bcH, C23166BcM bcM, String str, int i, int i2) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = bcH;
        this.A04 = i2;
        this.A02 = bcM;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A03);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A09(parcel, this.A01, 3, i, A0K);
        C26293Cx2.A06(parcel, 4, this.A04);
        C26293Cx2.A09(parcel, this.A02, 5, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23184Bce() {
        this.A04 = 0;
    }
}
