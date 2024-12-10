package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cys  reason: case insensitive filesystem */
public abstract class C26392Cys implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C26392Cys(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
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
