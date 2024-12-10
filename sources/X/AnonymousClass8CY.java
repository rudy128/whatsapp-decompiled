package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.8CY  reason: invalid class name */
public class AnonymousClass8CY extends Binder implements CLResultReceiver {
    public final /* synthetic */ C161068Bg A00;

    public AnonymousClass8CY() {
        attachInterface(this, "org.npci.upi.security.services.CLResultReceiver");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8CY(C161068Bg r1) {
        this();
        this.A00 = r1;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            CHP(A00(parcel));
        } else if (i == 2) {
            CPt(A00(parcel));
        } else if (i == 3) {
            BLY(A00(parcel));
        } else if (i == 4) {
            CPs(A00(parcel));
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("org.npci.upi.security.services.CLResultReceiver");
            return true;
        }
        parcel2.writeNoException();
        return true;
    }

    public static Bundle A00(Parcel parcel) {
        parcel.enforceInterface("org.npci.upi.security.services.CLResultReceiver");
        if (parcel.readInt() != 0) {
            return (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, org.npci.upi.security.services.CLResultReceiver, X.AmE] */
    public static CLResultReceiver A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("org.npci.upi.security.services.CLResultReceiver");
        if (queryLocalInterface != null && (queryLocalInterface instanceof CLResultReceiver)) {
            return (CLResultReceiver) queryLocalInterface;
        }
        ? obj = new Object();
        obj.A00 = iBinder;
        return obj;
    }

    public void BLY(Bundle bundle) {
        this.A00.A01.send(3, bundle);
    }

    public void CHP(Bundle bundle) {
        this.A00.A01.send(1, bundle);
    }

    public void CPs(Bundle bundle) {
        this.A00.A01.send(4, bundle);
    }

    public void CPt(Bundle bundle) {
        this.A00.A01.send(2, bundle);
    }
}
