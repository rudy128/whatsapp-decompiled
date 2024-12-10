package X;

import android.graphics.Color;

/* renamed from: X.1xO  reason: invalid class name and case insensitive filesystem */
public class C41961xO implements C40301uU {
    public static final C41961xO A00 = new Object();

    public /* bridge */ /* synthetic */ Object CB7(C39941tt r15, float f) {
        double d;
        boolean z = false;
        if (r15.A0B() == AnonymousClass00R.A00) {
            z = true;
            r15.A0F();
        }
        double A07 = r15.A07();
        double A072 = r15.A07();
        double A073 = r15.A07();
        if (r15.A0B() == AnonymousClass00R.A0u) {
            d = r15.A07();
        } else {
            d = 1.0d;
        }
        if (z) {
            r15.A0H();
        }
        if (A07 <= 1.0d && A072 <= 1.0d && A073 <= 1.0d) {
            A07 *= 255.0d;
            A072 *= 255.0d;
            A073 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) A07, (int) A072, (int) A073));
    }
}
