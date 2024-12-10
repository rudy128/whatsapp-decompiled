package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7B3  reason: invalid class name */
public class AnonymousClass7B3 implements BA7 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7B3(C108475bl r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void Bml(Map map) {
        if (this.A00 == 0) {
            ((C108495bn) this.A01).CQ0(map);
        }
    }

    public void C03(int i, List list) {
        if (this.A00 != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
            for (Object put : list) {
                linkedHashMap.put(put, Float.valueOf(((float) i) / 100.0f));
            }
            ((C108495bn) this.A01).CQ0(linkedHashMap);
        }
    }
}
