package X;

import java.util.List;

/* renamed from: X.6zZ  reason: invalid class name and case insensitive filesystem */
public final class C139866zZ {
    public final long A00;
    public final List A01;

    public C139866zZ(List list, long j) {
        C18070vi.A0d(list, 2);
        this.A00 = j;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139866zZ) {
                C139866zZ r8 = (C139866zZ) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ToSAcceptanceResponse(refreshRateMS=");
        A10.append(this.A00);
        A10.append(", userNotices=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C139866zZ() {
        this(C18460wS.A00, 864000000);
    }
}
