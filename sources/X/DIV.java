package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIV implements E5D {
    public final /* synthetic */ C23038BaF A00;
    public final /* synthetic */ BZ6 A01;

    public /* synthetic */ DIV(C23038BaF baF, BZ6 bz6) {
        this.A01 = bz6;
        this.A00 = baF;
    }

    public final void accept(Object obj, Object obj2) {
        C23038BaF baF = this.A00;
        C23279BeT beT = new C23279BeT((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        obtain.writeStrongBinder(beT);
        baF.writeToParcel(obtain, BE8.A1V(obtain) ? 1 : 0);
        ((C26390Cyq) ((C26157CtR) obj).A04()).A00(10, obtain);
    }
}
