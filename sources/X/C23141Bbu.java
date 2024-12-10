package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bbu  reason: case insensitive filesystem */
public final class C23141Bbu extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public C28637EBr A01;
    public C28639EBt A02;
    public C28642EBy A03;
    public C23195Bcp A04;
    public String A05;
    public String A06;
    public byte[] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23141Bbu) {
                C23141Bbu bbu = (C23141Bbu) obj;
                if (!C25332Cdd.A01(this.A03, bbu.A03) || !C25332Cdd.A01(this.A01, bbu.A01) || !C25332Cdd.A01(this.A05, bbu.A05) || !C25332Cdd.A01(this.A06, bbu.A06) || !C25332Cdd.A00(Long.valueOf(this.A00), bbu.A00) || !C25332Cdd.A01(this.A04, bbu.A04) || !C25332Cdd.A01(this.A02, bbu.A02) || !Arrays.equals(this.A07, bbu.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = this.A05;
        objArr[3] = this.A06;
        C17890vO.A1P(objArr, this.A00);
        objArr[5] = this.A04;
        objArr[6] = this.A02;
        C17890vO.A1I(objArr, Arrays.hashCode(this.A07));
        return Arrays.hashCode(objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = C26293Cx2.A00(parcel);
        C28642EBy eBy = this.A03;
        IBinder iBinder = null;
        if (eBy == null) {
            asBinder = null;
        } else {
            asBinder = eBy.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 1);
        C28637EBr eBr = this.A01;
        if (eBr == null) {
            asBinder2 = null;
        } else {
            asBinder2 = eBr.asBinder();
        }
        C26293Cx2.A04(asBinder2, parcel, 2);
        C26293Cx2.A0A(parcel, this.A05, 3, false);
        C26293Cx2.A0A(parcel, this.A06, 4, false);
        C26293Cx2.A07(parcel, 5, this.A00);
        C26293Cx2.A09(parcel, this.A04, 6, i, false);
        C28639EBt eBt = this.A02;
        if (eBt != null) {
            iBinder = eBt.asBinder();
        }
        C26293Cx2.A04(iBinder, parcel, 7);
        C26293Cx2.A0D(parcel, this.A07, 8, false);
        C26293Cx2.A05(parcel, A002);
    }
}
