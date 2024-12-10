package X;

/* renamed from: X.1J7  reason: invalid class name */
public class AnonymousClass1J7 extends AnonymousClass1J6 implements AnonymousClass1GC {
    public final AnonymousClass1F9 A00;
    public final /* synthetic */ AnonymousClass1DS A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1J7(AnonymousClass1F9 r1, AnonymousClass1DS r2, C22851Dl r3) {
        super(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void C6U(C27581Wq r5, AnonymousClass1F9 r6) {
        AnonymousClass1F9 r2 = this.A00;
        C23401Fx r1 = ((C23391Fw) r2.getLifecycle()).A02;
        C23401Fx r3 = r1;
        if (r1 == C23401Fx.DESTROYED) {
            this.A01.A0D(this.A02);
            return;
        }
        C23401Fx r0 = null;
        while (r0 != r1) {
            A00(((C23391Fw) r2.getLifecycle()).A02.A00(C23401Fx.STARTED));
            r1 = ((C23391Fw) r2.getLifecycle()).A02;
            r0 = r3;
            r3 = r1;
        }
    }
}
