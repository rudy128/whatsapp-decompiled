package X;

/* renamed from: X.2K5  reason: invalid class name */
public final class AnonymousClass2K5 extends AnonymousClass68G {
    public final C42341y1 A00;

    public AnonymousClass2K5(C42341y1 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bes(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        Class<C439221l> cls = C439221l.class;
        if (!(r5 instanceof C439221l)) {
            String A0U = C17890vO.A0U(r5);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r5, name, A0U, C17890vO.A0W(str), str);
        }
        C20083A6j A01 = this.A00.A01((AnonymousClass21K) r5);
        if (A01 == null || !A01.A0J()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.21B, X.21l, X.218, X.206] */
    public AnonymousClass21B A00(C59652mf r7, AnonymousClass206 r8) {
        Class<C439221l> cls = C439221l.class;
        if (!(r8 instanceof C439221l)) {
            String A0U = C17890vO.A0U(r8);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r8, name, A0U, C17890vO.A0W(str), str);
        } else if (!AnonymousClass1EG.A0H(C20120A8f.A04(r8))) {
            return new AnonymousClass21B(r7.A01, r7.A00);
        } else {
            ? r1 = new AnonymousClass206(r7.A01, 85, r7.A00);
            r1.A02 = 1;
            r1.A02 = 0;
            r1.A00 = ((C439221l) r8).A00;
            return r1;
        }
    }
}
