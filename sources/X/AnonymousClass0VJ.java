package X;

/* renamed from: X.0VJ  reason: invalid class name */
public final class AnonymousClass0VJ implements C16240rw {
    public static final AnonymousClass0VJ A00 = new AnonymousClass0VJ();

    public static final long A00(CharSequence charSequence, int i) {
        int i2 = i;
        while (true) {
            if (i2 > 0) {
                if (charSequence.charAt(i2 - 1) == 10) {
                    break;
                }
                i2--;
            } else {
                i2 = 0;
                break;
            }
        }
        int length = charSequence.length();
        while (true) {
            if (i < length) {
                if (charSequence.charAt(i) == 10) {
                    break;
                }
                i++;
            } else {
                i = charSequence.length();
                break;
            }
        }
        return C25858CnM.A01(i2, i);
    }

    public final long BNf(C04620Oc r3, int i) {
        return A00(r3.A04(), i);
    }
}
