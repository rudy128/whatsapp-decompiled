package X;

/* renamed from: X.7N3  reason: invalid class name */
public class AnonymousClass7N3 implements AnonymousClass88K {
    public final int A00;
    public final Object A01;

    public AnonymousClass7N3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C6z() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass74M r1 = (AnonymousClass74M) obj;
            C132116mE r0 = r1.A0G;
            if (r0 != null) {
                r0.A00();
                r1.A0G = null;
                return;
            }
            return;
        }
        C145777Mo r12 = (C145777Mo) obj;
        int i2 = C145777Mo.A15;
        C132116mE r02 = r12.A0L;
        if (r02 != null) {
            r02.A00();
            r12.A0L = null;
        }
    }
}
