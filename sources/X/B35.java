package X;

public final class B35 extends AnonymousClass11G implements C22821Di {
    public static final B35 A00 = new B35();

    public B35() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        if (!(th instanceof C173518vD)) {
            return th.getMessage();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("(code: ");
        A10.append(((C173518vD) th).BOq());
        return C17900vP.A0C(") ", A10, th);
    }
}
