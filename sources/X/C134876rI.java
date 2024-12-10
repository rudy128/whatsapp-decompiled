package X;

import java.util.List;

/* renamed from: X.6rI  reason: invalid class name and case insensitive filesystem */
public final class C134876rI {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134876rI) {
                C134876rI r5 = (C134876rI) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public C134876rI(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyDisclosureFlow(disclosureId=");
        A10.append(this.A00);
        A10.append(", prompts=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
