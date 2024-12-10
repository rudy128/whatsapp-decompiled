package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cyt  reason: case insensitive filesystem */
public abstract class C26393Cyt implements IInterface {
    public final String A00;
    public final IBinder A01;

    public C26393Cyt(IBinder iBinder, String str) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public final IBinder asBinder() {
        return this.A01;
    }

    public final Parcel A00(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A01, parcel, parcel, i);
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
