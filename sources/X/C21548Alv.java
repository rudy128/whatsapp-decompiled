package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Alv  reason: case insensitive filesystem */
public final /* synthetic */ class C21548Alv implements AnonymousClass1OS {
    public final /* synthetic */ A1X A00;
    public final /* synthetic */ AP5 A01;

    public final Object invoke(Object obj, Object obj2) {
        AP5 ap5 = this.A01;
        A1X a1x = this.A00;
        List list = (List) obj;
        List list2 = (List) obj2;
        C188769hx r2 = ap5.A09;
        C187639g8 r1 = r2.A06;
        if (r1 != null) {
            r1.A03 = list.size();
            r2.A06.A05 = list2;
        }
        a1x.A01.clear();
        r2.A0I = !list.isEmpty();
        r2.A0G.clear();
        r2.A0G.addAll(list);
        if (r2.A0I) {
            r2.A03 = 13;
            if (ap5.A05 == 1) {
                C185729d3 r4 = ap5.A0F;
                C20653ATl aTl = r4.A00;
                List<AF1> A0v = C29431cG.A0v(list, 5);
                ArrayList A0D = C29351c6.A0D(A0v);
                for (AF1 af1 : A0v) {
                    A0D.add(af1.A0B.A0A);
                }
                aTl.A05(A0D, r4.A01);
            } else {
                AP5.A07(ap5, 2);
            }
            ap5.A0B();
            AP5.A06(ap5);
        }
        return null;
    }

    public /* synthetic */ C21548Alv(A1X a1x, AP5 ap5) {
        this.A01 = ap5;
        this.A00 = a1x;
    }
}
