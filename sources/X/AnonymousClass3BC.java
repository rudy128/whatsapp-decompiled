package X;

import java.util.List;

/* renamed from: X.3BC  reason: invalid class name */
public class AnonymousClass3BC implements C1606089d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass3BC(C41821x7 r1, C1606089d r2, int i) {
        this.A00 = i;
        this.A02 = r1;
        this.A01 = r2;
    }

    public void Btv(C122946Sn r2, Integer num, Integer num2) {
        ((C1606089d) this.A01).Btv(r2, num, num2);
    }

    public void C2Z(List list) {
        int i = this.A00;
        C41821x7 r0 = (C41821x7) this.A02;
        if (i != 0) {
            ((AnonymousClass7PL) r0.A06.get()).A00(C122646Re.FACEBOOK);
        } else {
            ((AnonymousClass7FM) r0.A09.get()).A02();
        }
        ((C1606089d) this.A01).C2Z(list);
    }
}
