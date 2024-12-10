package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

public class BV5 extends C05050Qf implements C17110tl {
    public static final C16890tO A0F = new DFV();
    public static final C16890tO A0G = new C26820DFc();
    public static final C16890tO A0H = new DFR();
    public static final C16890tO A0I = new DFT();
    public static final C16890tO A0J = new C26818DFa();
    public static final C16890tO A0K = new DFZ();
    public static final C16890tO A0L = new C26819DFb();
    public static final C16890tO A0M = new DFW();
    public static final C16890tO A0N = new DFU();
    public static final C16890tO A0O = new C26821DFd();
    public static final C16890tO A0P = new DFS();
    public static final C16890tO A0Q = new DFX();
    public static final C16890tO A0R = new DFY();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public Rect A04;
    public C37961qT A05;
    public BM9 A06;
    public C24782CKb A07;
    public List A08;
    public List A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final C24781CKa A0C;
    public final C22707BLr A0D;
    public final long A0E;

    public C17110tl A0D() {
        return this;
    }

    public BV5(C24781CKa cKa, C22707BLr bLr, long j) {
        super(AnonymousClass00R.A01);
        this.A0E = j;
        this.A0D = bLr;
        this.A0C = cKa;
        AnonymousClass0Ij[] r3 = {new AnonymousClass0Ij(A0M, this), new AnonymousClass0Ij(A0F, this), new AnonymousClass0Ij(A0Q, this), new AnonymousClass0Ij(A0R, this), new AnonymousClass0Ij(A0K, this), new AnonymousClass0Ij(A0J, this), new AnonymousClass0Ij(A0L, this), new AnonymousClass0Ij(A0G, this), new AnonymousClass0Ij(A0O, this), new AnonymousClass0Ij(A0H, this), new AnonymousClass0Ij(A0P, this), new AnonymousClass0Ij(A0I, this), new AnonymousClass0Ij(A0N, this)};
        int i = 0;
        do {
            A0L(r3[i]);
            i++;
        } while (i < 13);
    }

    public long A0C() {
        return this.A0E;
    }

    public void A0M(C39711tW r2) {
        List list = this.A09;
        if (list == null) {
            list = C17880vN.A0z(4);
            this.A09 = list;
        }
        list.add(r2);
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return new BMP(context);
    }

    public /* synthetic */ C22821Di BVg() {
        return null;
    }

    public /* synthetic */ AnonymousClass0HX BXH() {
        return AnonymousClass0C0.A00;
    }

    public /* synthetic */ Class BXG() {
        return getClass();
    }
}
