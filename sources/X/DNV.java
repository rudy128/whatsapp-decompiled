package X;

import android.util.SparseArray;
import java.util.Map;

public class DNV implements E6E {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DNV(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final boolean CRs(DFL dfl) {
        if (this.A00 != 0) {
            C04170Mc A002 = ((AnonymousClass0IV) this.A02).A00();
            Integer valueOf = Integer.valueOf(dfl.A04);
            C18070vi.A0d(valueOf, 0);
            Map map = A002.A00;
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = null;
            }
            if ((obj instanceof SparseArray) && obj != null) {
                A002.A01.put(valueOf, obj);
            }
            Object obj2 = map.get(dfl);
            if (obj2 == null) {
                return false;
            }
            A002.A01.put(dfl, obj2);
            return false;
        }
        CQH cqh = (CQH) this.A02;
        C18070vi.A0b(dfl);
        CQH cqh2 = (CQH) this.A01;
        int i = dfl.A04;
        Object obj3 = cqh.A02.get(i);
        if (obj3 != null) {
            cqh2.A02.put(i, obj3);
        }
        Object obj4 = cqh.A00.get(i);
        if (obj4 != null) {
            cqh2.A00.put(i, obj4);
        }
        Object obj5 = cqh.A01.get(i);
        if (obj5 == null) {
            return false;
        }
        cqh2.A01.put(i, obj5);
        return false;
    }
}
