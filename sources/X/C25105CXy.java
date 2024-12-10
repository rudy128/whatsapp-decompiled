package X;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.CXy  reason: case insensitive filesystem */
public final class C25105CXy {
    public final C28635EBp A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25105CXy)) {
            return false;
        }
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            Parcel A05 = cyz.A05(17, C26399Cyz.A00(((C25105CXy) obj).A00, cyz));
            boolean A1O = AnonymousClass000.A1O(A05.readInt());
            A05.recycle();
            return A1O;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final int hashCode() {
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A00, 18);
            int readInt = A02.readInt();
            A02.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public C25105CXy(C28635EBp eBp) {
        C18210vx.A00(eBp);
        this.A00 = eBp;
    }
}
