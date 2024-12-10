package X;

/* renamed from: X.35u  reason: invalid class name and case insensitive filesystem */
public final class C690735u implements C437420t {
    public final AnonymousClass118 A00;

    public C690735u(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass3KT BXT(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        String str = ((C442222p) r2).A00;
        if (str == null) {
            str = "";
        }
        return C690335q.A01(str);
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r4) {
        String str;
        C18070vi.A0d(r4, 0);
        String str2 = ((C442222p) r4).A00;
        if (str2 != null) {
            str = AnonymousClass1EG.A0E(str2, 128);
        } else {
            str = null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("👤");
        A10.append(' ');
        if (str == null) {
            str = C18070vi.A0F(this.A00.A00, 2131889020);
        }
        return C690335q.A01(AnonymousClass000.A0y(str, A10));
    }
}
