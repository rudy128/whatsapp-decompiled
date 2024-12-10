package X;

import com.whatsapp.wabloks.ui.WaBloksActivity;

public class DNI implements E86 {
    public final /* synthetic */ CXY A00;
    public final /* synthetic */ AnonymousClass2ZZ A01;
    public final /* synthetic */ CMC A02;
    public final /* synthetic */ boolean A03;

    public DNI(CXY cxy, AnonymousClass2ZZ r2, CMC cmc, boolean z) {
        this.A00 = cxy;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = cmc;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C57, java.lang.Object] */
    public void BNU() {
        new Object().A00 = this.A02;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.C8B] */
    public C8B BSo() {
        C18030ve r2 = this.A01.A00;
        C18040vf r1 = C18040vf.A02;
        if ((C18020vd.A05(r1, r2, 8202) || C18020vd.A05(r1, r2, 12585)) && WaBloksActivity.A0H) {
            return new Object();
        }
        return null;
    }
}
