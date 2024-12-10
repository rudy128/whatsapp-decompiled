package X;

/* renamed from: X.180  reason: invalid class name */
public class AnonymousClass180 {
    public AnonymousClass1ER A00;
    public final AnonymousClass118 A01;
    public final C219317y A02;
    public final AnonymousClass00H A03;

    public static void A00(AnonymousClass180 r1) {
        ((AnonymousClass181) r1.A03.get()).A02();
        boolean z = false;
        if (r1.A00 != null) {
            z = true;
        }
        C17960vV.A0D(z);
    }

    public static void A01(AnonymousClass180 r4) {
        AnonymousClass1ER r0 = r4.A00;
        if (r0 != null) {
            C17960vV.A07(r0);
            r0.removeMessages(1);
            r4.A00.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public AnonymousClass180(AnonymousClass118 r1, C219317y r2, AnonymousClass00H r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
