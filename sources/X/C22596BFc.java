package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.BFc  reason: case insensitive filesystem */
public abstract class C22596BFc extends Binder implements IInterface {
    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C23297Bel bel = (C23297Bel) this;
        switch (i) {
            case 1:
                ((C23324BfC) bel).A00.A06((Status) BEA.A0M(parcel, Status.CREATOR));
                return true;
            case 2:
                BEA.A0M(parcel, Status.CREATOR);
                throw C17880vN.A0y();
            case 3:
                BEA.A0M(parcel, Status.CREATOR);
                parcel.readLong();
                throw C17880vN.A0y();
            case 4:
                BEA.A0M(parcel, Status.CREATOR);
                throw C17880vN.A0y();
            case 5:
                BEA.A0M(parcel, Status.CREATOR);
                parcel.readLong();
                throw C17880vN.A0y();
            case 6:
                BEA.A0M(parcel, Status.CREATOR);
                parcel.createTypedArray(C23192Bcm.CREATOR);
                throw C17880vN.A0y();
            case 7:
                BEA.A0M(parcel, DataHolder.CREATOR);
                throw C17880vN.A0y();
            case 8:
                BEA.A0M(parcel, Status.CREATOR);
                BEA.A0M(parcel, C23152Bc8.CREATOR);
                throw C17880vN.A0y();
            case 9:
                BEA.A0M(parcel, Status.CREATOR);
                BEA.A0M(parcel, C23152Bc8.CREATOR);
                throw C17880vN.A0y();
            default:
                return false;
        }
    }
}
