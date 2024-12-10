package X;

import java.util.Set;

/* renamed from: X.CaG  reason: case insensitive filesystem */
public final class C25165CaG {
    public final Object A00;
    public final Set A01;

    public C25165CaG(Object obj, Set set) {
        C18070vi.A0d(set, 2);
        this.A00 = obj;
        this.A01 = set;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25165CaG) {
                C25165CaG caG = (C25165CaG) obj;
                if (!C18070vi.A18(this.A00, caG.A00) || !C18070vi.A18(this.A01, caG.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ValueEntry(value=");
        A10.append(this.A00);
        A10.append(", variableLog=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
