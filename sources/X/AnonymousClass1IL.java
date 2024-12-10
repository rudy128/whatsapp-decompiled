package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.1IL  reason: invalid class name */
public abstract class AnonymousClass1IL extends AnonymousClass1IK implements C23781Hp {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02;
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile = 0;
    public volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<Object> cls = Object.class;
        Class<AnonymousClass1IL> cls2 = AnonymousClass1IL.class;
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue$volatile");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed$volatile");
        A00 = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleted$volatile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.lang.Runnable r6, X.AnonymousClass1IL r7) {
        /*
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = A02
        L_0x0002:
            java.lang.Object r5 = r4.get(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = A00
            int r1 = r0.get(r7)
            r0 = 0
            if (r1 == 0) goto L_0x0010
            r0 = 1
        L_0x0010:
            r1 = 0
            if (r0 != 0) goto L_0x004f
            r3 = 1
            if (r5 != 0) goto L_0x001e
            r0 = 0
            boolean r0 = X.C30561e9.A00(r7, r0, r6, r4)
        L_0x001b:
            if (r0 == 0) goto L_0x0002
        L_0x001d:
            return r3
        L_0x001e:
            boolean r0 = r5 instanceof X.AnonymousClass1IB
            if (r0 == 0) goto L_0x0039
            r2 = r5
            X.1IB r2 = (X.AnonymousClass1IB) r2
            int r0 = r2.A02(r6)
            if (r0 == 0) goto L_0x001d
            if (r0 != r3) goto L_0x004f
            long r0 = X.AnonymousClass1IB.A00(r2)
            X.1IB r0 = X.AnonymousClass1IB.A01(r2, r0)
            X.C30561e9.A00(r7, r5, r0, r4)
            goto L_0x0002
        L_0x0039:
            X.1I8 r0 = X.AnonymousClass2WX.A00
            if (r5 == r0) goto L_0x004f
            r1 = 8
            X.1IB r0 = new X.1IB
            r0.<init>(r1, r3)
            r0.A02(r5)
            r0.A02(r6)
            boolean r0 = X.C30561e9.A00(r7, r5, r0, r4)
            goto L_0x001b
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IL.A00(java.lang.Runnable, X.1IL):boolean");
    }

    public void A0F() {
        AnonymousClass3KX r0;
        boolean A002;
        C37591po.A00.set((Object) null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof AnonymousClass1IB)) {
                    if (obj == AnonymousClass2WX.A00) {
                        break;
                    }
                    AnonymousClass1IB r02 = new AnonymousClass1IB(8, true);
                    r02.A02(obj);
                    A002 = C30561e9.A00(this, obj, r02, atomicReferenceFieldUpdater);
                    continue;
                } else {
                    ((AnonymousClass1IB) obj).A04();
                    break;
                }
            } else {
                A002 = C30561e9.A00(this, (Object) null, AnonymousClass2WX.A00, atomicReferenceFieldUpdater);
                continue;
            }
            if (A002) {
                break;
            }
        }
        do {
        } while (A0E() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C63532tG r4 = (C63532tG) A01.get(this);
            if (r4 != null) {
                synchronized (r4) {
                    r0 = null;
                    if (C63532tG.A01.get(r4) > 0) {
                        r0 = r4.A02(0);
                    }
                }
                C70903Cy r03 = (C70903Cy) r0;
                if (r03 != null) {
                    A0K(r03, nanoTime);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.3Cy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.3Cy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.3Cy} */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.3JX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        if ((r12 - r0) > 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b6, code lost:
        r2 = (X.C63532tG) r5.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bc, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00be, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1 = r2.A00;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c2, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c4, code lost:
        r0 = r1[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c7, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c8, code lost:
        if (r0 != r11) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ca, code lost:
        r1 = A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d2, code lost:
        if (java.lang.Thread.currentThread() == r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d4, code lost:
        java.util.concurrent.locks.LockSupport.unpark(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C70903Cy r11, long r12) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = A00
            int r0 = r2.get(r10)
            if (r0 != 0) goto L_0x00ea
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = A01
            java.lang.Object r3 = r5.get(r10)
            X.3JX r3 = (X.AnonymousClass3JX) r3
            if (r3 != 0) goto L_0x0026
            X.3JX r1 = new X.3JX
            r1.<init>()
            r1.A00 = r12
            r0 = 0
            X.C30561e9.A00(r10, r0, r1, r5)
            java.lang.Object r3 = r5.get(r10)
            X.C18070vi.A0b(r3)
            X.3JX r3 = (X.AnonymousClass3JX) r3
        L_0x0026:
            monitor-enter(r11)
            java.lang.Object r0 = r11._heap     // Catch:{ all -> 0x00e6 }
            X.1I8 r4 = X.AnonymousClass2WX.A01     // Catch:{ all -> 0x00e6 }
            if (r0 != r4) goto L_0x002f
            monitor-exit(r11)
            return
        L_0x002f:
            monitor-enter(r3)     // Catch:{ all -> 0x00e6 }
            X.3KX[] r1 = r3.A00     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x0040
            r0 = 0
            r1 = r1[r0]     // Catch:{ all -> 0x00e3 }
        L_0x0037:
            X.3Cy r1 = (X.C70903Cy) r1     // Catch:{ all -> 0x00e3 }
            int r0 = r2.get(r10)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x0045
            goto L_0x0042
        L_0x0040:
            r1 = 0
            goto L_0x0037
        L_0x0042:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e9
        L_0x0045:
            r8 = 0
            if (r1 == 0) goto L_0x005a
            long r0 = r1.A01     // Catch:{ all -> 0x00e3 }
            long r6 = r0 - r12
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0052
            r12 = r0
        L_0x0052:
            long r0 = r3.A00     // Catch:{ all -> 0x00e3 }
            long r6 = r12 - r0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x005d
        L_0x005a:
            r3.A00 = r12     // Catch:{ all -> 0x00e3 }
            r0 = r12
        L_0x005d:
            long r6 = r11.A01     // Catch:{ all -> 0x00e3 }
            long r6 = r6 - r0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0066
            r11.A01 = r0     // Catch:{ all -> 0x00e3 }
        L_0x0066:
            java.lang.Object r0 = r11._heap     // Catch:{ all -> 0x00e3 }
            if (r0 == r4) goto L_0x00db
            r11._heap = r3     // Catch:{ all -> 0x00e3 }
            X.3KX[] r0 = r3.A00     // Catch:{ all -> 0x00e3 }
            if (r0 != 0) goto L_0x0085
            r0 = 4
            X.3KX[] r0 = new X.AnonymousClass3KX[r0]     // Catch:{ all -> 0x00e3 }
        L_0x0073:
            r3.A00 = r0     // Catch:{ all -> 0x00e3 }
        L_0x0075:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.C63532tG.A01     // Catch:{ all -> 0x00e3 }
            int r4 = r2.get(r3)     // Catch:{ all -> 0x00e3 }
            int r1 = r4 + 1
            r2.set(r3, r1)     // Catch:{ all -> 0x00e3 }
            r0[r4] = r11     // Catch:{ all -> 0x00e3 }
            r11.A00 = r4     // Catch:{ all -> 0x00e3 }
            goto L_0x009e
        L_0x0085:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = X.C63532tG.A01     // Catch:{ all -> 0x00e3 }
            int r2 = r4.get(r3)     // Catch:{ all -> 0x00e3 }
            int r1 = r0.length     // Catch:{ all -> 0x00e3 }
            if (r2 < r1) goto L_0x0075
            int r1 = r4.get(r3)     // Catch:{ all -> 0x00e3 }
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x00e3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00e3 }
            X.3KX[] r0 = (X.AnonymousClass3KX[]) r0     // Catch:{ all -> 0x00e3 }
            goto L_0x0073
        L_0x009e:
            if (r4 <= 0) goto L_0x00b4
            X.3KX[] r2 = r3.A00     // Catch:{ all -> 0x00e3 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x00e3 }
            int r0 = r4 + -1
            int r1 = r0 / 2
            int r0 = X.C63532tG.A00(r2, r1, r4)     // Catch:{ all -> 0x00e3 }
            if (r0 <= 0) goto L_0x00b4
            X.C63532tG.A01(r3, r4, r1)     // Catch:{ all -> 0x00e3 }
            r4 = r1
            goto L_0x009e
        L_0x00b4:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r11)
            java.lang.Object r2 = r5.get(r10)
            X.2tG r2 = (X.C63532tG) r2
            if (r2 == 0) goto L_0x00ed
            monitor-enter(r2)
            X.3KX[] r1 = r2.A00     // Catch:{ all -> 0x00d8 }
            r0 = 0
            if (r1 == 0) goto L_0x00c7
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00d8 }
        L_0x00c7:
            monitor-exit(r2)
            if (r0 != r11) goto L_0x00ed
            java.lang.Thread r1 = r10.A0J()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L_0x00ed
            java.util.concurrent.locks.LockSupport.unpark(r1)
            return
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00db:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x00e9:
            monitor-exit(r11)
        L_0x00ea:
            r10.A0K(r11, r12)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IL.A0M(X.3Cy, long):void");
    }

    public boolean A0N() {
        boolean z;
        Object obj;
        AnonymousClass1JD r0 = this.A01;
        if (r0 != null) {
            z = r0.isEmpty();
        } else {
            z = true;
        }
        if (z && ((obj = A01.get(this)) == null || C63532tG.A01.get(obj) == 0)) {
            Object obj2 = A02.get(this);
            if (obj2 == null) {
                return true;
            }
            if (obj2 instanceof AnonymousClass1IB) {
                long j = AnonymousClass1IB.A05.get(obj2);
                if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            } else if (obj2 == AnonymousClass2WX.A00) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 < 4611686018427387903L) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1OI Bdz(java.lang.Runnable r6, X.C18560wh r7, long r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass1IM
            if (r0 == 0) goto L_0x0033
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r8
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
        L_0x0020:
            long r3 = java.lang.System.nanoTime()
            long r1 = r1 + r3
            X.3JG r0 = new X.3JG
            r0.<init>(r6, r1)
            r5.A0M(r0, r3)
        L_0x002d:
            X.1OI r0 = (X.AnonymousClass1OI) r0
            return r0
        L_0x0030:
            X.1OK r0 = X.AnonymousClass1OK.A00
            goto L_0x002d
        L_0x0033:
            X.1Hp r0 = X.AnonymousClass1II.A00
            X.1OI r0 = r0.Bdz(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IL.Bdz(java.lang.Runnable, X.0wh, long):X.1OI");
    }

    public void CGy(C31761g5 r7, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j < 9223372036854L) {
                j2 = SearchActionVerificationClientService.MS_TO_NS * j;
                if (j2 >= 4611686018427387903L) {
                    return;
                }
            } else {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        AnonymousClass3JH r3 = new AnonymousClass3JH(r7, this, j2 + nanoTime);
        A0M(r3, nanoTime);
        C60682oR.A01(new AnonymousClass3E0(r3), r7);
    }

    public void A0L(Runnable runnable) {
        if (A00(runnable, this)) {
            Thread A0J = A0J();
            if (Thread.currentThread() != A0J) {
                LockSupport.unpark(A0J);
                return;
            }
            return;
        }
        AnonymousClass1IM.A00.A0L(runnable);
    }
}
