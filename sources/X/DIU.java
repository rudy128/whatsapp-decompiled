package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIU implements E5D {
    public final /* synthetic */ BZ4 A00;
    public final /* synthetic */ C23176BcW A01;

    public /* synthetic */ DIU(BZ4 bz4, C23176BcW bcW) {
        this.A00 = bz4;
        this.A01 = bcW;
    }

    public final void accept(Object obj, Object obj2) {
        C23176BcW bcW = this.A01;
        C26396Cyw cyw = (C26396Cyw) ((C26157CtR) obj).A04();
        BZO bzo = new BZO((TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        BE9.A15(bzo, obtain, cyw.A00);
        bcW.writeToParcel(obtain, BE8.A1V(obtain) ? 1 : 0);
        cyw.A01(2, obtain);
    }
}
