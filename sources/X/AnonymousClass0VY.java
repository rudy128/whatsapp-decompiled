package X;

import java.util.Map;

/* renamed from: X.0VY  reason: invalid class name */
public class AnonymousClass0VY implements C16280s0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass0VY(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public void dispose() {
        if (this.A00 != 0) {
            C03300Hl r5 = (C03300Hl) this.A02;
            C05850Vy r4 = (C05850Vy) this.A03;
            Map map = r4.A02;
            if (r5.A00) {
                Map CBf = r5.A01.CBf();
                boolean isEmpty = CBf.isEmpty();
                Object obj = r5.A02;
                if (isEmpty) {
                    map.remove(obj);
                } else {
                    map.put(obj, CBf);
                }
            }
            r4.A01.remove(this.A01);
            return;
        }
        Object obj2 = this.A03;
        ((C06820Zu) this.A01).remove(obj2);
        ((AnonymousClass0U5) this.A02).A02.remove(obj2);
    }
}
