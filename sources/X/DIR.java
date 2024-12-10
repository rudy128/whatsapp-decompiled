package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIR implements E5D {
    public final /* synthetic */ C23112BbR A00;
    public final /* synthetic */ BZ5 A01;

    public /* synthetic */ DIR(C23112BbR bbR, BZ5 bz5) {
        this.A01 = bz5;
        this.A00 = bbR;
    }

    public final void accept(Object obj, Object obj2) {
        BZ5 bz5 = this.A01;
        C23112BbR bbR = this.A00;
        C23244Bdu bdu = new C23244Bdu((TaskCompletionSource) obj2);
        C26391Cyr cyr = (C26391Cyr) ((C26157CtR) obj).A04();
        String str = bz5.A00;
        Parcel obtain = Parcel.obtain();
        BE9.A15(bdu, obtain, cyr.A00);
        C26079Cru.A01(obtain, bbR);
        obtain.writeString(str);
        cyr.A00(4, obtain);
    }
}
