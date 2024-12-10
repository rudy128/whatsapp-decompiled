package X;

import java.util.ArrayList;
import java.util.Iterator;

public final class DST implements Iterable, C18450wR {
    public final ArrayList A00;
    public final DPK A01;

    public DST(DPK dpk, ArrayList arrayList) {
        C18070vi.A0d(dpk, 1);
        this.A01 = dpk;
        this.A00 = arrayList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DST) {
                DST dst = (DST) obj;
                if (!C18070vi.A18(this.A01, dst.A01) || !C18070vi.A18(this.A00, dst.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public Iterator iterator() {
        Iterator it = this.A00.iterator();
        C18070vi.A0X(it);
        return it;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoArrayValue(wireType=");
        A10.append(this.A01);
        A10.append(", items=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
