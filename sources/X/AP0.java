package X;

import java.util.List;

public final /* synthetic */ class AP0 implements C22423B7f {
    public final /* synthetic */ C195699tl A00;
    public final /* synthetic */ AP5 A01;
    public final /* synthetic */ List A02;

    public final void C2S() {
        AP5 ap5 = this.A01;
        C195699tl r2 = this.A00;
        List list = this.A02;
        List list2 = r2.A09;
        list2.clear();
        list2.addAll(list);
        C188769hx r1 = ap5.A09;
        r1.A05 = r2;
        if (!list2.isEmpty() || !r2.A06.isEmpty()) {
            r1.A03 = 1;
            ap5.A0B();
            AP5.A05(ap5);
            AP5.A04(r2, ap5);
            return;
        }
        r1.A03 = 6;
        ap5.A0B();
    }

    public /* synthetic */ AP0(C195699tl r1, AP5 ap5, List list) {
        this.A01 = ap5;
        this.A00 = r1;
        this.A02 = list;
    }
}
