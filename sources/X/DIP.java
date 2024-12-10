package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIP implements E5D {
    public final /* synthetic */ C22999BYz A00;
    public final /* synthetic */ C23232Bdi A01;

    public /* synthetic */ DIP(C22999BYz bYz, C23232Bdi bdi) {
        this.A00 = bYz;
        this.A01 = bdi;
    }

    public final void accept(Object obj, Object obj2) {
        C23334BfM bfM = new C23334BfM((TaskCompletionSource) obj2);
        C26387Cyn cyn = (C26387Cyn) ((C26157CtR) obj).A04();
        C23232Bdi bdi = this.A01;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        obtain.writeStrongBinder(bfM);
        boolean A1V = BE8.A1V(obtain);
        bdi.writeToParcel(obtain, A1V ? 1 : 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cyn.A00.transact(1, obtain, obtain2, A1V);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
