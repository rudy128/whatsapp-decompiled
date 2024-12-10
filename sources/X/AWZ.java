package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AWZ implements BB0 {
    public final C198349yC A00;
    public final BB0 A01;
    public final String A02;

    public void Bsq(C21598Amm amm) {
        this.A01.Bsq(amm);
    }

    public void CDY(List list, boolean z) {
        C198349yC r5;
        if (z && (r5 = this.A00) != null) {
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0D.add(((C135346s3) it.next()).A00.name());
            }
            String str = this.A02;
            int A002 = C18020vd.A00(C18040vf.A02, r5.A02, 8151);
            if (A002 < 0) {
                A002 = 0;
            }
            long A012 = ((long) A002) + AnonymousClass11P.A01(r5.A00);
            C18070vi.A0d(A0D, 0);
            if (str == null) {
                str = "global";
            }
            String A05 = r5.A01.A05();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C29431cG.A0s(A0D));
            A10.append('_');
            A10.append(str);
            String A0Z = C17890vO.A0Z(A05, A10, '_');
            Map map = r5.A03;
            synchronized (map) {
                map.put(A0Z, new C193909qr(list, A012));
            }
            C198349yC.A00(r5);
        }
        this.A01.CDY(list, true);
    }

    public AWZ(C198349yC r1, BB0 bb0, String str) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = bb0;
    }
}
