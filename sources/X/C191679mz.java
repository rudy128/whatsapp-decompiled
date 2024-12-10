package X;

/* renamed from: X.9mz  reason: invalid class name and case insensitive filesystem */
public final class C191679mz {
    public final AnonymousClass1CJ A00;
    public final C35681md A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public volatile C29681ch A06;
    public volatile Runnable A07;

    public final synchronized void A00() {
        this.A06 = null;
        Runnable runnable = this.A07;
        if (runnable != null) {
            this.A02.CEz(runnable);
        }
        this.A07 = null;
    }

    public C191679mz(AnonymousClass1CJ r2, C35681md r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r2, r5, r6, r7);
        C18070vi.A0d(r3, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A01 = r3;
    }
}
