package X;

/* renamed from: X.APw  reason: case insensitive filesystem */
public final class C20562APw implements C22438B7u {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public Object CGG(C198589ya r4, C179319Hm r5, BCS bcs, String str, C30391dr r8) {
        boolean contains = C108995ce.A0c(C108955ca.A0v(C17880vN.A0P(this.A02), 11661)).contains(str);
        StringBuilder A10 = AnonymousClass000.A10();
        if (!contains) {
            C17900vP.A0f("DisplayDisconnectDialogTask/run: invalid reason ", str, A10);
            return new C184379ar(AnonymousClass9I9.UNKNOWN, true);
        }
        C17900vP.A0f("DisplayDisconnectDialogTask/run: ", str, A10);
        this.A00.get();
        ((C19880zA) this.A01.get()).A03();
        throw AnonymousClass000.A0s("getCoexOnboardEntryPoint");
    }

    public C20562APw(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
