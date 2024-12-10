package X;

public abstract class CCM {
    public static final C06 A00(String str) {
        for (C06 c06 : C06.A00) {
            if (C18070vi.A18(c06.toString(), str)) {
                return c06;
            }
        }
        AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, D8F.A0T, AnonymousClass001.A1H("Error finding DimmedBackgroundTapToDismiss enum value for: ", str, AnonymousClass000.A10()), (Throwable) null);
        return C06.AUTO;
    }
}
