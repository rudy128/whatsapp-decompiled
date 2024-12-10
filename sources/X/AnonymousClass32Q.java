package X;

/* renamed from: X.32Q  reason: invalid class name */
public final class AnonymousClass32Q implements AnonymousClass20p {
    public final C18030ve A00;
    public final AnonymousClass32A A01 = ((AnonymousClass32A) AnonymousClass12Q.A02(AnonymousClass114.A00(), 32884));

    public AnonymousClass32Q(C18030ve r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public boolean Bes(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (r4 instanceof AnonymousClass24P) {
            return C18020vd.A05(C18040vf.A02, this.A00, 10412);
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }

    public AnonymousClass206 BHO(C59652mf r5, AnonymousClass206 r6) {
        boolean A15 = C18070vi.A15(r6, r5);
        if (r6 instanceof AnonymousClass24P) {
            AnonymousClass24P r62 = (AnonymousClass24P) r6;
            AnonymousClass205 r0 = r5.A01;
            long j = r5.A00;
            C18070vi.A0d(r62, A15 ? 1 : 0);
            AnonymousClass24P r1 = new AnonymousClass24P(r0, j);
            r1.A00 = r62.A00;
            r1.A01 = r62.A01;
            return r1;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }
}
