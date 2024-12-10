package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public abstract class BFZ extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C23253Be3) {
            C23253Be3 be3 = (C23253Be3) this;
            if (i != 2) {
                return false;
            }
            Parcelable A0M = BEA.A0M(parcel, Bundle.CREATOR);
            C25906CoK.A00(parcel);
            BZ4.A00((Status) BEA.A0M(parcel, Status.CREATOR), be3.A00, A0M);
            return true;
        }
        C23254Be4 be4 = (C23254Be4) this;
        switch (i) {
            case 1:
                BEA.A0M(parcel, Status.CREATOR);
                C25906CoK.A00(parcel);
                throw C17880vN.A0y();
            case 2:
                BEA.A0M(parcel, Status.CREATOR);
                BEA.A0M(parcel, C23258Be8.CREATOR);
                C25906CoK.A00(parcel);
                throw C17880vN.A0y();
            case 3:
                BEA.A0M(parcel, Status.CREATOR);
                BEA.A0M(parcel, C23255Be5.CREATOR);
                C25906CoK.A00(parcel);
                throw C17880vN.A0y();
            case 4:
                if (be4 instanceof C23250Be0) {
                    ((C23250Be0) be4).A00.A00.setResult((Object) null);
                    return true;
                }
                throw C17880vN.A0y();
            case 5:
                C25906CoK.A00(parcel);
                be4.CTX((Status) BEA.A0M(parcel, Status.CREATOR));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                C25906CoK.A00(parcel);
                if (be4 instanceof C23251Be1) {
                    ((C23251Be1) be4).A01.A00.setResult(createByteArray);
                    return true;
                }
                throw C17880vN.A0y();
            case 7:
                BEA.A0M(parcel, C23080Bav.CREATOR);
                C25906CoK.A00(parcel);
                throw C17880vN.A0y();
            default:
                return false;
        }
    }
}
