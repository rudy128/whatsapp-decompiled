package X;

import java.util.List;

/* renamed from: X.6rE  reason: invalid class name and case insensitive filesystem */
public final class C134836rE {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134836rE) {
                C134836rE r8 = (C134836rE) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0I(this.A00) * 31);
    }

    public C134836rE(List list, long j) {
        this.A00 = j;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AllReactionsListUpdate(total=");
        A10.append(this.A00);
        A10.append(", reactions=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
