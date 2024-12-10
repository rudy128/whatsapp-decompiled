package X;

import java.util.Map;

/* renamed from: X.CVu  reason: case insensitive filesystem */
public class C25062CVu {
    public final Object A00 = C17880vN.A0p();
    public final Map A01 = C17880vN.A11();

    public int A00(DFL dfl, DFL dfl2, String str) {
        int incrementAndGet;
        C25110CYe cYe = new C25110CYe(dfl2.A04, dfl.A04, str);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(cYe);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = CFq.A00.incrementAndGet();
                C17880vN.A1P(cYe, map, incrementAndGet);
            }
        }
        return incrementAndGet;
    }
}
