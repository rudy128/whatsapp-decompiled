package X;

/* renamed from: X.6XK  reason: invalid class name */
public abstract class AnonymousClass6XK {
    public static void A00(AnonymousClass18K r8, C136246tV r9, Integer num, Integer num2, long j, long j2, boolean z) {
        int i;
        int i2;
        double A00;
        int i3;
        C18070vi.A0d(r9, 0);
        AnonymousClass645 r3 = new AnonymousClass645();
        int intValue = num2.intValue();
        if (intValue == 0) {
            i = 1;
        } else if (intValue != 1) {
            i = 3;
        } else {
            i = 2;
        }
        r3.A04 = i;
        if (r9.A04 == AnonymousClass00R.A01) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r3.A03 = i2;
        r3.A06 = Long.valueOf(r9.A00);
        r3.A07 = Long.valueOf(r9.A01);
        r3.A08 = Long.valueOf(r9.A02);
        r3.A09 = Long.valueOf(r9.A03);
        r3.A00 = Boolean.valueOf(r9.A05);
        r3.A0A = Long.valueOf(AnonymousClass6WJ.A00(j));
        r3.A01 = Boolean.valueOf(z);
        if (j2 == -1) {
            A00 = -1.0d;
        } else {
            A00 = (double) AnonymousClass6WJ.A00(C22339B3q.A02(((double) j2) / 1000.0d));
        }
        r3.A02 = Double.valueOf(A00);
        int intValue2 = num.intValue();
        if (intValue2 == 0) {
            i3 = 0;
        } else if (intValue2 != 2) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        r3.A05 = i3;
        r8.CC7(r3);
    }
}
