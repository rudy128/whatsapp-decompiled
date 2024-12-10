package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.BfJ  reason: case insensitive filesystem */
public abstract class C23331BfJ extends C22597BFd implements IObjectWrapper {
    public C23331BfJ() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.dynamic.IObjectWrapper, X.Cyt] */
    public static IObjectWrapper A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof IObjectWrapper) {
            return (IObjectWrapper) queryLocalInterface;
        }
        return new C26393Cyt(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static IObjectWrapper A02(Parcel parcel, C26399Cyz cyz, int i) {
        Parcel A05 = cyz.A05(i, parcel);
        IObjectWrapper A01 = A01(A05.readStrongBinder());
        A05.recycle();
        return A01;
    }
}
