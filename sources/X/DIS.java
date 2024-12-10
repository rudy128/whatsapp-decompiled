package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIS implements E5D {
    public final /* synthetic */ C23140Bbt A00;
    public final /* synthetic */ BZ5 A01;

    public /* synthetic */ DIS(C23140Bbt bbt, BZ5 bz5) {
        this.A01 = bz5;
        this.A00 = bbt;
    }

    public final void accept(Object obj, Object obj2) {
        C23242Bds bds = new C23242Bds((TaskCompletionSource) obj2);
        C26391Cyr cyr = (C26391Cyr) ((C26157CtR) obj).A04();
        C23140Bbt bbt = this.A00;
        C18210vx.A00(bbt);
        Parcel obtain = Parcel.obtain();
        BE9.A15(bds, obtain, cyr.A00);
        C26079Cru.A01(obtain, bbt);
        cyr.A00(1, obtain);
    }
}
