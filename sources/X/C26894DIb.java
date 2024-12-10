package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.DIb  reason: case insensitive filesystem */
public final /* synthetic */ class C26894DIb implements E5D {
    public final /* synthetic */ CWD A00;
    public final /* synthetic */ BZ9 A01;
    public final /* synthetic */ C23195Bcp A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C26894DIb(CWD cwd, BZ9 bz9, C23195Bcp bcp, String str) {
        this.A01 = bz9;
        this.A03 = str;
        this.A00 = cwd;
        this.A02 = bcp;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bbu, android.os.Parcelable, java.lang.Object] */
    public final void accept(Object obj, Object obj2) {
        C23021BZx bZx = (C23021BZx) obj;
        DIB dib = new DIB((TaskCompletionSource) obj2);
        String str = this.A03;
        CWD cwd = this.A00;
        C23195Bcp bcp = this.A02;
        C23413Bge bge = new C23413Bge(cwd);
        bZx.A04.add(bge);
        C26398Cyy cyy = (C26398Cyy) bZx.A04();
        ? obj3 = new Object();
        obj3.A03 = new C23417Bgi(dib);
        obj3.A05 = str;
        obj3.A06 = "thunderstorm";
        obj3.A04 = bcp;
        obj3.A02 = bge;
        cyy.A01(2001, C26398Cyy.A00(obj3, cyy));
    }
}
