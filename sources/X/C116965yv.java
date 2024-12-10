package X;

/* renamed from: X.5yv  reason: invalid class name and case insensitive filesystem */
public final class C116965yv extends C20126A8l {
    public static final C62382rJ A02 = C62382rJ.A03;
    public final AnonymousClass1E2 A00;
    public final String[] A01;

    public C116965yv(C19999A2n a2n, AnonymousClass1E2 r13, String str, long j) {
        super(A02, a2n, str, "regular", 7, j, false);
        this.A00 = r13;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "shareOwnPn";
        C17880vN.A1J(r13, A1Z, 1);
        this.A01 = A1Z;
    }

    public String A0B() {
        return "shareOwnPn";
    }

    public String[] A0F() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShareOwnPnMutation(lidUserJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
