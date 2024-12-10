package X;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.1I5  reason: invalid class name */
public final class AnonymousClass1I5 implements Executor, Closeable {
    public static final AnonymousClass1I8 A07 = new AnonymousClass1I8("NOT_IN_STACK");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A08;
    public static final /* synthetic */ AtomicLongFieldUpdater A09;
    public static final /* synthetic */ AtomicLongFieldUpdater A0A;
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final AnonymousClass1IC A04;
    public final AnonymousClass1IA A05;
    public final AnonymousClass1IA A06;
    public volatile /* synthetic */ int _isTerminated$volatile;
    public volatile /* synthetic */ long controlState$volatile;
    public volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Class<AnonymousClass1I5> cls = AnonymousClass1I5.class;
        A0A = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        A09 = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        A08 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00() {
        /*
            r11 = this;
            X.1IC r6 = r11.A04
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = A08     // Catch:{ all -> 0x006b }
            int r0 = r0.get(r11)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r6)
            r0 = -1
            return r0
        L_0x000e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = A09     // Catch:{ all -> 0x006b }
            long r1 = r8.get(r11)     // Catch:{ all -> 0x006b }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r9 = r1 & r3
            int r5 = (int) r9     // Catch:{ all -> 0x006b }
            r9 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r9
            r0 = 21
            long r1 = r1 >> r0
            int r0 = (int) r1     // Catch:{ all -> 0x006b }
            int r7 = r5 - r0
            r1 = 0
            if (r7 >= r1) goto L_0x002a
            r7 = 0
        L_0x002a:
            int r0 = r11.A00     // Catch:{ all -> 0x006b }
            if (r7 >= r0) goto L_0x0069
            int r0 = r11.A01     // Catch:{ all -> 0x006b }
            if (r5 >= r0) goto L_0x0069
            long r1 = r8.get(r11)     // Catch:{ all -> 0x006b }
            long r1 = r1 & r3
            int r0 = (int) r1     // Catch:{ all -> 0x006b }
            int r5 = r0 + 1
            if (r5 <= 0) goto L_0x0061
            java.lang.Object r0 = r6.A00(r5)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0061
            X.3Eb r2 = new X.3Eb     // Catch:{ all -> 0x006b }
            r2.<init>(r11, r5)     // Catch:{ all -> 0x006b }
            r6.A01(r5, r2)     // Catch:{ all -> 0x006b }
            long r0 = r8.incrementAndGet(r11)     // Catch:{ all -> 0x006b }
            long r3 = r3 & r0
            int r0 = (int) r3     // Catch:{ all -> 0x006b }
            if (r5 != r0) goto L_0x0059
            int r0 = r7 + 1
            monitor-exit(r6)
            r2.start()
            return r0
        L_0x0059:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006b }
            r1.<init>(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0068
        L_0x0061:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006b }
            r1.<init>(r0)     // Catch:{ all -> 0x006b }
        L_0x0068:
            throw r1     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r6)
            return r1
        L_0x006b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.A00():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r6.compareAndSet(r7, r8, ((long) r0) | r3) == false) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r5.nextParkedWorker = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.AnonymousClass1I5 r12) {
        /*
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = A0A
        L_0x0002:
            r7 = r12
            long r8 = r6.get(r12)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r1 = (int) r2
            X.1IC r0 = r12.A04
            java.lang.Object r5 = r0.A00(r1)
            X.3Eb r5 = (X.C71163Eb) r5
            if (r5 != 0) goto L_0x0029
            r5 = 0
        L_0x0017:
            r2 = 0
            if (r5 != 0) goto L_0x001b
            return r2
        L_0x001b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C71163Eb.A08
            r0 = -1
            boolean r0 = r1.compareAndSet(r5, r0, r2)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r0 = 1
            return r0
        L_0x0029:
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r3 = r3 + r8
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r3 = r3 & r0
            r2 = r5
        L_0x0032:
            java.lang.Object r2 = r2.nextParkedWorker
            X.1I8 r1 = A07
            if (r2 == r1) goto L_0x0002
            if (r2 != 0) goto L_0x0046
            r0 = 0
        L_0x003b:
            long r10 = (long) r0
            long r10 = r10 | r3
            boolean r0 = r6.compareAndSet(r7, r8, r10)
            if (r0 == 0) goto L_0x0002
            r5.nextParkedWorker = r1
            goto L_0x0017
        L_0x0046:
            X.3Eb r2 = (X.C71163Eb) r2
            int r0 = r2.indexInArray
            if (r0 == 0) goto L_0x0032
            if (r0 < 0) goto L_0x0002
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.A02(X.1I5):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Runnable r12, X.AnonymousClass1I4 r13, boolean r14) {
        /*
            r11 = this;
            int r0 = X.AnonymousClass1I0.A01
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r12 instanceof X.C30591eC
            if (r2 == 0) goto L_0x00ee
            r5 = r12
            X.1eC r5 = (X.C30591eC) r5
            r5.A00 = r0
            r5.A01 = r13
        L_0x0011:
            X.1I4 r0 = r5.A01
            int r1 = r0.A00
            r10 = 0
            r0 = 1
            if (r1 != r0) goto L_0x00e9
            r9 = 1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = A09
            r0 = 2097152(0x200000, double:1.0361308E-317)
            long r2 = r2.addAndGet(r11, r0)
        L_0x0023:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            boolean r0 = r1 instanceof X.C71163Eb
            r7 = 0
            if (r0 == 0) goto L_0x004b
            X.3Eb r1 = (X.C71163Eb) r1
            if (r1 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C71163Eb.A08
            X.1I5 r0 = r1.A07
            boolean r0 = X.C18070vi.A18(r0, r11)
            if (r0 == 0) goto L_0x004b
            r7 = r1
            java.lang.Integer r1 = r1.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 == r0) goto L_0x004b
            X.1I4 r0 = r5.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0076
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0076
        L_0x004b:
            X.1I4 r0 = r5.A01
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0073
            X.1IA r0 = r11.A05
        L_0x0054:
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r11.A03
            r1.append(r0)
            java.lang.String r0 = " was terminated"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            r0.<init>(r1)
            throw r0
        L_0x0073:
            X.1IA r0 = r11.A06
            goto L_0x0054
        L_0x0076:
            r0 = 1
            r7.A04 = r0
            X.2sX r6 = r7.A06
            if (r14 != 0) goto L_0x00ae
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C63122sX.A04
            java.lang.Object r5 = r0.getAndSet(r6, r5)
            X.1eC r5 = (X.C30591eC) r5
            if (r5 != 0) goto L_0x00ae
        L_0x0087:
            if (r9 == 0) goto L_0x009b
            if (r10 != 0) goto L_0x009a
            boolean r0 = A02(r11)
            if (r0 != 0) goto L_0x009a
            boolean r0 = A03(r11, r2)
        L_0x0095:
            if (r0 != 0) goto L_0x009a
            A02(r11)
        L_0x009a:
            return
        L_0x009b:
            if (r10 != 0) goto L_0x009a
            boolean r0 = A02(r11)
            if (r0 != 0) goto L_0x009a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A09
            long r0 = r0.get(r11)
            boolean r0 = A03(r11, r0)
            goto L_0x0095
        L_0x00ae:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = X.C63122sX.A03
            int r1 = r8.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C63122sX.A02
            int r0 = r0.get(r6)
            int r1 = r1 - r0
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x004b
            X.1I4 r0 = r5.A01
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x00cb
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C63122sX.A01
            r0.incrementAndGet(r6)
        L_0x00cb:
            int r0 = r8.get(r6)
            r4 = r0 & 127(0x7f, float:1.78E-43)
        L_0x00d1:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.A00
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x00dd
            java.lang.Thread.yield()
            goto L_0x00d1
        L_0x00dd:
            r1.lazySet(r4, r5)
            r8.incrementAndGet(r6)
        L_0x00e3:
            if (r14 == 0) goto L_0x0087
            if (r7 == 0) goto L_0x0087
            r10 = 1
            goto L_0x0087
        L_0x00e9:
            r9 = 0
            r2 = 0
            goto L_0x0023
        L_0x00ee:
            X.3JY r5 = new X.3JY
            r5.<init>(r12, r13, r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.A04(java.lang.Runnable, X.1I4, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C71163Eb r10, int r11, int r12) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = A0A
        L_0x0002:
            r4 = r9
            long r5 = r3.get(r9)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r2 = (int) r0
            r7 = 2097152(0x200000, double:1.0361308E-317)
            long r7 = r7 + r5
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r7 = r7 & r0
            if (r2 != r11) goto L_0x0033
            if (r12 != 0) goto L_0x002b
            r1 = r10
        L_0x0019:
            java.lang.Object r1 = r1.nextParkedWorker
            X.1I8 r0 = A07
            if (r1 == r0) goto L_0x0002
            if (r1 != 0) goto L_0x002d
            r2 = 0
        L_0x0022:
            long r0 = (long) r2
            long r7 = r7 | r0
            boolean r0 = r3.compareAndSet(r4, r5, r7)
            if (r0 == 0) goto L_0x0002
            return
        L_0x002b:
            r2 = r12
            goto L_0x0033
        L_0x002d:
            X.3Eb r1 = (X.C71163Eb) r1
            int r2 = r1.indexInArray
            if (r2 == 0) goto L_0x0019
        L_0x0033:
            if (r2 < 0) goto L_0x0002
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.A05(X.3Eb, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r5.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        r2 = X.C63122sX.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r12 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = A08
            r2 = 0
            r7 = 1
            boolean r2 = r3.compareAndSet(r12, r2, r7)
            if (r2 == 0) goto L_0x00d2
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r2 = r3 instanceof X.C71163Eb
            r6 = 0
            if (r2 == 0) goto L_0x0024
            X.3Eb r3 = (X.C71163Eb) r3
            if (r3 == 0) goto L_0x0024
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.C71163Eb.A08
            X.1I5 r2 = r3.A07
            boolean r2 = X.C18070vi.A18(r2, r12)
            if (r2 == 0) goto L_0x0024
            r6 = r3
        L_0x0024:
            X.1IC r9 = r12.A04
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = A09     // Catch:{ all -> 0x00cf }
            long r2 = r4.get(r12)     // Catch:{ all -> 0x00cf }
            r10 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r10
            int r10 = (int) r2
            monitor-exit(r9)
            if (r7 > r10) goto L_0x006b
            r11 = 1
        L_0x0036:
            java.lang.Object r5 = r9.A00(r11)
            X.C18070vi.A0b(r5)
            X.3Eb r5 = (X.C71163Eb) r5
            if (r5 == r6) goto L_0x0066
        L_0x0041:
            java.lang.Thread$State r3 = r5.getState()
            java.lang.Thread$State r2 = java.lang.Thread.State.TERMINATED
            if (r3 == r2) goto L_0x0050
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r5.join(r0)
            goto L_0x0041
        L_0x0050:
            X.2sX r8 = r5.A06
            X.1IA r5 = r12.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C63122sX.A04
            r2 = 0
            java.lang.Object r2 = r3.getAndSet(r8, r2)
            if (r2 == 0) goto L_0x0060
        L_0x005d:
            r5.A02(r2)
        L_0x0060:
            X.1eC r2 = X.C63122sX.A00(r8)
            if (r2 != 0) goto L_0x005d
        L_0x0066:
            if (r11 == r10) goto L_0x006b
            int r11 = r11 + 1
            goto L_0x0036
        L_0x006b:
            X.1IA r5 = r12.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = X.AnonymousClass1I9.A00
        L_0x006f:
            java.lang.Object r2 = r8.get(r5)
            X.1IB r2 = (X.AnonymousClass1IB) r2
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0095
            X.1IA r3 = r12.A06
        L_0x007d:
            java.lang.Object r2 = r8.get(r3)
            X.1IB r2 = (X.AnonymousClass1IB) r2
            boolean r0 = r2.A04()
            if (r0 != 0) goto L_0x00a1
            long r0 = X.AnonymousClass1IB.A00(r2)
            X.1IB r0 = X.AnonymousClass1IB.A01(r2, r0)
            X.C30561e9.A00(r3, r2, r0, r8)
            goto L_0x007d
        L_0x0095:
            long r0 = X.AnonymousClass1IB.A00(r2)
            X.1IB r0 = X.AnonymousClass1IB.A01(r2, r0)
            X.C30561e9.A00(r5, r2, r0, r8)
            goto L_0x006f
        L_0x00a1:
            if (r6 == 0) goto L_0x00a9
            X.1eC r0 = r6.A02(r7)
            if (r0 != 0) goto L_0x00cb
        L_0x00a9:
            java.lang.Object r0 = r3.A01()
            X.1eC r0 = (X.C30591eC) r0
            if (r0 != 0) goto L_0x00cb
            java.lang.Object r0 = r5.A01()
            X.1eC r0 = (X.C30591eC) r0
            if (r0 != 0) goto L_0x00cb
            if (r6 == 0) goto L_0x00c0
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r6.A04(r0)
        L_0x00c0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = A0A
            r0 = 0
            r2.set(r12, r0)
            r4.set(r12, r0)
            return
        L_0x00cb:
            A01(r0)
            goto L_0x00a1
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I5.close():void");
    }

    public void execute(Runnable runnable) {
        A04(runnable, AnonymousClass1I0.A07, false);
    }

    public String toString() {
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1IC r11 = this.A04;
        int length = r11.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C71163Eb r3 = (C71163Eb) r11.A00(i6);
            if (r3 != null) {
                C63122sX r13 = r3.A06;
                Object obj = C63122sX.A04.get(r13);
                int i7 = C63122sX.A03.get(r13) - C63122sX.A02.get(r13);
                if (obj != null) {
                    i7++;
                }
                int intValue = r3.A03.intValue();
                if (intValue != 2) {
                    if (intValue == 1) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(i7);
                        c = 'b';
                    } else if (intValue == 0) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(i7);
                        c = 'c';
                    } else if (intValue == 3) {
                        i4++;
                        if (i7 > 0) {
                            sb = new StringBuilder();
                            sb.append(i7);
                            c = 'd';
                        }
                    } else if (intValue == 4) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
        }
        long j = A09.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A03);
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[Pool Size {core = ");
        int i8 = this.A00;
        sb2.append(i8);
        sb2.append(", max = ");
        sb2.append(this.A01);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i);
        sb2.append(", blocking = ");
        sb2.append(i2);
        sb2.append(", parked = ");
        sb2.append(i3);
        sb2.append(", dormant = ");
        sb2.append(i4);
        sb2.append(", terminated = ");
        sb2.append(i5);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.A06.A00());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.A05.A00());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i8 - ((int) ((9223367638808264704L & j) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.1IC, java.lang.Object] */
    public AnonymousClass1I5(int i, int i2, String str, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = str;
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Max pool size ");
            sb2.append(i2);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > 2097150) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Max pool size ");
            sb3.append(i2);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString());
        } else if (j > 0) {
            this.A06 = new AnonymousClass1IA();
            this.A05 = new AnonymousClass1IA();
            ? obj = new Object();
            obj.array = new AtomicReferenceArray((i + 1) * 2);
            this.A04 = obj;
            this.controlState$volatile = ((long) i) << 42;
            this._isTerminated$volatile = 0;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Idle worker keep alive time ");
            sb4.append(j);
            sb4.append(" must be positive");
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static final void A01(C30591eC r2) {
        try {
            r2.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public static final boolean A03(AnonymousClass1I5 r5, long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = r5.A00;
        if (i < i2) {
            int A002 = r5.A00();
            if (A002 == 1) {
                if (i2 > 1) {
                    r5.A00();
                }
                return true;
            } else if (A002 > 0) {
                return true;
            }
        }
        return false;
    }
}
