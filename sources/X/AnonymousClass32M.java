package X;

/* renamed from: X.32M  reason: invalid class name */
public final class AnonymousClass32M implements AnonymousClass20p {
    public final AnonymousClass320 A00 = ((AnonymousClass320) AnonymousClass12Q.A02(AnonymousClass114.A00(), 49435));

    public AnonymousClass206 BHO(C59652mf r7, AnonymousClass206 r8) {
        boolean A17 = C18070vi.A17(r8, r7);
        Class<C442022n> cls = C442022n.class;
        if (!(r8 instanceof C442022n)) {
            String A0U = C17890vO.A0U(r8);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r8, name, A0U, C17890vO.A0W(str), str);
        }
        C442022n r82 = (C442022n) r8;
        AnonymousClass205 r0 = r7.A01;
        long j = r7.A00;
        C18070vi.A0d(r82, 0);
        C442022n r1 = new C442022n(r0, j);
        r1.A02 = A17 ? 1 : 0;
        r1.A18(r82.A17());
        r1.A00 = r82.A00;
        return r1;
    }

    public boolean Bes(AnonymousClass206 r2) {
        return true;
    }
}
