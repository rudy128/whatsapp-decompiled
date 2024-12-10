package X;

import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class AP3 implements C22423B7f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C184219ab A01;
    public final /* synthetic */ C198469yO A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public final void C2S() {
        int i;
        int i2;
        C198469yO r5 = this.A02;
        boolean z = this.A04;
        List list = this.A03;
        int i3 = this.A00;
        C184219ab r4 = this.A01;
        if (z) {
            i = list.size();
        } else {
            i = 14;
            if (i3 == 2) {
                i = 5;
            }
        }
        List list2 = r5.A03;
        int min = Math.min(i, C108955ca.A08(list, 150 - list2.size()));
        list2.addAll(list.subList(0, min));
        r5.A01 = list.subList(min, Math.min(list.size(), 150));
        ArrayList A10 = C17880vN.A10(list2);
        AP5 ap5 = r4.A01;
        C195699tl r1 = r4.A00;
        C188769hx r2 = ap5.A09;
        List list3 = r1.A06;
        r2.A05 = new C195699tl(r1.A00, r1.A01, r1.A03, r1.A05, r1.A04, r1.A02, r1.A07, list3, A10, r1.A08);
        r2.A0H |= AnonymousClass000.A1T(A10.size(), 150);
        AP5.A07(ap5, 1);
        if (!r2.A05.A09.isEmpty() || !r2.A05.A06.isEmpty()) {
            int i4 = 1;
            if (r2.A00 > 0) {
                i4 = 7;
            }
            r2.A03 = i4;
            ap5.A0B();
            AP5.A06(ap5);
            r2.A00++;
            AP5.A04(r1, ap5);
            if (ap5.A05 != 0 && 5 == A10.size()) {
                i2 = 10;
            } else {
                return;
            }
        } else {
            i2 = 6;
        }
        r2.A03 = i2;
        ap5.A0B();
    }

    public /* synthetic */ AP3(C184219ab r1, C198469yO r2, List list, int i, boolean z) {
        this.A02 = r2;
        this.A04 = z;
        this.A03 = list;
        this.A00 = i;
        this.A01 = r1;
    }
}
