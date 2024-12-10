package X;

/* renamed from: X.6L0  reason: invalid class name */
public final class AnonymousClass6L0 extends C24741Lm {
    public boolean A00;
    public boolean A01;
    public final C002100z A02 = new C002100z(1000);
    public final C218617r A03;

    public synchronized String BZc() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("AITypeaheadSuggestionsCache - ");
        A10.append(this.A02.A02());
        return AnonymousClass000.A0y(" items", A10);
    }

    public synchronized void C9L(C122516Qr r3, boolean z) {
        this.A02.A07(-1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6L0(C218617r r3, C24571Kv r4) {
        super(r4);
        C18070vi.A0j(r3, r4);
        this.A03 = r3;
        A09();
    }
}
