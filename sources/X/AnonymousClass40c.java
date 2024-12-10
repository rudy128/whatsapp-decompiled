package X;

/* renamed from: X.40c  reason: invalid class name */
public class AnonymousClass40c extends C41011vf {
    public final int A00;
    public final Object A01;

    public AnonymousClass40c(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01(AnonymousClass1EC r4) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass3VF r1 = (AnonymousClass3VF) obj;
            if (r4.equals(r1.A06)) {
                AnonymousClass3VF.A04(r1);
                return;
            }
            return;
        }
        C73293Ub r12 = (C73293Ub) obj;
        if (r4.equals(r12.A05)) {
            r12.A06.execute(new C98554rL(this, 10));
        }
    }
}
