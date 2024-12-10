package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class BFX extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C23235Bdl bdl = (C23235Bdl) this;
        if (i != 1) {
            return false;
        }
        Status status = (Status) BEA.A0M(parcel, Status.CREATOR);
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            C24601CAx.A00(status, bdl.A00, (Object) null);
            return true;
        }
        throw BEB.A0K(dataAvail);
    }
}
