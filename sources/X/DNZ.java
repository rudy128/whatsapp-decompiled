package X;

import java.lang.ref.Reference;
import java.util.Map;

public class DNZ implements E6G {
    public final int A00;
    public final Object A01;

    public DNZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void C5q(Object obj) {
        switch (this.A00) {
            case 0:
                C25166CaH caH = (C25166CaH) obj;
                C18070vi.A0d(caH, 0);
                C26012CqT cqT = (C26012CqT) this.A01;
                synchronized (cqT.A08) {
                    cqT.A00 = caH;
                    cqT.A06.A01(new C25137CZn(caH));
                }
                return;
            case 1:
                Map map = ((DNX) obj).A00;
                C18070vi.A0d(map, 0);
                ((E6G) this.A01).C5q(new C25138CZo(map));
                return;
            default:
                C25166CaH caH2 = ((C25137CZn) obj).A00;
                C18070vi.A0d(caH2, 0);
                Object obj2 = ((Reference) this.A01).get();
                if (obj2 != null) {
                    C26962DNk.A04(new C21459AkQ(obj2, new C25137CZn(caH2), "acq", 8));
                    return;
                }
                return;
        }
    }
}
