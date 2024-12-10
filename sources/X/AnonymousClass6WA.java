package X;

import java.io.File;

/* renamed from: X.6WA  reason: invalid class name */
public abstract class AnonymousClass6WA {
    public static int A00(AnonymousClass1L9 r5, AnonymousClass190 r6, AnonymousClass1FU r7, AnonymousClass1KB r8, C219217x r9, C32211gp r10, C438921i r11, C139956zi r12, AnonymousClass1DC r13, AnonymousClass10I r14) {
        int i;
        AnonymousClass1FU r4 = r7;
        AnonymousClass3Ma.A1N(r7, 0, r9);
        if (AnonymousClass112.A07() || r9.A0G()) {
            C438921i r72 = r11;
            C62572rc A00 = AnonymousClass206.A00(r11);
            if (!r11.A0v.A02 && !A00.A0V) {
                return 1;
            }
            File file = A00.A0G;
            if ((file == null || !file.exists()) && A00.A07 == 1) {
                return 4;
            }
            File file2 = A00.A0G;
            if (file2 == null || !file2.exists()) {
                return 2;
            }
            C62272r8.A04.A0A(r5, r6, r4, r8, r10, r72, r12, r13, r14);
            return 3;
        }
        if (!AnonymousClass112.A07()) {
            i = 2131894470;
        } else {
            i = 2131894473;
            if (!AnonymousClass112.A09()) {
                i = 2131894472;
            }
        }
        r7.startActivity(AnonymousClass74O.A03(r7, 2131894423, i, false));
        return 0;
    }
}
