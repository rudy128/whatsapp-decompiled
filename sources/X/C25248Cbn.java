package X;

import java.util.LinkedHashMap;

/* renamed from: X.Cbn  reason: case insensitive filesystem */
public class C25248Cbn {
    public int A00 = 0;
    public final E4T A01;
    public final LinkedHashMap A02 = C17880vN.A13();

    public synchronized int A00() {
        return this.A02.size();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized Object A02(Object obj) {
        Object remove;
        int i;
        remove = this.A02.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.BZN(remove);
        }
        this.A00 = i2 - i;
        return remove;
    }

    public synchronized void A03(Object obj, Object obj2) {
        int i;
        LinkedHashMap linkedHashMap = this.A02;
        Object remove = linkedHashMap.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.BZN(remove);
        }
        this.A00 = i2 - i;
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.BZN(obj2);
    }

    public C25248Cbn(E4T e4t) {
        this.A01 = e4t;
    }
}
