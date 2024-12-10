package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1G7  reason: invalid class name */
public final class AnonymousClass1G7 extends C23411Fy implements AnonymousClass1G4, AnonymousClass1G5, AnonymousClass1G6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass1G7.class, Object.class, "_state$volatile");
    public int A00;
    public volatile /* synthetic */ Object _state$volatile;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r6 = (X.C27611Wt[]) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r6 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r5 = r6.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r4 >= r5) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r0 = r6[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r3 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r1 = X.C34071js.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r2 == r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r0 = X.C34071js.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (r2 != r0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (X.AnonymousClass00N.A00(r2, r1, r3) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        if (X.AnonymousClass00N.A00(r2, r0, r3) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
        ((X.C31781g7) r2).resumeWith(X.C27621Wu.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r0 != r7) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        r6 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0064, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r0 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = A01     // Catch:{ all -> 0x0070 }
            java.lang.Object r2 = r3.get(r9)     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r10 == 0) goto L_0x0012
            boolean r0 = X.C18070vi.A18(r2, r10)     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r9)
            return r1
        L_0x0012:
            boolean r0 = X.C18070vi.A18(r2, r11)     // Catch:{ all -> 0x0070 }
            r8 = 1
            if (r0 != 0) goto L_0x006e
            r3.set(r9, r11)     // Catch:{ all -> 0x0070 }
            int r1 = r9.A00     // Catch:{ all -> 0x0070 }
            r0 = r1 & 1
            if (r0 != 0) goto L_0x006a
            int r7 = r1 + 1
            r9.A00 = r7     // Catch:{ all -> 0x0070 }
            X.1Ws[] r6 = r9.A01     // Catch:{ all -> 0x0070 }
            monitor-exit(r9)
        L_0x0029:
            X.1Wt[] r6 = (X.C27611Wt[]) r6
            if (r6 == 0) goto L_0x005c
            int r5 = r6.length
            r4 = 0
        L_0x002f:
            if (r4 >= r5) goto L_0x005c
            r0 = r6[r4]
            if (r0 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReference r3 = r0.A00
        L_0x0037:
            java.lang.Object r2 = r3.get()
            if (r2 == 0) goto L_0x004b
            X.1I8 r1 = X.C34071js.A01
            if (r2 == r1) goto L_0x004b
            X.1I8 r0 = X.C34071js.A00
            if (r2 != r0) goto L_0x004e
            boolean r0 = X.AnonymousClass00N.A00(r2, r1, r3)
            if (r0 == 0) goto L_0x0037
        L_0x004b:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x004e:
            boolean r0 = X.AnonymousClass00N.A00(r2, r0, r3)
            if (r0 == 0) goto L_0x0037
            X.1g7 r2 = (X.C31781g7) r2
            X.1Wu r0 = X.C27621Wu.A00
            r2.resumeWith(r0)
            goto L_0x004b
        L_0x005c:
            monitor-enter(r9)
            int r0 = r9.A00     // Catch:{ all -> 0x0070 }
            if (r0 != r7) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            X.1Ws[] r6 = r9.A01     // Catch:{ all -> 0x0070 }
            monitor-exit(r9)
            r7 = r0
            goto L_0x0029
        L_0x0067:
            int r0 = r7 + 1
            goto L_0x006c
        L_0x006a:
            int r0 = r1 + 2
        L_0x006c:
            r9.A00 = r0     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r9)
            return r8
        L_0x0070:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G7.A00(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r5 != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return new X.AnonymousClass5WR(r3, r4, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0007, code lost:
        if (r5 == -3) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (r4 == X.C25691Pg.SUSPEND) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C23421Fz BLm(X.C18560wh r3, X.C25691Pg r4, int r5) {
        /*
            r2 = this;
            r1 = r2
            if (r5 >= 0) goto L_0x000e
            r0 = -2
            if (r5 == r0) goto L_0x000e
            r0 = -3
            if (r5 != r0) goto L_0x0014
        L_0x0009:
            X.1Pg r0 = X.C25691Pg.SUSPEND
            if (r4 != r0) goto L_0x0014
        L_0x000d:
            return r1
        L_0x000e:
            X.1Pg r0 = X.C25691Pg.DROP_OLDEST
            if (r4 == r0) goto L_0x000d
            if (r5 == 0) goto L_0x0009
        L_0x0014:
            X.5WP r1 = new X.5WP
            r1.<init>(r3, r4, r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G7.BLm(X.0wh, X.1Pg, int):X.1Fz");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010f, code lost:
        if (r1.A0C() == r8) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1 A[ADDED_TO_REGION, Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1 A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5 A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BFC(X.C30391dr r16, X.AnonymousClass1G2 r17) {
        /*
            r15 = this;
            r10 = r17
            r3 = r16
            boolean r0 = r3 instanceof X.C71373Fa
            if (r0 == 0) goto L_0x003b
            r9 = r3
            X.3Fa r9 = (X.C71373Fa) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r9.label = r2
        L_0x0016:
            java.lang.Object r11 = r9.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r14 = 0
            r7 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 == r1) goto L_0x0060
            if (r0 == r6) goto L_0x004d
            if (r0 != r7) goto L_0x0045
            java.lang.Object r5 = r9.L$4
            java.lang.Object r4 = r9.L$3
            X.1OB r4 = (X.AnonymousClass1OB) r4
            java.lang.Object r3 = r9.L$2
            X.1Wt r3 = (X.C27611Wt) r3
            java.lang.Object r10 = r9.L$1
            X.1G2 r10 = (X.AnonymousClass1G2) r10
            java.lang.Object r2 = r9.L$0
            X.1Fy r2 = (X.C23411Fy) r2
            goto L_0x0041
        L_0x003b:
            X.3Fa r9 = new X.3Fa
            r9.<init>(r3, r15)
            goto L_0x0016
        L_0x0041:
            X.C30691eM.A01(r11)     // Catch:{ all -> 0x0112 }
            goto L_0x009e
        L_0x0045:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x004d:
            java.lang.Object r5 = r9.L$4
            java.lang.Object r4 = r9.L$3
            X.1OB r4 = (X.AnonymousClass1OB) r4
            java.lang.Object r3 = r9.L$2
            X.1Wt r3 = (X.C27611Wt) r3
            java.lang.Object r10 = r9.L$1
            X.1G2 r10 = (X.AnonymousClass1G2) r10
            java.lang.Object r2 = r9.L$0
            X.1Fy r2 = (X.C23411Fy) r2
            goto L_0x00d3
        L_0x0060:
            java.lang.Object r3 = r9.L$2
            X.1Wt r3 = (X.C27611Wt) r3
            java.lang.Object r10 = r9.L$1
            X.1G2 r10 = (X.AnonymousClass1G2) r10
            java.lang.Object r2 = r9.L$0
            X.1Fy r2 = (X.C23411Fy) r2
            goto L_0x008e
        L_0x006d:
            X.C30691eM.A01(r11)
            X.1Ws r3 = r15.A08()
            X.1Wt r3 = (X.C27611Wt) r3
            boolean r0 = r10 instanceof X.C27187DXx     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x008c
            r0 = r10
            X.DXx r0 = (X.C27187DXx) r0     // Catch:{ all -> 0x0114 }
            r9.L$0 = r15     // Catch:{ all -> 0x0114 }
            r9.L$1 = r10     // Catch:{ all -> 0x0114 }
            r9.L$2 = r3     // Catch:{ all -> 0x0114 }
            r9.label = r1     // Catch:{ all -> 0x0114 }
            java.lang.Object r0 = r0.A00(r9)     // Catch:{ all -> 0x0114 }
            if (r0 != r8) goto L_0x008c
            return r8
        L_0x008c:
            r2 = r15
            goto L_0x0091
        L_0x008e:
            X.C30691eM.A01(r11)     // Catch:{ all -> 0x0112 }
        L_0x0091:
            X.0wh r1 = r9.getContext()     // Catch:{ all -> 0x0112 }
            X.1OU r0 = X.AnonymousClass1OB.A00     // Catch:{ all -> 0x0112 }
            X.0wi r4 = r1.get(r0)     // Catch:{ all -> 0x0112 }
            X.1OB r4 = (X.AnonymousClass1OB) r4     // Catch:{ all -> 0x0112 }
            r5 = r14
        L_0x009e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x0112 }
            java.lang.Object r11 = r0.get(r2)     // Catch:{ all -> 0x0112 }
            if (r4 == 0) goto L_0x00b1
            boolean r0 = r4.Be2()     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x00b1
            java.util.concurrent.CancellationException r0 = r4.BOI()     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x00b1:
            if (r5 == 0) goto L_0x00b9
            boolean r0 = r5.equals(r11)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x00d6
        L_0x00b9:
            X.1I8 r1 = X.AnonymousClass4IV.A01     // Catch:{ all -> 0x0112 }
            r0 = r11
            if (r11 != r1) goto L_0x00bf
            r0 = r14
        L_0x00bf:
            r9.L$0 = r2     // Catch:{ all -> 0x0112 }
            r9.L$1 = r10     // Catch:{ all -> 0x0112 }
            r9.L$2 = r3     // Catch:{ all -> 0x0112 }
            r9.L$3 = r4     // Catch:{ all -> 0x0112 }
            r9.L$4 = r11     // Catch:{ all -> 0x0112 }
            r9.label = r6     // Catch:{ all -> 0x0112 }
            java.lang.Object r0 = r10.BJt(r0, r9)     // Catch:{ all -> 0x0112 }
            if (r0 == r8) goto L_0x0111
            r5 = r11
            goto L_0x00d6
        L_0x00d3:
            X.C30691eM.A01(r11)     // Catch:{ all -> 0x0112 }
        L_0x00d6:
            java.util.concurrent.atomic.AtomicReference r13 = r3.A00     // Catch:{ all -> 0x0112 }
            X.1I8 r12 = X.C34071js.A00     // Catch:{ all -> 0x0112 }
            java.lang.Object r1 = r13.getAndSet(r12)     // Catch:{ all -> 0x0112 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x0112 }
            X.1I8 r0 = X.C34071js.A01     // Catch:{ all -> 0x0112 }
            if (r1 == r0) goto L_0x009e
            r9.L$0 = r2     // Catch:{ all -> 0x0112 }
            r9.L$1 = r10     // Catch:{ all -> 0x0112 }
            r9.L$2 = r3     // Catch:{ all -> 0x0112 }
            r9.L$3 = r4     // Catch:{ all -> 0x0112 }
            r9.L$4 = r5     // Catch:{ all -> 0x0112 }
            r9.label = r7     // Catch:{ all -> 0x0112 }
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C31781g7.A02     // Catch:{ all -> 0x0112 }
            X.1dr r11 = X.C30581eB.A02(r9)     // Catch:{ all -> 0x0112 }
            r0 = 1
            X.1g7 r1 = new X.1g7     // Catch:{ all -> 0x0112 }
            r1.<init>(r0, r11)     // Catch:{ all -> 0x0112 }
            r1.A0F()     // Catch:{ all -> 0x0112 }
            boolean r0 = X.AnonymousClass00N.A00(r12, r1, r13)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x010b
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0112 }
            r1.resumeWith(r0)     // Catch:{ all -> 0x0112 }
        L_0x010b:
            java.lang.Object r0 = r1.A0C()     // Catch:{ all -> 0x0112 }
            if (r0 != r8) goto L_0x009e
        L_0x0111:
            return r8
        L_0x0112:
            r1 = move-exception
            goto L_0x0116
        L_0x0114:
            r1 = move-exception
            r2 = r15
        L_0x0116:
            r2.A09(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G7.BFC(X.1dr, X.1G2):java.lang.Object");
    }

    public boolean BFK(Object obj, Object obj2) {
        if (obj == null) {
            obj = AnonymousClass4IV.A01;
        }
        if (obj2 == null) {
            obj2 = AnonymousClass4IV.A01;
        }
        return A00(obj, obj2);
    }

    public void CFl() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public Object getValue() {
        AnonymousClass1I8 r1 = AnonymousClass4IV.A01;
        Object obj = A01.get(this);
        if (obj == r1) {
            return null;
        }
        return obj;
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = AnonymousClass4IV.A01;
        }
        A00((Object) null, obj);
    }

    public AnonymousClass1G7(Object obj) {
        this._state$volatile = obj;
    }

    public Object BJt(Object obj, C30391dr r3) {
        setValue(obj);
        return C27621Wu.A00;
    }

    public List BY9() {
        List singletonList = Collections.singletonList(getValue());
        C18070vi.A0X(singletonList);
        return singletonList;
    }

    public boolean CPw(Object obj) {
        setValue(obj);
        return true;
    }
}
