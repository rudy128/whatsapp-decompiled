package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.BFh  reason: case insensitive filesystem */
public abstract class C22601BFh extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        C23439Bh4 bh4 = (C23439Bh4) this;
        if (i == 1) {
            BEA.A0M(parcel, Status.CREATOR);
            BEA.A0M(parcel, C23032Ba8.CREATOR);
            throw C17880vN.A0y();
        } else if (i == 2) {
            parcel.readString();
            throw C17880vN.A0y();
        } else if (i == 3) {
            BEA.A0M(parcel, Status.CREATOR);
            BEA.A0M(parcel, C23089Bb4.CREATOR);
            throw C17880vN.A0y();
        } else if (i == 4) {
            BEA.A0M(parcel, Status.CREATOR);
            parcel.readInt();
            throw C17880vN.A0y();
        } else if (i == 6) {
            BEA.A0M(parcel, Status.CREATOR);
            BEA.A0M(parcel, Ba9.CREATOR);
            throw C17880vN.A0y();
        } else if (i == 8) {
            ((C23438Bh3) bh4).A00.A06(new AJB((Status) BEA.A0M(parcel, Status.CREATOR), (C23084Baz) BEA.A0M(parcel, C23084Baz.CREATOR)));
            return true;
        } else if (i == 10) {
            BEA.A0M(parcel, Status.CREATOR);
            parcel.readInt();
            throw C17880vN.A0y();
        } else if (i == 11) {
            BEA.A0M(parcel, Status.CREATOR);
            throw C17880vN.A0y();
        } else if (i == 15) {
            BEA.A0M(parcel, Status.CREATOR);
            BEA.A0M(parcel, C23043BaK.CREATOR);
            throw C17880vN.A0y();
        } else if (i != 16) {
            return false;
        } else {
            BEA.A0M(parcel, Status.CREATOR);
            parcel.readString();
            parcel.readInt();
            throw C17880vN.A0y();
        }
    }
}
