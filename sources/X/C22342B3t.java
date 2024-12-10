package X;

/* renamed from: X.B3t  reason: case insensitive filesystem */
public final class C22342B3t extends C18600wl {
    public final C190859ld A00 = new C190859ld();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1.A01 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(X.C18560wh r3) {
        /*
            r2 = this;
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.0wl r0 = X.C23871Hy.A00
            X.1IR r0 = X.AnonymousClass1IN.A00
            X.1IT r0 = (X.AnonymousClass1IT) r0
            X.1IT r0 = r0.A01
            boolean r1 = r0.A0C(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0021
            X.9ld r1 = r2.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x001e
            boolean r1 = r1.A01
            r0 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r0 = r0 ^ 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22342B3t.A0C(X.0wh):boolean");
    }

    public void A0D(Runnable runnable, C18560wh r6) {
        C18070vi.A0h(r6, runnable);
        C190859ld r3 = this.A00;
        C18600wl r0 = C23871Hy.A00;
        AnonymousClass1IT r2 = ((AnonymousClass1IT) AnonymousClass1IN.A00).A01;
        if (r2.A0C(r6) || r3.A00 || !r3.A01) {
            r2.A0D(new C21471Akc((Object) r3, (Object) runnable, 6), r6);
        } else if (r3.A03.offer(runnable)) {
            r3.A00();
        } else {
            throw AnonymousClass000.A0n("cannot enqueue any more runnables");
        }
    }
}
