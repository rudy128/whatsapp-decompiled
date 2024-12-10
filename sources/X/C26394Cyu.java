package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cyu  reason: case insensitive filesystem */
public abstract class C26394Cyu implements IInterface {
    public final IBinder A00;
    public final String A01;

    public final Parcel A00(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A00, parcel, parcel, 1);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }

    public C26394Cyu(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }
}
