package X;

import java.util.UUID;

/* renamed from: X.2lo  reason: invalid class name and case insensitive filesystem */
public final class C59132lo {
    public final int A00;
    public final UUID A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59132lo) {
                C59132lo r5 = (C59132lo) obj;
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

    public C59132lo(UUID uuid, int i) {
        this.A01 = uuid;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OfflineAttemptKey(sessionId=");
        A10.append(this.A01);
        A10.append(", attemptNumber=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
