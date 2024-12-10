package X;

/* renamed from: X.2oC  reason: invalid class name and case insensitive filesystem */
public abstract class C60542oC {
    public static final boolean A00(AnonymousClass1QB r5) {
        C18070vi.A0d(r5, 0);
        if (r5.BS5() == 5 || r5.BS5() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C34141jz r7) {
        if (!AnonymousClass000.A1a(r7.A04()) || r7.A02().length() < 4) {
            return false;
        }
        String A02 = r7.A02();
        C18070vi.A0X(A02);
        int length = A02.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A00 = C18070vi.A00(A02.charAt(i2), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        String obj = A02.subSequence(i, length + 1).toString();
        if (obj != null) {
            for (char isDigit : obj.toCharArray()) {
                if (!Character.isDigit(isDigit)) {
                    return false;
                }
            }
        }
        return true;
    }
}
