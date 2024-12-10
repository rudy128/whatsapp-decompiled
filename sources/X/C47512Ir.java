package X;

/* renamed from: X.2Ir  reason: invalid class name and case insensitive filesystem */
public final class C47512Ir extends C1187664x {
    public final C18030ve A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47512Ir(C18030ve r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ AnonymousClass21X A03(C59652mf r6, AnonymousClass21X r7) {
        C18070vi.A0d(r7, 0);
        Class<C440922c> cls = C440922c.class;
        if (r7 instanceof C440922c) {
            return new AnonymousClass21X(r6.A01, 81, r6.A00);
        }
        String A0U = C17890vO.A0U(r7);
        String name = cls.getName();
        String str = "".toString();
        throw AnonymousClass206.A02(r7, name, A0U, C17890vO.A0W(str), str);
    }

    public boolean Bes(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A00, 3482) || !r4.A0v.A02) {
            return false;
        }
        return true;
    }

    public void A02(C59652mf r1, AnonymousClass21V r2, AnonymousClass21V r3) {
        C18070vi.A0n(r2, r3, r1);
        super.A02(r1, r2, r3);
        AnonymousClass32S.A00(r1, r3);
    }
}
