package X;

/* renamed from: X.0Ie  reason: invalid class name and case insensitive filesystem */
public final class C03440Ie {
    public final C30391dr A00;
    public final C22821Di A01;

    public final void A01(long j) {
        Object obj;
        C30391dr r2 = this.A00;
        try {
            obj = this.A01.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = C30691eM.A00(th);
        }
        r2.resumeWith(obj);
    }

    public C03440Ie(C30391dr r1, C22821Di r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final C30391dr A00() {
        return this.A00;
    }
}
