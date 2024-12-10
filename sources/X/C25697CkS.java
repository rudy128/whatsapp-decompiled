package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.CkS  reason: case insensitive filesystem */
public class C25697CkS {
    public final E4K A00;
    public final E4K A01;
    public final E4K A02 = C24697CGj.A00;
    public final E14 A03;
    public final C25026CUc A04;
    public final C28658ECt A05;
    public final ExecutorService A06;
    public final E4K A07;
    public final E4K A08;
    public final E4K A09;
    public final E4K A0A;
    public final E4K A0B;
    public final E7V A0C;
    public final ScheduledExecutorService A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.E9u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.E9u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.E9u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.E9u} */
    /* JADX WARNING: type inference failed for: r9v4, types: [X.DBp] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.C99, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C26732DBj A00(android.graphics.Bitmap.Config r15, X.C25697CkS r16, X.C25524ChM r17) {
        /*
            r4 = r17
            X.EAH r0 = r4.A01
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0, r0, r2, r1)
            r2 = r16
            X.E14 r0 = r2.A03
            X.DCh r0 = (X.C26752DCh) r0
            java.lang.Object r0 = r0.A01
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r0 = (com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl) r0
            X.C99 r1 = r0.A06
            if (r1 != 0) goto L_0x0027
            X.C99 r1 = new X.C99
            r1.<init>()
            r0.A06 = r1
        L_0x0027:
            boolean r0 = r0.A0A
            X.Cse r5 = new X.Cse
            r5.<init>(r3, r4, r1, r0)
            X.DBl r7 = new X.DBl
            r7.<init>(r5)
            X.E4K r0 = r2.A00
            java.lang.Object r0 = r0.get()
            int r1 = X.AnonymousClass000.A0M(r0)
            r6 = 1
            if (r1 == r6) goto L_0x00d6
            r0 = 2
            if (r1 == r0) goto L_0x00f1
            r0 = 3
            if (r1 == r0) goto L_0x00cf
            X.DBm r8 = new X.DBm
            r8.<init>()
        L_0x004b:
            X.E4K r1 = r2.A0B
            java.lang.Object r0 = r1.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            X.CWs r11 = new X.CWs
            r11.<init>(r8, r5, r0)
            X.E4K r0 = r2.A0A
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass000.A0M(r0)
            r10 = 0
            if (r0 <= 0) goto L_0x00cd
            X.DBp r9 = new X.DBp
            r9.<init>(r0)
            X.CUc r3 = r2.A04
            if (r15 != 0) goto L_0x0072
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0072:
            java.util.concurrent.ExecutorService r0 = r2.A06
            X.6hy r10 = new X.6hy
            r10.<init>(r15, r11, r3, r0)
        L_0x0079:
            java.lang.Object r0 = r1.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x00b4
            java.lang.String r4 = r4.A00
            X.CUc r5 = r2.A04
            X.E4K r0 = r2.A07
            java.lang.Object r0 = r0.get()
            int r3 = X.AnonymousClass000.A0M(r0)
            X.E4K r0 = r2.A08
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass000.A0M(r0)
            X.Ci6 r14 = new X.Ci6
            r14.<init>(r5, r3, r0)
            X.E4K r0 = r2.A09
            java.lang.Object r0 = r0.get()
            boolean r17 = X.AnonymousClass000.A1Y(r0)
            X.DBq r9 = new X.DBq
            r12 = r9
            r13 = r7
            r15 = r11
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x00b4:
            X.CUc r12 = r2.A04
            java.lang.Object r0 = r1.get()
            boolean r13 = X.AnonymousClass000.A1Y(r0)
            X.DBk r6 = new X.DBk
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.E7V r3 = r2.A0C
            java.util.concurrent.ScheduledExecutorService r1 = r2.A0D
            X.DBj r0 = new X.DBj
            r0.<init>(r3, r6, r6, r1)
            return r0
        L_0x00cd:
            r9 = r10
            goto L_0x0079
        L_0x00cf:
            X.DBn r8 = new X.DBn
            r8.<init>()
            goto L_0x004b
        L_0x00d6:
            int r3 = r4.hashCode()
            X.E4K r0 = r2.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            X.DAJ r1 = new X.DAJ
            r1.<init>(r3, r0)
            X.ECt r0 = r2.A05
            X.CRI r3 = new X.CRI
            r3.<init>(r1, r0)
            goto L_0x010c
        L_0x00f1:
            int r3 = r4.hashCode()
            X.E4K r0 = r2.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            X.DAJ r1 = new X.DAJ
            r1.<init>(r3, r0)
            X.ECt r0 = r2.A05
            X.CRI r3 = new X.CRI
            r3.<init>(r1, r0)
            r6 = 0
        L_0x010c:
            X.DBo r8 = new X.DBo
            r8.<init>(r3, r6)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25697CkS.A00(android.graphics.Bitmap$Config, X.CkS, X.ChM):X.DBj");
    }

    public Drawable A01(C28672EDo eDo) {
        EAH eah;
        C25524ChM chM;
        Bitmap.Config config = null;
        if (!(eDo instanceof BSC)) {
            return null;
        }
        BSC bsc = (BSC) eDo;
        synchronized (eDo) {
            C25524ChM chM2 = bsc.A00;
            if (chM2 == null) {
                eah = null;
            } else {
                eah = chM2.A01;
            }
        }
        try {
            synchronized (eDo) {
                chM = bsc.A00;
            }
            C26208Cuj.A01(chM);
            if (eah != null) {
                config = eah.getAnimatedBitmapConfig();
            }
            C26732DBj A002 = A00(config, this, chM);
            if (AnonymousClass000.A1Y(this.A02.get())) {
                return new BFA(A002);
            }
            return new BFF(A002);
        } catch (NullPointerException e) {
            Object BRU = eDo.BRU("uri_source");
            if (BRU != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass8BS.A1I(A10, e);
                throw AnonymousClass000.A0s(BEA.A0j(BRU, " uri=", A10));
            }
            throw e;
        }
    }

    public C25697CkS(E4K e4k, E4K e4k2, E4K e4k3, E4K e4k4, E4K e4k5, E4K e4k6, E4K e4k7, E7V e7v, E14 e14, C25026CUc cUc, C28658ECt eCt, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = e14;
        this.A0D = scheduledExecutorService;
        this.A06 = executorService;
        this.A0C = e7v;
        this.A04 = cUc;
        this.A05 = eCt;
        this.A00 = e4k;
        this.A0A = e4k2;
        this.A01 = e4k3;
        this.A0B = e4k4;
        this.A07 = e4k6;
        this.A09 = e4k5;
        this.A08 = e4k7;
    }
}
