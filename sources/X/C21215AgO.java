package X;

/* renamed from: X.AgO  reason: case insensitive filesystem */
public final class C21215AgO implements C22470B9c {
    public static final C21215AgO A00 = new C21215AgO();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        C29621ca r4 = r12;
        C62672rm r3 = r13;
        int A17 = C18070vi.A17(r12, r13);
        if (!r13.A09(r12, "picture")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "url";
        Class<String> cls = String.class;
        Long A0L = C17890vO.A0L();
        String str = (String) r3.A05(r4, cls, A0L, 4096L, (Object) null, strArr, false);
        if (str == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        strArr2[0] = "direct_path";
        String str2 = (String) r3.A05(r4, cls, A0L, 4096L, (Object) null, strArr2, false);
        if (str2 != null) {
            return new AnonymousClass9EE(r12, str, str2);
        }
        return null;
    }
}
