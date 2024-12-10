package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cz0  reason: case insensitive filesystem */
public final class C26400Cz0 implements IInterface, C28631EBl {
    public final IBinder A00;

    public final IBinder asBinder() {
        return this.A00;
    }

    public C26400Cz0(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Parcel A00(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A00, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
