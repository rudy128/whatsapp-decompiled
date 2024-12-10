package X;

import java.util.List;

/* renamed from: X.6qq  reason: invalid class name and case insensitive filesystem */
public final class C134596qq {
    public final C134586qp A00;
    public final List A01;

    public C134596qq(C134586qp r2, List list) {
        C18070vi.A0d(list, 1);
        this.A01 = list;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134596qq) {
                C134596qq r5 = (C134596qq) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyStatusCrosspostingUnsentSessionData(messageRowIds=");
        A10.append(this.A01);
        A10.append(", backOffData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
