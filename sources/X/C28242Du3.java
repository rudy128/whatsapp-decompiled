package X;

/* renamed from: X.Du3  reason: case insensitive filesystem */
public class C28242Du3 extends C27178DXn {
    public final C25691Pg A00;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        return new X.AnonymousClass5WK(r10.A0K());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(java.lang.Object r14, X.C28242Du3 r15) {
        /*
            r10 = r15
            X.1Pg r1 = r15.A00
            X.1Pg r0 = X.C25691Pg.DROP_LATEST
            r8 = r14
            if (r1 != r0) goto L_0x0017
            java.lang.Object r1 = super.CQ0(r14)
            boolean r0 = r1 instanceof X.AnonymousClass4PR
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof X.AnonymousClass5WK
            if (r0 == 0) goto L_0x009c
        L_0x0016:
            return r1
        L_0x0017:
            X.1I8 r9 = X.CIR.A03
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C27178DXn.A09
            X.Du5 r11 = X.BE6.A17(r15, r0)
        L_0x001f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C27178DXn.A04
            long r0 = r0.getAndIncrement(r10)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r0 & r2
            r2 = 0
            boolean r15 = X.C27178DXn.A0I(r10, r0, r2)
            int r6 = X.CIR.A01
            long r0 = (long) r6
            long r2 = r13 / r0
            long r4 = r13 % r0
            int r12 = (int) r4
            long r4 = r11.A00
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0052
            X.Du5 r2 = X.C27178DXn.A07(r10, r11, r2)
            if (r2 != 0) goto L_0x0051
            if (r15 == 0) goto L_0x001f
        L_0x0047:
            java.lang.Throwable r0 = r10.A0K()
            X.5WK r1 = new X.5WK
            r1.<init>(r0)
            return r1
        L_0x0051:
            r11 = r2
        L_0x0052:
            int r3 = X.C27178DXn.A00(r8, r9, r10, r11, r12, r13, r15)
            if (r3 == 0) goto L_0x0099
            r2 = 1
            if (r3 == r2) goto L_0x009c
            r2 = 2
            if (r3 == r2) goto L_0x0076
            r0 = 3
            if (r3 == r0) goto L_0x007c
            r0 = 4
            if (r3 == r0) goto L_0x0068
            r11.A01()
            goto L_0x001f
        L_0x0068:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C27178DXn.A03
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            r11.A01()
            goto L_0x0047
        L_0x0076:
            if (r15 == 0) goto L_0x0083
            r11.A05()
            goto L_0x0047
        L_0x007c:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0083:
            boolean r2 = r9 instanceof X.C31771g6
            if (r2 == 0) goto L_0x0090
            X.1g6 r9 = (X.C31771g6) r9
            if (r9 == 0) goto L_0x0090
            int r2 = r12 + r6
            r9.Bdv(r11, r2)
        L_0x0090:
            long r2 = r11.A00
            long r2 = r2 * r0
            long r0 = (long) r12
            long r2 = r2 + r0
            r10.A0L(r2)
            goto L_0x009c
        L_0x0099:
            r11.A01()
        L_0x009c:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28242Du3.A05(java.lang.Object, X.Du3):java.lang.Object");
    }

    public C28242Du3(C25691Pg r3, int i) {
        super(i);
        this.A00 = r3;
        if (r3 == C25691Pg.SUSPEND) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("This implementation does not support suspension for senders, use ");
            A10.append(AnonymousClass3MW.A15(C27178DXn.class).BZJ());
            throw AnonymousClass001.A12(" instead", A10);
        } else if (i < 1) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Buffered channel capacity must be at least 1, but ");
            A102.append(i);
            throw AnonymousClass001.A12(" was specified", A102);
        }
    }

    public Object CQ0(Object obj) {
        return A05(obj, this);
    }
}
