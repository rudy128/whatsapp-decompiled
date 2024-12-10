package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cr9  reason: case insensitive filesystem */
public class C26045Cr9 {
    public static final Map A0H = BE8.A0q();
    public Handler A00;
    public final int A01;
    public final Context A02;
    public final CJN A03;
    public final C26140Ct3 A04;
    public final C26140Ct3 A05;
    public final C25517ChF A06;
    public final C26372CyY A07;
    public final C25132CZh A08 = new C25132CZh();
    public final Object A09 = C17880vN.A0p();
    public final boolean A0A;
    public final boolean A0B;
    public final C9Y A0C;
    public volatile Looper A0D;
    public volatile EAJ A0E;
    public volatile boolean A0F;
    public volatile boolean A0G;

    public static void A00(C26045Cr9 cr9) {
        EAJ eaj = cr9.A0E;
        if (eaj != null) {
            try {
                List list = cr9.A08.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((E98) list.get(i)).BIY();
                }
                eaj.release();
            } catch (Throwable th) {
                cr9.A0E = null;
                cr9.A0G = false;
                cr9.A0F = false;
                A0H.remove(cr9.A00.getLooper());
                throw th;
            }
            cr9.A0E = null;
            cr9.A0G = false;
            cr9.A0F = false;
            A0H.remove(cr9.A00.getLooper());
        }
    }

    public EAJ A01() {
        EAJ eaj;
        synchronized (this.A09) {
            C26045Cr9 cr9 = (C26045Cr9) A0H.get(Looper.myLooper());
            if (cr9 != null) {
                eaj = cr9.A0E;
            } else {
                eaj = null;
            }
            C26159CtX.A01(eaj);
        }
        return eaj;
    }

    public void A02() {
        if (this.A0B && !this.A0G) {
            synchronized (this.A09) {
                this.A0G = true;
            }
        }
    }

    public void A03(E98 e98) {
        Object obj = this.A09;
        C25132CZh cZh = this.A08;
        if (e98 != null) {
            synchronized (obj) {
                try {
                    if (!cZh.A00.contains(e98)) {
                        e98.Bd8(this);
                        EAJ eaj = this.A0E;
                        if (eaj != null && A05()) {
                            e98.BCi(eaj);
                        }
                        cZh.A01(e98);
                    }
                } catch (Throwable th) {
                    C27222Da1.A00(this, "GlHostImpl.attach() failed.", th);
                }
            }
        }
    }

    public void A04(E98 e98) {
        Object obj = this.A09;
        C25132CZh cZh = this.A08;
        if (e98 != null) {
            synchronized (obj) {
                try {
                    if (cZh.A02(e98) && this.A0E != null) {
                        e98.BIY();
                    }
                } catch (Throwable th) {
                    C27222Da1.A00(this, "GlHostImpl.detach() failed.", th);
                }
            }
        }
    }

    public boolean A05() {
        boolean z;
        synchronized (this.A09) {
            EAJ eaj = this.A0E;
            Looper looper = this.A0D;
            if (eaj == null || (this.A0G && looper != Looper.myLooper())) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public C26045Cr9(Context context, Looper looper, CJN cjn, C26140Ct3 ct3, C25517ChF chF, C9Y c9y) {
        this.A02 = context;
        this.A06 = chF;
        C9S c9s = C25517ChF.A07;
        Integer A0j = C17880vN.A0j();
        Map map = chF.A00;
        int A0M = AnonymousClass000.A0M(BE8.A0e(c9s, A0j, map));
        this.A01 = A0M;
        this.A04 = C26076Crq.A01(BE8.A0e(C25517ChF.A02, C25675Ck6.A05, map), A0M);
        this.A05 = ct3;
        this.A03 = cjn;
        this.A00 = new Handler(looper);
        this.A0D = looper;
        this.A0A = AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A01, AnonymousClass000.A0h(), map));
        this.A0B = AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A09, AnonymousClass000.A0i(), map));
        this.A07 = new C26372CyY((Looper) map.get(C25517ChF.A0A));
        this.A0C = c9y;
    }
}
