package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcr  reason: case insensitive filesystem */
public final class C23197Bcr extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public C23171BcR A01;
    public C23166BcM A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23197Bcr) {
                C23197Bcr bcr = (C23197Bcr) obj;
                if (C25332Cdd.A01(this.A00, bcr.A00)) {
                    if (!DJ0.A0H(bcr.A03, Integer.valueOf(this.A03)) || !C25332Cdd.A01(this.A01, bcr.A01) || !C25332Cdd.A01(this.A02, bcr.A02)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C23197Bcr(C23171BcR bcR, C23166BcM bcM, String str, int i) {
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

    public /* synthetic */ C23197Bcr(C24434C3k c3k) {
        this.A03 = 0;
    }

    public C23197Bcr() {
        this.A03 = 0;
    }
}
