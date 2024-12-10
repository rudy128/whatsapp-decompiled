package X;

/* renamed from: X.2JL  reason: invalid class name */
public final class AnonymousClass2JL extends AUK {
    public final AnonymousClass11P A00;

    public void CBB(C193069pU r7, C166388co r8, AnonymousClass206 r9) {
        AnonymousClass24N r5;
        C18070vi.A0d(r9, 0);
        if (!(r9 instanceof AnonymousClass24N) || (r5 = (AnonymousClass24N) r9) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A07(r9, "Unexpected message type: ", A10);
            throw new C32711hd(0, A10.toString());
        } else if (r5.A00 < AnonymousClass11P.A01(this.A00)) {
            r5.A00 = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JL(AnonymousClass11P r1, AnonymousClass00H r2) {
        super(r2);
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
    }
}
