package X;

/* renamed from: X.2JK  reason: invalid class name */
public final class AnonymousClass2JK extends AUK {
    public final AnonymousClass11P A00;

    public void CBB(C193069pU r8, C166388co r9, AnonymousClass206 r10) {
        C18070vi.A0d(r10, 0);
        if (r10 instanceof AnonymousClass23S) {
            AnonymousClass23S r6 = (AnonymousClass23S) r10;
            boolean z = false;
            if (r6 != null) {
                if (r6.A01 * 1000 < AnonymousClass11P.A01(this.A00)) {
                    z = true;
                }
                r6.A07 = z;
                return;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass206.A07(r10, "Unexpected message type: ", A10);
        throw new C32711hd(0, A10.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JK(AnonymousClass11P r1, AnonymousClass00H r2) {
        super(r2);
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
    }
}
