package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bct  reason: case insensitive filesystem */
public final class C23199Bct extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C28641EBx A00;
    public C23143Bbw A01;
    public String[] A02;
    public C23171BcR A03;
    public C23166BcM A04;
    public boolean A05;
    public final int A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23199Bct) {
                C23199Bct bct = (C23199Bct) obj;
                if (C25332Cdd.A01(this.A00, bct.A00) && Arrays.equals(this.A02, bct.A02) && C25332Cdd.A01(this.A01, bct.A01) && DJ0.A0M(Boolean.valueOf(this.A05), bct.A05)) {
                    if (!DJ0.A0H(bct.A06, Integer.valueOf(this.A06)) || !C25332Cdd.A01(this.A03, bct.A03) || !C25332Cdd.A01(this.A04, bct.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A00;
        AnonymousClass000.A1M(objArr, Arrays.hashCode(this.A02));
        objArr[2] = this.A01;
        BE8.A1P(objArr, this.A05);
        AnonymousClass3Ma.A1T(objArr, this.A06);
        objArr[5] = this.A03;
        return AnonymousClass000.A0P(this.A04, objArr, 6);
    }

    public /* synthetic */ C23199Bct(C24437C3n c3n) {
        this.A06 = 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A002 = C26293Cx2.A00(parcel);
        C28641EBx eBx = this.A00;
        if (eBx == null) {
            asBinder = null;
        } else {
            asBinder = eBx.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 1);
        C26293Cx2.A0G(parcel, this.A02, 2);
        C26293Cx2.A09(parcel, this.A01, 3, i, false);
        C26293Cx2.A08(parcel, 4, this.A05);
        C26293Cx2.A06(parcel, 5, this.A06);
        C26293Cx2.A09(parcel, this.A03, 6, i, false);
        C26293Cx2.A09(parcel, this.A04, 7, i, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23199Bct(IBinder iBinder, C23143Bbw bbw, C23171BcR bcR, C23166BcM bcM, String[] strArr, int i, boolean z) {
        C28641EBx A0U;
        if (iBinder == null) {
            A0U = null;
        } else {
            A0U = BEA.A0U(iBinder);
        }
        this.A00 = A0U;
        this.A02 = strArr;
        this.A01 = bbw;
        this.A05 = z;
        this.A06 = i;
        this.A03 = bcR;
        this.A04 = bcM;
    }

    public C23199Bct() {
        this.A06 = 0;
    }
}
