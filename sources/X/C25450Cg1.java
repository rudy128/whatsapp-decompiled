package X;

import android.graphics.Rect;

/* renamed from: X.Cg1  reason: case insensitive filesystem */
public abstract class C25450Cg1 {
    public static final C27251Dad A00 = new C27251Dad();
    public static final ThreadLocal A01 = new C27245DaP();
    public static final ThreadLocal A02 = new C27246DaQ();

    public static final Rect A00(int i, int i2, int i3, int i4) {
        Rect A07 = AnonymousClass3MW.A07();
        int i5 = i2;
        int i6 = i4;
        if (i > i2) {
            i5 = i;
            i = i2;
        }
        if (i3 > i4) {
            i6 = i3;
            i3 = i4;
        }
        float f = (float) i3;
        float f2 = (float) i6;
        float f3 = (float) i;
        float f4 = (float) i5;
        if (f / f2 > f3 / f4) {
            int i7 = (i3 - ((int) (f3 * (f2 / f4)))) / 2;
            A07.set(i7, 0, i3 - i7, i6);
            return A07;
        }
        int i8 = (i6 - ((int) (f4 * (f / f3)))) / 2;
        A07.set(0, i8, i3, i6 - i8);
        return A07;
    }
}
