package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.DIc  reason: case insensitive filesystem */
public final /* synthetic */ class C26895DIc implements E5D {
    public final /* synthetic */ CWD A00;
    public final /* synthetic */ BZ9 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public /* synthetic */ C26895DIc(CWD cwd, BZ9 bz9, String str, byte[] bArr) {
        this.A01 = bz9;
        this.A03 = bArr;
        this.A02 = str;
        this.A00 = cwd;
    }

    public final void accept(Object obj, Object obj2) {
        C23021BZx bZx = (C23021BZx) obj;
        DIB dib = new DIB((TaskCompletionSource) obj2);
        byte[] bArr = this.A03;
        String str = this.A02;
        C23413Bge bge = new C23413Bge(this.A00);
        bZx.A04.add(bge);
        C26398Cyy cyy = (C26398Cyy) bZx.A04();
        C23201Bcv bcv = new C23201Bcv((C24436C3m) null);
        bcv.A01 = new C23416Bgh(dib);
        bcv.A03 = bArr;
        bcv.A02 = str;
        bcv.A00 = bge;
        cyy.A01(2005, C26398Cyy.A00(bcv, cyy));
    }
}
