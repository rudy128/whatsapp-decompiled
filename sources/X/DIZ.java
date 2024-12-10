package X;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIZ implements E5D {
    public final /* synthetic */ CWD A00;
    public final /* synthetic */ BZ9 A01;
    public final /* synthetic */ C23194Bco A02;

    public /* synthetic */ DIZ(CWD cwd, BZ9 bz9, C23194Bco bco) {
        this.A01 = bz9;
        this.A00 = cwd;
        this.A02 = bco;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bbr, android.os.Parcelable, java.lang.Object] */
    public final void accept(Object obj, Object obj2) {
        C23021BZx bZx = (C23021BZx) obj;
        DIB dib = new DIB((TaskCompletionSource) obj2);
        CWD cwd = this.A00;
        C23194Bco bco = this.A02;
        C23415Bgg bgg = new C23415Bgg(cwd);
        bZx.A02.add(bgg);
        C26398Cyy cyy = (C26398Cyy) bZx.A04();
        ? obj3 = new Object();
        obj3.A03 = new C23416Bgh(dib);
        obj3.A05 = "thunderstorm";
        obj3.A04 = bco;
        obj3.A02 = bgg;
        cyy.A01(2003, C26398Cyy.A00(obj3, cyy));
    }
}
