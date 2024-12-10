package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6FH  reason: invalid class name */
public class AnonymousClass6FH extends C39611tM {
    public final long A00;
    public final AnonymousClass1E7 A01;
    public final Set A02;

    public AnonymousClass6FH(AnonymousClass1E7 r3, Set set, long j) {
        super(r3.A0J, 25);
        HashSet A12 = C17880vN.A12();
        this.A02 = A12;
        this.A01 = r3;
        this.A00 = j;
        if (set != null) {
            A12.addAll(set);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass6FH r7 = (AnonymousClass6FH) obj;
            if (this.A00 == r7.A00 && this.A01.equals(r7.A01)) {
                return this.A02.equals(r7.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A01)) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchResult{group=");
        A10.append(this.A01);
        A10.append(", lastMessageTimestamp=");
        A10.append(this.A00);
        A10.append(", matchingContact=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }
}
