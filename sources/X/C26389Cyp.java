package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.Cyp  reason: case insensitive filesystem */
public abstract class C26389Cyp implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C26389Cyp(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final IBinder asBinder() {
        return this.A00;
    }
}
