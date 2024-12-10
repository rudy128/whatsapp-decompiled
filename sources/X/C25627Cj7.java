package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Cj7  reason: case insensitive filesystem */
public class C25627Cj7 {
    public static boolean A0T;
    public long A00 = 0;
    public long A01 = 0;
    public MediaFormat A02 = null;
    public C25820CmX A03;
    public C28609EAd A04;
    public C25242Cbd A05;
    public C26015CqW A06;
    public C25832Cml A07;
    public E7t A08;
    public EAT A09;
    public File A0A;
    public ExecutorService A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C25325CdW A0F;
    public final C25092CXd A0G;
    public final E7q A0H;
    public final C25674Ck5 A0I;
    public final E54 A0J;
    public final E55 A0K;
    public final CAM A0L;
    public final C28564E7r A0M;
    public final CAP A0N;
    public final CUT A0O;
    public final E56 A0P;
    public final CXE A0Q;
    public final CAH A0R;
    public volatile boolean A0S;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.CXE, java.lang.Object] */
    public C25627Cj7(Context context, CWZ cwz, C28559E7l e7l, C25325CdW cdW, CAH cah, C25092CXd cXd, E7q e7q, E54 e54, E55 e55, CAM cam, C28564E7r e7r, CUT cut, E56 e56) {
        boolean z;
        boolean z2;
        C18030ve r2;
        C18030ve r22;
        this.A0E = context;
        this.A0H = e7q;
        E56 e562 = e56;
        this.A0P = e562;
        CUT cut2 = cut;
        this.A0O = cut2;
        this.A0J = e54;
        this.A0M = e7r;
        E55 e552 = e55;
        this.A0K = e552;
        CAM cam2 = cam;
        this.A0L = cam2;
        this.A0R = cah;
        this.A0I = new C22930BVx(cut2.A05);
        this.A0F = cdW;
        this.A0N = cut2.A07;
        CZT czt = cut2.A08;
        boolean z3 = czt instanceof BWB;
        if (!z3 || (r22 = ((BWB) czt).A00) == null) {
            z = false;
        } else {
            z = C18020vd.A05(C18040vf.A02, r22, 11765);
        }
        this.A0D = z;
        if (!z3 || (r2 = ((BWB) czt).A00) == null) {
            z2 = false;
        } else {
            z2 = C18020vd.A05(C18040vf.A02, r2, 11764);
        }
        this.A0C = z2;
        ? obj = new Object();
        obj.A00 = context;
        obj.A06 = e562;
        obj.A04 = e552;
        obj.A03 = e7q;
        obj.A05 = cam2;
        obj.A02 = e7l;
        obj.A01 = cwz;
        this.A0Q = obj;
        this.A0G = cXd;
        A0T = czt.A02();
    }

    public static void A00(C25627Cj7 cj7, boolean z) {
        if (z && cj7.A0S) {
            throw new CancellationException("Operation Cancelled");
        }
    }
}
