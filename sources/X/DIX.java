package X;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIX implements E5D {
    public final /* synthetic */ CWD A00;
    public final /* synthetic */ BZ9 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ DIX(CWD cwd, BZ9 bz9, String str) {
        this.A01 = bz9;
        this.A02 = str;
        this.A00 = cwd;
    }

    public final void accept(Object obj, Object obj2) {
        C23021BZx bZx = (C23021BZx) obj;
        DIB dib = new DIB((TaskCompletionSource) obj2);
        String str = this.A02;
        C23414Bgf bgf = new C23414Bgf(bZx.A0F, this.A00, bZx.A01);
        bZx.A03.add(bgf);
        C26398Cyy cyy = (C26398Cyy) bZx.A04();
        C23200Bcu bcu = new C23200Bcu((C24433C3j) null);
        bcu.A01 = new C23416Bgh(dib);
        bcu.A02 = str;
        bcu.A00 = bgf;
        cyy.A01(2006, C26398Cyy.A00(bcu, cyy));
    }
}
