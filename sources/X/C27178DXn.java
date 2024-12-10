package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DXn  reason: case insensitive filesystem */
public class C27178DXn implements C108485bm {
    public static final /* synthetic */ AtomicLongFieldUpdater A01;
    public static final /* synthetic */ AtomicLongFieldUpdater A02;
    public static final /* synthetic */ AtomicLongFieldUpdater A03;
    public static final /* synthetic */ AtomicLongFieldUpdater A04;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A07;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A08;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A09;
    public final int A00;
    public volatile /* synthetic */ Object _closeCause$volatile;
    public volatile /* synthetic */ long bufferEnd$volatile;
    public volatile /* synthetic */ Object bufferEndSegment$volatile;
    public volatile /* synthetic */ Object closeHandler$volatile;
    public volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public volatile /* synthetic */ Object receiveSegment$volatile;
    public volatile /* synthetic */ long receivers$volatile;
    public volatile /* synthetic */ Object sendSegment$volatile;
    public volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Class<C27178DXn> cls = C27178DXn.class;
        A04 = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        A03 = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        A01 = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        A02 = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        A09 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        A08 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        A06 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        A07 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
    }

    public C27178DXn(int i) {
        long j;
        this.A00 = i;
        if (i >= 0) {
            int i2 = CIR.A01;
            if (i == 0) {
                j = 0;
            } else if (i != Integer.MAX_VALUE) {
                j = (long) i;
            } else {
                j = Long.MAX_VALUE;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = A01.get(this);
            C28244Du5 du5 = new C28244Du5(this, (C28244Du5) null, 3, 0);
            this.sendSegment$volatile = du5;
            this.receiveSegment$volatile = du5;
            if (A0E()) {
                du5 = CIR.A02;
                C18070vi.A0z(du5, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = du5;
            this._closeCause$volatile = CIR.A0C;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Invalid channel capacity: ");
        A10.append(i);
        throw AnonymousClass001.A12(", should be >=0", A10);
    }

    public boolean A0N(Throwable th, boolean z) {
        long j;
        long j2;
        int i;
        Object obj;
        AnonymousClass1I8 r0;
        long j3;
        long j4;
        if (z) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                int i2 = CIR.A01;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (1 << 60) + (1152921504606846975L & j4)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        boolean A002 = C30561e9.A00(this, CIR.A0C, th, atomicReferenceFieldUpdater);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        if (z) {
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, (3 << 60) + (1152921504606846975L & j3)));
        } else {
            do {
                j = atomicLongFieldUpdater2.get(this);
                int i3 = (int) (j >> 60);
                if (i3 != 0) {
                    if (i3 != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    i = 3;
                } else {
                    j2 = j & 1152921504606846975L;
                    i = 2;
                }
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j, (((long) i) << 60) + j2));
        }
        BeJ();
        if (A002) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A07;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    r0 = CIR.A05;
                } else {
                    r0 = CIR.A06;
                }
            } while (!C30561e9.A00(this, obj, r0, atomicReferenceFieldUpdater2));
            if (obj != null) {
                C41681wt.A04(obj, 1);
                ((C22821Di) obj).invoke(atomicReferenceFieldUpdater.get(this));
            }
        }
        return A002;
    }

    public boolean BF8(Throwable th) {
        return A0N(th, false);
    }

    public Object CDX(C30391dr r2) {
        return A02(r2, this);
    }

    public static final int A00(Object obj, Object obj2, C27178DXn dXn, C28244Du5 du5, int i, long j, boolean z) {
        boolean z2;
        boolean A0A;
        Object obj3;
        AtomicReferenceArray atomicReferenceArray = du5.A01;
        int i2 = i * 2;
        atomicReferenceArray.set(i2, obj);
        if (!z) {
            int i3 = i2 + 1;
            Object obj4 = atomicReferenceArray.get(i3);
            z2 = true;
            if (obj4 == null) {
                obj3 = null;
                if (dXn.A0F(j)) {
                    if (du5.A0A(i, (Object) null, CIR.A03)) {
                        return 1;
                    }
                }
                if (obj2 != null) {
                    if (du5.A0A(i, obj3, obj2)) {
                        return 2;
                    }
                }
                return 3;
            } else if (obj4 instanceof C31771g6) {
                atomicReferenceArray.set(i2, (Object) null);
                if (dXn.A0G(obj4, obj)) {
                    atomicReferenceArray.set(i3, CIR.A07);
                    return 0;
                }
                AnonymousClass1I8 r1 = CIR.A09;
                if (atomicReferenceArray.getAndSet(i3, r1) == r1) {
                    return 5;
                }
                du5.A09(i, z2);
                return 5;
            }
        }
        while (true) {
            int i4 = i2 + 1;
            Object obj5 = atomicReferenceArray.get(i4);
            z2 = true;
            if (obj5 == null) {
                obj3 = null;
                if (!dXn.A0F(j)) {
                    if (!z) {
                        break;
                    }
                } else if (!z) {
                    A0A = du5.A0A(i, (Object) null, CIR.A03);
                }
                if (du5.A0A(i, (Object) null, CIR.A0A)) {
                    du5.A05();
                    return 4;
                }
            } else if (obj5 == CIR.A0B) {
                A0A = du5.A0A(i, obj5, CIR.A03);
            } else {
                AnonymousClass1I8 r7 = CIR.A09;
                if (obj5 == r7 || obj5 == CIR.A0E) {
                    atomicReferenceArray.set(i2, (Object) null);
                    return 5;
                } else if (obj5 == CIR.A04) {
                    atomicReferenceArray.set(i2, (Object) null);
                    dXn.BeJ();
                    return 4;
                } else {
                    atomicReferenceArray.set(i2, (Object) null);
                    if (obj5 instanceof CVX) {
                        obj5 = ((CVX) obj5).A00;
                    }
                    if (dXn.A0G(obj5, obj)) {
                        atomicReferenceArray.set(i4, CIR.A07);
                        return 0;
                    } else if (atomicReferenceArray.getAndSet(i4, r7) == r7) {
                        return 5;
                    }
                }
            }
            if (A0A) {
                return 1;
            }
        }
        du5.A09(i, z2);
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r1 != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        r10.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        if (r9 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        r0 = r11.A0A(r12, r6, r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b5 A[EDGE_INSN: B:54:0x00b5->B:48:0x00b5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af A[EDGE_INSN: B:56:0x00af->B:45:0x00af ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(java.lang.Object r9, X.C27178DXn r10, X.C28244Du5 r11, int r12, long r13) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r11.A01
            int r2 = r12 * 2
            int r4 = r2 + 1
            java.lang.Object r5 = r3.get(r4)
            if (r5 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r6 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r6 & r0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            if (r9 == 0) goto L_0x00bd
            boolean r0 = r11.A0A(r12, r5, r9)
        L_0x0022:
            if (r0 == 0) goto L_0x0042
            r10.A08()
            X.1I8 r1 = X.CIR.A0H
            return r1
        L_0x002a:
            X.1I8 r0 = X.CIR.A03
            if (r5 != r0) goto L_0x0042
            X.1I8 r0 = X.CIR.A07
            boolean r0 = r11.A0A(r12, r5, r0)
        L_0x0034:
            if (r0 == 0) goto L_0x0042
            r10.A08()
            java.lang.Object r1 = r3.get(r2)
            r0 = 0
            r3.set(r2, r0)
            return r1
        L_0x0042:
            java.lang.Object r6 = r3.get(r4)
            if (r6 == 0) goto L_0x0097
            X.1I8 r0 = X.CIR.A0B
            if (r6 == r0) goto L_0x0097
            X.1I8 r0 = X.CIR.A03
            if (r6 != r0) goto L_0x0057
            X.1I8 r0 = X.CIR.A07
            boolean r0 = r11.A0A(r12, r6, r0)
            goto L_0x0034
        L_0x0057:
            X.1I8 r5 = X.CIR.A0A
            if (r6 == r5) goto L_0x00b2
            X.1I8 r0 = X.CIR.A0E
            if (r6 == r0) goto L_0x00b2
            X.1I8 r0 = X.CIR.A04
            if (r6 == r0) goto L_0x00af
            X.1I8 r0 = X.CIR.A0F
            if (r6 == r0) goto L_0x0042
            X.1I8 r0 = X.CIR.A0G
            boolean r0 = r11.A0A(r12, r6, r0)
            if (r0 == 0) goto L_0x0042
            boolean r1 = r6 instanceof X.CVX
            if (r1 == 0) goto L_0x0077
            X.CVX r6 = (X.CVX) r6
            X.1g6 r6 = r6.A00
        L_0x0077:
            boolean r0 = r10.A0H(r6, r11, r12)
            if (r0 == 0) goto L_0x008e
            X.1I8 r0 = X.CIR.A07
            r3.set(r4, r0)
            r10.A08()
            java.lang.Object r1 = r3.get(r2)
            r0 = 0
            r3.set(r2, r0)
            return r1
        L_0x008e:
            r3.set(r4, r5)
            r11.A05()
            if (r1 == 0) goto L_0x00b2
            goto L_0x00af
        L_0x0097:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r7 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            X.1I8 r0 = X.CIR.A0E
            boolean r0 = r11.A0A(r12, r6, r0)
            if (r0 == 0) goto L_0x0042
        L_0x00af:
            r10.A08()
        L_0x00b2:
            X.1I8 r1 = X.CIR.A08
            return r1
        L_0x00b5:
            if (r9 == 0) goto L_0x00bd
            boolean r0 = r11.A0A(r12, r6, r9)
            goto L_0x0022
        L_0x00bd:
            X.1I8 r1 = X.CIR.A0I
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A01(java.lang.Object, X.DXn, X.Du5, int, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A02(X.C30391dr r16, X.C27178DXn r17) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C27364Dcd
            r7 = r17
            if (r0 == 0) goto L_0x0089
            r12 = r3
            X.Dcd r12 = (X.C27364Dcd) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r12.label = r2
        L_0x0016:
            java.lang.Object r1 = r12.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r4) goto L_0x008f
            X.C30691eM.A01(r1)
            X.Cqb r1 = (X.C26020Cqb) r1
            java.lang.Object r1 = r1.A00
        L_0x0028:
            return r1
        L_0x0029:
            X.C30691eM.A01(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            X.Du5 r8 = X.BE6.A17(r7, r0)
        L_0x0032:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r0 = r0.get(r7)
            boolean r0 = A0I(r7, r0, r4)
            if (r0 == 0) goto L_0x0043
            X.5WK r1 = X.BEA.A0w(r7)
            return r1
        L_0x0043:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r10 = r0.getAndIncrement(r7)
            int r0 = X.CIR.A01
            long r2 = (long) r0
            long r0 = r10 / r2
            long r2 = r10 % r2
            int r9 = (int) r2
            long r2 = r8.A00
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x005e
            X.Du5 r0 = A06(r7, r8, r0)
            if (r0 == 0) goto L_0x0032
            r8 = r0
        L_0x005e:
            r6 = 0
            java.lang.Object r1 = A01(r6, r7, r8, r9, r10)
            X.1I8 r0 = X.CIR.A0H
            if (r1 == r0) goto L_0x0098
            X.1I8 r0 = X.CIR.A08
            if (r1 != r0) goto L_0x0077
            long r1 = r7.A0J()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            r8.A01()
            goto L_0x0032
        L_0x0077:
            X.1I8 r0 = X.CIR.A0I
            if (r1 != r0) goto L_0x0094
            r12.label = r4
            r13 = r7
            r14 = r8
            r15 = r9
            r16 = r10
            java.lang.Object r1 = A03(r12, r13, r14, r15, r16)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0089:
            X.Dcd r12 = new X.Dcd
            r12.<init>(r3, r7)
            goto L_0x0016
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0094:
            r8.A01()
            return r1
        L_0x0098:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A02(X.1dr, X.DXn):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r1 == X.CIR.A0I) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        r12.A01();
        r0 = new X.C26020Cqb(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        throw X.AnonymousClass000.A0n("unexpected");
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C30391dr r10, X.C27178DXn r11, X.C28244Du5 r12, int r13, long r14) {
        /*
            boolean r0 = r10 instanceof X.C27433Ddo
            if (r0 == 0) goto L_0x00c9
            r3 = r10
            X.Ddo r3 = (X.C27433Ddo) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c9
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r2 = r3.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x00d0
            X.C30691eM.A01(r2)
        L_0x0020:
            X.Cqb r2 = (X.C26020Cqb) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x0025:
            X.C30691eM.A01(r2)
            r3.L$0 = r11
            r3.L$1 = r12
            r3.I$0 = r13
            r3.J$0 = r14
            r3.label = r0
            X.1dr r0 = X.C30581eB.A02(r3)
            X.1g7 r4 = X.C60682oR.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>"
            X.C18070vi.A0z(r4, r0)     // Catch:{ all -> 0x00dc }
            X.DXl r10 = new X.DXl     // Catch:{ all -> 0x00dc }
            r10.<init>(r4)     // Catch:{ all -> 0x00dc }
            java.lang.Object r1 = A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00dc }
            X.1I8 r6 = X.CIR.A0H     // Catch:{ all -> 0x00dc }
            if (r1 == r6) goto L_0x00bf
            X.1I8 r5 = X.CIR.A08     // Catch:{ all -> 0x00dc }
            r8 = 0
            if (r1 != r5) goto L_0x00a6
            long r1 = r11.A0J()     // Catch:{ all -> 0x00dc }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            r12.A01()     // Catch:{ all -> 0x00dc }
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08     // Catch:{ all -> 0x00dc }
            X.Du5 r12 = X.BE6.A17(r11, r0)     // Catch:{ all -> 0x00dc }
        L_0x0062:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04     // Catch:{ all -> 0x00dc }
            boolean r0 = X.BE9.A1X(r0, r11)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0077
            X.5WK r1 = X.BEA.A0w(r11)     // Catch:{ all -> 0x00dc }
            X.Cqb r0 = new X.Cqb     // Catch:{ all -> 0x00dc }
            r0.<init>(r1)     // Catch:{ all -> 0x00dc }
            r4.resumeWith(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00c2
        L_0x0077:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x00dc }
            long r14 = r0.getAndIncrement(r11)     // Catch:{ all -> 0x00dc }
            int r0 = X.CIR.A01     // Catch:{ all -> 0x00dc }
            long r2 = (long) r0     // Catch:{ all -> 0x00dc }
            long r0 = r14 / r2
            long r2 = r14 % r2
            int r13 = (int) r2     // Catch:{ all -> 0x00dc }
            long r2 = r12.A00     // Catch:{ all -> 0x00dc }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0092
            X.Du5 r0 = A06(r11, r12, r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0062
            r12 = r0
        L_0x0092:
            java.lang.Object r1 = A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00dc }
            if (r1 == r6) goto L_0x00bf
            if (r1 != r5) goto L_0x00af
            long r1 = r11.A0J()     // Catch:{ all -> 0x00dc }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            r12.A01()     // Catch:{ all -> 0x00dc }
            goto L_0x0062
        L_0x00a6:
            r12.A01()     // Catch:{ all -> 0x00dc }
            X.Cqb r0 = new X.Cqb     // Catch:{ all -> 0x00dc }
            r0.<init>(r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00bb
        L_0x00af:
            X.1I8 r0 = X.CIR.A0I     // Catch:{ all -> 0x00dc }
            if (r1 == r0) goto L_0x00d5
            r12.A01()     // Catch:{ all -> 0x00dc }
            X.Cqb r0 = new X.Cqb     // Catch:{ all -> 0x00dc }
            r0.<init>(r1)     // Catch:{ all -> 0x00dc }
        L_0x00bb:
            r4.CG1(r8, r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00c2
        L_0x00bf:
            r10.Bdv(r12, r13)     // Catch:{ all -> 0x00dc }
        L_0x00c2:
            java.lang.Object r2 = r4.A0C()
            if (r2 != r7) goto L_0x0020
            return r7
        L_0x00c9:
            X.Ddo r3 = new X.Ddo
            r3.<init>(r10, r11)
            goto L_0x0012
        L_0x00d0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00d5:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            r4.A0H()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A03(X.1dr, X.DXn, X.Du5, int, long):java.lang.Object");
    }

    public static final Throwable A04(C27178DXn dXn) {
        Throwable th = (Throwable) A05.get(dXn);
        if (th == null) {
            return new C27330Dc2();
        }
        return th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0114, code lost:
        r0 = (X.C28244Du5) ((X.C35931n4) X.C35931n4.A01.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C28244Du5 A05(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A06
            java.lang.Object r5 = r0.get(r11)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            X.Du5 r6 = X.BE6.A17(r11, r0)
            long r3 = r6.A00
            r0 = r5
            X.1n6 r0 = (X.C35951n6) r0
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            r5 = r6
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            X.Du5 r6 = X.BE6.A17(r11, r0)
            long r3 = r6.A00
            r0 = r5
            X.1n6 r0 = (X.C35951n6) r0
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            r5 = r6
        L_0x002a:
            X.1n4 r5 = (X.C35931n4) r5
        L_0x002c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C35931n4.A00
            java.lang.Object r0 = r2.get(r5)
            X.1I8 r1 = X.C61052p2.A00
            if (r0 == r1) goto L_0x0041
            X.1n4 r0 = (X.C35931n4) r0
            if (r0 != 0) goto L_0x0122
            r0 = 0
            boolean r0 = X.C30561e9.A00(r5, r0, r1, r2)
            if (r0 == 0) goto L_0x002c
        L_0x0041:
            X.Du5 r5 = (X.C28244Du5) r5
            r1 = r11
            boolean r0 = r11 instanceof X.C28242Du3
            if (r0 == 0) goto L_0x006d
            X.Du3 r1 = (X.C28242Du3) r1
            X.1Pg r1 = r1.A00
            X.1Pg r0 = X.C25691Pg.DROP_OLDEST
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x006d
            r0 = r5
        L_0x0055:
            int r7 = X.CIR.A01
            r6 = r7
        L_0x0058:
            int r7 = r7 + -1
            r1 = -1
            if (r1 >= r7) goto L_0x0114
            long r1 = r0.A00
            long r3 = (long) r6
            long r1 = r1 * r3
            long r3 = (long) r7
            long r1 = r1 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = A03
            long r8 = r3.get(r11)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00e8
        L_0x006d:
            r8 = r5
            r7 = 1
            r6 = 0
        L_0x0070:
            r4 = -1
            if (r8 == 0) goto L_0x0125
            int r10 = X.CIR.A01
            int r9 = r10 - r7
        L_0x0077:
            if (r4 >= r9) goto L_0x00dd
            long r2 = r8.A00
            long r0 = (long) r10
            long r2 = r2 * r0
            long r0 = (long) r9
            long r2 = r2 + r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0125
        L_0x0083:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r8.A01
            int r0 = r9 * 2
            int r0 = r0 + 1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x00d1
            X.1I8 r0 = X.CIR.A0B
            if (r1 == r0) goto L_0x00d1
            boolean r0 = r1 instanceof X.CVX
            if (r0 == 0) goto L_0x00c4
            X.1I8 r0 = X.CIR.A04
            boolean r0 = r8.A0A(r9, r1, r0)
            if (r0 == 0) goto L_0x0083
            X.CVX r1 = (X.CVX) r1
            X.1g6 r1 = r1.A00
        L_0x00a3:
            if (r6 != 0) goto L_0x00ac
            r6 = r1
        L_0x00a6:
            r8.A09(r9, r7)
        L_0x00a9:
            int r9 = r9 + -1
            goto L_0x0077
        L_0x00ac:
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00b7
            r0 = r6
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x00a6
        L_0x00b7:
            r0 = 4
            java.util.ArrayList r0 = X.C17880vN.A0z(r0)
            r0.add(r6)
            r0.add(r1)
            r6 = r0
            goto L_0x00a6
        L_0x00c4:
            boolean r0 = r1 instanceof X.C31771g6
            if (r0 == 0) goto L_0x00a9
            X.1I8 r0 = X.CIR.A04
            boolean r0 = r8.A0A(r9, r1, r0)
            if (r0 == 0) goto L_0x0083
            goto L_0x00a3
        L_0x00d1:
            X.1I8 r0 = X.CIR.A04
            boolean r0 = r8.A0A(r9, r1, r0)
            if (r0 == 0) goto L_0x0083
            r8.A05()
            goto L_0x00a9
        L_0x00dd:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C35931n4.A01
            java.lang.Object r8 = r0.get(r8)
            X.1n4 r8 = (X.C35931n4) r8
            X.Du5 r8 = (X.C28244Du5) r8
            goto L_0x0070
        L_0x00e8:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.A01
            int r3 = r7 * 2
            int r3 = r3 + 1
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x0107
            X.1I8 r3 = X.CIR.A0B
            if (r4 == r3) goto L_0x0107
            X.1I8 r3 = X.CIR.A03
            if (r4 != r3) goto L_0x0058
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r11.A0L(r1)
            goto L_0x006d
        L_0x0107:
            X.1I8 r3 = X.CIR.A04
            boolean r3 = r0.A0A(r7, r4, r3)
            if (r3 == 0) goto L_0x00e8
            r0.A05()
            goto L_0x0058
        L_0x0114:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C35931n4.A01
            java.lang.Object r0 = r1.get(r0)
            X.1n4 r0 = (X.C35931n4) r0
            X.Du5 r0 = (X.C28244Du5) r0
            if (r0 != 0) goto L_0x0055
            goto L_0x006d
        L_0x0122:
            r5 = r0
            goto L_0x002c
        L_0x0125:
            if (r6 == 0) goto L_0x0130
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x0131
            X.1g6 r6 = (X.C31771g6) r6
            r11.A0A(r6, r7)
        L_0x0130:
            return r5
        L_0x0131:
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            int r1 = r6.size()
            int r1 = r1 - r7
        L_0x0138:
            if (r4 >= r1) goto L_0x0130
            java.lang.Object r0 = r6.get(r1)
            X.1g6 r0 = (X.C31771g6) r0
            r11.A0A(r0, r7)
            int r1 = r1 + -1
            goto L_0x0138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A05(long):X.Du5");
    }

    public static final C28244Du5 A06(C27178DXn dXn, C28244Du5 du5, long j) {
        Object A002;
        boolean A1Z;
        C27178DXn dXn2;
        long j2;
        long j3;
        C28244Du5 du52 = du5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        int i = CIR.A01;
        C27448Dfd dfd = C27448Dfd.A00;
        loop0:
        while (true) {
            A002 = C61052p2.A00(dfd, du52, j);
            A1Z = AnonymousClass000.A1Z(A002, C61052p2.A00);
            dXn2 = dXn;
            if (A1Z) {
                break;
            }
            C35951n6 A003 = AnonymousClass2VJ.A00(A002);
            while (true) {
                C35951n6 r8 = (C35951n6) atomicReferenceFieldUpdater.get(dXn);
                if (r8.A00 >= A003.A00) {
                    break loop0;
                } else if (A003.A08()) {
                    if (C30561e9.A00(dXn, r8, A003, atomicReferenceFieldUpdater)) {
                        A0D(r8);
                        break loop0;
                    }
                    A0D(A003);
                }
            }
        }
        if (A1Z) {
            dXn.BeJ();
            j2 = du52.A00 * ((long) CIR.A01);
        } else {
            du52 = (C28244Du5) AnonymousClass2VJ.A00(A002);
            if (!dXn.A0E() && j <= A01.get(dXn) / ((long) CIR.A01)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A06;
                while (true) {
                    C35951n6 r82 = (C35951n6) atomicReferenceFieldUpdater2.get(dXn);
                    if (r82.A00 >= du52.A00 || !du52.A08()) {
                        break;
                    } else if (C30561e9.A00(dXn, r82, du52, atomicReferenceFieldUpdater2)) {
                        A0D(r82);
                        break;
                    } else {
                        A0D(du52);
                    }
                }
            }
            long j4 = du52.A00;
            if (j4 <= j) {
                return du52;
            }
            j2 = j4 * ((long) CIR.A01);
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            do {
                j3 = atomicLongFieldUpdater.get(dXn2);
                if (j3 >= j2) {
                    break;
                }
            } while (atomicLongFieldUpdater.compareAndSet(dXn2, j3, j2));
        }
        if (j2 < dXn2.A0J()) {
            du52.A01();
        }
        return null;
    }

    public static final C28244Du5 A07(C27178DXn dXn, C28244Du5 du5, long j) {
        Object A002;
        boolean A1Z;
        C27178DXn dXn2;
        long j2;
        long j3;
        long j4;
        C28244Du5 du52 = du5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        int i = CIR.A01;
        C27448Dfd dfd = C27448Dfd.A00;
        loop0:
        while (true) {
            A002 = C61052p2.A00(dfd, du52, j);
            A1Z = AnonymousClass000.A1Z(A002, C61052p2.A00);
            dXn2 = dXn;
            if (A1Z) {
                break;
            }
            C35951n6 A003 = AnonymousClass2VJ.A00(A002);
            while (true) {
                C35951n6 r8 = (C35951n6) atomicReferenceFieldUpdater.get(dXn);
                if (r8.A00 >= A003.A00) {
                    break loop0;
                } else if (A003.A08()) {
                    if (C30561e9.A00(dXn, r8, A003, atomicReferenceFieldUpdater)) {
                        A0D(r8);
                        break loop0;
                    }
                    A0D(A003);
                }
            }
        }
        if (A1Z) {
            dXn.BeJ();
            j2 = du52.A00 * ((long) CIR.A01);
        } else {
            du52 = (C28244Du5) AnonymousClass2VJ.A00(A002);
            long j5 = du52.A00;
            if (j5 <= j) {
                return du52;
            }
            j2 = j5 * ((long) CIR.A01);
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j3 = atomicLongFieldUpdater.get(dXn2);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j2) {
                    break;
                }
            } while (atomicLongFieldUpdater.compareAndSet(dXn2, j3, (((long) ((int) (j3 >> 60))) << 60) + j4));
        }
        if (j2 < A03.get(dXn2)) {
            du52.A01();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (r17 >= A03.get(r10)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r8.A0A(r4, r2, X.CIR.A0F) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (A0H(r2, r8, r4) == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r3.set(r1, X.CIR.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        r3.set(r1, X.CIR.A0A);
        r8.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0116, code lost:
        A09(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A08() {
        /*
            r19 = this;
            r10 = r19
            boolean r0 = r10.A0E()
            if (r0 != 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = A06
            X.Du5 r8 = X.BE6.A17(r10, r9)
        L_0x000e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = A01
            long r17 = r11.getAndIncrement(r10)
            int r0 = X.CIR.A01
            long r4 = (long) r0
            long r6 = r17 / r4
            long r0 = r10.A0J()
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            long r0 = r8.A00
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0036
            if (r2 >= 0) goto L_0x0030
            X.1n4 r0 = r8.A00()
            if (r0 == 0) goto L_0x0030
            r10.A0C(r8, r6)
        L_0x0030:
            r0 = 1
            r10.A09(r0)
        L_0x0035:
            return
        L_0x0036:
            if (r2 == 0) goto L_0x0090
            X.Dfd r15 = X.C27448Dfd.A00
        L_0x003a:
            java.lang.Object r14 = X.C61052p2.A00(r15, r8, r6)
            X.1I8 r0 = X.C61052p2.A00
            if (r14 != r0) goto L_0x004e
            r10.BeJ()
            r10.A0C(r8, r6)
        L_0x0048:
            r4 = 1
        L_0x004a:
            r10.A09(r4)
            goto L_0x000e
        L_0x004e:
            X.1n6 r13 = X.AnonymousClass2VJ.A00(r14)
        L_0x0052:
            java.lang.Object r12 = r9.get(r10)
            X.1n6 r12 = (X.C35951n6) r12
            long r2 = r12.A00
            long r0 = r13.A00
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x006f
            boolean r0 = r13.A08()
            if (r0 == 0) goto L_0x003a
            boolean r0 = X.C30561e9.A00(r10, r12, r13, r9)
            if (r0 == 0) goto L_0x008b
            A0D(r12)
        L_0x006f:
            X.1n6 r3 = X.AnonymousClass2VJ.A00(r14)
            X.Du5 r3 = (X.C28244Du5) r3
            long r0 = r3.A00
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x008f
            r2 = 1
            long r13 = r17 + r2
            long r4 = r4 * r0
            r12 = r10
            r15 = r4
            boolean r0 = r11.compareAndSet(r12, r13, r15)
            if (r0 == 0) goto L_0x0048
            long r4 = r4 - r17
            goto L_0x004a
        L_0x008b:
            A0D(r13)
            goto L_0x0052
        L_0x008f:
            r8 = r3
        L_0x0090:
            long r0 = r17 % r4
            int r4 = (int) r0
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r8.A01
            int r0 = r4 * 2
            int r1 = r0 + 1
            java.lang.Object r2 = r3.get(r1)
            boolean r0 = r2 instanceof X.C31771g6
            if (r0 == 0) goto L_0x00c0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r5 = r0.get(r10)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00c0
        L_0x00ab:
            X.1I8 r0 = X.CIR.A0F
            boolean r0 = r8.A0A(r4, r2, r0)
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r10.A0H(r2, r8, r4)
            if (r0 == 0) goto L_0x010e
            X.1I8 r0 = X.CIR.A03
            r3.set(r1, r0)
            goto L_0x0030
        L_0x00c0:
            java.lang.Object r2 = r3.get(r1)
            boolean r0 = r2 instanceof X.C31771g6
            if (r0 == 0) goto L_0x00e2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r5 = r0.get(r10)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            r5 = r2
            X.1g6 r5 = (X.C31771g6) r5
            X.CVX r0 = new X.CVX
            r0.<init>(r5)
        L_0x00da:
            boolean r0 = r8.A0A(r4, r2, r0)
            if (r0 == 0) goto L_0x00c0
            goto L_0x0030
        L_0x00e2:
            X.1I8 r0 = X.CIR.A0A
            if (r2 == r0) goto L_0x0116
            if (r2 != 0) goto L_0x00eb
            X.1I8 r0 = X.CIR.A0B
            goto L_0x00da
        L_0x00eb:
            X.1I8 r0 = X.CIR.A03
            if (r2 == r0) goto L_0x0030
            X.1I8 r0 = X.CIR.A0E
            if (r2 == r0) goto L_0x0030
            X.1I8 r0 = X.CIR.A07
            if (r2 == r0) goto L_0x0030
            X.1I8 r0 = X.CIR.A09
            if (r2 == r0) goto L_0x0030
            X.1I8 r0 = X.CIR.A04
            if (r2 == r0) goto L_0x0030
            X.1I8 r0 = X.CIR.A0G
            if (r2 == r0) goto L_0x00c0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected cell state: "
            java.lang.IllegalStateException r0 = X.BEA.A0c(r2, r0, r1)
            throw r0
        L_0x010e:
            X.1I8 r0 = X.CIR.A0A
            r3.set(r1, r0)
            r8.A05()
        L_0x0116:
            r0 = 1
            r10.A09(r0)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A08():void");
    }

    private final void A09(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A02;
        if ((atomicLongFieldUpdater.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
        }
    }

    private final void A0A(C31771g6 r4, boolean z) {
        Object A1J;
        C30391dr r42;
        Object cqb;
        Throwable A0K;
        if (r4 instanceof C31761g5) {
            r42 = (C30391dr) r4;
            if (z) {
                A0K = A04(this);
            } else {
                A0K = A0K();
            }
            cqb = C30691eM.A00(A0K);
        } else if (r4 instanceof C27176DXl) {
            r42 = ((C27176DXl) r4).A00;
            cqb = new C26020Cqb(BEA.A0w(this));
        } else if (r4 instanceof C27177DXm) {
            C27177DXm dXm = (C27177DXm) r4;
            C31781g7 r2 = dXm.A01;
            C18070vi.A0b(r2);
            dXm.A01 = null;
            dXm.A00 = CIR.A04;
            Throwable th = (Throwable) A05.get(dXm.A02);
            if (th == null) {
                A1J = AnonymousClass000.A0h();
            } else {
                A1J = C108945cZ.A1J(th);
            }
            r2.resumeWith(A1J);
            return;
        } else if (r4 instanceof C27175DXk) {
            C27175DXk.A00(this, CIR.A04, (C27175DXk) r4);
            return;
        } else {
            throw BEA.A0c(r4, "Unexpected waiter: ", AnonymousClass000.A10());
        }
        r42.resumeWith(cqb);
    }

    public static final void A0B(C27178DXn dXn, C27175DXk dXk) {
        C27178DXn dXn2 = dXn;
        C28244Du5 A17 = BE6.A17(dXn, A08);
        while (true) {
            C27175DXk dXk2 = dXk;
            if (BE9.A1X(A04, dXn2)) {
                dXk.A01 = CIR.A04;
                return;
            }
            long andIncrement = A03.getAndIncrement(dXn2);
            long j = (long) CIR.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (A17.A00 != j2) {
                C28244Du5 A062 = A06(dXn2, A17, j2);
                if (A062 != null) {
                    A17 = A062;
                } else {
                    continue;
                }
            }
            Object A012 = A01(dXk2, dXn2, A17, i, andIncrement);
            if (A012 == CIR.A0H) {
                if ((dXk instanceof C31771g6) && dXk != null) {
                    dXk.Bdv(A17, i);
                    return;
                }
                return;
            } else if (A012 == CIR.A08) {
                if (andIncrement < dXn2.A0J()) {
                    A17.A01();
                }
            } else if (A012 != CIR.A0I) {
                A17.A01();
                dXk.A01 = A012;
                return;
            } else {
                throw AnonymousClass000.A0n("unexpected");
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=X.Du5, code=X.1n6, for r8v0, types: [X.Du5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0C(X.C35951n6 r8, long r9) {
        /*
            r7 = this;
        L_0x0000:
            long r1 = r8.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            X.1n4 r0 = r8.A00()
            X.1n6 r0 = (X.C35951n6) r0
            if (r0 == 0) goto L_0x0010
            r8 = r0
            goto L_0x0000
        L_0x0010:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x0020
            X.1n4 r0 = r8.A00()
            X.1n6 r0 = (X.C35951n6) r0
            if (r0 == 0) goto L_0x0020
            r8 = r0
            goto L_0x0010
        L_0x0020:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A06
        L_0x0022:
            java.lang.Object r5 = r6.get(r7)
            X.1n6 r5 = (X.C35951n6) r5
            long r3 = r5.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            boolean r0 = r8.A08()
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.C30561e9.A00(r7, r5, r8, r6)
            if (r0 == 0) goto L_0x0040
            A0D(r5)
        L_0x003f:
            return
        L_0x0040:
            A0D(r8)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A0C(X.Du5, long):void");
    }

    private final boolean A0E() {
        long j = A01.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private final boolean A0F(long j) {
        if (j < A01.get(this) || j < A03.get(this) + ((long) this.A00)) {
            return true;
        }
        return false;
    }

    private final boolean A0G(Object obj, Object obj2) {
        C31781g7 r2;
        if (!(obj instanceof C27175DXk)) {
            if (obj instanceof C27176DXl) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                r2 = ((C27176DXl) obj).A00;
                C26020Cqb cqb = new C26020Cqb(obj2);
                int i = CIR.A01;
                if (r2.CPz(cqb, (C22821Di) null) == null) {
                    return false;
                }
            } else if (obj instanceof C27177DXm) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                C27177DXm dXm = (C27177DXm) obj;
                r2 = dXm.A01;
                C18070vi.A0b(r2);
                dXm.A01 = null;
                dXm.A00 = obj2;
                Boolean A0i = AnonymousClass000.A0i();
                int i2 = CIR.A01;
                if (r2.CPz(A0i, (C22821Di) null) == null) {
                    return false;
                }
            } else if (obj instanceof C31761g5) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                C31761g5 r5 = (C31761g5) obj;
                int i3 = CIR.A01;
                if (r5.CPz(obj2, (C22821Di) null) == null) {
                    return false;
                }
                r5.BFP();
                return true;
            } else {
                throw BEA.A0c(obj, "Unexpected receiver type: ", AnonymousClass000.A10());
            }
            r2.BFP();
            return true;
        } else if (C27175DXk.A00(this, obj2, (C27175DXk) obj) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean A0H(Object obj, C28244Du5 du5, int i) {
        Integer num;
        if (obj instanceof C31761g5) {
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            C31761g5 r5 = (C31761g5) obj;
            C27621Wu r1 = C27621Wu.A00;
            int i2 = CIR.A01;
            if (r5.CPz(r1, (C22821Di) null) == null) {
                return false;
            }
            r5.BFP();
            return true;
        } else if (obj instanceof C27175DXk) {
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            int A002 = C27175DXk.A00(this, C27621Wu.A00, (C27175DXk) obj);
            if (A002 == 0) {
                num = AnonymousClass00R.A00;
            } else if (A002 == 1) {
                num = AnonymousClass00R.A01;
            } else if (A002 != 2) {
                num = AnonymousClass00R.A0N;
            } else {
                num = AnonymousClass00R.A0C;
            }
            if (num == AnonymousClass00R.A01) {
                du5.A01.set(i * 2, (Object) null);
            }
            if (num == AnonymousClass00R.A00) {
                return true;
            }
            return false;
        } else {
            throw BEA.A0c(obj, "Unexpected waiter: ", AnonymousClass000.A10());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0.A01.set(r8 * 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        r0 = (X.C28244Du5) ((X.C35931n4) X.C35931n4.A01.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0I(X.C27178DXn r15, long r16, boolean r18) {
        /*
            r0 = 60
            long r3 = r16 >> r0
            int r5 = (int) r3
            r6 = 0
            if (r5 == 0) goto L_0x0128
            r0 = 1
            if (r5 == r0) goto L_0x0128
            r0 = 2
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r14 = r15
            if (r5 == r0) goto L_0x00ef
            r0 = 3
            if (r5 != r0) goto L_0x00e4
            long r1 = r16 & r3
            X.Du5 r0 = r15.A05(r1)
            r13 = 1
            r7 = 0
        L_0x001f:
            int r9 = X.CIR.A01
            int r8 = r9 - r13
        L_0x0023:
            r5 = -1
            if (r5 >= r8) goto L_0x00b7
            long r3 = r0.A00
            long r1 = (long) r9
            long r3 = r3 * r1
            long r1 = (long) r8
            long r3 = r3 + r1
        L_0x002c:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.A01
            int r1 = r8 * 2
            int r1 = r1 + 1
            java.lang.Object r10 = r2.get(r1)
            X.1I8 r1 = X.CIR.A07
            if (r10 == r1) goto L_0x00c3
            X.1I8 r1 = X.CIR.A03
            if (r10 != r1) goto L_0x005e
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = A03
            long r11 = r1.get(r15)
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x00c3
            X.1I8 r1 = X.CIR.A04
            boolean r1 = r0.A0A(r8, r10, r1)
            if (r1 == 0) goto L_0x002c
        L_0x0050:
            r3 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.A01
            int r1 = r8 * 2
            r2.set(r1, r3)
        L_0x0058:
            r0.A05()
        L_0x005b:
            int r8 = r8 + -1
            goto L_0x0023
        L_0x005e:
            X.1I8 r1 = X.CIR.A0B
            if (r10 == r1) goto L_0x00ae
            if (r10 == 0) goto L_0x00ae
            boolean r1 = r10 instanceof X.C31771g6
            if (r1 != 0) goto L_0x0077
            boolean r1 = r10 instanceof X.CVX
            if (r1 != 0) goto L_0x0077
            X.1I8 r2 = X.CIR.A0F
            if (r10 == r2) goto L_0x00c3
            X.1I8 r1 = X.CIR.A0G
            if (r10 == r1) goto L_0x00c3
            if (r10 == r2) goto L_0x002c
            goto L_0x005b
        L_0x0077:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = A03
            long r11 = r1.get(r15)
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x00c3
            boolean r1 = r10 instanceof X.CVX
            r2 = r10
            if (r1 == 0) goto L_0x008a
            X.CVX r2 = (X.CVX) r2
            X.1g6 r2 = r2.A00
        L_0x008a:
            X.1I8 r1 = X.CIR.A04
            boolean r1 = r0.A0A(r8, r10, r1)
            if (r1 == 0) goto L_0x002c
            if (r7 != 0) goto L_0x0096
            r7 = r2
            goto L_0x0050
        L_0x0096:
            boolean r1 = r7 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00a1
            r1 = r7
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            r1.add(r2)
            goto L_0x0050
        L_0x00a1:
            r1 = 4
            java.util.ArrayList r1 = X.C17880vN.A0z(r1)
            r1.add(r7)
            r1.add(r2)
            r7 = r1
            goto L_0x0050
        L_0x00ae:
            X.1I8 r1 = X.CIR.A04
            boolean r1 = r0.A0A(r8, r10, r1)
            if (r1 == 0) goto L_0x002c
            goto L_0x0058
        L_0x00b7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C35931n4.A01
            java.lang.Object r0 = r1.get(r0)
            X.1n4 r0 = (X.C35931n4) r0
            X.Du5 r0 = (X.C28244Du5) r0
            if (r0 != 0) goto L_0x001f
        L_0x00c3:
            if (r7 == 0) goto L_0x0127
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x00cf
            X.1g6 r7 = (X.C31771g6) r7
            r15.A0A(r7, r6)
            goto L_0x0127
        L_0x00cf:
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            int r1 = r7.size()
            int r1 = r1 - r13
        L_0x00d6:
            if (r5 >= r1) goto L_0x0127
            java.lang.Object r0 = r7.get(r1)
            X.1g6 r0 = (X.C31771g6) r0
            r15.A0A(r0, r6)
            int r1 = r1 + -1
            goto L_0x00d6
        L_0x00e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unexpected close status: "
            java.lang.IllegalStateException r0 = X.AnonymousClass8BX.A0W(r0, r1, r5)
            throw r0
        L_0x00ef:
            long r1 = r16 & r3
            r15.A05(r1)
            if (r18 == 0) goto L_0x0127
        L_0x00f6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = A08
            X.Du5 r7 = X.BE6.A17(r14, r9)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = A03
            long r15 = r13.get(r14)
            long r1 = r14.A0J()
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0127
            int r0 = X.CIR.A01
            long r4 = (long) r0
            long r2 = r15 / r4
            long r0 = r7.A00
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0129
            X.Du5 r7 = A06(r14, r7, r2)
            if (r7 != 0) goto L_0x0129
            java.lang.Object r0 = r9.get(r14)
            X.1n6 r0 = (X.C35951n6) r0
            long r4 = r0.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f6
        L_0x0127:
            r6 = 1
        L_0x0128:
            return r6
        L_0x0129:
            r7.A01()
            long r0 = r15 % r4
            int r2 = (int) r0
        L_0x012f:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r7.A01
            int r0 = r2 * 2
            int r0 = r0 + 1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0164
            X.1I8 r0 = X.CIR.A0B
            if (r1 == r0) goto L_0x0164
            X.1I8 r0 = X.CIR.A03
            if (r1 == r0) goto L_0x0128
            X.1I8 r0 = X.CIR.A0A
            if (r1 == r0) goto L_0x016f
            X.1I8 r0 = X.CIR.A04
            if (r1 == r0) goto L_0x016f
            X.1I8 r0 = X.CIR.A07
            if (r1 == r0) goto L_0x016f
            X.1I8 r0 = X.CIR.A0E
            if (r1 == r0) goto L_0x016f
            X.1I8 r0 = X.CIR.A0F
            if (r1 == r0) goto L_0x0128
            X.1I8 r0 = X.CIR.A0G
            if (r1 == r0) goto L_0x016f
            long r1 = r13.get(r14)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x016f
            return r6
        L_0x0164:
            X.1I8 r0 = X.CIR.A0E
            boolean r0 = r7.A0A(r2, r1, r0)
            if (r0 == 0) goto L_0x012f
            r14.A08()
        L_0x016f:
            r17 = 1
            long r17 = r17 + r15
            r13.compareAndSet(r14, r15, r17)
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.A0I(X.DXn, long, boolean):boolean");
    }

    public final long A0J() {
        return A04.get(this) & 1152921504606846975L;
    }

    public final Throwable A0K() {
        Throwable th = (Throwable) A05.get(this);
        if (th == null) {
            return new C24409C2h();
        }
        return th;
    }

    public final void A0L(long j) {
        C28244Du5 A17 = BE6.A17(this, A08);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.A00) + j2, A01.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    long j3 = (long) CIR.A01;
                    long j4 = j2 / j3;
                    int i = (int) (j2 % j3);
                    if (A17.A00 != j4) {
                        C28244Du5 A062 = A06(this, A17, j4);
                        if (A062 != null) {
                            A17 = A062;
                        }
                    }
                    if (A01((Object) null, this, A17, i, j2) != CIR.A08 || j2 < A0J()) {
                        A17.A01();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void A0M(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (!A0E()) {
            do {
                atomicLongFieldUpdater = A01;
            } while (atomicLongFieldUpdater.get(this) <= j);
            int i = CIR.A00;
            int i2 = 0;
            while (i2 < i) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (j4 != (A02.get(this) & 4611686018427387903L) || j4 != atomicLongFieldUpdater.get(this)) {
                    i2++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = A02;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                long j6 = atomicLongFieldUpdater2.get(this);
                long j7 = j6 & 4611686018427387903L;
                boolean A1O = AnonymousClass000.A1O(((4611686018427387904L & j6) > 0 ? 1 : ((4611686018427387904L & j6) == 0 ? 0 : -1)));
                if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                    break;
                } else if (!A1O) {
                    atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + j7);
                }
            }
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 0 + (j3 & 4611686018427387903L)));
        }
    }

    public final void BEM(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        A0N(cancellationException, true);
    }

    public C24937CQk BVj() {
        C27449Dfe dfe = C27449Dfe.A00;
        C18070vi.A0z(dfe, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C41681wt.A04(dfe, 3);
        C27450Dff dff = C27450Dff.A00;
        C18070vi.A0z(dff, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C41681wt.A04(dff, 3);
        return new C24937CQk(this, dfe, dff);
    }

    public C24937CQk BVk() {
        C27451Dfg dfg = C27451Dfg.A00;
        C18070vi.A0z(dfg, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        C41681wt.A04(dfg, 3);
        C27452Dfh dfh = C27452Dfh.A00;
        C18070vi.A0z(dfh, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        C41681wt.A04(dfh, 3);
        return new C24937CQk(this, dfg, dfh);
    }

    public void Bdw(C22821Di r5) {
        AnonymousClass1I8 r1;
        AnonymousClass1I8 r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A07;
        if (!C30561e9.A00(this, (Object) null, r5, atomicReferenceFieldUpdater)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                r1 = CIR.A05;
                r0 = CIR.A06;
                if (obj != r1) {
                    if (obj == r0) {
                        throw AnonymousClass000.A0n("Another handler was already registered and successfully invoked");
                    }
                    throw BEA.A0c(obj, "Another handler is already registered: ", AnonymousClass000.A10());
                }
            } while (!C30561e9.A00(this, r1, r0, atomicReferenceFieldUpdater));
            r5.invoke(A05.get(this));
        }
    }

    public boolean BeJ() {
        return A0I(this, A04.get(this), false);
    }

    public C27177DXm Bh9() {
        return new C27177DXm(this);
    }

    public Object CDW(C30391dr r29) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        C28244Du5 A17 = BE6.A17(this, atomicReferenceFieldUpdater);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            if (!BE9.A1X(atomicLongFieldUpdater, this)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = A03;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j = (long) CIR.A01;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (A17.A00 != j2) {
                    C28244Du5 A062 = A06(this, A17, j2);
                    if (A062 != null) {
                        A17 = A062;
                    } else {
                        continue;
                    }
                }
                Object A012 = A01((Object) null, this, A17, i, andIncrement);
                AnonymousClass1I8 r11 = CIR.A0H;
                if (A012 != r11) {
                    AnonymousClass1I8 r8 = CIR.A08;
                    if (A012 != r8) {
                        AnonymousClass1I8 r13 = CIR.A0I;
                        if (A012 == r13) {
                            C31781g7 A002 = C60682oR.A00(C30581eB.A02(r29));
                            try {
                                Object A013 = A01(A002, this, A17, i, andIncrement);
                                if (A013 == r11) {
                                    A002.Bdv(A17, i);
                                } else {
                                    C31781g7 r6 = null;
                                    if (A013 == r8) {
                                        if (andIncrement < A0J()) {
                                            A17.A01();
                                        }
                                        A17 = BE6.A17(this, atomicReferenceFieldUpdater);
                                        while (true) {
                                            if (BE9.A1X(atomicLongFieldUpdater, this)) {
                                                A002.resumeWith(C30691eM.A00(A04(this)));
                                                break;
                                            }
                                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                            long j3 = andIncrement2 / j;
                                            int i2 = (int) (andIncrement2 % j);
                                            if (A17.A00 != j3) {
                                                C28244Du5 A063 = A06(this, A17, j3);
                                                if (A063 != null) {
                                                    A17 = A063;
                                                } else {
                                                    continue;
                                                }
                                            }
                                            A013 = A01(A002, this, A17, i2, andIncrement2);
                                            if (A013 == r11) {
                                                if (A002 instanceof C31771g6) {
                                                    r6 = A002;
                                                }
                                                if (r6 != null) {
                                                    r6.Bdv(A17, i2);
                                                }
                                            } else if (A013 == r8) {
                                                if (andIncrement2 < A0J()) {
                                                    A17.A01();
                                                }
                                            } else if (A013 == r13) {
                                                throw AnonymousClass000.A0n("unexpected");
                                            }
                                        }
                                    }
                                    A17.A01();
                                    A002.CG1((C22821Di) null, A013);
                                }
                                return A002.A0C();
                            } catch (Throwable th) {
                                A002.A0H();
                                throw th;
                            }
                        } else {
                            A17.A01();
                            return A012;
                        }
                    } else if (andIncrement < A0J()) {
                        A17.A01();
                    }
                } else {
                    throw AnonymousClass000.A0n("unexpected");
                }
            } else {
                Throwable A042 = A04(this);
                StackTraceElement stackTraceElement = AnonymousClass2WE.A00;
                throw A042;
            }
        }
    }

    public Object CHH(Object obj, C30391dr r34) {
        Object A0C;
        Object obj2;
        int i;
        IllegalStateException illegalStateException;
        Object obj3 = obj;
        if (this instanceof C28242Du3) {
            C28242Du3 du3 = (C28242Du3) this;
            if (!(C28242Du3.A05(obj3, du3) instanceof AnonymousClass5WK)) {
                return C27621Wu.A00;
            }
            throw du3.A0K();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        C28244Du5 A17 = BE6.A17(this, atomicReferenceFieldUpdater);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean A0I = A0I(this, andIncrement, false);
            int i2 = CIR.A01;
            long j2 = (long) i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (A17.A00 != j3) {
                C28244Du5 A072 = A07(this, A17, j3);
                if (A072 != null) {
                    A17 = A072;
                } else if (A0I) {
                    break;
                }
            }
            int A002 = A00(obj3, (Object) null, this, A17, i3, j, A0I);
            if (A002 == 0) {
                A17.A01();
                break;
            } else if (A002 == 1) {
                break;
            } else if (A002 != 2) {
                if (A002 == 3) {
                    C31781g7 A003 = C60682oR.A00(C30581eB.A02(r34));
                    try {
                        int A004 = A00(obj3, A003, this, A17, i3, j, false);
                        if (A004 == 0) {
                            A17.A01();
                            obj2 = C27621Wu.A00;
                        } else if (A004 != 1) {
                            if (A004 != 2) {
                                if (A004 != 4) {
                                    if (A004 == 5) {
                                        A17.A01();
                                        A17 = BE6.A17(this, atomicReferenceFieldUpdater);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j4 = andIncrement2 & 1152921504606846975L;
                                            boolean A0I2 = A0I(this, andIncrement2, false);
                                            long j5 = j4 / j2;
                                            int i4 = (int) (j4 % j2);
                                            if (A17.A00 != j5) {
                                                C28244Du5 A073 = A07(this, A17, j5);
                                                if (A073 != null) {
                                                    A17 = A073;
                                                } else if (A0I2) {
                                                    break;
                                                }
                                            }
                                            int A005 = A00(obj3, A003, this, A17, i4, j4, A0I2);
                                            if (A005 != 0) {
                                                if (A005 == 1) {
                                                    obj2 = C27621Wu.A00;
                                                    break;
                                                } else if (A005 != 2) {
                                                    if (A005 != 3) {
                                                        if (A005 == 4) {
                                                            i = (j4 > A03.get(this) ? 1 : (j4 == A03.get(this) ? 0 : -1));
                                                            break;
                                                        }
                                                        A17.A01();
                                                    } else {
                                                        illegalStateException = AnonymousClass000.A0n("unexpected");
                                                        break;
                                                    }
                                                } else if (A0I2) {
                                                    A17.A05();
                                                } else {
                                                    C31781g7 r0 = null;
                                                    if (A003 instanceof C31771g6) {
                                                        r0 = A003;
                                                    }
                                                    if (r0 != null) {
                                                        r0.Bdv(A17, i4 + i2);
                                                    }
                                                }
                                            } else {
                                                A17.A01();
                                                obj2 = C27621Wu.A00;
                                                break;
                                            }
                                        }
                                        obj2 = C30691eM.A00(A0K());
                                    } else {
                                        illegalStateException = AnonymousClass000.A0n("unexpected");
                                    }
                                    throw illegalStateException;
                                }
                                i = (j > A03.get(this) ? 1 : (j == A03.get(this) ? 0 : -1));
                                if (i < 0) {
                                    A17.A01();
                                }
                                obj2 = C30691eM.A00(A0K());
                            } else {
                                A003.Bdv(A17, i3 + i2);
                            }
                            A0C = A003.A0C();
                        } else {
                            obj2 = C27621Wu.A00;
                        }
                        A003.resumeWith(obj2);
                        A0C = A003.A0C();
                    } catch (Throwable th) {
                        A003.A0H();
                        throw th;
                    }
                } else if (A002 != 4) {
                    A17.A01();
                } else if (j < A03.get(this)) {
                    A17.A01();
                }
            } else if (A0I) {
                A17.A05();
            }
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r1 = new C31781g7(1, C30581eB.A02(r34));
        r1.A0F();
        r1.resumeWith(C30691eM.A00(A0K()));
        A0C = r1.A0C();
        C31751g4 r02 = C31751g4.COROUTINE_SUSPENDED;
        if (A0C != r02) {
            A0C = C27621Wu.A00;
        }
        if (A0C == r02) {
            return A0C;
        }
        return C27621Wu.A00;
    }

    public Object CPy() {
        C31771g6 r9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (!A0I(this, j2, true)) {
            if (j < (j2 & 1152921504606846975L)) {
                AnonymousClass1I8 r92 = CIR.A09;
                C28244Du5 A17 = BE6.A17(this, A08);
                while (!BE9.A1X(atomicLongFieldUpdater2, this)) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = (long) CIR.A01;
                    long j4 = andIncrement / j3;
                    int i = (int) (andIncrement % j3);
                    if (A17.A00 != j4) {
                        C28244Du5 A062 = A06(this, A17, j4);
                        if (A062 != null) {
                            A17 = A062;
                        } else {
                            continue;
                        }
                    }
                    Object A012 = A01(r92, this, A17, i, andIncrement);
                    if (A012 == CIR.A0H) {
                        if ((r92 instanceof C31771g6) && (r9 = (C31771g6) r92) != null) {
                            r9.Bdv(A17, i);
                        }
                        A0M(andIncrement);
                        A17.A05();
                    } else if (A012 == CIR.A08) {
                        if (andIncrement < A0J()) {
                            A17.A01();
                        }
                    } else if (A012 != CIR.A0I) {
                        A17.A01();
                        return A012;
                    } else {
                        throw AnonymousClass000.A0n("unexpected");
                    }
                }
            }
            return C26020Cqb.A01;
        }
        return BEA.A0w(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        return new X.AnonymousClass5WK(A0K());
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CQ0(java.lang.Object r17) {
        /*
            r16 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = A04
            r10 = r16
            long r2 = r7.get(r10)
            r6 = 0
            boolean r0 = A0I(r10, r2, r6)
            if (r0 != 0) goto L_0x0020
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r0
            boolean r0 = r10.A0F(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0020
        L_0x001d:
            X.4PR r0 = X.C26020Cqb.A01
            return r0
        L_0x0020:
            X.1I8 r9 = X.CIR.A0A
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            X.Du5 r5 = X.BE6.A17(r10, r0)
        L_0x0028:
            long r0 = r7.getAndIncrement(r10)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r0 & r2
            boolean r15 = A0I(r10, r0, r6)
            int r4 = X.CIR.A01
            long r2 = (long) r4
            long r0 = r13 / r2
            long r2 = r13 % r2
            int r12 = (int) r2
            long r2 = r5.A00
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0057
            X.Du5 r11 = A07(r10, r5, r0)
            if (r11 != 0) goto L_0x0058
            if (r15 == 0) goto L_0x0028
        L_0x004d:
            java.lang.Throwable r1 = r10.A0K()
            X.5WK r0 = new X.5WK
            r0.<init>(r1)
            return r0
        L_0x0057:
            r11 = r5
        L_0x0058:
            r8 = r17
            int r1 = A00(r8, r9, r10, r11, r12, r13, r15)
            if (r1 == 0) goto L_0x009c
            r0 = 1
            if (r1 == r0) goto L_0x009f
            r0 = 2
            if (r1 == r0) goto L_0x007f
            r0 = 3
            if (r1 == r0) goto L_0x0095
            r0 = 4
            if (r1 == r0) goto L_0x0071
            r11.A01()
            r5 = r11
            goto L_0x0028
        L_0x0071:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            r11.A01()
            goto L_0x004d
        L_0x007f:
            if (r15 == 0) goto L_0x0085
            r11.A05()
            goto L_0x004d
        L_0x0085:
            boolean r0 = r9 instanceof X.C31771g6
            if (r0 == 0) goto L_0x0091
            X.1g6 r9 = (X.C31771g6) r9
            if (r9 == 0) goto L_0x0091
            int r12 = r12 + r4
            r9.Bdv(r11, r12)
        L_0x0091:
            r11.A05()
            goto L_0x001d
        L_0x0095:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x009c:
            r11.A01()
        L_0x009f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.CQ0(java.lang.Object):java.lang.Object");
    }

    public static void A0D(C35951n6 r1) {
        if (r1.A07()) {
            r1.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018c, code lost:
        r8 = (X.C28244Du5) r8.A00();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            r9 = r16
            long r1 = r0.get(r9)
            r0 = 60
            long r1 = r1 >> r0
            int r0 = (int) r1
            r2 = 3
            r3 = 2
            if (r0 == r3) goto L_0x006e
            if (r0 != r2) goto L_0x001b
            java.lang.String r0 = "cancelled,"
        L_0x0018:
            r6.append(r0)
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "capacity="
            r1.append(r0)
            int r0 = r9.A00
            r1.append(r0)
            r7 = 44
            r1.append(r7)
            X.AnonymousClass8BS.A1D(r1, r6)
            java.lang.String r0 = "data=["
            r6.append(r0)
            X.Du5[] r2 = new X.C28244Du5[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            java.lang.Object r1 = r0.get(r9)
            r0 = 0
            r2[r0] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            java.lang.Object r0 = r0.get(r9)
            r15 = 1
            r2[r15] = r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A06
            java.lang.Object r0 = r0.get(r9)
            java.util.List r0 = X.C18070vi.A0O(r0, r2, r3)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x005c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r1 = r2.next()
            X.Du5 r0 = X.CIR.A02
            if (r1 == r0) goto L_0x005c
            r3.add(r1)
            goto L_0x005c
        L_0x006e:
            java.lang.String r0 = "closed,"
            goto L_0x0018
        L_0x0071:
            java.util.Iterator r10 = r3.iterator()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r8 = r10.next()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x009f
            r0 = r8
            X.1n6 r0 = (X.C35951n6) r0
            long r4 = r0.A00
        L_0x008a:
            java.lang.Object r3 = r10.next()
            r0 = r3
            X.1n6 r0 = (X.C35951n6) r0
            long r1 = r0.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0099
            r8 = r3
            r4 = r1
        L_0x0099:
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x008a
        L_0x009f:
            X.Du5 r8 = (X.C28244Du5) r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r13 = r0.get(r9)
            long r11 = r9.A0J()
        L_0x00ab:
            int r5 = X.CIR.A01
            r4 = 0
        L_0x00ae:
            if (r4 >= r5) goto L_0x018c
            long r2 = r8.A00
            long r0 = (long) r5
            long r2 = r2 * r0
            long r0 = (long) r4
            long r2 = r2 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00be
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0194
        L_0x00be:
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r8.A01
            int r1 = r4 * 2
            int r0 = r1 + 1
            java.lang.Object r9 = r10.get(r0)
            java.lang.Object r1 = r10.get(r1)
            boolean r0 = r9 instanceof X.C31761g5
            if (r0 == 0) goto L_0x010a
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fc
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00fc
            java.lang.String r0 = "receive"
        L_0x00da:
            if (r1 == 0) goto L_0x00f4
            java.lang.StringBuilder r2 = X.BE9.A0r()
            r2.append(r0)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = "),"
            r2.append(r0)
        L_0x00ee:
            X.AnonymousClass8BS.A1D(r2, r6)
        L_0x00f1:
            int r4 = r4 + 1
            goto L_0x00ae
        L_0x00f4:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            r2.append(r7)
            goto L_0x00ee
        L_0x00fc:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0107
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0107
            java.lang.String r0 = "send"
            goto L_0x00da
        L_0x0107:
            java.lang.String r0 = "cont"
            goto L_0x00da
        L_0x010a:
            boolean r0 = r9 instanceof X.C27175DXk
            if (r0 == 0) goto L_0x0127
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0119
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0119
            java.lang.String r0 = "onReceive"
            goto L_0x00da
        L_0x0119:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0124
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0124
            java.lang.String r0 = "onSend"
            goto L_0x00da
        L_0x0124:
            java.lang.String r0 = "select"
            goto L_0x00da
        L_0x0127:
            boolean r0 = r9 instanceof X.C27176DXl
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = "receiveCatching"
            goto L_0x00da
        L_0x012e:
            boolean r0 = r9 instanceof X.CVX
            if (r0 == 0) goto L_0x0140
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "EB("
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1F(r9, r2)
            goto L_0x00da
        L_0x0140:
            X.1I8 r0 = X.CIR.A0G
            boolean r0 = X.C18070vi.A18(r9, r0)
            if (r0 != 0) goto L_0x0188
            X.1I8 r0 = X.CIR.A0F
            boolean r0 = X.C18070vi.A18(r9, r0)
            if (r0 != 0) goto L_0x0188
            if (r9 == 0) goto L_0x00f1
            X.1I8 r0 = X.CIR.A0B
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f1
            X.1I8 r0 = X.CIR.A07
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f1
            X.1I8 r0 = X.CIR.A0E
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f1
            X.1I8 r0 = X.CIR.A09
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f1
            X.1I8 r0 = X.CIR.A0A
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f1
            X.1I8 r0 = X.CIR.A04
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = r9.toString()
            goto L_0x00da
        L_0x0188:
            java.lang.String r0 = "resuming_sender"
            goto L_0x00da
        L_0x018c:
            X.1n4 r8 = r8.A00()
            X.Du5 r8 = (X.C28244Du5) r8
            if (r8 != 0) goto L_0x00ab
        L_0x0194:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x01b3
            int r0 = r6.length()
            int r0 = r0 + -1
            char r0 = r6.charAt(r0)
            if (r0 != r7) goto L_0x01ae
            int r0 = r6.length()
            int r0 = r0 - r15
            r6.deleteCharAt(r0)
        L_0x01ae:
            java.lang.String r0 = X.AnonymousClass000.A0z(r6)
            return r0
        L_0x01b3:
            java.lang.String r1 = "Char sequence is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            java.util.NoSuchElementException r0 = X.BE6.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27178DXn.toString():java.lang.String");
    }
}
