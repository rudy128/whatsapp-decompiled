package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.AmE  reason: case insensitive filesystem */
public class C21567AmE implements CLResultReceiver {
    public IBinder A00;

    public void CHP(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.npci.upi.security.services.CLResultReceiver");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }

    public static boolean A00(Bundle bundle, Parcel parcel) {
        parcel.writeInterfaceToken("org.npci.upi.security.services.CLResultReceiver");
        if (bundle != null) {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public void BLY(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(3, obtain, obtain2, A00(bundle, obtain) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void CPs(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(4, obtain, obtain2, A00(bundle, obtain) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void CPt(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(2, obtain, obtain2, A00(bundle, obtain) ? 1 : 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
