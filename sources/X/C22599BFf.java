package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.flags.impl.FlagProviderImpl;

/* renamed from: X.BFf  reason: case insensitive filesystem */
public abstract class C22599BFf extends Binder implements IInterface {
    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        FlagProviderImpl flagProviderImpl = (FlagProviderImpl) this;
        if (i != 1) {
            if (i == 2) {
                i3 = flagProviderImpl.getBooleanFlagValue(parcel.readString(), C72473Md.A1R(parcel), parcel.readInt());
            } else if (i == 3) {
                i3 = flagProviderImpl.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            } else if (i == 4) {
                long longFlagValue = flagProviderImpl.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            } else if (i != 5) {
                return false;
            } else {
                String stringFlagValue = flagProviderImpl.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        flagProviderImpl.init(C23331BfJ.A01(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
