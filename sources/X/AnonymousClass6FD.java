package X;

import java.util.AbstractCollection;

/* renamed from: X.6FD  reason: invalid class name */
public class AnonymousClass6FD extends C39611tM {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C39611tM r5 = (C39611tM) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public static void A02(Object obj, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C39611tM(obj, i));
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[type: ");
        A10.append(this.A00);
        A10.append(", data: ");
        A10.append(this.A01);
        return AnonymousClass000.A0y("]", A10);
    }
}
