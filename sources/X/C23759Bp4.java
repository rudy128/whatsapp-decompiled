package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bp4  reason: case insensitive filesystem */
public class C23759Bp4 extends C25836Cmq implements Iterable {
    public List A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23759Bp4)) {
            return false;
        }
        return this.A00.equals(((C23759Bp4) obj).A00);
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public String toString() {
        return BEA.A0m(C25888Cnz.A00(this.A00, ",", ""), BE9.A0q());
    }
}
