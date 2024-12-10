package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.BFm  reason: case insensitive filesystem */
public abstract class C22606BFm extends Binder implements IInterface {
    public abstract boolean a(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        return this;
    }

    public static Bundle A00(Parcel parcel) {
        Bundle bundle = (Bundle) C26062Crc.A00(parcel, Bundle.CREATOR);
        C26062Crc.A01(parcel);
        return bundle;
    }

    public C22606BFm(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return a(i, parcel, parcel2, i2);
    }
}
