package X;

import java.util.List;

/* renamed from: X.0M5  reason: invalid class name */
public abstract class AnonymousClass0M5 {
    public static final C17330uU A00 = AnonymousClass0Q9.A03(false);

    public static final void A00(AnonymousClass0KX r10, AnonymousClass0K4 r11) {
        long j;
        boolean A1b = AnonymousClass001.A1b(A00);
        boolean z = r10.A0C;
        if (A1b) {
            if (!z && r10.A0B) {
                r11.A01();
            }
            if (!AnonymousClass0Oz.A01(r10)) {
                List A002 = r10.A00();
                int size = A002.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass0IL r0 = (AnonymousClass0IL) A002.get(i);
                    r11.A02(r0.A02, r0.A00);
                }
                j = r10.A0A;
                r11.A02(j, r10.A00);
            } else {
                j = r10.A0A;
                if (j - r11.A01 > 40) {
                    r11.A01();
                }
            }
            r11.A01 = j;
            return;
        }
        if (!z && r10.A0B) {
            r11.A00 = r10.A06;
            r11.A01();
        }
        long j2 = r10.A07;
        List A003 = r10.A00();
        int size2 = A003.size();
        int i2 = 0;
        while (i2 < size2) {
            AnonymousClass0IL r9 = (AnonymousClass0IL) A003.get(i2);
            long j3 = r9.A01;
            long A05 = AnonymousClass0QY.A05(r11.A00, AnonymousClass0QY.A04(j3, j2));
            r11.A00 = A05;
            r11.A02(r9.A02, A05);
            i2++;
            j2 = j3;
        }
        long A052 = AnonymousClass0QY.A05(r11.A00, AnonymousClass0QY.A04(r10.A06, j2));
        r11.A00 = A052;
        r11.A02(r10.A0A, A052);
    }
}
