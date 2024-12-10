package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cyq  reason: case insensitive filesystem */
public abstract class C26390Cyq implements IInterface {
    public final IBinder A00;

    public C26390Cyq(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final IBinder asBinder() {
        return this.A00;
    }

    public final void A00(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
