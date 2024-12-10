package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.00q  reason: invalid class name and case insensitive filesystem */
public class C001200q implements Iterable {
    public int A00 = 0;
    public C001300r A01;
    public C001300r A02;
    public final WeakHashMap A03 = new WeakHashMap();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C001200q) {
            C001200q r7 = (C001200q) obj;
            if (this.A00 == r7.A00) {
                Iterator it = iterator();
                Iterator it2 = r7.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if (entry == null) {
                        if (next == null) {
                        }
                    } else if (!entry.equals(next)) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
        return false;
    }

    public C001300r A00(Object obj) {
        C001300r r1 = this.A02;
        while (r1 != null && !r1.A02.equals(obj)) {
            r1 = r1.A00;
        }
        return r1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Iterator, X.01O, java.lang.Object] */
    public Iterator iterator() {
        C001300r r1 = this.A02;
        C001300r r0 = this.A01;
        ? obj = new Object();
        obj.A00 = r0;
        obj.A01 = r1;
        this.A03.put(obj, false);
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object A01(Object obj) {
        C001300r A002 = A00(obj);
        if (A002 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (AnonymousClass01N A003 : weakHashMap.keySet()) {
                A003.A00(A002);
            }
        }
        C001300r r1 = A002.A01;
        C001300r r0 = A002.A00;
        if (r1 != null) {
            r1.A00 = r0;
        } else {
            this.A02 = r0;
        }
        C001300r r02 = A002.A00;
        if (r02 != null) {
            r02.A01 = r1;
        } else {
            this.A01 = r1;
        }
        A002.A00 = null;
        A002.A01 = null;
        return A002.A03;
    }

    public Object A02(Object obj, Object obj2) {
        C001300r A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        C001300r r1 = new C001300r(obj, obj2);
        this.A00++;
        C001300r r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }
}
