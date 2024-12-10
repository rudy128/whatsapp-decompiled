package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class CXE {
    public Context A00;
    public CWZ A01;
    public C28559E7l A02;
    public E7q A03;
    public E55 A04;
    public CAM A05;
    public E56 A06;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.DHZ] */
    public static DHZ A00(CUT cut, E7t e7t, CXE cxe) {
        Context context = cxe.A00;
        CWZ cwz = cxe.A01;
        cwz.getClass();
        ? obj = new Object();
        obj.A02 = 0;
        obj.A00 = 0;
        obj.A01 = -1;
        obj.A03 = C24707CGt.A00;
        obj.A04 = context;
        obj.A07 = cwz;
        obj.A09 = cut;
        obj.A0A = e7t;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [X.DHY, java.lang.Object, X.EAT] */
    public EAT A01(C25820CmX cmX, C25271CcJ ccJ, CUT cut, E7t e7t, ExecutorService executorService, boolean z) {
        CUT cut2 = cut;
        boolean A022 = cut2.A08.A02();
        E7t e7t2 = e7t;
        if (ccJ.A04 == C24250By8.MULTI_PHOTO) {
            Context context = this.A00;
            C199610h.A04((Object) null);
            ? obj = new Object();
            obj.A00 = -1;
            obj.A01 = context;
            obj.A03 = cut2;
            obj.A04 = e7t2;
            return obj;
        }
        File file = ccJ.A05;
        if (file != null && "image/gif".equals(C180949Oo.A00(file.getPath(), "video/mp4", A022))) {
            return A00(cut2, e7t2, this);
        }
        if (ccJ.A02(A022)) {
            Context context2 = this.A00;
            C28559E7l e7l = this.A02;
            C199610h.A04(e7l);
            return new C26869DHa(context2, e7l, cut2, e7t2);
        }
        Context context3 = this.A00;
        E56 e56 = this.A06;
        return new C26871DHc(context3, this.A03, cmX, this.A04, this.A05, cut2, e7t2, e56, executorService, z);
    }
}
