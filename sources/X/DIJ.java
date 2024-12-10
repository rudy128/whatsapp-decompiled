package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIJ implements E5D {
    public final /* synthetic */ BZ5 A00;

    public /* synthetic */ DIJ(BZ5 bz5) {
        this.A00 = bz5;
    }

    public final void accept(Object obj, Object obj2) {
        BZ5 bz5 = this.A00;
        BZN bzn = new BZN((TaskCompletionSource) obj2);
        C26391Cyr cyr = (C26391Cyr) ((C26157CtR) obj).A04();
        String str = bz5.A00;
        Parcel obtain = Parcel.obtain();
        BE9.A15(bzn, obtain, cyr.A00);
        obtain.writeString(str);
        cyr.A00(2, obtain);
    }
}
