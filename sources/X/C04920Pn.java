package X;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Pn  reason: invalid class name and case insensitive filesystem */
public final class C04920Pn {
    public C16320s4 A00;
    public C04680Oi A01;
    public boolean A02;
    public boolean A03;
    public long A04 = -1;
    public final C06970a9 A05 = C06970a9.A02(new C04680Oi[16]);
    public final AtomicReference A06 = new AtomicReference((Object) null);
    public final C22821Di A07;
    public final C22821Di A08 = new C10800iv(this);
    public final AnonymousClass1OS A09 = new C12700mB(this);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C04680Oi A00(X.C22821Di r7) {
        /*
            r6 = this;
            X.0a9 r5 = r6.A05
            int r4 = r5.A00
            if (r4 <= 0) goto L_0x0018
            java.lang.Object[] r3 = r5.A01
            r2 = 0
        L_0x0009:
            r1 = r3[r2]
            r0 = r1
            X.0Oi r0 = (X.C04680Oi) r0
            X.1Di r0 = r0.A02()
            if (r0 == r7) goto L_0x0019
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0009
        L_0x0018:
            r1 = 0
        L_0x0019:
            X.0Oi r1 = (X.C04680Oi) r1
            if (r1 != 0) goto L_0x002f
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            X.C18070vi.A0z(r7, r0)
            r0 = 1
            X.C41681wt.A04(r7, r0)
            X.0Oi r0 = new X.0Oi
            r0.<init>(r7)
            r5.A0F(r0)
            return r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04920Pn.A00(X.1Di):X.0Oi");
    }

    public static final void A01(C04920Pn r2) {
        r2.A07.invoke(new C08160ee(r2));
    }

    public static final void A02(C04920Pn r4, Set set) {
        AtomicReference atomicReference;
        Object obj;
        Object A0k;
        do {
            atomicReference = r4.A06;
            obj = atomicReference.get();
            if (obj == null) {
                A0k = set;
            } else if (obj instanceof Set) {
                Set[] setArr = new Set[2];
                AnonymousClass001.A1Q(obj, set, setArr);
                A0k = AnonymousClass1ZU.A08(setArr);
            } else if (obj instanceof List) {
                A0k = C29431cG.A0k(AnonymousClass1ZT.A00(set), (Collection) obj);
            } else {
                C05020Qb.A06("Unexpected notification");
                throw null;
            }
        } while (!AnonymousClass00N.A00(obj, A0k, atomicReference));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r0 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C04920Pn r10) {
        /*
            X.0a9 r5 = r10.A05
            monitor-enter(r5)
            boolean r1 = r10.A03     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            r0 = 0
            if (r1 == 0) goto L_0x000a
            return r0
        L_0x000a:
            r9 = 0
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference r8 = r10.A06
            java.lang.Object r7 = r8.get()
            r6 = 0
            if (r7 == 0) goto L_0x0070
            boolean r0 = r7 instanceof java.util.Set
            if (r0 == 0) goto L_0x0040
            r4 = r7
            java.util.Set r4 = (java.util.Set) r4
        L_0x001b:
            boolean r0 = X.AnonymousClass00N.A00(r7, r6, r8)
            if (r0 == 0) goto L_0x000b
            if (r4 == 0) goto L_0x0070
            monitor-enter(r5)
            int r3 = r5.A00     // Catch:{ all -> 0x0071 }
            if (r3 <= 0) goto L_0x003e
            java.lang.Object[] r2 = r5.A01     // Catch:{ all -> 0x0071 }
            r1 = 0
        L_0x002b:
            r0 = r2[r1]     // Catch:{ all -> 0x0071 }
            X.0Oi r0 = (X.C04680Oi) r0     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.A07(r4)     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0039
            r0 = r9
            r9 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r9 = 1
        L_0x003a:
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x002b
        L_0x003e:
            monitor-exit(r5)
            goto L_0x000b
        L_0x0040:
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L_0x006a
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r4 = r3.get(r0)
            java.util.Set r4 = (java.util.Set) r4
            int r0 = r3.size()
            r2 = 1
            r1 = 2
            if (r0 != r1) goto L_0x005b
            java.lang.Object r6 = r3.get(r2)
            goto L_0x001b
        L_0x005b:
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x001b
            int r0 = r3.size()
            java.util.List r6 = r3.subList(r2, r0)
            goto L_0x001b
        L_0x006a:
            java.lang.String r0 = "Unexpected notification"
            X.C05020Qb.A06(r0)
            throw r6
        L_0x0070:
            return r9
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04920Pn.A03(X.0Pn):boolean");
    }

    public final void A04() {
        C06970a9 r5 = this.A05;
        synchronized (r5) {
            int i = r5.A00;
            if (i > 0) {
                Object[] objArr = r5.A01;
                int i2 = 0;
                do {
                    C04680Oi r1 = (C04680Oi) objArr[i2];
                    r1.A06.A00.A05();
                    r1.A04.A05();
                    r1.A05.A00.A05();
                    r1.A07.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    public final void A05() {
        this.A00 = C04790Ov.A01(this.A09);
    }

    public final void A06(Object obj, C18090vk r11, C22821Di r12) {
        C04680Oi A002;
        synchronized (this.A05) {
            A002 = A00(r12);
        }
        boolean z = this.A02;
        C04680Oi r5 = this.A01;
        long j = this.A04;
        if (j != -1) {
            Thread currentThread = Thread.currentThread();
            if (j != currentThread.getId()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
                A10.append(j);
                A10.append("), currentThread={id=");
                A10.append(currentThread.getId());
                A10.append(", name=");
                A10.append(currentThread.getName());
                throw AnonymousClass001.A12("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.", A10);
            }
        }
        try {
            this.A02 = false;
            this.A01 = A002;
            this.A04 = Thread.currentThread().getId();
            A002.A05(obj, r11, this.A08);
        } finally {
            this.A01 = r5;
            this.A02 = z;
            this.A04 = j;
        }
    }

    public final void A07(C22821Di r8) {
        C06970a9 r6 = this.A05;
        synchronized (r6) {
            int i = r6.A00;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                C04680Oi r0 = (C04680Oi) r6.A01[i3];
                r0.A06(r8);
                if (r0.A04.A01 == 0) {
                    i2++;
                } else if (i2 > 0) {
                    Object[] objArr = r6.A01;
                    objArr[i3 - i2] = objArr[i3];
                }
            }
            int i4 = i - i2;
            C200310o.A06(r6.A01, i4, i);
            r6.A00 = i4;
        }
    }

    public C04920Pn(C22821Di r3) {
        this.A07 = r3;
    }
}
