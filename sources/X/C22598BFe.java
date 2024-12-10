package X;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.BFe  reason: case insensitive filesystem */
public abstract class C22598BFe extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object createFromParcel;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C23334BfM bfM = (C23334BfM) this;
        if (i != 1) {
            return false;
        }
        Status status = (Status) BEA.A0M(parcel, Status.CREATOR);
        Parcelable.Creator creator = PendingIntent.CREATOR;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(parcel);
        }
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            C24601CAx.A00(status, bfM.A00, createFromParcel);
            return true;
        }
        throw BEB.A0K(dataAvail);
    }
}
