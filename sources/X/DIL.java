package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIL implements E5D {
    public final /* synthetic */ BZ6 A00;

    public /* synthetic */ DIL(BZ6 bz6) {
        this.A00 = bz6;
    }

    public final void accept(Object obj, Object obj2) {
        C23280BeU beU = new C23280BeU((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(beU);
        ((C26390Cyq) ((C26157CtR) obj).A04()).A00(2, obtain);
    }
}
