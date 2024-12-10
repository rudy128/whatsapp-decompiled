package X;

import java.util.List;

/* renamed from: X.6rG  reason: invalid class name and case insensitive filesystem */
public final class C134856rG {
    public final int A00;
    public final List A01;

    public C134856rG(List list, int i) {
        C18070vi.A0d(list, 1);
        this.A01 = list;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134856rG) {
                C134856rG r5 = (C134856rG) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TabsListUpdate(tabs=");
        A10.append(this.A01);
        A10.append(", selectedTabPosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
