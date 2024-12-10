package X;

/* renamed from: X.2In  reason: invalid class name and case insensitive filesystem */
public class C47472In extends AnonymousClass32S {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47472In(C18030ve r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    public boolean Bes(AnonymousClass206 r5) {
        if (!(this instanceof C47402Ig)) {
            return true;
        }
        C47402Ig r2 = (C47402Ig) this;
        C18070vi.A0d(r5, 0);
        Class<C439021j> cls = C439021j.class;
        if (!(r5 instanceof C439021j)) {
            String A0U = C17890vO.A0U(r5);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r5, name, A0U, C17890vO.A0W(str), str);
        }
        C20083A6j A01 = r2.A00.A01((AnonymousClass21K) r5);
        if (A01 == null || !A01.A0J()) {
            return false;
        }
        return true;
    }
}
