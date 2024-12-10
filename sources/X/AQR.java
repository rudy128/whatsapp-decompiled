package X;

public class AQR implements C43451zp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AQR(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BpK(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass8o8 r2 = (AnonymousClass8o8) this.A01;
            C43451zp r1 = (C43451zp) this.A02;
            AnonymousClass8o7 r0 = r2.A00;
            if (r0 != null && !r0.A00.A03()) {
                r1.BpK(obj);
            }
            r2.A00 = null;
            return;
        }
        C42571yO r02 = (C42571yO) this.A01;
        Object obj2 = this.A02;
        if (obj != null) {
            AnonymousClass1TD r3 = r02.A03;
            ((C31931gM) r3.A0E.get()).A01(new AnonymousClass3C4(r3, obj2, obj, 2), 15);
        }
    }
}
