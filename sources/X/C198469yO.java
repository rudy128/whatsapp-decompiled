package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9yO  reason: invalid class name and case insensitive filesystem */
public class C198469yO {
    public C195459tN A00;
    public List A01 = AnonymousClass000.A13();
    public final C199299zl A02;
    public final List A03 = AnonymousClass000.A13();
    public final AnonymousClass1XN A04;

    public C198469yO(C199299zl r2, AnonymousClass1XN r3) {
        this.A04 = r3;
        this.A02 = r2;
    }

    public static ArrayList A00(List list, Map map) {
        C194849sO r0;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AF0 af0 = (AF0) it.next();
            if (!(af0.A01 == 1 || (r0 = (C194849sO) map.get(af0.A0F)) == null)) {
                List list2 = r0.A02;
                List list3 = r0.A03;
                String str = r0.A01;
                af0 = AF0.A00(af0);
                af0.A06 = list2;
                af0.A05 = list3;
                af0.A04 = str;
                af0.A01 = 1;
            }
            A13.add(af0);
        }
        return A13;
    }
}
