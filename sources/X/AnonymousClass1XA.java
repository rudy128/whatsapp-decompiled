package X;

/* renamed from: X.1XA  reason: invalid class name */
public class AnonymousClass1XA implements AnonymousClass1X8 {
    public static final AnonymousClass1XA A00 = new Object();

    public int BEk(CharSequence charSequence, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        if (z) {
            return 1;
        }
        return 2;
    }
}
