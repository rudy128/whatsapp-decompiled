package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Cyy  reason: case insensitive filesystem */
public abstract class C26398Cyy implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C26398Cyy(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final IBinder asBinder() {
        return this.A00;
    }

    public static Parcel A00(Parcelable parcelable, C26398Cyy cyy) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(cyy.A01);
        obtain.writeInt(1);
        parcelable.writeToParcel(obtain, 0);
        return obtain;
    }

    public final void A01(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            AnonymousClass000.A18(this.A00, parcel, obtain, i);
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
