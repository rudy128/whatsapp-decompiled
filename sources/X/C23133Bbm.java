package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bbm  reason: case insensitive filesystem */
public final class C23133Bbm extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final DSS A01;
    public final DSS A02;
    public final DSS A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C23133Bbm) {
            C23133Bbm bbm = (C23133Bbm) obj;
            if (this.A00 != bbm.A00 || !C25332Cdd.A01(this.A01, bbm.A01) || !C25332Cdd.A01(this.A02, bbm.A02) || !C25332Cdd.A01(this.A03, bbm.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A07(parcel, 1, j);
        C26293Cx2.A0D(parcel, this.A01.A04(), 2, false);
        C26293Cx2.A0D(parcel, this.A02.A04(), 3, false);
        C26293Cx2.A0D(parcel, this.A03.A04(), 4, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23133Bbm(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        C23362Bfo A09 = DJ0.A09(bArr);
        C23362Bfo A092 = DJ0.A09(bArr2);
        C23362Bfo A093 = DJ0.A09(bArr3);
        this.A00 = j;
        C18210vx.A00(A09);
        this.A01 = A09;
        C18210vx.A00(A092);
        this.A02 = A092;
        C18210vx.A00(A093);
        this.A03 = A093;
    }

    public final int hashCode() {
        Object[] A1a = BE6.A1a();
        C17890vO.A1L(A1a, this.A00);
        A1a[1] = this.A01;
        A1a[2] = this.A02;
        return AnonymousClass000.A0P(this.A03, A1a, 3);
    }
}
