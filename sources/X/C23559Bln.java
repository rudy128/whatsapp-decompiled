package X;

import java.io.Serializable;

/* renamed from: X.Bln  reason: case insensitive filesystem */
public final class C23559Bln extends DUS implements Serializable {
    public static final long serialVersionUID = 0;
    public final C43011z6 function;
    public final DUS ordering;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C23559Bln)) {
                return false;
            }
            C23559Bln bln = (C23559Bln) obj;
            if (!this.function.equals(bln.function) || !this.ordering.equals(bln.ordering)) {
                return false;
            }
        }
        return true;
    }

    public int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    public C23559Bln(C43011z6 r1, DUS dus) {
        C199610h.A04(r1);
        this.function = r1;
        C199610h.A04(dus);
        this.ordering = dus;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.function;
        return AnonymousClass000.A0P(this.ordering, A1b, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.ordering);
        A10.append(".onResultOf(");
        A10.append(this.function);
        return AnonymousClass8BU.A0q(A10);
    }
}
