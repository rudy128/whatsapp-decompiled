package X;

import java.util.List;

/* renamed from: X.Caf  reason: case insensitive filesystem */
public final class C25189Caf {
    public final int A00;
    public final String A01;
    public final List A02;

    public C25189Caf(List list, int i, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25189Caf) {
                C25189Caf caf = (C25189Caf) obj;
                if (!C18070vi.A18(this.A01, caf.A01) || this.A00 != caf.A00 || !C18070vi.A18(this.A02, caf.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, (C17880vN.A03(this.A01) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AsyncComponentContainerTargetInfo(serverId=");
        A10.append(this.A01);
        A10.append(", clientId=");
        A10.append(this.A00);
        A10.append(", keyPath=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
