package X;

/* renamed from: X.32N  reason: invalid class name */
public final class AnonymousClass32N implements AnonymousClass20p {
    public final AnonymousClass321 A00 = ((AnonymousClass321) AnonymousClass12Q.A02(AnonymousClass114.A00(), 49436));

    public boolean Bes(AnonymousClass206 r2) {
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.22p, X.206] */
    public AnonymousClass206 BHO(C59652mf r7, AnonymousClass206 r8) {
        boolean A15 = C18070vi.A15(r8, r7);
        Class<C442222p> cls = C442222p.class;
        if (!(r8 instanceof C442222p)) {
            String A0U = C17890vO.A0U(r8);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r8, name, A0U, C17890vO.A0W(str), str);
        }
        C442222p r82 = (C442222p) r8;
        AnonymousClass205 r4 = r7.A01;
        long j = r7.A00;
        C18070vi.A0d(r82, A15 ? 1 : 0);
        ? r1 = new AnonymousClass206(r4, 4, j);
        r1.A02 = A15;
        r1.A02 = A15;
        r1.A00 = r82.A00;
        r1.A18(r82.A17());
        return r1;
    }
}
