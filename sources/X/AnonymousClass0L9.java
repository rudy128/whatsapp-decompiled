package X;

/* renamed from: X.0L9  reason: invalid class name */
public abstract class AnonymousClass0L9 {
    public static final void A00(C04910Pm r3, int i, int i2) {
        int i3 = 1 << i;
        int i4 = r3.A03;
        if ((i4 & i3) == 0) {
            r3.A03 = i3 | i4;
            r3.A05[(r3.A00 - C04910Pm.A01(r3).A00) + i] = i2;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Already pushed argument ");
        throw AnonymousClass000.A0o(C04910Pm.A01(r3).A04(i), A10);
    }

    public static final void A01(C04910Pm r3, Object obj, int i) {
        int i2 = 1 << i;
        int i3 = r3.A04;
        if ((i3 & i2) == 0) {
            r3.A04 = i2 | i3;
            r3.A07[(r3.A01 - C04910Pm.A01(r3).A01) + i] = obj;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Already pushed argument ");
        throw AnonymousClass000.A0o(C04910Pm.A01(r3).A05(i), A10);
    }
}
