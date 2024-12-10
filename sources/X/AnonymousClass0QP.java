package X;

import android.content.Context;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0QP  reason: invalid class name */
public final class AnonymousClass0QP {
    public static final AtomicInteger A0P = new AtomicInteger(0);
    public AnonymousClass0sX A00;
    public C04240Mk A01;
    public AnonymousClass0YL A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07;
    public int A08;
    public long A09;
    public AnonymousClass0CB A0A;
    public AnonymousClass0sU A0B;
    public C04220Mi A0C;
    public AnonymousClass0CA A0D;
    public Object A0E;
    public boolean A0F;
    public final C009104x A0G;
    public final Object A0H;
    public final List A0I = AnonymousClass000.A13();
    public final int A0J;
    public final long A0K;
    public final Context A0L;
    public final AnonymousClass0sW A0M;
    public final Object A0N;
    public final Executor A0O;

    public AnonymousClass0QP(Context context, AnonymousClass0sW r5, Object obj, Executor executor) {
        C18070vi.A0d(context, 1);
        this.A0L = context;
        this.A0M = r5;
        this.A0N = obj;
        this.A0O = executor;
        Looper mainLooper = Looper.getMainLooper();
        C18070vi.A0X(mainLooper);
        this.A0G = new C009104x(mainLooper, this);
        A0P.incrementAndGet();
        this.A0J = C25436Cfj.A00(context);
        this.A0K = System.nanoTime();
        this.A04 = -1;
        this.A03 = -1;
        this.A09 = AnonymousClass0OH.A00.A01(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.A0H = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r1.A03(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass0QP r3) {
        /*
            monitor-enter(r3)
            X.0sW r1 = r3.A0M     // Catch:{ all -> 0x0035 }
            X.0Mi r0 = r3.A0C     // Catch:{ all -> 0x0035 }
            r2 = 0
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0035 }
        L_0x000a:
            r1.BFI(r0)     // Catch:{ all -> 0x0035 }
            X.0Mk r1 = r3.A01     // Catch:{ all -> 0x0035 }
            X.0Mi r0 = r3.A0C     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001a
            X.0Mk r0 = r0.A01     // Catch:{ all -> 0x0035 }
        L_0x0015:
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x0035 }
            goto L_0x001e
        L_0x001a:
            r0 = r2
            goto L_0x0015
        L_0x001c:
            r0 = r2
            goto L_0x000a
        L_0x001e:
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
        L_0x0021:
            return
        L_0x0022:
            X.0Mi r0 = r3.A0C     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0028
            X.0Mk r2 = r0.A01     // Catch:{ all -> 0x0035 }
        L_0x0028:
            r3.A01 = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)
            X.0YL r1 = r3.A02
            if (r1 == 0) goto L_0x0021
            X.0Mk r0 = r3.A01
            r1.A03(r0)
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QP.A03(X.0QP):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r1.A02 == r13.A09) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r5 = (X.C04220Mi) r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (X.AnonymousClass000.A1P((r6.A02 > r13.A09 ? 1 : (r6.A02 == r13.A09 ? 0 : -1))) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (r1 <= r13.A04) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if (X.C18070vi.A18(r13.A0C, r5) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r13.A04 = r1;
        r13.A03 = r6.A00;
        r13.A0C = r5;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (X.C18070vi.A18(r13.A0A, r6) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r13.A0A = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        if (r14 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r1 = r5.A01.A03.A03;
        r14[0] = r1.width();
        r14[1] = r1.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        r13.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass0QP r13, int[] r14) {
        /*
            monitor-enter(r13)
            boolean r0 = r13.A0F     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r13)
            return
        L_0x0007:
            X.0sU r5 = r13.A0B     // Catch:{ all -> 0x00a1 }
            if (r5 == 0) goto L_0x009a
            X.0CB r1 = r13.A0A     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0024
            X.0sU r0 = r1.A03     // Catch:{ all -> 0x00a1 }
            boolean r0 = X.C18070vi.A18(r0, r5)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0024
            long r3 = r13.A09     // Catch:{ all -> 0x00a1 }
            long r1 = r1.A02     // Catch:{ all -> 0x00a1 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
        L_0x001f:
            X.0CB r6 = r13.A0A     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x0093
            goto L_0x003e
        L_0x0024:
            android.content.Context r4 = r13.A0L     // Catch:{ all -> 0x00a1 }
            java.lang.Object r7 = r13.A0N     // Catch:{ all -> 0x00a1 }
            java.lang.Object r8 = r13.A0E     // Catch:{ all -> 0x00a1 }
            int r9 = r13.A07     // Catch:{ all -> 0x00a1 }
            int r0 = r9 + 1
            r13.A07 = r0     // Catch:{ all -> 0x00a1 }
            int r10 = r13.A06     // Catch:{ all -> 0x00a1 }
            X.0Mi r6 = r13.A0C     // Catch:{ all -> 0x00a1 }
            long r11 = r13.A09     // Catch:{ all -> 0x00a1 }
            X.0CB r3 = new X.0CB     // Catch:{ all -> 0x00a1 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a1 }
            r13.A0A = r3     // Catch:{ all -> 0x00a1 }
            goto L_0x001f
        L_0x003e:
            monitor-exit(r13)
            java.lang.Object r5 = r6.A00()
            X.0Mi r5 = (X.C04220Mi) r5
            monitor-enter(r13)
            long r2 = r13.A09     // Catch:{ all -> 0x00a1 }
            long r0 = r6.A02     // Catch:{ all -> 0x00a1 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r4)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x006c
            int r1 = r6.A01     // Catch:{ all -> 0x00a1 }
            int r0 = r13.A04     // Catch:{ all -> 0x00a1 }
            if (r1 <= r0) goto L_0x006c
            X.0Mi r0 = r13.A0C     // Catch:{ all -> 0x00a1 }
            boolean r0 = X.C18070vi.A18(r0, r5)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x006c
            r13.A04 = r1     // Catch:{ all -> 0x00a1 }
            int r0 = r6.A00     // Catch:{ all -> 0x00a1 }
            r13.A03 = r0     // Catch:{ all -> 0x00a1 }
            r13.A0C = r5     // Catch:{ all -> 0x00a1 }
            r2 = 1
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            X.0CB r0 = r13.A0A     // Catch:{ all -> 0x00a1 }
            boolean r1 = X.C18070vi.A18(r0, r6)     // Catch:{ all -> 0x00a1 }
            r0 = 0
            if (r1 == 0) goto L_0x0078
            r13.A0A = r0     // Catch:{ all -> 0x00a1 }
        L_0x0078:
            monitor-exit(r13)
            if (r14 == 0) goto L_0x008d
            X.0Mk r0 = r5.A01
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03
            android.graphics.Rect r1 = r0.A03
            int r0 = r1.width()
            r14[r4] = r0
            int r0 = r1.height()
            r14[r3] = r0
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r13.A01()
        L_0x0092:
            return
        L_0x0093:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a0
        L_0x009a:
            java.lang.String r0 = "Tried executing the layout step before resolving a tree"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x00a1 }
        L_0x00a0:
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QP.A04(X.0QP, int[]):void");
    }

    public static final synchronized boolean A05(AnonymousClass0QP r2, AnonymousClass0CA r3, AnonymousClass0Jt r4) {
        boolean z;
        synchronized (r2) {
            int i = r3.A01;
            if (i > r2.A05) {
                r2.A05 = i;
                r2.A0B = r4.A00;
                r2.A06 = r3.A00;
                r2.A0E = r4.A01;
                List list = r4.A02;
                if (list != null && !list.isEmpty()) {
                    C41681wt.A00(r2.A0I).removeAll(list);
                }
                z = true;
            } else {
                z = false;
            }
            if (C18070vi.A18(r2.A0D, r3)) {
                r2.A0D = null;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r1 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        A05(r12, r1, (X.AnonymousClass0Jt) r1.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        A04(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int[] r13, long r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.A0F     // Catch:{ all -> 0x00a5 }
            r1 = 1
            r6 = r14
            if (r0 == 0) goto L_0x002d
            long r2 = r12.A09     // Catch:{ all -> 0x00a5 }
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x000d:
            X.0Mk r2 = r12.A01     // Catch:{ all -> 0x00a5 }
            r5 = 0
            if (r2 == 0) goto L_0x0043
            long r8 = r2.A00     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r2.A03     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r0 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r3 = r0.width()     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r2.A03     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r2 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r0 = r2.height()     // Catch:{ all -> 0x00a5 }
            long r10 = X.C02760Fg.A00(r3, r0)     // Catch:{ all -> 0x00a5 }
            boolean r0 = X.C04520Ns.A02(r6, r8, r10)     // Catch:{ all -> 0x00a5 }
            goto L_0x0032
        L_0x002d:
            r12.A0F = r1     // Catch:{ all -> 0x00a5 }
            r12.A09 = r14     // Catch:{ all -> 0x00a5 }
            goto L_0x000d
        L_0x0032:
            if (r0 == 0) goto L_0x0043
            if (r13 == 0) goto L_0x0087
            int r0 = r2.width()     // Catch:{ all -> 0x00a5 }
            r13[r5] = r0     // Catch:{ all -> 0x00a5 }
            int r0 = r2.height()     // Catch:{ all -> 0x00a5 }
            r13[r1] = r0     // Catch:{ all -> 0x00a5 }
            goto L_0x0087
        L_0x0043:
            X.0Mi r3 = r12.A0C     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x007d
            X.0Mk r4 = r3.A01     // Catch:{ all -> 0x00a5 }
            long r8 = r4.A00     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r4.A03     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r0 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r2 = r0.width()     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r4.A03     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r0 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r0 = r0.height()     // Catch:{ all -> 0x00a5 }
            long r10 = X.C02760Fg.A00(r2, r0)     // Catch:{ all -> 0x00a5 }
            boolean r0 = X.C04520Ns.A02(r6, r8, r10)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x007d
            A03(r12)     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x0087
            X.0Mk r0 = r3.A01     // Catch:{ all -> 0x00a5 }
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03     // Catch:{ all -> 0x00a5 }
            android.graphics.Rect r2 = r0.A03     // Catch:{ all -> 0x00a5 }
            int r0 = r2.width()     // Catch:{ all -> 0x00a5 }
            r13[r5] = r0     // Catch:{ all -> 0x00a5 }
            int r0 = r2.height()     // Catch:{ all -> 0x00a5 }
            r13[r1] = r0     // Catch:{ all -> 0x00a5 }
            goto L_0x0087
        L_0x007d:
            X.0sX r0 = r12.A00     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0089
            if (r13 == 0) goto L_0x0087
            r13[r5] = r5     // Catch:{ all -> 0x00a5 }
            r13[r1] = r5     // Catch:{ all -> 0x00a5 }
        L_0x0087:
            monitor-exit(r12)
            return
        L_0x0089:
            X.0sU r0 = r12.A0B     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            X.0CA r1 = r12.A0D     // Catch:{ all -> 0x00a5 }
            r1.getClass()     // Catch:{ all -> 0x00a5 }
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            monitor-exit(r12)
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.A00()
            X.0Jt r0 = (X.AnonymousClass0Jt) r0
            A05(r12, r1, r0)
        L_0x00a1:
            A04(r12, r13)
            return
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QP.A06(int[], long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r12 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r11.A0O.execute(new X.AnonymousClass0ZJ(r11, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r1 = (X.AnonymousClass0CA) r2.element;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (A05(r11, r1, (X.AnonymousClass0Jt) r1.A00()) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        A04(r11, (int[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass0sX r10, X.AnonymousClass0QP r11, boolean r12) {
        /*
            X.4rF r2 = new X.4rF
            r2.<init>()
            monitor-enter(r11)
            if (r10 != 0) goto L_0x0012
            java.util.List r0 = r11.A0I     // Catch:{ all -> 0x0073 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r11)
            return
        L_0x0012:
            r11.A00 = r10     // Catch:{ all -> 0x0073 }
        L_0x0014:
            X.0sX r5 = r11.A00     // Catch:{ all -> 0x0073 }
            if (r5 == 0) goto L_0x006c
            java.lang.Object r0 = r11.A0N     // Catch:{ all -> 0x0073 }
            X.0HY r6 = new X.0HY     // Catch:{ all -> 0x0073 }
            r6.<init>(r11, r0)     // Catch:{ all -> 0x0073 }
            X.0sU r4 = r11.A0B     // Catch:{ all -> 0x0073 }
            java.lang.Object r7 = r11.A0E     // Catch:{ all -> 0x0073 }
            java.util.List r1 = r11.A0I     // Catch:{ all -> 0x0073 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0043
            X.0wS r8 = X.AnonymousClass1ZU.A09()     // Catch:{ all -> 0x0073 }
        L_0x002f:
            int r9 = r11.A08     // Catch:{ all -> 0x0073 }
            int r0 = r9 + 1
            r11.A08 = r0     // Catch:{ all -> 0x0073 }
            int r10 = r11.A00()     // Catch:{ all -> 0x0073 }
            X.0CA r3 = new X.0CA     // Catch:{ all -> 0x0073 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0073 }
            r2.element = r3     // Catch:{ all -> 0x0073 }
            r11.A0D = r3     // Catch:{ all -> 0x0073 }
            goto L_0x0049
        L_0x0043:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0073 }
            r8.<init>(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x002f
        L_0x0049:
            monitor-exit(r11)
            if (r12 == 0) goto L_0x0057
            java.util.concurrent.Executor r1 = r11.A0O
            X.0ZJ r0 = new X.0ZJ
            r0.<init>(r11, r2)
            r1.execute(r0)
        L_0x0056:
            return
        L_0x0057:
            java.lang.Object r1 = r2.element
            X.0CA r1 = (X.AnonymousClass0CA) r1
            java.lang.Object r0 = r1.A00()
            X.0Jt r0 = (X.AnonymousClass0Jt) r0
            boolean r0 = A05(r11, r1, r0)
            if (r0 == 0) goto L_0x0056
            r0 = 0
            A04(r11, r0)
            return
        L_0x006c:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QP.A02(X.0sX, X.0QP, boolean):void");
    }

    private final int A00() {
        return C22339B3q.A00((((double) (System.nanoTime() - this.A0K)) * 1.0d) / ((double) this.A0J));
    }

    private final void A01() {
        if (C26176Ctu.A03()) {
            A03(this);
            return;
        }
        C009104x r2 = this.A0G;
        if (!r2.hasMessages(99)) {
            r2.sendEmptyMessage(99);
        }
    }
}
