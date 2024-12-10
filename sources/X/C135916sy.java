package X;

import java.util.List;

/* renamed from: X.6sy  reason: invalid class name and case insensitive filesystem */
public final class C135916sy {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135916sy) {
                C135916sy r5 = (C135916sy) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03))));
    }

    public C135916sy(List list, List list2, List list3, List list4) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        this.A00 = list4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestResult(enforcedEncryptedSuccessUniqueIds=");
        A10.append(this.A03);
        A10.append(", enforcedEncryptedFailureUnknownIds=");
        A10.append(this.A02);
        A10.append(", enforcedEncryptedFailureDuplicateIds=");
        A10.append(this.A01);
        A10.append(", enforcedEncryptedFailureAlreadySharedIds=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
