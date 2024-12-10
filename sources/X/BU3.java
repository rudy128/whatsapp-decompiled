package X;

import java.util.List;

public final class BU3 extends C3J implements E1G {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BU3) {
                BU3 bu3 = (BU3) obj;
                if (this.A00 != bu3.A00 || !C18070vi.A18(this.A01, bu3.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public BU3(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
