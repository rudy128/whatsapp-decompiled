package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.BFb  reason: case insensitive filesystem */
public abstract class C22595BFb extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable.Creator creator;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C23285BeZ) {
            C23285BeZ beZ = (C23285BeZ) this;
            switch (i) {
                case 3:
                    Parcelable.Creator creator2 = C23203Bcx.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator2.createFromParcel(parcel);
                    }
                    creator = C23211Bd6.CREATOR;
                    break;
                case 4:
                case 6:
                    creator = Status.CREATOR;
                    break;
                case 7:
                    Parcelable.Creator creator3 = Status.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator3.createFromParcel(parcel);
                    }
                    creator = GoogleSignInAccount.CREATOR;
                    break;
                case 8:
                    C23074Bap bap = (C23074Bap) BEA.A0M(parcel, C23074Bap.CREATOR);
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        beZ.CSf(bap);
                        break;
                    } else {
                        throw BEB.A0K(dataAvail);
                    }
                case 9:
                    creator = C23210Bd5.CREATOR;
                    break;
                default:
                    return false;
            }
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            int dataAvail2 = parcel.dataAvail();
            if (dataAvail2 > 0) {
                throw BEB.A0K(dataAvail2);
            }
            parcel2.writeNoException();
            return true;
        }
        C23284BeY beY = (C23284BeY) this;
        if (i != 1) {
            return false;
        }
        Status status = (Status) BEA.A0M(parcel, Status.CREATOR);
        int dataAvail3 = parcel.dataAvail();
        if (dataAvail3 <= 0) {
            beY.C3c(status);
            return true;
        }
        throw BEB.A0K(dataAvail3);
    }
}
