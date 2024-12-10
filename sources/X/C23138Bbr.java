package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bbr  reason: case insensitive filesystem */
public final class C23138Bbr extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public C23401BgS A01;
    public EBv A02;
    public C28641EBx A03;
    public C23194Bco A04;
    public String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23138Bbr) {
                C23138Bbr bbr = (C23138Bbr) obj;
                if (!C25332Cdd.A01(this.A03, bbr.A03) || !C25332Cdd.A01(this.A01, bbr.A01) || !C25332Cdd.A01(this.A05, bbr.A05) || !C25332Cdd.A00(Long.valueOf(this.A00), bbr.A00) || !C25332Cdd.A01(this.A04, bbr.A04) || !C25332Cdd.A01(this.A02, bbr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = this.A05;
        C17890vO.A1O(objArr, this.A00);
        objArr[4] = this.A04;
        return AnonymousClass000.A0P(this.A02, objArr, 5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = C26293Cx2.A00(parcel);
        C28641EBx eBx = this.A03;
        IBinder iBinder = null;
        if (eBx == null) {
            asBinder = null;
        } else {
            asBinder = eBx.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 1);
        C23401BgS bgS = this.A01;
        if (bgS == null) {
            asBinder2 = null;
        } else {
            asBinder2 = bgS.asBinder();
        }
        C26293Cx2.A04(asBinder2, parcel, 2);
        C26293Cx2.A0A(parcel, this.A05, 3, false);
        C26293Cx2.A07(parcel, 4, this.A00);
        C26293Cx2.A09(parcel, this.A04, 5, i, false);
        EBv eBv = this.A02;
        if (eBv != null) {
            iBinder = eBv.asBinder();
        }
        C26293Cx2.A04(iBinder, parcel, 6);
        C26293Cx2.A05(parcel, A002);
    }
}
