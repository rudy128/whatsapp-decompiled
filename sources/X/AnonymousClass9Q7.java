package X;

/* renamed from: X.9Q7  reason: invalid class name */
public abstract class AnonymousClass9Q7 {
    public static final C193199ph A00(String str, String str2) {
        C18070vi.A0d(str2, 1);
        byte[] digest = C108945cZ.A1I().digest(C108975cc.A1O(C17900vP.A0A(str, str2)));
        C18070vi.A0b(digest);
        String str3 = "";
        for (byte valueOf : digest) {
            StringBuilder A11 = AnonymousClass000.A11(str3);
            String format = String.format("%02x", C108945cZ.A1b(Byte.valueOf(valueOf), new Object[1], 0, 1));
            C18070vi.A0X(format);
            str3 = AnonymousClass000.A0y(format, A11);
        }
        return new C193199ph(str3);
    }
}
