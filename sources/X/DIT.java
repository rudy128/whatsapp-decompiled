package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIT implements E5D {
    public final /* synthetic */ C23137Bbq A00;
    public final /* synthetic */ BZ5 A01;

    public /* synthetic */ DIT(C23137Bbq bbq, BZ5 bz5) {
        this.A01 = bz5;
        this.A00 = bbq;
    }

    public final void accept(Object obj, Object obj2) {
        C23243Bdt bdt = new C23243Bdt((TaskCompletionSource) obj2);
        C26391Cyr cyr = (C26391Cyr) ((C26157CtR) obj).A04();
        C23137Bbq bbq = this.A00;
        C18210vx.A00(bbq);
        Parcel obtain = Parcel.obtain();
        BE9.A15(bdt, obtain, cyr.A00);
        C26079Cru.A01(obtain, bbq);
        cyr.A00(3, obtain);
    }
}
