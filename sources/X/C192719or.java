package X;

/* renamed from: X.9or  reason: invalid class name and case insensitive filesystem */
public class C192719or {
    public C170218ov A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass1Cb A03;
    public final AnonymousClass1CO A04;
    public final AnonymousClass00H A05;

    public synchronized C170218ov A00() {
        C170218ov r0;
        r0 = this.A00;
        if (r0 == null) {
            AnonymousClass118 r2 = this.A02;
            AnonymousClass190 r1 = this.A01;
            AnonymousClass1CO r5 = this.A04;
            r0 = new C170218ov(r1, r2, this.A03, (AnonymousClass1CP) this.A05.get(), r5);
            this.A00 = r0;
        }
        return r0;
    }

    public synchronized void A01() {
        C170218ov r0 = this.A00;
        if (r0 != null) {
            r0.A07();
            this.A00.close();
            this.A00 = null;
        }
    }

    public C192719or(AnonymousClass190 r1, AnonymousClass118 r2, AnonymousClass1Cb r3, AnonymousClass1CO r4, AnonymousClass00H r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
    }
}
