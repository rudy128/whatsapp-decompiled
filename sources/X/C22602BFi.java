package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.BFi  reason: case insensitive filesystem */
public abstract class C22602BFi extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        Bj5 bj5 = (Bj5) this;
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) BEA.A0M(parcel, Bundle.CREATOR);
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            bj5.CTI(bundle);
            return true;
        }
        throw BEB.A0K(dataAvail);
    }
}
