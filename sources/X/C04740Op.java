package X;

import java.util.List;

/* renamed from: X.0Op  reason: invalid class name and case insensitive filesystem */
public abstract class C04740Op {
    public static final int A00(Integer num, Integer num2, List list, AnonymousClass1OS r3, AnonymousClass1OS r4, int i, int i2) {
        if (num == num2) {
            return A02(list, r3, i, i2);
        }
        return A03(list, r4, r3, i, i2);
    }

    public static final int A02(List list, AnonymousClass1OS r11, int i, int i2) {
        float f;
        C03690Jn r1;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            C16860tL A0g = AnonymousClass000.A0g(list, i5);
            Object BWC = A0g.BWC();
            if (!(BWC instanceof C03690Jn) || (r1 = (C03690Jn) BWC) == null) {
                f = 0.0f;
            } else {
                f = r1.A00;
            }
            int A0M = AnonymousClass000.A0M(r11.invoke(A0g, Integer.valueOf(i)));
            if (f == 0.0f) {
                i4 += A0M;
            } else if (f > 0.0f) {
                f2 += f;
                i3 = Math.max(i3, C22339B3q.A01(((float) A0M) / f));
            }
        }
        return C22339B3q.A01(((float) i3) * f2) + i4 + ((list.size() - 1) * i2);
    }

    public static final int A03(List list, AnonymousClass1OS r12, AnonymousClass1OS r13, int i, int i2) {
        int A01;
        C03690Jn r1;
        C03690Jn r14;
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        float f = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C16860tL A0g = AnonymousClass000.A0g(list, i4);
            Object BWC = A0g.BWC();
            if ((BWC instanceof C03690Jn) && (r14 = (C03690Jn) BWC) != null) {
                float f2 = r14.A00;
                if (f2 != 0.0f) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
            }
            int min2 = Math.min(AnonymousClass000.A0M(r12.invoke(A0g, Integer.MAX_VALUE)), i - min);
            min += min2;
            i3 = Math.max(i3, AnonymousClass000.A0M(r13.invoke(A0g, Integer.valueOf(min2))));
        }
        if (f == 0.0f) {
            A01 = 0;
        } else if (i == Integer.MAX_VALUE) {
            A01 = Integer.MAX_VALUE;
        } else {
            A01 = C22339B3q.A01(((float) Math.max(i - min, 0)) / f);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C16860tL A0g2 = AnonymousClass000.A0g(list, i5);
            Object BWC2 = A0g2.BWC();
            if ((BWC2 instanceof C03690Jn) && (r1 = (C03690Jn) BWC2) != null) {
                float f3 = r1.A00;
                if (f3 > 0.0f) {
                    int i6 = Integer.MAX_VALUE;
                    if (A01 != Integer.MAX_VALUE) {
                        i6 = C22339B3q.A01(((float) A01) * f3);
                    }
                    i3 = Math.max(i3, AnonymousClass000.A0M(r13.invoke(A0g2, Integer.valueOf(i6))));
                }
            }
        }
        return i3;
    }
}
