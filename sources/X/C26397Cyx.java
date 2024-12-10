package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cyx  reason: case insensitive filesystem */
public abstract class C26397Cyx implements IInterface {
    public final String A00;
    public final IBinder A01;

    public C26397Cyx(IBinder iBinder, String str) {
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

    public final void A01(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A01, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
