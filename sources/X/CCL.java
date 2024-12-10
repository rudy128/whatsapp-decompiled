package X;

public abstract class CCL {
    public static final C08 A00(String str) {
        for (C08 c08 : C08.A00) {
            if (C18070vi.A18(c08.toString(), str)) {
                return c08;
            }
        }
        AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, D8F.A0T, AnonymousClass001.A1H("Error finding BackgroundMode enum value for: ", str, AnonymousClass000.A10()), (Throwable) null);
        return C08.STATIC;
    }
}
