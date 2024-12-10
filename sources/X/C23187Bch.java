package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bch  reason: case insensitive filesystem */
public final class C23187Bch extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public C23171BcR A02;
    public C23166BcM A03;
    public byte[] A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23187Bch) {
                C23187Bch bch = (C23187Bch) obj;
                if (C25332Cdd.A01(this.A01, bch.A01)) {
                    if (DJ0.A0H(bch.A00, Integer.valueOf(this.A00)) && Arrays.equals(this.A04, bch.A04)) {
                        if (!DJ0.A0H(bch.A05, Integer.valueOf(this.A05)) || !C25332Cdd.A01(this.A02, bch.A02) || !C25332Cdd.A01(this.A03, bch.A03)) {
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
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass3Ma.A1S(objArr, Arrays.hashCode(this.A04));
        C17890vO.A1G(objArr, this.A05);
        objArr[4] = this.A02;
        return AnonymousClass000.A0P(this.A03, objArr, 5);
    }

    public C23187Bch(C23171BcR bcR, C23166BcM bcM, String str, byte[] bArr, int i, int i2) {
        this.A01 = str;
        this.A00 = i;
        this.A04 = bArr;
        this.A05 = i2;
        this.A02 = bcR;
        this.A03 = bcM;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0K = DJ0.A0K(parcel, this.A01);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A0D(parcel, this.A04, 3, A0K);
        C26293Cx2.A06(parcel, 4, this.A05);
        C26293Cx2.A09(parcel, this.A02, 5, i, A0K);
        C26293Cx2.A09(parcel, this.A03, 6, i, A0K);
        C26293Cx2.A05(parcel, A002);
    }

    public C23187Bch() {
        this.A05 = 0;
    }
}
