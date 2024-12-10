package X;

/* renamed from: X.3JC  reason: invalid class name */
public abstract class AnonymousClass3JC extends AnonymousClass1c5 {
    public static final boolean A01(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
