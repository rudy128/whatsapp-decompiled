package X;

public abstract class CCN {
    public static final C07 A00(String str) {
        for (C07 c07 : C07.A00) {
            if (C18070vi.A18(c07.toString(), str)) {
                return c07;
            }
        }
        AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, D8F.A0T, AnonymousClass001.A1H("Error finding DragToDismiss enum value for: ", str, AnonymousClass000.A10()), (Throwable) null);
        return C07.AUTO;
    }
}
