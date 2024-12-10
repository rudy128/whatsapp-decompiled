package X;

/* renamed from: X.4iv  reason: invalid class name and case insensitive filesystem */
public class C93404iv implements C107165Yq {
    public final int A00;
    public final Object A01;

    public C93404iv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BnB(C178119Bw r3) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C91454fi r1 = (C91454fi) obj;
            if (!C42171xk.A00(r3, r1.A06)) {
                r1.A06 = r3;
                C91454fi.A00(r1);
                return;
            }
            return;
        }
        C77843ra r12 = (C77843ra) obj;
        r12.A01 = r3;
        r12.A09.CQq(r3);
        if (r3 != null && r3.A0W()) {
            r12.A01.invalidateOptionsMenu();
        }
    }
}
