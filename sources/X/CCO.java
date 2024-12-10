package X;

public abstract class CCO {
    public static final C0B A00(String str) {
        for (C0B c0b : C0B.A00) {
            if (C18070vi.A18(c0b.toString(), str)) {
                return c0b;
            }
        }
        AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, D8F.A0T, AnonymousClass001.A1H("Error finding Mode enum value for ", str, AnonymousClass000.A10()), (Throwable) null);
        return C0B.FULL_SHEET;
    }
}
