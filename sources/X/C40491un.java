package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: X.1un  reason: invalid class name and case insensitive filesystem */
public abstract class C40491un {
    public static final C40111uB A00 = C40111uB.A01("x", "y");

    public static ArrayList A03(C39941tt r3, float f) {
        ArrayList arrayList = new ArrayList();
        r3.A0F();
        while (r3.A0B() == AnonymousClass00R.A00) {
            r3.A0F();
            arrayList.add(A02(r3, f));
            r3.A0H();
        }
        r3.A0H();
        return arrayList;
    }

    public static float A00(C39941tt r4) {
        Integer A0B = r4.A0B();
        int intValue = A0B.intValue();
        if (intValue == 6) {
            return (float) r4.A07();
        }
        if (intValue == 0) {
            r4.A0F();
            float A07 = (float) r4.A07();
            while (r4.A0M()) {
                r4.A0K();
            }
            r4.A0H();
            return A07;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown value for token of type ");
        sb.append(C24513C7h.A00(A0B));
        throw new IllegalArgumentException(sb.toString());
    }

    public static int A01(C39941tt r8) {
        r8.A0F();
        int A07 = (int) (r8.A07() * 255.0d);
        int A072 = (int) (r8.A07() * 255.0d);
        int A073 = (int) (r8.A07() * 255.0d);
        while (r8.A0M()) {
            r8.A0K();
        }
        r8.A0H();
        return Color.argb(255, A07, A072, A073);
    }

    public static PointF A02(C39941tt r5, float f) {
        float f2;
        float f3;
        int intValue = r5.A0B().intValue();
        if (intValue != 6) {
            if (intValue == 0) {
                r5.A0F();
                f2 = (float) r5.A07();
                f3 = (float) r5.A07();
                while (r5.A0B() != AnonymousClass00R.A01) {
                    r5.A0K();
                }
                r5.A0H();
            } else if (intValue == 2) {
                r5.A0G();
                f2 = 0.0f;
                f3 = 0.0f;
                while (r5.A0M()) {
                    int A09 = r5.A09(A00);
                    if (A09 == 0) {
                        f2 = A00(r5);
                    } else if (A09 != 1) {
                        r5.A0J();
                        r5.A0K();
                    } else {
                        f3 = A00(r5);
                    }
                }
                r5.A0I();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown point starts with ");
                sb.append(C24513C7h.A00(r5.A0B()));
                throw new IllegalArgumentException(sb.toString());
            }
            return new PointF(f2 * f, f3 * f);
        }
        float A07 = (float) r5.A07();
        float A072 = (float) r5.A07();
        while (r5.A0M()) {
            r5.A0K();
        }
        return new PointF(A07 * f, A072 * f);
    }
}
