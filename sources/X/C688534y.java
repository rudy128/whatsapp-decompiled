package X;

import java.util.Set;

/* renamed from: X.34y  reason: invalid class name and case insensitive filesystem */
public final class C688534y implements B5K {
    public final int A00;
    public final Set A01;
    public final Set A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C688534y) {
                C688534y r5 = (C688534y) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(this.A00 * 31, this.A03) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C688534y(Set set, Set set2, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = set;
        this.A01 = set2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingStatusValues(statusDistributionMode=");
        A10.append(this.A00);
        A10.append(", isMentionedInStatusPost=");
        A10.append(this.A03);
        A10.append(", mentionedUsers=");
        A10.append(this.A02);
        A10.append(", mentionSource=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
