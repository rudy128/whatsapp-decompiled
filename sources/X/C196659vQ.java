package X;

/* renamed from: X.9vQ  reason: invalid class name and case insensitive filesystem */
public abstract class C196659vQ {
    public static final C62382rJ A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return C62382rJ.A03;
        }
        if (intValue == 1) {
            return C62382rJ.A02;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unknown SyncdOperation: ");
        throw AnonymousClass000.A0o("SET", A10);
    }

    public static final Integer A01(C62382rJ r2) {
        if (C18070vi.A18(r2, C62382rJ.A03)) {
            return AnonymousClass00R.A00;
        }
        if (C18070vi.A18(r2, C62382rJ.A02)) {
            return AnonymousClass00R.A01;
        }
        throw AnonymousClass000.A0n(AnonymousClass001.A1E(r2, "Unknown SyncdOperation: ", AnonymousClass000.A10()));
    }
}
