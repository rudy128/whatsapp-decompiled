package X;

/* renamed from: X.0F1  reason: invalid class name */
public abstract class AnonymousClass0F1 {
    public static final /* synthetic */ int A00(C04280Mo r5, AnonymousClass0AM r6) {
        long j;
        AnonymousClass0AM A0e = r6.A0e();
        if (A0e == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Child of ");
            A10.append(r6);
            throw AnonymousClass000.A0o(" cannot be null when calculating alignment line", A10);
        } else if (r6.A0c().BMp().containsKey(r5)) {
            Number number = (Number) r6.A0c().BMp().get(r5);
            if (number != null) {
                return number.intValue();
            }
            return Integer.MIN_VALUE;
        } else {
            int BLy = A0e.BLy(r5);
            if (BLy == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            A0e.A0h(true);
            r6.A0g(true);
            r6.A0f();
            A0e.A0h(false);
            r6.A0g(false);
            boolean z = r5 instanceof AnonymousClass0AE;
            long A0b = A0e.A0b();
            if (z) {
                j = A0b & 4294967295L;
            } else {
                j = A0b >> 32;
            }
            return BLy + ((int) j);
        }
    }
}
