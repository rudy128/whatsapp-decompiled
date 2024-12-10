package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0K6  reason: invalid class name */
public class AnonymousClass0K6 {
    public AnonymousClass0sT A00;
    public final C29031bT A01 = new C29031bT(3);
    public final String A02;
    public final AtomicInteger A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = (java.lang.Class) r3).getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0K6(java.lang.Object r3) {
        /*
            r2 = this;
            r1 = 3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r2.<init>()
            X.1bT r0 = new X.1bT
            r0.<init>(r1)
            r2.A01 = r0
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001e
            r0 = r3
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            java.lang.String r0 = r3.toString()
        L_0x0022:
            r2.A02 = r0
            r1 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0K6.<init>(java.lang.Object):void");
    }

    public Object A00() {
        Object BAf = this.A01.BAf();
        if (BAf != null) {
            this.A03.decrementAndGet();
        }
        return BAf;
    }

    public void A01() {
        if (this.A00 != null) {
            AtomicInteger atomicInteger = this.A03;
            if (atomicInteger.get() != 0) {
                while (true) {
                    Object BAf = this.A01.BAf();
                    if (BAf != null) {
                        atomicInteger.decrementAndGet();
                        AnonymousClass0sT r0 = this.A00;
                        if (r0 != null) {
                            r0.Bol(BAf);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean A02(Object obj) {
        try {
            boolean CEF = this.A01.CEF(obj);
            if (CEF) {
                this.A03.incrementAndGet();
            }
            return CEF;
        } catch (IllegalStateException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to release item to DefaultContentPool: ");
            throw new IllegalStateException(AnonymousClass000.A0y(this.A02, A10), e);
        }
    }
}
