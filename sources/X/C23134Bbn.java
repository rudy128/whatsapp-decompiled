package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bbn  reason: case insensitive filesystem */
public final class C23134Bbn extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public long A01;
    public long A02;
    public long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23134Bbn) {
                C23134Bbn bbn = (C23134Bbn) obj;
                if (C25332Cdd.A00(Long.valueOf(this.A01), bbn.A01)) {
                    if (!DJ0.A0H(bbn.A00, Integer.valueOf(this.A00)) || !C25332Cdd.A00(Long.valueOf(this.A02), bbn.A02) || !C25332Cdd.A00(Long.valueOf(this.A03), bbn.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] A1a = BE6.A1a();
        C17890vO.A1L(A1a, this.A01);
        AnonymousClass000.A1M(A1a, this.A00);
        C17890vO.A1N(A1a, this.A02);
        C17890vO.A1O(A1a, this.A03);
        return Arrays.hashCode(A1a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A07(parcel, 1, this.A01);
        C26293Cx2.A06(parcel, 2, this.A00);
        C26293Cx2.A07(parcel, 3, this.A02);
        C26293Cx2.A07(parcel, 4, this.A03);
        C26293Cx2.A05(parcel, A002);
    }
}
