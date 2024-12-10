package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcs  reason: case insensitive filesystem */
public final class C23198Bcs extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C28641EBx A00;
    public String A01;
    public C23171BcR A02;
    public C23166BcM A03;
    public final int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23198Bcs) {
                C23198Bcs bcs = (C23198Bcs) obj;
                if (C25332Cdd.A01(this.A00, bcs.A00) && C25332Cdd.A01(this.A01, bcs.A01)) {
                    if (!DJ0.A0H(bcs.A04, Integer.valueOf(this.A04)) || !C25332Cdd.A01(this.A02, bcs.A02) || !C25332Cdd.A01(this.A03, bcs.A03)) {
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
        objArr[0] = this.A00;
        objArr[1] = this.A01;
        AnonymousClass3Ma.A1S(objArr, this.A04);
        objArr[3] = this.A02;
        return AnonymousClass000.A0P(this.A03, objArr, 4);
    }

    public /* synthetic */ C23198Bcs(C24435C3l c3l) {
        this.A04 = 0;
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
        C26293Cx2.A0A(parcel, this.A01, 2, false);
        C26293Cx2.A06(parcel, 3, this.A04);
        C26293Cx2.A09(parcel, this.A02, 4, i, false);
        C26293Cx2.A09(parcel, this.A03, 5, i, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23198Bcs(IBinder iBinder, C23171BcR bcR, C23166BcM bcM, String str, int i) {
        C28641EBx A0U;
        if (iBinder == null) {
            A0U = null;
        } else {
            A0U = BEA.A0U(iBinder);
        }
        this.A00 = A0U;
        this.A01 = str;
        this.A04 = i;
        this.A02 = bcR;
        this.A03 = bcM;
    }

    public C23198Bcs() {
        this.A04 = 0;
    }
}
