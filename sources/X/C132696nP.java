package X;

import java.util.Set;

/* renamed from: X.6nP  reason: invalid class name and case insensitive filesystem */
public final class C132696nP {
    public final Set A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public C132696nP(Set set, Set set2, Set set3, Set set4) {
        C18070vi.A0s(set, set2, set3, set4);
        this.A01 = set;
        this.A02 = set2;
        this.A00 = set3;
        this.A03 = set4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sending = ");
        A10.append(this.A02.size());
        A10.append(", send = ");
        A10.append(this.A03.size());
        A10.append(", deleting = ");
        A10.append(this.A00.size());
        A10.append(", failed = ");
        return C17880vN.A0t(A10, this.A01.size());
    }
}
