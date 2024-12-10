package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9z5  reason: invalid class name and case insensitive filesystem */
public final class C198889z5 {
    public static final C198889z5 A00 = new Object();

    public final void A00(DAE dae, List list, boolean z) {
        double d;
        double d2;
        DAE dae2 = dae;
        C26152CtJ ctJ = dae2.A0R;
        C20278AEl aEl = ctJ.A06().A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (aEl.A02((C20269AEc) next)) {
                A13.add(next);
            }
        }
        if (A13.size() != list.size()) {
            C20269AEc A002 = aEl.A00();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aEl = aEl.A01((C20269AEc) it.next());
            }
            C18070vi.A0b(A002);
            C20269AEc aEc = aEl.A00;
            C20269AEc aEc2 = aEl.A01;
            double d3 = A002.A00;
            double abs = Math.abs(d3 - aEc.A00);
            double abs2 = Math.abs(aEc2.A00 - d3);
            if (abs > abs2) {
                d = d3 - abs;
            } else {
                d = d3 + abs2;
            }
            double d4 = A002.A01;
            C20278AEl A01 = aEl.A01(new C20269AEc(d, d4));
            C18070vi.A0b(A01);
            C20269AEc aEc3 = A01.A00;
            C20269AEc aEc4 = A01.A01;
            double abs3 = Math.abs(d4 - aEc3.A01);
            double abs4 = Math.abs(aEc4.A01 - d4);
            if (abs3 > abs4) {
                d2 = d4 - abs3;
            } else {
                d2 = d4 + abs4;
            }
            C20278AEl A012 = A01.A01(new C20269AEc(d3, d2));
            C18070vi.A0b(A012);
            C20269AEc aEc5 = A012.A00;
            C20269AEc aEc6 = A012.A01;
            float A013 = AnonymousClass8BR.A01(dae2.A0O, 120.0f);
            float f = dae2.A02().A02;
            double d5 = (double) (A013 / (((float) ((1 << ((int) f)) * ctJ.A00.A0N)) * ((f % 1.0f) + 1.0f)));
            double A014 = C26152CtJ.A01(aEc5.A01);
            double A003 = C26152CtJ.A00(aEc5.A00);
            C20278AEl A015 = A012.A01(new C20269AEc(C26152CtJ.A02(C26152CtJ.A00(aEc6.A00) + d5), ((C26152CtJ.A01(aEc6.A01) - d5) * 360.0d) - 180.0d)).A01(new C20269AEc(C26152CtJ.A02(A003 - d5), ((A014 + d5) * 360.0d) - 180.0d));
            CXL cxl = new CXL();
            cxl.A07 = A015;
            cxl.A06 = A002;
            if (z) {
                dae2.A0A(cxl, (E7P) null, 150);
            } else {
                dae2.A09(cxl);
            }
        }
    }
}
