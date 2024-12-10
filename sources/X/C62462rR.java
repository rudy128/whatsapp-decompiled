package X;

import java.util.List;

/* renamed from: X.2rR  reason: invalid class name and case insensitive filesystem */
public final class C62462rR {
    public final A2B A00;
    public final List A01;
    public final List A02;
    public final AnonymousClass1EC A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62462rR) {
                C62462rR r5 = (C62462rR) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, ((AnonymousClass001.A0k(this.A03) * 31) + C17880vN.A02(this.A00)) * 31));
    }

    public C62462rR(A2B a2b, AnonymousClass1EC r2, List list, List list2) {
        this.A03 = r2;
        this.A00 = a2b;
        this.A01 = list;
        this.A02 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunityGroups(parent=");
        A10.append(this.A03);
        A10.append(", cag=");
        A10.append(this.A00);
        A10.append(", joinedSubgroups=");
        A10.append(this.A01);
        A10.append(", unJoinedSubgroups=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62462rR() {
        /*
            r2 = this;
            r1 = 0
            X.0wS r0 = X.C18460wS.A00
            r2.<init>(r1, r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62462rR.<init>():void");
    }
}
