package X;

public class AMK implements C72053Kl {
    public final int A00;
    public final Object A01;

    public AMK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BE3(Object obj) {
        if (this.A00 != 0) {
            int A0M = AnonymousClass000.A0M(obj);
            AMY amy = (AMY) this.A01;
            amy.A00 = ((double) A0M) * 0.05d;
            AMY.A00(amy);
            return;
        }
        ((A34) this.A01).A0C(obj);
    }
}
