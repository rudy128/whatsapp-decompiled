package X;

/* renamed from: X.ASo  reason: case insensitive filesystem */
public final class C20630ASo implements B83, B85, C436820m {
    public final AnonymousClass11S A00;
    public final C18030ve A01;

    public C20630ASo(AnonymousClass11S r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r7) {
        C18070vi.A0h(r7, a2m);
        Class<AnonymousClass24J> cls = AnonymousClass24J.class;
        if (!(r7 instanceof AnonymousClass24J)) {
            String A0U = C17890vO.A0U(r7);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r7, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass8X8 r4 = a2m.A00;
        C164098Xn r0 = ((C166418cr) r4.A00).placeholderMessage_;
        if (r0 == null) {
            r0 = C164098Xn.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        AnonymousClass9JW r2 = AnonymousClass9JW.A01;
        C164098Xn r1 = (C164098Xn) C17880vN.A0G(A0O);
        int i = C164098Xn.TYPE_FIELD_NUMBER;
        r1.type_ = r2.value;
        r1.bitField0_ |= 1;
        C166418cr A0M = AnonymousClass8BS.A0M(r4);
        C164098Xn r02 = (C164098Xn) A0O.A0C();
        r02.getClass();
        A0M.placeholderMessage_ = r02;
        A0M.bitField2_ |= 1;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.206, X.24J] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if (AnonymousClass8BW.A1Q(A012.bitField2_)) {
            C164098Xn r0 = A012.placeholderMessage_;
            if (r0 == null) {
                r0 = C164098Xn.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 1) != 0) {
                if (C18020vd.A05(C18040vf.A02, this.A01, 6673) && this.A00.A0N()) {
                    Integer num = AnonymousClass00R.A00;
                    ? r02 = new AnonymousClass206(a6d.A0A, 95, a6d.A03);
                    r02.A00 = num;
                    return r02;
                }
            }
        }
        return null;
    }
}
