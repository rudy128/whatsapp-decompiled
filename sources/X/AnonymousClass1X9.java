package X;

/* renamed from: X.1X9  reason: invalid class name */
public class AnonymousClass1X9 implements AnonymousClass1X8 {
    public static final AnonymousClass1X9 A00 = new Object();

    public int BEk(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            i2 = 1;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            continue;
                    }
                }
                i2 = 0;
            }
        }
        return i2;
    }
}
