package X;

import java.util.List;

/* renamed from: X.6sS  reason: invalid class name and case insensitive filesystem */
public final class C135596sS {
    public final C136476ts A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135596sS) {
                C135596sS r5 = (C135596sS) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public C135596sS(C136476ts r1, List list, List list2) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostEligibilityCheckResult(enforcedEncryptedUniqueIdList=");
        A10.append(this.A02);
        A10.append(", crosspostedStateList=");
        A10.append(this.A01);
        A10.append(", purposeEncryptionParams=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
