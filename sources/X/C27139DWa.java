package X;

/* renamed from: X.DWa  reason: case insensitive filesystem */
public class C27139DWa implements C18080vj, C22821Di {
    public final int A00;

    public C27139DWa(int i) {
        this.A00 = i;
    }

    public final Object invoke(Object obj) {
        boolean z;
        switch (this.A00) {
            case 0:
                return AnonymousClass000.A0i();
            case 6:
                C26224CvE cvE = (C26224CvE) obj;
                C18070vi.A0d(cvE, 0);
                String str = cvE.A01.A00;
                int length = str.length();
                boolean z2 = false;
                if (length <= 30) {
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            char charAt = str.charAt(i);
                            if (Character.isLetterOrDigit(charAt) || charAt == '_' || charAt == '.') {
                                i++;
                            }
                        } else if (!AnonymousClass1YF.A0Y(str, "..", true)) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 7:
                C16020ra r2 = C02980Gd.A01;
                return AnonymousClass0Ne.A00(C04880Ph.A02(new AnonymousClass0Tx(r2, 500, 0)), C04880Ph.A03(new AnonymousClass0Tx(r2, 500, 0)));
            case 8:
                C26224CvE cvE2 = (C26224CvE) obj;
                C18070vi.A0d(cvE2, 0);
                String str2 = cvE2.A01.A00;
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= str2.length()) {
                        z3 = true;
                    } else if (Character.isDigit(str2.charAt(i2))) {
                        i2++;
                    }
                }
                return Boolean.valueOf(z3);
            case 10:
                C26224CvE cvE3 = (C26224CvE) obj;
                C18070vi.A0d(cvE3, 0);
                String str3 = cvE3.A01.A00;
                int length2 = str3.length();
                if (length2 <= 6) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = true;
                        } else if (Character.isDigit(str3.charAt(i3))) {
                            i3++;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                return C27621Wu.A00;
        }
    }
}
