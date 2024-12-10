package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.BcG  reason: case insensitive filesystem */
public final class C23160BcG extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C23160BcG) {
            C23160BcG bcG = (C23160BcG) obj;
            if (this.A00 == bcG.A00 && this.A01 == bcG.A01 && this.A02 == bcG.A02 && this.A03 == bcG.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A0u = BE6.A0u("NetworkLocationStatus:");
        A0u.append(" Wifi status: ");
        A0u.append(this.A00);
        A0u.append(" Cell status: ");
        A0u.append(this.A01);
        A0u.append(" elapsed time NS: ");
        A0u.append(this.A03);
        A0u.append(" system time ms: ");
        return C17880vN.A0u(A0u, this.A02);
    }

    public C23160BcG(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }

    public final int hashCode() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, this.A01);
        AnonymousClass000.A1M(A1a, this.A00);
        C17890vO.A1N(A1a, this.A03);
        C17890vO.A1O(A1a, this.A02);
        return Arrays.hashCode(A1a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A07(parcel, 3, this.A02);
        C26293Cx2.A07(parcel, 4, this.A03);
        C26293Cx2.A05(parcel, A002);
    }
}
