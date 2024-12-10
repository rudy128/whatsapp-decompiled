package X;

import android.text.TextUtils;

/* renamed from: X.6v3  reason: invalid class name and case insensitive filesystem */
public abstract class C137186v3 {
    public static int A00(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return A01(charSequence, 0, charSequence.length());
    }

    public static int A01(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (length != 0) {
            C43281zY r2 = new C43281zY(charSequence);
            while (i < i2) {
                r2.A00 = i;
                i += r2.A02(C43291zZ.A00(r2, false), i);
                i3++;
            }
        }
        return i3;
    }
}
