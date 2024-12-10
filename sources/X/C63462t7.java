package X;

import android.os.Build;

/* renamed from: X.2t7  reason: invalid class name and case insensitive filesystem */
public abstract class C63462t7 {
    public static int A00(CharSequence charSequence) {
        C43281zY r8 = new C43281zY(charSequence);
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            r8.A00 = i;
            long A00 = C43291zZ.A00(r8, false);
            if (A00 != -1) {
                i += r8.A03(A00, i);
                i2++;
                if (i2 > 3) {
                }
            }
            return 0;
        }
        return i2;
    }

    public static String A02(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C43281zY r6 = new C43281zY(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r6.A00 = i;
            long A00 = C43291zZ.A00(r6, false);
            int A02 = r6.A02(A00, i);
            if (Build.VERSION.SDK_INT >= 23 || A00 == -1 || ((int) (A00 & 15)) <= 1) {
                A10.append(charSequence.subSequence(i, i + A02));
            } else {
                A10.append(9633);
            }
            i += A02;
        }
        return A10.toString();
    }

    public static CharSequence A01(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        C43281zY r4 = new C43281zY(charSequence);
        int i4 = 0;
        int i5 = i;
        while (i5 < i2) {
            r4.A00 = i5;
            i5 += r4.A02(C43291zZ.A00(r4, false), i5);
            i4++;
            if (i4 >= i3) {
                return charSequence.subSequence(i, i5);
            }
        }
        return null;
    }

    public static String A03(CharSequence charSequence) {
        StringBuilder A10 = AnonymousClass000.A10();
        C43281zY r10 = new C43281zY(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r10.A00 = i;
            long A00 = C43291zZ.A00(r10, false);
            int A02 = r10.A02(A00, i);
            if (A00 != -1) {
                for (int i2 = 0; i2 < ((int) (A00 & 15)); i2++) {
                    A10.append(' ');
                }
            } else {
                A10.append(charSequence.subSequence(i, i + A02));
            }
            i += A02;
        }
        return A10.toString();
    }
}
