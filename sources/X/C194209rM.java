package X;

import java.util.Set;

/* renamed from: X.9rM  reason: invalid class name and case insensitive filesystem */
public final class C194209rM {
    public long A00;
    public final C20287AEv A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194209rM) {
                C194209rM r8 = (C194209rM) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A01)));
    }

    public C194209rM(C20287AEv aEv, Set set, long j) {
        this.A01 = aEv;
        this.A00 = j;
        this.A02 = set;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CartItem(product=");
        A10.append(this.A01);
        A10.append(", quantity=");
        A10.append(this.A00);
        A10.append(", variantIds=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
