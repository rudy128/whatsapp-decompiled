package X;

import java.util.List;

/* renamed from: X.6qe  reason: invalid class name and case insensitive filesystem */
public final class C134476qe {
    public final List A00;
    public final C135136ri A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134476qe) {
                C134476qe r5 = (C134476qe) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C134476qe(C135136ri r1, List list) {
        this.A00 = list;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaArEffectsConnection(nodes=");
        A10.append(this.A00);
        A10.append(", pageInfo=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
