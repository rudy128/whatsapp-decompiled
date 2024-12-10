package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7MJ  reason: invalid class name */
public class AnonymousClass7MJ implements AnonymousClass888 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7MJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C6p(List list) {
        List list2;
        List list3;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C121146Hx r3 = (C121146Hx) obj;
            if (r3.A08 && (list3 = r3.A02) != null && !list3.isEmpty()) {
                Iterator it = r3.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("loading-hash".equals(C108945cZ.A0x(it).A0F)) {
                        List list4 = r3.A02;
                        if (list4 != null) {
                            r3.A06(list4);
                            return;
                        }
                    }
                }
            }
            r3.A06(list);
            return;
        }
        C121156Hy r32 = (C121156Hy) obj;
        if (r32.A0D && (list2 = r32.A06) != null && !list2.isEmpty()) {
            Iterator it2 = r32.A06.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if ("loading-hash".equals(C108945cZ.A0x(it2).A0F)) {
                    List list5 = r32.A06;
                    if (list5 != null) {
                        r32.A06(list5);
                        return;
                    }
                }
            }
        }
        r32.A06(list);
    }
}
