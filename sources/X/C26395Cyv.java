package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Cyv  reason: case insensitive filesystem */
public abstract class C26395Cyv implements IInterface {
    public final String A00;
    public final IBinder A01;

    public C26395Cyv(IBinder iBinder, String str) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public final IBinder asBinder() {
        return this.A01;
    }

    public final void A00(int i, Parcel parcel) {
        try {
            this.A01.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
