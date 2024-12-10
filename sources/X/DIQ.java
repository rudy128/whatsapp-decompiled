package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIQ implements E5D {
    public final /* synthetic */ C23131Bbk A00;
    public final /* synthetic */ BZ3 A01;

    public /* synthetic */ DIQ(C23131Bbk bbk, BZ3 bz3) {
        this.A01 = bz3;
        this.A00 = bbk;
    }

    public final void accept(Object obj, Object obj2) {
        C23241Bdr bdr = new C23241Bdr((TaskCompletionSource) obj2);
        C26391Cyr cyr = (C26391Cyr) ((C26157CtR) obj).A04();
        C23131Bbk bbk = this.A00;
        C18210vx.A00(bbk);
        Parcel obtain = Parcel.obtain();
        BE9.A15(bdr, obtain, cyr.A00);
        C26079Cru.A01(obtain, bbk);
        cyr.A00(2, obtain);
    }
}
