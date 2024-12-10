package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.Bbp  reason: case insensitive filesystem */
public final class C23136Bbp extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final IBinder A01;
    public final C23203Bcx A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof C23136Bbp) {
                    C23136Bbp bbp = (C23136Bbp) obj;
                    if (!this.A02.equals(bbp.A02) || !C25332Cdd.A01(A00(), bbp.A00())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Cyt, com.google.android.gms.common.internal.IAccountAccessor] */
    public final IAccountAccessor A00() {
        IBinder iBinder = this.A01;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        return new C26393Cyt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public C23136Bbp(IBinder iBinder, C23203Bcx bcx, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = iBinder;
        this.A02 = bcx;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A00);
        C26293Cx2.A04(this.A01, parcel, 2);
        C26293Cx2.A09(parcel, this.A02, 3, i, false);
        C26293Cx2.A08(parcel, 4, this.A03);
        C26293Cx2.A08(parcel, 5, this.A04);
        C26293Cx2.A05(parcel, A002);
    }
}
