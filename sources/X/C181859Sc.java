package X;

/* renamed from: X.9Sc  reason: invalid class name and case insensitive filesystem */
public abstract class C181859Sc {
    public static final boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C18070vi.A00(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
